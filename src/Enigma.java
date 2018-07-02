import java.util.Scanner;
import javafx.util.Pair;

public class Enigma {
	private String type = "M3";
	protected int pos1;
	protected int offset1;
	protected int pos2;
	protected int offset2;
	protected int pos3;
	protected int offset3;
	
	private Pair[] plugboard;
	
	private char[] reflector;
	
	private Rotor R1;
	private Rotor R2;
	private Rotor R3;

	
	public Enigma (){
		defaultRotors();
		defaultPositions();
		setReflector('B');
	}
	
	public Enigma(int position1, int position2, int position3, char reflector, char rotor1, char rotor2, char rotor3, String type, Pair[] plug){
		//setRotors(position1, position2, position3, rotor1, rotor2, rotor3);
		//setReflector(reflector);
		//setPlugboard(plug);
	}
	
	public char[] getReflector(){
		return this.reflector;
	}
	
	public void setReflector(char type){
		if (type == 'B'){
			this.reflector = new char[] {'Y','R','U','H','Q','S','L','D','P','X','N','G','O','K','M','I','E','B','F','Z','C','W','V','J','A','T'};
		} else if (type == 'C'){
			this.reflector = new char[] {'F','V','P','J','I','A','O','Y','E','D','R','Z','X','W','G','C','T','K','U','Q','S','B','N','M','H','L'};
		}
	}
	
	public int[] getPosition(){
		int[] Positions = new int[] {this.pos1, this.pos2, this.pos3};
		return Positions;
	}
	
	public Pair[] getPlugboard(){
		return this.plugboard;
	}
	
	public void setPlugboard(Pair[] plug){
		this.plugboard = plug;
	}
	
	public Rotor[] getRotors(){
		Rotor[] Rotors = new Rotor[] {this.R1, this.R2, this.R3};
		return Rotors;
	}
	
	public void setRotors(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first rotor: ");
		String temp = reader.next();
		this.R1 = new Rotor(temp.charAt(0)  , type);
		System.out.println("Enter the position of the first rotor: ");
		try{
			this.pos1 = reader.nextInt();
		} catch (Exception e) {
			System.out.println("Input not valid");
			System.out.println("Default first rotor enabled");
		}
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
	
	public void defaultRotors(){
		this.R1 = new Rotor('1', this.type);
		this.R2 = new Rotor('2', this.type);
		this.R3 = new Rotor('3', this.type);
	}

	public void defaultPositions(){
		this.pos1 = 0;
		this.offset1 = 0;
		
		this.pos2 = 0;
		this.offset2 = 0;
		
		this.pos3 = 0;
		this.offset3 = 0;
	}

	public void inc(){
		if (this.pos1 == 25){
			this.pos1 = 0;
		} else {
			this.pos1 ++;
		}

		if (this.pos1 == offset1){
			if (this.pos2 == 25){
				this.pos2 = 0;
			} else {
				this.pos2 ++;
			}

			if (this.pos2 == offset2){
				if (this.pos3 == 25){
					this.pos3 = 0;
				} else {
					this.pos3 ++;
				}
			}
		}
	}

	public static void main(String[] args){
	
		
		

	}
}
