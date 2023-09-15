import java.util.Scanner;

public class Main {
    public static void EspecieVista(Duck especie) {
        int option = 0;
        String optionDuck;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.print("Especie: ");
        especie.display();
        System.out.print("Comportamiento volar: ");
        especie.perfomFly();
        System.out.print("Comportamiento nadar: ");
        especie.performswim();
        System.out.print("Comportamiento graznar: ");
        especie.perfomQuack();
        System.out.println("-------------------------------------");
        System.out.println("Ingrese qué comportamiento del Pato le gustaría cambiar"); 
        System.out.println("Volar");
        System.out.println("Nadar");
        System.out.println("Graznar");
        System.out.print(": ");
        optionDuck = scanner.nextLine().toLowerCase();

        // Cambiar Comportamientos de vuelo //
        if (optionDuck.equals("volar")) {
            System.out.println("-------------------------------------");
            System.out.print("Ingrese 1 para volar con alas, 2 para no volar o 3 para volar con cohete: ");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                especie.setFlyBehavior(new FlyWithWings());
            } else if (option == 2) {
                especie.setFlyBehavior(new FlyNoWay());
            } else if (option == 3) {
                especie.setFlyBehavior(new FlyRocketPowered());
            }
            System.out.println("Cambio realizado!");
            scanner.nextLine();
            System.out.println("-------------------------------------");
        }

        // Cambiar Comportamientos de nadar //
        if (optionDuck.equals("nadar")) {
            System.out.println("-------------------------------------");
            System.out.print("Ingrese 1 para nadar, 2 para no nadar o 3 para nadar en bote: ");
            option = Integer.parseInt(scanner.nextLine());
            
            if (option == 1) {
                especie.setSwimBehavior(new SwimDuck());
            } else if (option == 2) {
                especie.setSwimBehavior(new SwimNoWay());
            } else if (option == 3) {
                especie.setSwimBehavior(new SwimWithBoat());
            }
            System.out.println("Cambio realizado!");
            scanner.nextLine();
            System.out.println("-------------------------------------");
        }

        // Cambiar Comportamientos de graznar //
        if (optionDuck.equals("graznar")) {
           System.out.println("-------------------------------------");
            System.out.print("Ingrese 1 para hacer Quack, 2 para Mute o 3 para Squeak: ");
            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                especie.setQuackBehavior(new Quack());
            } else if (option == 2) {
                especie.setQuackBehavior(new MuteQuack());
            }
            System.out.println("Cambio realizado!");
            scanner.nextLine();
            System.out.println("-------------------------------------");
        }

        if (optionDuck.equals("salir")) {
           System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck readHead = new RedHeadDuck();
         Duck decoy = new DecoyDuck();
        Duck model = new ModelDuck();
        Duck rubber = new RubberDuck();
     

        int option = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("---------------MENU-----------------");
            System.out.println("Seleccione una especie de pato del menu");
            System.out.println("Presione 1 para seleccionar el tipo Mallard Duck");
            System.out.println("Presione 2 para seleccionar el tipo Red Head Duck");
            System.out.println("Presione 3 para seleccionar el tipo Decoy Duck");
            System.out.println("Presione 4 para seleccionar el tipo Model Duck");
            System.out.println("Presione 5 para seleccionar el tipo Rubber Duck");
            System.out.println("Presione 0 para salir del programa");
           System.out.println("-------------------------------------");
            System.out.print(": ");
            option = Integer.parseInt(scanner.nextLine());
           System.out.println("-------------------------------------");

            switch (option) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    EspecieVista(mallard);
                    break;

                case 2:
                   EspecieVista(readHead);
                    break;

                case 3:
                   EspecieVista(decoy);
                    break;

                case 4:
                    EspecieVista(model);
                    break;

                case 5:
                    EspecieVista(rubber);
                    break;

                default:
                    System.out.println("Ingrese una opción correcta.");
                    System.out.println("Presione <Enter> para volver...");
                    scanner.nextLine();
                    System.out.println("-------------------------------------");
                    break;
            }
        } while (option != 0);
    }
}
