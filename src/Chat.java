import java.util.Arrays;
import java.util.List;

public class Chat extends Animal {

    private List<int[]> couleurs;

    public Chat(String couleur, boolean carnivore) {
        super(couleur, carnivore); // Appel des attributs de la classe père Animal
        this.couleurs = couleurs;
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
    // Getter pour la liste des couleurs
    public List<int[]> getCouleurs() {
        return couleurs;
    }

    // Setter pour la liste des couleurs
    public void setCouleurs(List<int[]> couleurs) {
        this.couleurs = couleurs;
    }
}

