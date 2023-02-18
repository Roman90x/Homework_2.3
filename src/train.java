public class train extends transport {

    private float priceTicket;
    private int travelTime;
    private String initialStation;
    private String finishStation;
    private int numberOfWagons;

    public train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 int maxSpeed,
                 float priceTicket,
                 int travelTime,
                 String initialStation,
                 String finishStation,
                 int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setPriceTicket(priceTicket);
        setTravelTime(travelTime);
        setInitialStation(initialStation);
        setFinishStation(finishStation);
        setNumberOfWagons(numberOfWagons);

    }

    @Override
    public void refill() {
        System.out.println("Объекты train нужно заправлять дизелем");
    }

    @Override
    public String toString() {
        return "train{" +
                "transport=" + super.toString() +
                ", priceTicket=" + priceTicket +
                ", travelTime=" + travelTime +
                ", initialStation='" + initialStation + '\'' +
                ", finishStation='" + finishStation + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }

    public float getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(float priceTicket) {
        this.priceTicket = Math.max(priceTicket, 1.0f);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 1);
    }

    public String getInitialStation() {
        return initialStation;
    }

    public void setInitialStation(String initialStation) {
        if (initialStation == null) {
            this.initialStation = "default";
        } else {
            this.initialStation = initialStation;
        }
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        if (finishStation == null) {
            this.finishStation = "default";
        } else {
            this.finishStation = finishStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.max(numberOfWagons, 1);
    }
}
