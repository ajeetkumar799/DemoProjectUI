package advancePolymerphism2interfaceBased;
import java.util.*;

abstract class Payment {

    // Template method (common workflow)
    public final void pay() {
        validatePayment();
        processPayment();
        System.out.println("----------------------");
    }

    abstract void validatePayment();
    abstract void processPayment();
}

// Credit Card भुगतान
class CreditCardPayment extends Payment {

    @Override
    void validatePayment() {
        System.out.println("Validating Credit Card with OTP...");
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}

// UPI भुगतान
class UPIPayment extends Payment {

    @Override
    void validatePayment() {
        System.out.println("Validating UPI with PIN...");
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}

// Net Banking भुगतान
class NetBankingPayment extends Payment {

    @Override
    void validatePayment() {
        System.out.println("Validating Net Banking with Login Credentials...");
    }

    @Override
    void processPayment() {
        System.out.println("Processing Net Banking Payment");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {

        // Collection of payments (Polymorphism)
        List<Payment> payments = Arrays.asList(
            new CreditCardPayment(),
            new UPIPayment(),
            new NetBankingPayment()
        );

        // Loop → Runtime Polymorphism
        for (Payment p : payments) {
            p.pay();
        }
    }
}