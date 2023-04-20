import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Main {
    public static void main (String [] args){

        System.out.println("ВВедите строку");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        Pattern p = Pattern.compile("((25[0-5]\\.)|(2[0-4]\\d\\.)|(1\\d\\d\\.)|(\\d\\d\\.)|(\\d\\.)){3}((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|(\\d\\d)|(\\d))");
        Matcher m = p.matcher(id);
        String answer;
        if (m.find()){
            System.out.println("Ваш ip:");
            answer = id.substring(m.start(), m.end());
            System.out.println(answer);
        }
        else{
            answer = "ip не найден";
            System.out.println(answer);
        }

        try{
            FileWriter writer = new FileWriter("C:\\Users\\79623\\OneDrive\\Рабочий стол\\lab-13\\myFile.txt", false);
            writer.write(answer);
            writer.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}