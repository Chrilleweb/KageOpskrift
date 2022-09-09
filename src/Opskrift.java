public class Opskrift {
    private int antal;
    private String navn;
    private Ingredienser[] ingredienser;

    public Opskrift(String navn) {
        this.navn = navn;

        Ingredienser æg = new Ingredienser("Æg", 3, "stk", 60, 155.1);
        Ingredienser salt = new Ingredienser("Groft salt", 0.5, "Tsk", 4, 0);
        Ingredienser smør = new Ingredienser("Smør", 50, "Gram", 71.68);
        Ingredienser mælk = new Ingredienser("Mælk", 4, "DL", 45, 19.2);
        Ingredienser hvedemel = new Ingredienser("Hvedemel", 150, "Gram", 3.64);
        String navne[] = {"Æg", "Groft salt", "Smør", "Mælk", "Hvedemel"};

        this.ingredienser = new Ingredienser[]{æg, salt, smør, mælk, hvedemel};

    }

    public void setAntal(int antal) {
        this.antal = antal;
        for (Ingredienser ingrediens : ingredienser) {
            ingrediens.setAntal(antal);
        }
    }

    public String getNavn() {
        return navn;
    }

    public int getAntal(){
        return antal;
    }

    public Ingredienser[] getIngredienser() {
        return ingredienser;
    }

}

