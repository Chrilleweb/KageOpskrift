import java.util.Scanner;

public class Main {

    private Opskrift opskrift = new Opskrift("Pandekager");

    public void udskrivVelkomst(){
        System.out.println("\u001b[33mVelkommen til programmet\uu001b[0m.");
        System.out.println("---------------------------------");
        System.out.println("\u001b[33mOpskrift:\uu001b[0m " + opskrift.getNavn() + "\uD83D\uDE00");
    }

    public void indlæstAntalPersoner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("hvor mange mennesker er i?");
        int antal = scan.nextInt();
        opskrift.setAntal(antal);
    }

    public void printeIngredienserUd(){
        System.out.println("\u001b[33mIngredienser til " + opskrift.getAntal()+ " per\u001b[0m");
        for (Ingredienser ingrediens : opskrift.getIngredienser()) {
            System.out.println(ingrediens);
        }
    }

    public void printeIngredienserVægt(){
        //enhancement loop for at printe ingrediensernes vægt ud
        System.out.println(System.lineSeparator() + "\u001b[33mDine ingredienser vejer:\uu001b[0m. ");
        System.out.println("---------------------------------");
        for (Ingredienser ingrediens : opskrift.getIngredienser()) {
            System.out.println(ingrediens.ingredienserVægt());
        }
    }

    public void vægtIAltUD(){
        //Enhancement loop for at printe vægt i alt ud
        int sum = 0;
        System.out.println(System.lineSeparator() + "\u001b[33mDet vejer i alt:\uu001b[0m. ");
        System.out.println("---------------------------------");
        for (Ingredienser ingrediens : opskrift.getIngredienser()) {
            sum += ingrediens.getEnhedsVægt();
        }
        System.out.println((sum) + " Gram");
    }

    public void printEnergiIndhold(){
        //Enhancement loop for at printe energiindhold ud
        System.out.println(System.lineSeparator() + "\u001b[33mDine ingrediensers kalorie indhold\uu001b[0m.");
        System.out.println("---------------------------------");
        for (Ingredienser ingrediens : opskrift.getIngredienser()) {
            System.out.println(ingrediens.energi());
        }
    }

    public void printKiloj(){
        //Enhancement loop for at printe kilojoule ud
        System.out.println(System.lineSeparator() + "\u001b[33mDine ingredienser i kilo joule\uu001b[0m.");
        System.out.println("---------------------------------");
        for (Ingredienser ingrediens : opskrift.getIngredienser()){
            System.out.println(ingrediens.getKiloJoule());
        }
    }

    public void printSamledeEnergi(){
        //Enhancement loop for at printe det samlede energi indhold
        int samledeEnergiindhold = 0;
        System.out.println(System.lineSeparator() + "\u001b[33mDet samlede kalorie indhold i din mad:\uu001b[0m. ");
        System.out.println("---------------------------------");
        for (Ingredienser ingrediens : opskrift.getIngredienser()) {
            samledeEnergiindhold += ingrediens.getEnergiIndhold();
        }
        System.out.println((samledeEnergiindhold));
    }

    public void printSamledeKiloJoule(){
        //Enhancement loop for at printe samlede kilo joule ud
        int samledeKiloJoule = 0;
        System.out.println(System.lineSeparator() + "\u001b[33mDet samlede kilo joule i din mad:\uu001b[0m. ");
        System.out.println("---------------------------------");
        for(Ingredienser ingrediens : opskrift.getIngredienser()){
            samledeKiloJoule += ingrediens.getKiloj();
        }
        System.out.println(samledeKiloJoule);
    }

    public void start(){

        udskrivVelkomst();
        indlæstAntalPersoner();
        printeIngredienserUd();
        printeIngredienserVægt();
        vægtIAltUD();
        printEnergiIndhold();
        printKiloj();
        printSamledeEnergi();
        printSamledeKiloJoule();

    }

    public static void main(String[] args) {
        Main program = new Main();
        program.start();
        System.out.println(System.lineSeparator()+ "Velbekomme\uD83E\uDD5E\uD83E\uDD5E\uD83E\uDD5E");
    }
}