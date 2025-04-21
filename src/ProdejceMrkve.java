public class ProdejceMrkve {
    private String jmeno;
    private String datumNarozeni;
    private int pocetSmluv;
    private double mnozstviMrkve;
    private boolean jeSenior;


    public ProdejceMrkve(String jmeno, String datumNarozeni, int pocetSmluv, double mnozstviMrkve, boolean jeSenior) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
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
}

