package Bridge;

/**
 *
 * @author Darkmoon
 */
public class Sum implements Operation{

    @Override
    public int Operate(int num1, int num2) {
        return num1+num2;
    }
}
