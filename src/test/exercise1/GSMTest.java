package test.exercise1;

import main.exercise1.Battery;
import main.exercise1.Display;
import main.exercise1.GSM;

public class GSMTest {
    public static void main(String[] args) {
        Battery b1 = new Battery("BAT1", 100, 150);
        Display d1 = new Display(5.5f, 256);
        Battery b2 = new Battery("BAT2", 150, 200);
        Display d2 = new Display(6f, 512);
        GSM gsm1 = new GSM("GSM1", "GSM", 500, "GSM", b1, d1);
        GSM gsm2 = new GSM("GSM2", "GSM", 600, "GSM", b2, d2);
        GSM gsm3 = new GSM("GSM3", "GSM", 550, "GSM", b1, d2);
        GSM gsm4 = new GSM("GSM4", "GSM", 525, "GSM", b2, d1);
        GSM gsm5 = new GSM("GSM5", "GSM", 515, "GSMA", b1, d1);


        GSM[] GSMs = {gsm1, gsm2, gsm3};
        for (GSM gsm : GSMs) {
            System.out.println(gsm.toString());
        }
    }
}
