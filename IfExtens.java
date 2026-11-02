interface A {
    void paymentDetails();
    void paymentAmount();
}

interface B extends A {
    void paymentStatus();
}

class MyClass implements B {
    public void paymentDetails() {
        System.out.println("Payment Method: UPI");
    }

    public void paymentAmount() {
        System.out.println("Payment Amount: Rs. 500");
    }

    public void paymentStatus() {
        System.out.println("Payment Successful");
    }
}

class IfExtens {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.paymentDetails();
        obj.paymentAmount();
        obj.paymentStatus();
    }
}