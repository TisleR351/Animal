public class Chat extends Animal {

    public Chat(String couleur, boolean carnivore) {
        super(couleur, carnivore); // Appel des attributs de la classe père Animal
    }

    public void miauler() {
        System.out.println("Miaou !");
    }

    // Getter de l'attribut couleur
    public String getCouleur() {
        return super.getCouleur();
    }

    // Setter de l'attribut couleur
    public void setCouleur(String couleur) {
        super.setCouleur(couleur);
    }

    // Getter du booléen Carnivore
    public boolean isCarnivore() {
        return super.isCarnivore();
    }

    // Setter du booléen Carnivore
    public void setCarnivore(boolean carnivore) {
        super.setCarnivore(carnivore);
    }
}
