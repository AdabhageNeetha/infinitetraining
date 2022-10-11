
import java.util.Scanner;

class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;

    Person(String name, String dateOfBirth, String gender, String mobileNumber, String bloodGroup) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

   /* public void display() {

        System.out.println("Enter the Name: " + name);
        System.out.println("Enter the Date Of Birth " + dateOfBirth);
        System.out.println("Enter the Gender: " + gender);
        System.out.println("Enter the Mobile Number: " + mobileNumber);
        System.out.println("Enter the Blood Group: " + bloodGroup);
    }*/
}
class Donor extends Person {
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    Donor(String name, String dateOfBirth, String gender, String mobileNumber, String bloodGroup, String bloodBankName, String donorType, String donationDate) {
        super(name, dateOfBirth, gender, mobileNumber, bloodGroup);
        this.bloodBankName = bloodBankName;
        this.donorType = donorType;
        this.donationDate = donationDate;
    }

    public String getBloodBankName() {

        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {

        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {

        return donorType;
    }

    public void setDonorType(String donorType) {

        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }


}


    class Main1 {
        public   static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Name: ");
            String name = s.next();
            System.out.println("Enter the Date of Birth:");
            String dateOfBirth = s.next();
            System.out.println("Enter the Gender:");
            String gender = s.next();
            System.out.println("Enter the Mobile Number:");
            String mobileNumber = s.next();
            System.out.println("Enter the Blood Group:");
            String bloodGroup = s.next();
            System.out.println("Enter the Blood Bank Name:");
            String bloodBankName = s.next();
            System.out.println("Enter the Donor Type:");
            String donorType = s.next();
            System.out.println("Enter the Donation Date:");
            String donationDate = s.next();
            System.out.println("Enter the Name: " + name);
            System.out.println("Enter the Date Of Birth " + dateOfBirth);
            System.out.println("Enter the Gender: " + gender);
            System.out.println("Enter the Mobile Number: " + mobileNumber);
            System.out.println("Enter the Blood Group: " + bloodGroup);
            System.out.println("Enter the Name: " + bloodBankName);
            System.out.println("Enter the Date Of Birth " + donorType);
            System.out.println("Enter the Gender: " + donationDate);


        }


    }





