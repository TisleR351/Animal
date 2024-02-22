import java.util.Arrays;
import java.util.List;

public class Chat extends Animal {

    private List<int[]> couleurs;

    public Chat(String couleur, boolean carnivore, List<int[]> couleurs) {
        super(couleur, carnivore);
        this.couleurs = couleurs;
    }

    public void miauler() {
        System.out.println("Miaou !");
    }

    // Getter pour l'attribut couleur
    public String getCouleur() {
        return super.getCouleur();
    }

    // Setter pour l'attribut couleur
    public void setCouleur(String couleur) {
        super.setCouleur(couleur);
    }

    // Getter pour le booléen Carnivore
    public boolean isCarnivore() {
        return super.isCarnivore();
    }

    // Setter pour le booléen Carnivore
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

    // Méthode pour afficher les couleurs du chat
    public void afficherCouleurs() {
        for (int[] couleur : couleurs)
    }

    // Méthode pour vérifier si le chat est de couleur noir
    public boolean estNoir() {
        for (int[] couleur : couleurs) {
            if (couleur[0] != 0 || couleur[1] != 0 || couleur[2] != 0) {
                return false;
            }
        return true;
    }
}
