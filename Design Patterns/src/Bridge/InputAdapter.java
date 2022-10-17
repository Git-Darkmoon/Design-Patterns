package Bridge;

import javax.swing.JOptionPane;

/**
 * @author Darkmoon
 */
public class InputAdapter {

    public InputAdapter() {
    }

    public int adapt(String value){
        int newNum = 0;
        switch (value.toLowerCase()) {
            case "uno":
                newNum = 1;
                break;
            case "dos":
                newNum = 2;
                break;
            case "tres":
                newNum = 3;
                break;
            case "cuatro":
                newNum = 4;
                break;
            case "cinco":
                newNum = 5;
                break;
            case "seis":
                newNum = 6;
                break;
            case "siete":
                newNum = 7;
                break;
            case "ocho":
                newNum = 8;
                break;
            case "nueve":
                newNum = 9;
                break;
            case "diez":
                newNum = 10;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Not a valid input.");
                System.exit(0);
        }
        return newNum;
    }
}
