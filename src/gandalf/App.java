package gandalf;

import gandalf.controllers.*;

/**
 *
 * @author Caio Adler
 */
public class App {

    private static Controller gandalfController;

    public static void main(String[] args) {
        gandalfController = new Controller();
        gandalfController.init();
    }

}
