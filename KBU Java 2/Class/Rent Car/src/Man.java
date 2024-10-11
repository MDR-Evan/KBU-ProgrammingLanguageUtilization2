public class Man {
    private String custom_num, name, type;

    public Man() {
    }

    public Man(String custom_num, String name, String type) {
        this.custom_num = custom_num;
        this.name = name;
        this.type = type;
    }

    public String getCustom_num() {
        return custom_num;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        String model = "";
        switch (this.type) {
            case "S", "s":
                model = "소형 승용차";
                break;
            case "M", "m":
                model = "중형 승용차";
                break;
            case "H", "h":
                model = "승합차";
                break;
            case "B", "b":
                model = "미니버스";
                break;
            case "J", "j":
                model = "지프";
                break;
            default:
                model = "알 수 없음";
                break;
        }
        return model;
    }

    @Override
    public String toString() {
        return String.format("   %4s\t\t %3s\t %1s\t\t%7s", custom_num, name, type, getModel());
    }
}
