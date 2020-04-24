package gandalf.models;

import javax.swing.ImageIcon;

public class Image {

    private ImageIcon[] weaponImages;
    private ImageIcon[] elementImages;

    public Image() {
        weaponImages = new ImageIcon[] {
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/sword.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/magic_sword.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/double_sword.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/staff.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/bow.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/hammer.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/dagger.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/weapons/rapier.png")),
        };

        elementImages = new ImageIcon[] {
            new ImageIcon(getClass().getResource("/gandalf/images/elements/fire.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/elements/water.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/elements/earth.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/elements/holy.png")),
            new ImageIcon(getClass().getResource("/gandalf/images/elements/dark.png")),
        };
    }

    public ImageIcon[] getWeaponImages() {
        return weaponImages;
    }

    public void setWeaponImages(ImageIcon[] weaponImages) {
        this.weaponImages = weaponImages;
    }

    public ImageIcon[] getElementImages() {
        return elementImages;
    }

    public void setElementImages(ImageIcon[] elementImages) {
        this.elementImages = elementImages;
    }

}
