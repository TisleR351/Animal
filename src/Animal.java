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
    
    // Méthode toString pour afficher les caractéristiques de l'animal
    @Override
    public String toString() {
        return "Couleur: " + couleur + ", Est carnivore: " + carnivore;
    }

    public boolean isBeautiful() {
        return this.couleur.equals("Blue");
    }

    public boolean isVegan() {
        return !this.carnivore;
    }
}