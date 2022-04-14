package defining_classes;

public class GSMTest {
    public static void main(String[] args) {
        GSM gsm1 = new GSM("GSM1", "GSM");
        GSM gsm2 = new GSM("GSM2", "GSM");
        GSM gsm3 = new GSM("GSM3", "GSM");
        GSM gsm4 = new GSM("GSM4", "GSM");
        GSM gsm5 = new GSM("GSM5", "GSM");


        GSM[] GSMs = {gsm1, gsm2, gsm3};
        for (GSM gsm : GSMs) {
            System.out.println(gsm.toString());
        }
    }
}
