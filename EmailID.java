import java.util.*;
import java.io.*;
    class User{
    public Scanner sc = new Scanner(System.in);
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    private int mailCapacity = 500;
    private String alternateEmail;
    
    public User(String fname,String lname){
        this.fname = fname;
        this.lname = lname;
        this.dept = this.setDepartment();
        this.email = this.GenerateEmail();
        this.password = this.generatePassword(8);
        this.alternateEmail = this.GenerateEmail();
    }

    private String GenerateEmail(){
        return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".gmail.com";
    }

    private String setDepartment(){
        System.out.println("\nThe department codes are \n1.Sales\n2.Development\n3.Accounting\nEnter your department code:");
        int choice = sc.nextInt();
        sc.nextLine();
        boolean flag = false;
        do{

            switch(choice){
            case 1:
            return "Sales";
            case 2:
            return "Development";
            case 3:
            return "Accounting";
            case 0:
            return "None";    
            default:
            System.out.println("Invalid Choice please choose an valid one !");
        }
    }while(!flag);
        return null;
    }

    private String generatePassword(int length){
        Random r = new Random();
        String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = capitalLetters.toLowerCase();
        String numbers ="0123456789";
        String symbols = "!@#$%^&*";
        String values = capitalLetters+smallLetters+numbers+symbols;
        String password = "";
        for(int i=0;i<length;i++){
            password = password+values.charAt(r.nextInt(values.length()));
        }

        return password;
    }

    public void setPassword(){
        boolean flag = false;
        do{
            System.out.println("\nDo you want to change your password!(Y/N) ?:");
            char c = sc.next().charAt(0);
            if(c =='Y' || c =='y')
            {
                flag = true;
                System.out.println("\nEnter current password :");
                String temp = sc.nextLine();
                if(temp.equals(this.password)){
                    System.out.println("\nEnter your New password  :");
                    this.password = sc.nextLine();
                    System.out.println("Password changed Successfully");
                }
                else{
                    System.out.println("Incorrect Password !");
                }
            } 
            else if(c == 'N'|c=='n'){
                flag = true;
                System.out.println("Thank you .");
            }
            else{
                System.out.println("Please Enter a valid choice !");
            }
        }while(!flag);
    }

    public void set_mail_size(){
        System.out.println("The current mail capactiy is: "+this.mailCapacity+" mb");
        System.out.println("Enter New mail capacity :");
        this.mailCapacity = sc.nextInt();
        sc.nextLine();
        System.out.println("Mail capacity updated.");
    }

    public void alternateEmail(){
        System.out.println("Enter new alternate email: ");
        this.alternateEmail = sc.nextLine();
        System.out.println("Alternate Email is :"+this.alternateEmail);
    }

    public void getInfo(){
        System.out.println("Employee Name           : "+this.fname+" "+this.lname);
        System.out.println("Department              : "+this.dept);
        System.out.println("Email                   : "+this.email);
        System.out.println("Password                : "+this.password);
        System.out.println("Mail Storage            : "+this.mailCapacity+" mb");
        System.out.println("Alternate Mail          : "+this.alternateEmail+" mb");
    }
}

public class EmailID{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name: ");
        String f_name = sc.nextLine();
        System.out.println("Enter the last Name: ");
        String l_name = sc.nextLine();
        User user = new User(f_name, l_name);
        int choice = -1;
        do{
           System.out.println("Enter your choice:\n1.Show Basic Info\n2.Change Password\n3.Change Mail capacity\n4.Set Alternate Email");  
           choice = sc.nextInt();
           switch(choice){
            case 1:
                user.getInfo();
                break;
            case 2:
                user.setPassword();
                break;
            case 3:
                user.set_mail_size();
                break;
            case 4:
                user.alternateEmail();
                break;
            default:
                System.out.println("Enter a valid selection:");    
           }
        }while(choice!=-1);
    }
}
