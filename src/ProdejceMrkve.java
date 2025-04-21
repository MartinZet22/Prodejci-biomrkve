import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProdejceMrkve {
    private String jmeno;
    private String datumNarozeni;
    private String adresa;
    private int pocetSmluv;
    private double mnozstviMrkve;
    private boolean jeSenior;

    public ProdejceMrkve(String jmeno, String datumNarozeni, String adresa, int pocetSmluv, double mnozstviMrkve, boolean jeSenior) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
        this.adresa = adresa;
        this.pocetSmluv = pocetSmluv;
        this.mnozstviMrkve = mnozstviMrkve;
        this.jeSenior = jeSenior;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPocetSmluv() {
        return pocetSmluv;
    }

    public void setPocetSmluv(int pocetSmluv) {
        this.pocetSmluv = pocetSmluv;
    }

    public double getMnozstviMrkve() {
        return mnozstviMrkve;
    }

    public void setMnozstviMrkve(double mnozstviMrkve) {
        this.mnozstviMrkve = mnozstviMrkve;
    }

    public boolean isJeSenior() {
        return jeSenior;
    }

    public void setJeSenior(boolean jeSenior) {
        this.jeSenior = jeSenior;
    }

    public int getVek() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate narozeni = LocalDate.parse(datumNarozeni, formatter);
        LocalDate dnes = LocalDate.now();
        return Period.between(narozeni, dnes).getYears();
    }
}