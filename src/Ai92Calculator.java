public class Ai92Calculator {
    double pricai92Pricee = 42.74;
    double tax = 0.13;
    double fullPrice = pricai92Pricee * (1 + tax);

    public double calculateLoop(double volume) {
        return volume * fullPrice;
    }
}
