public class HelloWorld{

     public static void main(String []args){
        //T t1=new T("A");
        //T t2=new T("B");
        //t1.start();
        //t2.start();
        new Thread(new R("AA")).start();
        new Thread(new R("BB")).start();
     }
}
