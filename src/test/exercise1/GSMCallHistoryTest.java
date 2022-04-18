package test.exercise1;

import main.exercise1.Call;
import main.exercise1.GSM;

import java.util.Date;

public class GSMCallHistoryTest {
    public static void main(String[] args) {
        GSM gsm = new GSM("GSM1911", "GSM");

        Call call1 = new Call(new Date(), "0398472398", 50);
        Call call2 = new Call(new Date(), "0232874293", 100);
        Call call3 = new Call(new Date(), "0293482930", 200);

        // Add few calls
        gsm.addCall(call1);
        gsm.addCall(call2);
        gsm.addCall(call3);

        // Display the information about the calls
        System.out.println("Call history: ");
        for (Call call : gsm.getCallHistory()) {
            System.out.println("\t" + call);
        }

        // total price of the calls
        System.out.println("Total price: " + gsm.totalPrice(0.37));

        // Remove the longest call
        Call longestCall = gsm.getLongestCall();
        gsm.deleteCall(longestCall);
        System.out.println("Removed the longest call in the history");

        // calculate the total price again.
        System.out.println("Total price: " + gsm.totalPrice(0.37));

        // clear the call history and print it
        gsm.clearCallHistory();
        System.out.println("Call history: ");
        for (Call call : gsm.getCallHistory()) {
            System.out.println("\t" + call);
        }

    }
}
