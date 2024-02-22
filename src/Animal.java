public class Animal {
    private String couleur;
    private boolean carnivore;

    // Constructeur
    public Animal(String couleur, boolean carnivore) {
        this.couleur = couleur;
        this.carnivore = carnivore;
    }

    // Getters
    public String getCouleur() {
        return couleur;
    }

    public boolean isCarnivore() {
        return carnivore;
    }

    // Setters (si nécessaire)
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setCarnivore(boolean carnivore) {
        this.carnivore = carnivore;
    }
}