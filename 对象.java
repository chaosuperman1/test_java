package java对象和类;

public class 对象 {
    int age;
    String name;
    public 对象(){}
    public 对象(String name,int age){
        // 这个构造器仅有一个参数：name
       this.name=name;
       this.age=age;
    }
    public void setAge( int age ){
       this.age=  age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + age );
        return age;
    }
//
//    public static void main(String[] args){
//        /* 创建对象 */
//        Puppy myPuppy = new Puppy( "tommy" );
//        /* 通过方法来设定age */
//        myPuppy.setAge( 2 );
//        /* 调用另一个方法获取age */
//        myPuppy.getAge( );
//        /*你也可以像下面这样访问成员变量 */
//        System.out.println("变量值 : " + myPuppy.puppyAge );
    }
