public class Adresse {
    private int numero;
    private String rue;
    private String codepostal;
    private String ville;

    public Adresse(int numero, String rue, String codepostal, String ville){
        this.ville = ville;
        this.rue = rue;
        this.numero = numero;
        this.codepostal = codepostal;
    }

    public int getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }

    public String getCodepostal() {
        return codepostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                 numero + ", Rue" + rue + ", codepostal=" + codepostal + ", ville=" + ville + '}';
    }
}
