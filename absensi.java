import java.util.Scanner;
public class absensi {
    public static void main(String[] args) {
        String user1, password1, user, password;

        
        user1 = "Is Mardianto";
        password1 = "trisakti";

    
        Scanner abc = new Scanner(System. in );

      
        System.out.println("masukkan Username: ");
        user = abc.nextLine();
        System.out.println("masukkan Password: ");
        password = abc.nextLine();

        
        if (user1.equals(user) && password1.equals(password)) {
            System.out.println("login berhasil");
        } else {
            System.out.println("login gagal");
        }
    }
}