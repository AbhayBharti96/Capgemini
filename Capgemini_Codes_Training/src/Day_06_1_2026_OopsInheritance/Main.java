package Day_06_1_2026_OopsInheritance;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class P1{
 void show(){
     System.out.println("Hello i Am Parent");
 }
}
class C1 extends P1{
 void display(){
     System.out.println("hello i am child ");
 }
}
class Main {
 public static void main(String[] args) {
    //Upcasting 
    P1 p  = new C1();// Providing Parent Object refernce to Child..It is automatically Done
   
    C1 c = (C1)p;// Downcasting 
    // Done Manually to acess the Child method using parent object we have
    // to the downcast after upcasting also known as explicit casting..
    c.display();
    c.show();
 }
}