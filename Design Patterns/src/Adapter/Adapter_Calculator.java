package Adapter;

public class Adapter_Calculator implements Interface_Adapter{

    public Adapter_Calculator() {
    }

    @Override
    public int Times(int num,int byNum) {
         
        byte acc = 0;
        
        for (int i = 1; i <= byNum; i++) {
            acc += num;
        }
        return acc;
    }

    @Override
    public int Sum(int a, int b) {
        return a+b;
    }
}
