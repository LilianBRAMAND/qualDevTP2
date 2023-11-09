package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    private static final String DescriptionCommande = "remplacer;start;end;remplacement\n   Remplace le texte entre les positions start et end par le texte remplacement\n";


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters, DescriptionCommande);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;start;end;remplacement");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        String remplacement = parameters[3];
        this.document.remplacer(start, end, remplacement);
        super.executer();
    }

    public String getDescriptionCommande() {
    	return DescriptionCommande;
    }
}
