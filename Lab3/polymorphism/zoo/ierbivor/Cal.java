package polymorphism.zoo.ierbivor;

public class Cal extends Ierbivor {
    public Cal(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "necheaza";
    }

    @Override
    public void scoateSunet() {
        System.out.println("calul " + sunetSpecific);
    }
}
