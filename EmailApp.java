public class EmailApp {
    public static void main(String[] args){
        Email em1 = new Email("Issac", "Smith");

        em1.setAlternateEmail(("is@gmail.com"));
        System.out.println(em1.showInfo());
    }
}
