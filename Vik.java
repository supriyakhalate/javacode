abstract class Area
{
    abstract public void findArea();
 
    public void fillColour(String str){
        System.out.println("colour is "+str);
    }
}

class Circle extends Area
{
   
   public void findArea(){

     System.out.println("Area of circle..");
   }

}

class Reactangle extends Area
{
   
   public void findArea(){

     System.out.println("Area of Reactangle..");
   }

}

class Vik{
    public static void main(String[] args){
    Circle c=new Circle();
    c.findArea();
    c.fillColour("red");

    Reactangle r=new Reactangle();
    r.findArea();
    r.fillColour("blue");
    }
}


