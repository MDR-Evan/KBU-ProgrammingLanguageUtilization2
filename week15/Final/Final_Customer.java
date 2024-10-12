public class Customer extends Man {
    private int time, distance;
    private char driver;

    public Customer(String custom_num, String name, String type) {
        super(custom_num, name, type);
    }

    public Customer(String custom_num, String name, String type, char driver, int time, int distance) {
        super(custom_num, name, type);
        this.driver = driver;
        this.time = time;
        this.distance = distance;
    }

    public Customer(String customNum, String name, int time, int distance, char driver) {
        super(customNum, name, "Unknown");
        this.time = time;
        this.distance = distance;
        this.driver = driver;
    }

    public int getTime() {
        return time;
    }

    public int getDistance() {
        return distance;
    }

    public char getDriver() {
        return driver;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setDriver(char driver) {
        this.driver = driver;
    }

    public char driver() {
        char answer;
        if (getDriver() == 'Y' || getDriver() == 'y') {
            answer = 'O';
        } else {
            answer = 'X';
        }
        return answer;
    }

    public int basic(){
        int pay;
        switch (getType()) {
            case "S", "s":
                pay = 40000;
                break;
            case "M", "m":
                pay = 50000;
                break;
            case "H", "h":
                pay = 35000;
                break;
            case "B", "b":
                pay = 55000;
                break;
            case "J", "j":
                pay = 39000;
                break;
            default:
                pay = 0;
                break;
        }
        return pay;
    }

    public int plus(){
        int pay;
        switch (getType()) {
            case "S", "s":
                if (getTime() <= 12) {
                    pay = getTime() * 7600;
                } else {
                    pay = (getTime() * 7600) + ((getTime() - 12) * 8600) ;
                }
                break;
            case "M", "m":
                if (getTime() <= 10) {
                    pay = getTime() * 8800;
                } else {
                    pay = (getTime() * 8800) + ((getTime() - 10) * 10000) ;
                }
                break;
            case "H", "h":
                if (getTime() <= 9) {
                    pay = getTime() * 11600;
                } else {
                    pay = (getTime() * 11600) + ((getTime() - 9) * 12000) ;
                }
                break;
            case "B", "b":
                if (getTime() <= 15) {
                    pay = getTime() * 9500;
                } else {
                    pay = (getTime() * 9500) + ((getTime() - 15) * 11000) ;
                }
                break;
            case "J", "j":
                if (getTime() <= 12) {
                    pay = getTime() * 12000;
                } else {
                    pay = (getTime() * 12000) + ((getTime() - 12) * 13000) ;
                }
                break;
            default:
                pay = 0;
                break;
        }
        return pay;
    }

    public int discount() {
        int pay;
        switch (getType()) {
            case "S", "s":
                if (getDistance() < 120) {
                    pay = (120 - getDistance()) * 2500;
                } else {
                    pay = 0;
                }
                break;
            case "M", "m":
                if (getDistance() < 185) {
                    pay = (185 - getDistance()) * 2500;
                } else {
                    pay = 0;
                }
                break;
            case "H", "h":
                if (getDistance() < 120) {
                    pay = (120 - getDistance()) * 2500;
                } else {
                    pay = 0;
                }
                break;
            case "B", "b":
                if (getDistance() < 135) {
                    pay = (135 - getDistance()) * 2500;
                } else {
                    pay = 0;
                }
                break;
            case "J", "j":
                if (getDistance() < 140) {
                    pay = (140 - getDistance()) * 2500;
                } else {
                    pay = 0;
                }
                break;
            default:
                pay = 0;
                break;
        }
        return pay;
    }

    public int pay() {
        int pay;
        int driver = 0;
        if (getDriver() == 'Y' || getDriver() == 'y') {
            driver = 150000;
        }

        if ((basic() + plus()) - discount() > 0) {
            pay = (basic() + plus()) - discount() + driver;
        } else {
            pay = basic();
        }
        return pay;
    }

    public String note() {
        String best = "";
        if (pay() >= 400000) {
            best = "우수";
        }
        return best;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\t(%1c)\t  %3d\t\t  %3dKm\t\t %,6d\t\t%,10d\t  %,10d\t\t%,10d\t\t %2s",driver(), getTime(), getDistance(), basic(), plus(), discount(), pay(), note());
    }
}
