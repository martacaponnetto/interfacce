class Rettangolo implements Forma { //sottoclasse, implementa forma
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}


