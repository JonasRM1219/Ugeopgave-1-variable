import java.time.LocalDate;

public class uge1 {
    public static void main(String[] args) {
// klar til kildekoded opgave
        //opgave 1
        /* Jeg oprettede en folder der hedder 'src', og har markeret den som root i IntelliJ

         */
        //opgave 2
        /* jeg har oprettet en klasse i folderen og den hedder uge1
         */

        // opgave 3
        /* jeg har lavet en main metode i class
        og det starter med denne kode
         */
        System.out.println("opgave 1-3 er blevet løst");

   //opgave 1 Shopping cart

            double item1 = 25.50;
            double item2 = 15.00;
            double item3 = 30.00;

            double subtotal = item1 + item2 + item3;
            double taxRate = 25.0;
            double withTax = subtotal + (subtotal * taxRate / 100.0);

            System.out.println(subtotal);
            System.out.println(withTax);

            //opgave 2 split resturant bill
        double mad=450;
        double drikke=120;
        double drikkepenge=50;
        int personer=4;
                double Subtotal= (mad + drikke + drikkepenge);
       double perPerson = (Subtotal / personer);
System.out.println(perPerson);

//opgave 3

                // Oprindelig pris
                double originalPrice = 300.0;

                // Rabat i procent
                double discountPercent = 20.0;

                // Pris efter rabat
                double discounted = originalPrice - (originalPrice * discountPercent / 100.0);

                // Moms i procent
                double taxPercent = 25.0;

                // Endelig pris inkl. moms
                double finalPrice = discounted + (discounted * taxPercent / 100.0);


                System.out.println(originalPrice);
                System.out.println(discounted);
                System.out.println(finalPrice);

                //opgave 4

        // Antal gæster og cupcakes
        int guests = 15;
        int cupcakes = 40;

// Cupcakes pr. person
        int cupcakesPerPerson = cupcakes / guests;

// Cupcakes til overs
        int leftover = cupcakes % guests;


        System.out.println("Hver gæst får " + cupcakesPerPerson + " cupcakes");
        System.out.println(leftover + " cupcakes tilovers");

        //opgave 5


        StringBuilder sb = new StringBuilder();

// Variabler
        String name = "Dogmeat";
        int age = 69;


        sb.append("Hejsa, ");
        sb.append(name);
        sb.append("! ");
        sb.append("Du er ");
        sb.append(age);
        sb.append(" år gammel.");


        System.out.println(sb.toString());

//opgave 6
        int score = 100;
        System.out.println(score);

        score += 50;
        System.out.println(score);

        score += 25;
        System.out.println(score);

        //opgave 7
        int health = 100;

        health -= 15;
        System.out.println(health);

        health -= 20;
        System.out.println(health);

        //opgave 8
        double price = 50.0;
        System.out.println(price);

        price *= 2;
        System.out.println(price);

        //opgave 9
        int counter = 10;

        System.out.println(counter);

        counter++;

        System.out.println(counter);

        counter--;

        System.out.println(counter);

        // opgave 10
        int number = 10;
        number += 5;
        System.out.println(number);
        number -= 3;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        //opgave 11
        String productName = "Hummer";
        double productPrice = 2999.99;
        boolean inStock = true;
        int stockQuantity = 4;
        double DiscountPercent = 10.0;
        String category = "Mad";

        //opgave 12
        String elevNavn = "Carlos";       // String variabel
        int proveScore = 85;              // int variabel
        int afleveringsScore = 92;        // int variabel
        double endeligKarakter = 88.5;    // double variabel
        boolean harBestaaet = true;       // boolean variabel

        //opgave 13
        String gæstNavn = "Arne noughatgren";      // String variabel
        int værelsesNummer = 204;               // int variabel
        int Nætter = 3;                    // int variabel
        double prisPerNat = 899.00;              // double variabel
        boolean morgenmadInkluderet = true;     // boolean variabel
        double totalPris = 2697.00;             // double variabel

        //opgave 14
        int dagligeSkridt = 8547;
        int skridtMål = 10000;
        double gåetDistanceKm = 6.2;
        int forbrændteKalorier = 420;
        boolean målNået = false;

        //opgave 15
        String bogTitel = "Hans og Grete";
        String forfatter = "Brødrene Grimm";
        String isbnNummer = "978-87-23-12345-6";
        int antalSider = 64;
        boolean erTilgængelig = true;
        String lånerNavn = "Mr Beast";
        LocalDate afleveringsdato = LocalDate.of(2026, 12, 26);
        double forsinkelsesgebyr = 25.0;
        boolean erBestseller = true;
        double bedømmelse = 2.5;

        //reflektionsspørgsmål
        //Hvad er forskellen mellem int division og double division?
        int resultat1 = 5 / 2;      // = 2 (int division klipper decimaler af)
        double resultat2 = 5 / 2;   // = 2.0 (men stadig int division først!)
        double resultat3 = 5.0 / 2; // = 2.5 (double division)
        double resultat4 = 5 / 2.0; // = 2.5 (double division)

        //Hvornår skal du bruge parenteser i calculations?
             -//Når du vil ændre rækkefølgen af regneoperationer

        //Hvad giver modulo (%) operator dig?
             //Bruges til at tjekke om tal er lige/ulige, arbejde med tidsenheder, osv.
        int rest1 = 10 % 3;  // = 1 (10 ÷ 3 = 3 med rest 1)
        int rest2 = 7 % 2;   // = 1 (ulige tal: rest 1)
        int rest3 = 8 % 2;   // = 0 (lige tal: rest 0)
        int rest4 = 5 % 5;   // = 0 (ingen rest)

        //Hvordan kombinerer du strings og numbers?
        int alder = 25;
        double pris = 99.95;

// Metode 1: String concatenation med +
        String tekst1 = "Jeg er " + alder + " år gammel";

// Metode 2: String.format() for mere kontrol
        String tekst2 = String.format("Prisen er %.2f kr.", pris);

// Metode 3: StringBuilder for mange sammenkædninger
        String tekst3 = new StringBuilder()
                .append("Alder: ").append(alder)
                .append(", Pris: ").append(pris)
                .toString();

        //Hvad sker der hvis du skriver "5" + 3 vs 5 + 3?
        String resultat1 = "5" + 3;   // = "53" (String concatenation)
        int resultat2 = 5 + 3;        // = 8 (matematisk addition)
        String resultat3 = "Resultat: " + (5 + 3); // = "Resultat: 8"

        //Hvorfor er += mere praktisk end = ... + ?
        // Med += (kortere og mere læseligt)
        int tal = 10;
        tal += 5;     // samme som: tal = tal + 5;
        tal -= 3;     // samme som: tal = tal - 3;
        tal *= 2;     // samme som: tal = tal * 2;

// Uden += (længere og mindre læseligt)
        int tal2 = 10;
        tal2 = tal2 + 5;  // mindre elegant

        //Hvordan tvinger du decimal division med int variables?
        int a = 5;
        int b = 2;

// Metode 1: Cast til double
        double resultat1 = (double)a / b;  // = 2.5

// Metode 2: Brug decimaltal i beregningen
        double resultat2 = a * 1.0 / b;    // = 2.5

// Metode 3: Cast begge variable
        double resultat3 = (double)a / (double)b;  // = 2.5

// Metode 4: Brug double variable direkte
        double x = a;
        double y = b;
        double resultat4 = x / y;  // = 2.5

    }
        }
