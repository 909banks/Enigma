import java.util.Scanner;

public class M4  extends Enigma{
  private String type = "M4";
  private Rotor R4;
  private int offset4 = 0;

  public M4(){
    
  }

  public void setRotors(){
    super.setRotors();
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the fourth rotor: ");
    String temp = reader.next();
    this.R4 = new Rotor(temp.charAt(0)  , type);
    System.out.println("Enter the position of the fourth rotor: ");
    this.offset4 = reader.nextInt();
    reader.close();
  }

  public void main(){

  }
}
