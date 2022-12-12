public class bus extends transport {
    public bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Объекты bus можно заправлять бензином или дизелем на заправке");
    }
}
