public class Calculadora{
    private suma = 0;
    private resta = 0;
    private multiplicacion = 0;
    private division = 0;
    private int opcion;
    Scanner s1 = new Scanner(System.in);
    private String decision;
    private int num1;
    private int num2;

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
                    System.out.println("Intoduca el primer número ");
                    num1 = nextInt();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("La opción introducida es incorrecta ");
                    break;
            }

            System.out.println("¿Desea realizar otra operación? S/N ");
            decision = s1.next();
        }while(decision.equalsIgnoreCase("s"));
    }

    public int sumar(){

    }
}