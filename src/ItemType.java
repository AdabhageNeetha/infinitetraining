import java.util.Scanner;

public class ItemType {
    private String name;
    private double costPerDay;
    private double deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getCostPerDay() {

        return costPerDay;
    }

    public void setCostPerDay(double CostPerDay) {

        this.costPerDay = costPerDay;
    }

    public double getDeposit() {

        return deposit;
    }

    public void setDeposit(double deposit) {

        this.deposit = deposit;
    }
    public void display(){
        System.out.println("Item type details");
        //System.out.println("Item_Name : "+itemType);
        System.out.println("Item_Name : "+costPerDay);
        System.out.println("Item_Name : "+deposit);
    }

}
  class Festival{
    public static void main(String[] args){


        Scanner s=new Scanner(System.in);
        System.out.println("Enter the item type name");
        String item=s.next();
        System.out.println("Enter the cost per day");
        double cost=s.nextDouble();
        System.out.println("Enter the deposit");
        double deposit=s.nextDouble();
        ItemType i=new ItemType();
        i.setCostPerDay(cost);
        i.setDeposit(deposit);


        s.close();



        }
}
