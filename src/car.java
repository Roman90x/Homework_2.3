import java.time.LocalDate;

public class car extends transport {
    private double engineVolume;
    private String transmission;
    private final String body;
    private String regNumber;
    private final int seats;
    private boolean winterTires;
    private key key;
    private Insurance insurance;


    public car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int maxSpeed,
               double engineVolume,
               String transmission,
               String body,
               String regNumber,
               int seats,
               boolean winterTires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if (body == null) {
            this.body = "седан";
        } else {
            this.body = body;
        }
        if (seats <= 0 && seats >7) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }

        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
        setKey(key);
        setInsurance(insurance);

    }

    @Override
    public void refill() {
        System.out.println("Объекты car можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар");
    }

    @Override
    public String toString() {
        return "car {" + super.toString() +
                "; Объем двигателя " + engineVolume +
                ", Кпп " + transmission +
                ", кузов " + body +
                ", госномер " + regNumber + " " + isCorrectRegNumber() +
                ", количество мест " + seats +
                "; сезонность резины - " + (winterTires ? "зимняя " : "летняя ") +
                "; " + (key.isKeylessAccess() ? "бесключевой доступ ":"обычный доступ ") +
                "; " + (key.isRemoteLaunch() ? "удаленный запуск ":"обычный запуск ") +
                '}';

    }

    public String getBody() {
        return body;
    }

    public int getSeats() {
        return seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "АКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "х000хх000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public car.key getKey() {
        return key;
    }

    public void setKey(car.key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTires() {
        winterTires = !winterTires;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class key {
        private final boolean remoteLaunch;
        private final boolean keylessAccess;

        public key(boolean remoteLaunch, boolean keylessAccess) {
            this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;
        }

        public key() {
            this(false, false);
        }

        public boolean isRemoteLaunch() {
            return remoteLaunch;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validityPeriod;
        private final int cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, int cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 12000, null);
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidity() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) ;
            System.out.println("Нужно срочно ехать оформлять новую страховку");
        }

        public void chekNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

}

