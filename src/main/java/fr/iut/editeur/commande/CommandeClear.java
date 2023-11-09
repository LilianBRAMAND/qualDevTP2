package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{

    private static final String DescriptionCommande = "clear\n  Efface tout le texte\n";

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    @Override
    public void executer() {
        this.document.clear();
        super.executer();
    }

    public String getDescriptionCommande() {
    	return DescriptionCommande;
    }
}
