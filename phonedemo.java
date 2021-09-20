public class phonedemo {
    public static void main(String[] args) {
        //chaungjianduixiang
        phone p = new phone();
        p.brand="小米";
        p.price=1999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendmessage();
    }
}
