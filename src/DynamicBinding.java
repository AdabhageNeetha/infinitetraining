public class DynamicBinding {
    public static void main(String[] args) {
        RegularCustomerr regCust1 = new RegularCustomerr();
        RegularCustomerr regCust2 = new RegularCustomerr();
        PremiumCustomer premCust1 = new PremiumCustomer();

        showCustomerDetails(regCust1);
        showCustomerDetails(premCust1);
        showCustomerDetails(regCust2);
    }
    public static void showCustomerDetails(Customerrr customer) {
        customer.display();
    }
}

class Customerrr {
    public void display() {
        System.out.println("Customer is coming...");
    }
}

class RegularCustomerr extends Customerrr {
    @Override
    public void display() {
        System.out.println("A regular customer has come");
    }
}

class PremiumCustomer extends Customerrr {
    @Override
    public void display() {
        System.out.println("A premium customer has come");
    }
}

