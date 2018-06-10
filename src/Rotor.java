public class Rotor{

  private char[] substitution = new char[26];

  public Rotor(){
	  
  }
  
  public Rotor (char number, String type){
 
    try {

      if (number == '1'){
        substitution = new char[]{'J','P','G','V','O','U','M','F','Y','Q','B','E','N','H','Z','R','D','K','A','S','X','L','I','C','T','W'};
      } else if (number == '2'){
        substitution = new char[]{'N','Z','J','H','G','R','C','X','M','Y','S','W','B','O','U','F','A','I','V','L','P','E','K','Q','D','T'};
      } else if (number == '3'){
        substitution = new char[]{'F','K','Q','H','T','L','X','O','C','B','J','S','P','D','Z','R','A','M','E','W','N','I','U','Y','G','V'};
      } else if (number == '4'){
        substitution = new char[]{'N','Z','J','H','G','R','C','X','M','Y','S','W','B','O','U','F','A','I','V','L','P','E','K','Q','D','T'};
      } else if (number == '5'){
        substitution = new char[]{'F','K','Q','H','T','L','X','O','C','B','J','S','P','D','Z','R','A','M','E','W','N','I','U','Y','G','V'};
      } else if (number == 'B' && type == "M4"){
        substitution = new char[]{'L','E','Y','J','V','C','N','I','X','W','P','B','Q','M','D','R','T','A','K','Z','G','F','U','H','O','S'};
      } else if (number == 'C' && type == "M4"){
        substitution = new char[]{'F','S','O','K','A','N','U','E','R','H','M','B','T','I','Y','C','W','L','Q','P','Z','X','V','G','J','D'};
      } else {
        System.out.println("Invalid rotor, please enter the correct rotor");
      }

    } catch (Exception e) {
      System.out.println("Invalid input.");
    }

  }

  public char[] getSubstitution(){
    return this.substitution;
  }
}
