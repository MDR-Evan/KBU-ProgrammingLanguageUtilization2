public abstract class Ramyun implements Topping{
    private String ramyun, soup, egg, water, green_onion;

    public Ramyun(String ramyun,boolean flag) {
        this.ramyun = ramyun;
        this.soup = "스프";
        if (flag)
            this.egg = "계란";
        else
            this.egg = "";
        this.water = "생수";
        this.green_onion = "파";
    }

    private void boil_Water() {
        System.out.printf("\n" + water + "를 끓인다.\n");
    }
    
    public void cooking() {
        boil_Water();
        System.out.println(ramyun + "," + soup + "," + egg + "," + green_onion + "를 넣고 끓인다.");
        topping();
        System.out.println("요리 완성\n맛있게 드세요.");
    }
}
