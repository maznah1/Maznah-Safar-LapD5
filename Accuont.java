package Package5;

public class Accuont {

    private String id ;
    private String name ;
    private int balace ;

    public Accuont(String id, String name ){

    }

    public Accuont(String id ,String name, int balace){


    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalace() {
        return balace;
    }
    public int credit(int amunt ){
        return amunt;
    }

    public int debit(int amount){

      if (amount<= balace){
          System.out.println("Snbtract amount from balace ");
      }else {

          System.out.println("Amint exceeded balance return balance ");
      }
return balace;
    }


    public int transferTO(Accuont another,int amount ){

if (amount<= balace){
    System.out.println("trasfsr amunt to given Account ");

}else {
    System.out.println("Amount exceeded balance");



}
return balace;
    }

    @Override
    public String toString() {
        return "Accuont{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balace=" + balace +
                '}';
    }

    public static void main(String[] args){

    }

}
