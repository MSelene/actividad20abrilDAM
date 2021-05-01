public class Calculadora{
    private int suma = 0;
    private int resta = 0;
    private int multiplicacion = 0;
    private int division = 0;
    private int opcion;
    Scanner sc = new Scanner(System.in);
    private String decision;
    private int num1;
    private int num2;
    private static Calculadora menu = new Calculadora();

    public void Menu(){
        do{
            System.out.println("Introduzca la operación que desea realizar: ");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            opcion = s1.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Intoduzca el primer número: ");
                    num1 = sc.nextInt();
                    System.out.println("Introduzca el segundo número: ");
                    num2 = sc.nextInt();
                    menu.Sumar(num1, num2);
                    break;
                case 2:
                    System.out.println("Intoduzca el primer número: ");
                    num1 = sc.nextInt();
                    System.out.println("Introduzca el segundo número: ");
                    num2 = sc.nextInt();
                    menu.Restar(num1, num2);
                    break;
                case 3:
                    System.out.println("Intoduzca el primer número: ");
                    num1 = sc.nextInt();
                    System.out.println("Introduzca el segundo número: ");
                    num2 = sc.nextInt();
                    menu.Multiplicar(num1, num2);
                    break;
                case 4:
                    System.out.println("Intoduzca el primer número: ");
                    num1 = sc.nextInt();
                    System.out.println("Introduzca el segundo número: ");
                    num2 = sc.nextInt();
                    menu.Dividir(num1, num2);
                    break;
                default:
                    System.out.println("La opción introducida es incorrecta ");
                    break;
            }

            System.out.println("¿Desea realizar otra operación? S/N ");
            decision = sc.next();
        }while(decision.equalsIgnoreCase("s"));
    }

    public void Sumar(int num1, int num2){
        suma = num1 + num2;
        System.out.println("Resultado: "+suma);
    }

    public void Restar(int num1, int num2){
        resta = num1 - num2;
        System.out.println("Resultado: "+resta);
    }

    public void Multiplicar(int num1, int num2){
        multiplicacion = num1 * num2;
        System.out.println("Resultado: "+multiplicacion);
    }

    public void Dividir(int num1, int num2){
        division = num1 / num2;
        System.out.println("Resultado: "+division);
    }
    
    public static void main(String[] args) {
        menu.Menu();
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static Calculadora getMenu() {
        return menu;
    }

    public static void setMenu(Calculadora menu) {
        Calculadora.menu = menu;
    }
    
}
}
