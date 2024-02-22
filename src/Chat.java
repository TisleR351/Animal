import java.util.Arrays;
public class Chat extends Animal {

    private int[] couleurRGB;
    public Chat(String couleur, boolean carnivore) {
        super(couleur, carnivore); // Appel des attributs de la classe père Animal
        this.couleurRGB = couleurRGB;
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
    // Getter du tableau de couleurs RGB
    public int[] getCouleurRGB() {
        return couleurRGB;
    }

    // Setter du tableau de couleurs RGB
    public void setCouleurRGB(int[] couleurRGB) {
        this.couleurRGB = couleurRGB;
    }

    // Méthode pour afficher la couleur RGB
    public void afficherCouleurRGB() {
        System.out.println("Couleur RGB : " + Arrays.toString(couleurRGB));
    }

}