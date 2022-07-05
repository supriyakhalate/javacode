interface DataBase{
     void connect();
}
class Payment{
    public void makePayment(){
        System.out.println("payment completed");
    }
}
class MyCart extends Payment implements DataBase
{
      public void connect(){
        System.out.println("connect to sqlserver");
      }
}

class Library extends Payment implements DataBase
{
      public void connect(){
        System.out.println("connect to mysql");
      }
}

class Info{
    public static void main(String[] args)
    {
         MyCart c=new MyCart();
         c.connect();
         c.makePayment();

         Library l = new Library();
         l.connect();
         l.makePayment();
    }
}