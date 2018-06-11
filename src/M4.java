import java.util.Scanner;

public class M4  extends Enigma{
  private String type = "M4";
  private Rotor R4;
  private int pos4 = 0;
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
	this.pos4 = reader.nextInt();
	reader.close();
	
	this.offset4 = this.pos4;
  }

  public void inc(){
	  super.inc();
	  if (this.pos1 == offset1 && this.pos2 == offset2 && this.pos3 == offset3){
		  if (this.pos4 == 25){
			  this.pos4 = 0;
		  } else {
			  this.pos4 ++;
		  }
	  }
  }
  
  public void main(){

  }

}
