//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person Akmal= new Person("Akmal", "Toshkent,Muqimiy 12");
        System.out.println(Akmal);
        Staff Bobur=new Staff("Bobur", "Pskent,Abduqahor 27", "1-IDUM", 1000);
        System.out.println(Bobur);
        Student Ali=new Student("Ali", "Olmaliq,ShoshIloq 23", "Enginering", 4,1000);
        System.out.println(Ali);
    }
}