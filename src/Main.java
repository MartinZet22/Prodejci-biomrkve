public class Main {
    public static void main(String[] args) {

        ProdejceMrkve prodejce1 =
                new ProdejceMrkve("Karel Mrkvička", "12.03.1955", 12, 18.5, true);

        ProdejceMrkve prodejce2 =
                new ProdejceMrkve("František Okurka", "25.11.1997", 5,6.3, false);

        System.out.println();

        System.out.println("Jméno prodejce 1: " + prodejce1.getJmeno());
        System.out.println("Datum narození: " + prodejce1.getDatumNarozeni());
        System.out.println("Počet smluv: " + prodejce1.getPocetSmluv());
        System.out.println("Množství mrkve: " + prodejce1.getMnozstviMrkve() + "t");
        System.out.println("Je senior: " + (prodejce1.isJeSenior() ? "Ano" : "Ne"));

        System.out.println();

        System.out.println("Jméno prodejce 2: " + prodejce2.getJmeno());
        System.out.println("Datum narození: " + prodejce2.getDatumNarozeni());
        System.out.println("Počet smluv: " + prodejce2.getPocetSmluv());
        System.out.println("Množství mrkve: " + prodejce2.getMnozstviMrkve() + "t");
        System.out.println("Je senior: " + (prodejce2.isJeSenior() ? "Ano" : "Ne"));

    }
}