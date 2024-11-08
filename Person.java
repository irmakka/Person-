public class Person {
    //attributes , Instance variables 
    public String firstName;
    public String lastName;
    public int age;
    //Constructor  , constructors are made with the name of the class
    public Person (){
    }
    public  Person(String firstName,String lastName,int age){
        // it means that the firstName attribute of this object will be the firstName value I will give 
        //Same for the other attributes 
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void print(){
        //will print the values of the object .
        System.out.print("\n"+this.firstName+" "+this.lastName+" "+this.age);
    }
}
