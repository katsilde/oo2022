import java.util.Scanner;

public class Game {
    //main --> pakub
    public static void main(String[] args) {
        //sout --> pakub
        System.out.println("Hello World");
        //String    sõnaline muutuja
        //char      üks täht
        //double    15 kohaline komakohaga nr
        //float     7 kohaline komakohaga nr
        //int       täiskohaline nr (max 2.1 miljardit)
        //byte      128kohta
        //short     32000 kohta
        //long      väga palju 9x(0x18)
        //boolean   kahendväärtus true/false

        int worldHeight =5;
        int worldWidth =10;
        int playerCoordinateY =generateRandomCoordinate(worldHeight);
        int playerCoordinateX =generateRandomCoordinate(worldWidth);
        int enemyCoordinateY =generateRandomCoordinate(worldHeight);
        int enemyCoordinateX =generateRandomCoordinate(worldWidth);

        printMap(worldHeight,worldWidth,playerCoordinateY,
                playerCoordinateX,enemyCoordinateY, enemyCoordinateX );

        //klasside tegemine tund nr2
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            switch (input){
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
            printMap(worldHeight, worldWidth, playerCoordinateY,
                    playerCoordinateX, enemyCoordinateY, playerCoordinateX);
            input = scanner.nextLine();
        }
    }
    // int sam tüüp mis peab olema fn sees return järgi
    public static int generateRandomCoordinate(int worldSize ){

        return (int) (Math.random()*(worldSize-2))+1;
    }
    public static void printMap(int worldHeight, int worldWidth,
                                int playerCoordinateY, int playerCoordinateX,
                                int enemyCoordinateY, int enemyCoordinateX){
        char symbol;  //üks kord deklareerib muutuja
        //fori
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {

                if (y ==0 || y == worldHeight-1) {// primitiiv || ab_päring (lihtsad asjad ennem)
                    symbol = '-';
                } else if (x==0|| x == worldWidth-1){
                    symbol = '|';
                }else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x){
                    symbol='x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol='z';
                }
                System.out.print(symbol);

            }
            System.out.println();

        }
    }
}


//public static double taksosõit(double h){
    //return 3+0.8*h
        //}
