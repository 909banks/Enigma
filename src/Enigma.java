import java.util.Scanner;

public class Enigma {
	private String type = "M3";
	private int pos1;
	private int offset1;
	private int pos2;
	private int offset2;
	private int pos3;
	private int offset3;
	private Rotor R1;
	private Rotor R2;
	private Rotor R3;

	public Enigma (){

	}

	public void setRotors(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first rotor: ");
		String temp = reader.next();
		this.R1 = new Rotor(temp.charAt(0)  , type);
		System.out.println("Enter the position of the first rotor: ");
		this.pos1 = reader.nextInt();
		reader.close();

		Scanner reader1 = new Scanner(System.in);
		System.out.println("Enter the second rotor: ");
		temp = reader1.next();
		this.R2 = new Rotor(temp.charAt(0), this.type);
		System.out.println("Enter the position of the second rotor: ");
		this.pos2 = reader1.nextInt();
		reader1.close();


		Scanner reader2 = new Scanner(System.in);
		System.out.println("Enter the third rotor: ");
		temp = reader2.next();
		this.R3 = new Rotor(temp.charAt(0)  , type);
		System.out.println("Enter the position of the third rotor: ");
		this.pos3 = reader2.nextInt();
		reader2.close();

		this.offset1 = this.pos1;
		this.offset2 = this.pos2;
		this.offset3 = this.pos3;
	}
/*
	public static char[] plugboard(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the letters to be switched: ");
		char temp = reader.nextString();
		reader.close();
		for (int i=0; temp.lenght(); i++){
			if (!(temp.charAt(i) == ' ')){
				
			}
		}
	}
*/
	public static void main(){
		
	}
}
