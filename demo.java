package animal;

public class demo {
    public static void main(String[] args) {
        cat c = new cat();
        c.setAge("10");
        c.setName("加菲猫");
        System.out.println(c.getAge()+c.getname());
        c.lookdoor();
        cat c1 = new cat("皮特","12");
        c1.lookdoor();
        dog d =new dog();
        d.setAge("10");
        d.setName("刘志超");
        System.out.println(d.getAge()+d.getname());
        d.mouse();
        dog d1=new dog ("19","考四级");
    }
}
