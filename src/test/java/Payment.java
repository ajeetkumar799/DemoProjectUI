class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay() {
       // super.pay();  // calling parent method
        System.out.println("Using Credit Card");
    }
    
   
}

