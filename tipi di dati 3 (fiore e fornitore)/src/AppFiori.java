import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppFiori {
    public static void main(String[] args) throws Exception {
        
        boolean cont= true;
        Scanner sc= new Scanner (System.in);

        System.out.println("Descrivimi il tuo fiore preferito");

        while (cont) {
            
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Nome del fiore: ");
        String nome= sc.nextLine();

        System.out.println("Tipologia del fiore: ");
        System.out.println("");
        System.out.println("[0 - Annuale]");
        System.out.println("[1 - Perenne]");
        System.out.println("[2 - Bulboso]");
        System.out.println("[3 - Arbustivo]");
        System.out.println("[4 - Treppiante]");
        System.out.println("[5 - Acquatico]");
        System.out.println("");
        byte tipologiaNum= sc.nextByte();
        TipologiaFiore tipologiaFiore= TipologiaFiore.values()[tipologiaNum];

        System.out.println("Il prezzo del fiore?");
        byte prezzo= sc.nextByte();
        sc.nextLine();

        System.out.println("Quanti fiori ci sono al momento?");
        Short quantita= sc.nextShort();
        sc.nextLine();
        
        System.out.println("Qual è il colore principale del fiore?");
        String colore= sc.nextLine();

        System.out.println("Quando inizia la disponibilità del fiore?");
        String InizioDispSTR= sc.nextLine();
        LocalDate InizoDisp= LocalDate.parse(InizioDispSTR, formatter);

        System.out.println("Quando finisce la disponibilità del fiore?");
        String FineDispSTR= sc.nextLine();
        LocalDate FineDisp= LocalDate.parse(FineDispSTR, formatter);

        System.out.println("Il tuo fiore profuma? (true o false)");
        Boolean profumo= sc.nextBoolean();

        System.out.println("Il tuo fiore è artificiale? (true o false)");
        Boolean artificiale= sc.nextBoolean();




        // ------------------------------------------------------------

        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("Ecco la descrizione finale del tuo fiore: ");
        System.out.println("");
        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("");
        System.out.println("Tipologia: " + tipologiaFiore);
        System.out.println("");
        System.out.println("Prezzo: " + prezzo + "Euro");
        System.out.println("");
        System.out.println("Quantità: " + quantita);
        System.out.println("");
        System.out.println("Colore principale: " + colore);
        System.out.println("");
        System.out.println("Inizio della disponibilità: " + InizoDisp);
        System.out.println("");
        System.out.println("Fine della disponibilità: " + FineDisp);
        System.out.println("");
        System.out.println("Profumo: " + profumo);
        System.out.println("");
        System.out.println("Artificiale: " + artificiale);
        System.out.println("");


        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("");

        System.out.println("Vuoi continuare a inserire un'altro tipo di fiore? (true o false)");
        cont= sc.nextBoolean();
        sc.nextLine();
    }

        System.out.println("");
        System.out.println("Grazie per aver usato il software!!");
        System.out.println("");

        sc.close();
    } 
} 
