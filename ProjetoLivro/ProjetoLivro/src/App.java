public class App {
    public static void main(String[] args) throws Exception {
        
        LivroDigital ld = new LivroDigital("C#", 
        new Autor("Maria", "Brasileira", 
        "maraia@gmail.com"), 
        "Estudos", 2013, 684, 54.10);

        ld.info();
    }
}
