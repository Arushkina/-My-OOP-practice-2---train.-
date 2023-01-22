import java.util.ArrayList;
import java.util.Scanner;
//create an ArrayList of Tickets objects and to take input from the user
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Train train = new Train();
        train_car train_car = new train_car();
        luxuryTrain_car lux = new luxuryTrain_car();
        coupeTrain_car coupe = new coupeTrain_car();
        secondClassTrain_car secondClassCarriage = new secondClassTrain_car();
        Tickets ticket = new Tickets();
        ArrayList<Tickets> tickets = new ArrayList<>();
        tickets.add(new Tickets("A","AZ", "secondClass", 1,1));
        tickets.add(new Tickets("B","AB", "secondClass", 1,2));
        tickets.add(new Tickets("C","EV", "secondClass", 1,3));
        tickets.add(new Tickets("D","CF", "secondClass", 1,4));
        tickets.add(new Tickets("E","KO", "secondClass", 1,5));
        tickets.add(new Tickets("F","AS", "secondClass", 1,6));
        tickets.add(new Tickets("G","PB", "lux", 1,7));
        tickets.add(new Tickets("H","KJ", "lux", 1,8));
        tickets.add(new Tickets("I","SS", "lux", 1,9));
        tickets.add(new Tickets("K","DD", "secondClass", 1,10));
        tickets.add(new Tickets("L","WE", "lux", 1,11));
        tickets.add(new Tickets("M","TH", "lux", 1,12));
        tickets.add(new Tickets("N","KL", "secondClass", 1,13));
        tickets.add(new Tickets("O","OP", "lux", 2,14));
        tickets.add(new Tickets("P","KM", "lux", 2,15));
        tickets.add(new Tickets("W","RT", "coupe", 2,1));
        tickets.add(new Tickets("X","KO", "coupe", 2,1));
        tickets.add(new Tickets("Y","DI", "coupe", 2,1));
        tickets.add(new Tickets("Z","AS", "secondClass", 1,1));
        int seatNum = 0;
        int train_carNum = 0;
        String name = null;
        String surname = null;
        String train_car_type=null;
        while (true){
            int action = message();
            if (action == 1) {
                int CarriageType = messageToByTicket();
                if (CarriageType == 1) {
                    System.out.println("Enter your name");
                    name = scanner.next();
                    System.out.println("Enter your name");
                    surname = scanner.next();
                    train_carNum = messageToChoseCarriageNum(train.getNumOfLuxCarriage());
                    seatNum = messageToChoseSeat(lux.getNumOfSeat());
                    train_car_type="lux";
                } else if (CarriageType == 2) {
                    System.out.println("Enter your name");
                    name = scanner.next();
                    System.out.println("Enter your name");
                    surname = scanner.next();
                    train_carNum = messageToChoseCarriageNum(train.getNumOfCoupeCarriage());
                    seatNum = messageToChoseSeat(coupe.getNumOfSeat());
                    train_car_type="coupe";
                } else if (CarriageType == 3) {
                    System.out.println("Enter your name");
                    name = scanner.next();
                    System.out.println("Enter your name");
                    surname = scanner.next();
                    train_carNum = messageToChoseCarriageNum(train.getNumOfLuxCarriage());
                    seatNum = messageToChoseSeat(secondClassCarriage.getNumOfSeat());
                    train_car_type="secondClass";
                }
                tickets.add(new Tickets(name,surname, train_car_type, train_carNum, seatNum));
            } else if (action == 2) {
                System.out.println(tickets.toString());
            } else if (action == 3) {
                break;
            }
        }
    }

    public static int message() {
        int temp = 0;
        while (true) {
            System.out.println("press [1] to by a ticket \n" +
                    "press [2] to list the passengers\n" +
                    "press [3] to exit");
            temp = scanner.nextInt();
            if (temp < 1 || temp > 3) {
                System.out.println("You can chose from 1 to 3");
                continue;
            }
            return temp;
        }
    }
    public static int messageToByTicket() {
        System.out.println("Chose the Carriage type");
        int temp = 0;
        while (true) {
            System.out.println("[1] luxury carriage\n" +
                    "[2] coupe carriage\n" +
                    "[3] second class carriage");
            temp = scanner.nextInt();
            if (temp < 1 || temp > 3) {
                System.out.println("You can chose from 1 to 3");
                continue;
            }
            return temp;
        }
    }
    public static int messageToChoseCarriageNum(int numOfCarriage) {
        int temp = 0;
        while (true) {
            System.out.println("Chose the Carriage 1 - " + numOfCarriage);
            temp = scanner.nextInt();
            if (temp < 1 || temp > numOfCarriage) {
                System.out.println("You can chose from 1 to " + numOfCarriage);
                continue;
            }
            return temp;
        }
    }

    public static int messageToChoseSeat(int numOfSeats) {
        int temp = 0;
        while (true) {
            System.out.println("Chose the seat 1 - " + numOfSeats);
            temp = scanner.nextInt();
            if (temp < 1 || temp > numOfSeats) {
                System.out.println("You can chose from 1 to " + numOfSeats);
                continue;
            }
            return temp;
        }
    }
}
class Tickets {
    private String name;
    private String Surname;
    private String train_carType;
    private int train_carNum;
    private int seatNum;

    public String getTrain_carType() {
        return train_carType;
    }

    public void setTrain_carType(String train_carType) {
        this.train_carType = train_carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getTrain_carNum() {
        return train_carNum;
    }

    public void setTrain_carNum(int train_carNum) {
        this.train_carNum = train_carNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public Tickets(String name, String surname, String train_carType, int train_carNum, int seatNum) {
        this.name = name;
        Surname = surname;
        this.train_carType = train_carType;
        this.train_carNum = train_carNum;
        this.seatNum = seatNum;
    }

    public Tickets(){
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", train_carType='" + train_carType + '\'' +
                ", train_carNum=" + train_carNum +
                ", seatNum=" + seatNum +
                '}';
    }
}
class Train{
    private int numOfLuxCarriage = 5;
    private int numOfCoupeCarriage = 15;
    private int numOf2ndClassCarriage = 30;

    public int getNumOfLuxCarriage() {
        return numOfLuxCarriage;
    }

    public int getNumOfCoupeCarriage() {
        return numOfCoupeCarriage;
    }

    public int getNumOf2ndClassCarriage() {
        return numOf2ndClassCarriage;
    }
}
class train_car{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public train_car(double weight) {
        this.weight = weight;
    }

    public train_car() {
    }
}
class luxuryTrain_car extends train_car {
    private int numOfSeat = 12;
    private int price = 20000;

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public int getPrice() {
        return price;
    }

    public luxuryTrain_car() {
    }

    public luxuryTrain_car(int price) {
        this.price = price;
    }
}
class coupeTrain_car extends train_car {
    private int numOfSeat = 20;
    private int price = 10000;

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public int getPrice() {
        return price;
    }


    public coupeTrain_car() {
    }

    public coupeTrain_car(int price) {
        this.price = price;
    }
}
class secondClassTrain_car  extends train_car {
    private int numOfSeat = 50;
    private int price = 5000;

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public int getPrice() {
        return price;
    }


    public secondClassTrain_car() {
    }

    public secondClassTrain_car(int price) {
        this.price = price;
    }
}