package gandalf.models;

public class MagicItem {

    private String name, weapon, element, power;
    private int damage, atkSpeed;

    public MagicItem(String name, String weapon, String element, String power, int damage, int atkSpeed) {
        this.name = name;
        this.weapon = weapon;
        this.element = element;
        this.power = power;
        this.damage = damage;
        this.atkSpeed = atkSpeed;
    }

    public MagicItem(int weaponChoice, int elementChoice, String name, String weapon, String element) {
        this.name = name;
        this.weapon = weapon;
        this.element = element;

        switch (weaponChoice) {
            case 0: // sword
                this.damage = 212;
                this.atkSpeed = 3;
                break;
            case 1: // magic sword
                this.damage = 246;
                this.atkSpeed = 2;
                break;
            case 2:// double sword
                this.damage = 237;
                this.atkSpeed = 2;
                break;
            case 3: // staff
                this.damage = 268;
                this.atkSpeed = 1;
                break;
            case 4: // bow
                this.damage = 274;
                this.atkSpeed = 1;
                break;
            case 5: // hammer
                this.damage = 282;
                this.atkSpeed = 1;
                break;
            case 6: // dagger
                this.damage = 187;
                this.atkSpeed = 4;
                break;
            case 7: // rapier
                this.damage = 212;
                this.atkSpeed = 3;
                break;
            default:
                break;
        }

        switch (elementChoice) {
            case 0: // fire
                this.damage += 100;
                this.power = "Prominance";
                break;
            case 1: // water
                this.damage += 30;
                this.atkSpeed += 3;
                this.power = "Hydro Blast";
                break;
            case 2: // earth
                this.damage += 60;
                this.atkSpeed += 1;
                this.power = "Earthquake";
                break;
            case 3: // holy
                this.damage += 45;
                this.atkSpeed += 2;
                this.power = "Soul of the Phoenix";
                break;
            case 4: // dark
                this.damage += 80;
                this.atkSpeed += 1;
                this.power = "Death Spike";
                break;
            default:
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(int atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Weapon=" + weapon + ", Damage=" + damage + ", Element=" + element + ", Power="
                + power + ", AtkSpeed=" + atkSpeed;
    }
}
