package LeisureActivity;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// write your code here
        //Deze methode is niet gekoppeld aan andere objecten maar direct aan de klasse, dat komt omdat hij static is.
        //create an object in main ajax is het object, name en abbrecviation zijn de instance variable
    public static void main(String[] args) {  //Waarom wordt hier ook int geaccepteert omdat er alleen maar String[] staat
   // Footballclub ajax = new Footballclub("Ajax Amsterdam", "AFCA", 1902); // Ajax Amsterdam en AFCA zijn de instance variabelen
    ClubMembersInfo memberA = new ClubMembersInfo("Henk", "van 't Kruijs", "Ede", "Nederland", "52 jaar");
    ClubMembersInfo memberB = new ClubMembersInfo("Piet", "Jansen", "Utrecht", "Nederland", "32 jaar");
  //System.out.println("Voetbalclub " + ajax.getName() + " met de afkorting " + ajax.getAbbreviation() + " is opgericht in " + ajax.getFoundingYear());
    System.out.println("Clublid memberA heet " + memberA.getFirstname() + " " + memberA.getLastname() + " en is " + memberA.getAge());
    System.out.println("Clublid memberB heet " + memberB.getFirstname() + " " + memberB.getLastname() + " en is " + memberB.getAge());
    }
}

