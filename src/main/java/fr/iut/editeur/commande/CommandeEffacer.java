package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{

    private static final String DescriptionCommande = "effacer;start;end\n  Efface le texte entre les positions start et end\n";

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;start;end");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.effacer(start, end);
        super.executer();
    }

    public String getDescriptionCommande() {
    	return DescriptionCommande;
    }
}
