package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {

    private static final String DescriptionCommande = "ajouter;texte\n  Ajoute le texte à la fin du document\n";

    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    public String getDescriptionCommande() {
        return DescriptionCommande;
    }
}
