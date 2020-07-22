import java.time.LocalDate;
class Student{
    int rollNo;
    String name;
    void insertRecords(int i,String n){
        rollNo=i;
        name=n;
    }
    void displayDeatils(){
        System.out.println("Roll No:"+rollNo+" Name: "+name );
    }
}
class Example{
    int input=150;
    String str="Hello World";

    void DisplayDate(){
        LocalDate myObj = LocalDate.now();
        System.out.println("Todays Date is: "+myObj);
    }


    Example(){
        System.out.println("Default constructor");
    }
    Example(int i, int j){
        System.out.println("constructor with Two parameters");
    }
    Example(int i, int j, int k){
        System.out.println("constructor with Three parameters");
    }
    Example(int i, String name){
        System.out.println("constructor with int and String parameters");
    }

    public static void main(String args[]) {
        Example obj = new Example();
        Example obj2 = new Example(12, 12);
        Example obj3 = new Example(1, 2, 13);
        Example obj4 = new Example(1, "BeginnersBook");
        System.out.println("Command-Line arguments are");
        for (String str : args) {
            int argument = Integer.parseInt(str);
            System.out.println(argument);

        }
        Example Obj5 = new Example();
        System.out.println(Obj5.input);
        System.out.println(Obj5.str);
        Obj5.DisplayDate();

        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecords(10,"Ranbir");
        s1.displayDeatils();
        s2.insertRecords(99,"Preeti");

    }


}