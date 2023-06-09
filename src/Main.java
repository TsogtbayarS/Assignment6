public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('u', "Uynga");
        t.add('t', "Tsogtbayar");
        t.add('w', "Willie");
        System.out.println("Before edit the T");
        System.out.println(t);
        t.add('t', "Tsogtoo");
        System.out.println("After edit the T");
        System.out.println(t);
        System.out.println(t.get('t'));
        System.out.println(t.get('u'));
    }
}
