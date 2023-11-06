public class Boots {

    //variable declarations
    public String color;
    public String fit;
    public int weight;
    public boolean FeelsGood;
    public int ratings;



    public void printInfo(){
        System.out.println("The boots are: " + color);
        System.out.println("The boots fit: " + fit);
        System.out.println("The boots weigh this many grams: " + weight);
        System.out.println("This boot is rated: " + ratings);
        if(FeelsGood == true){
            System.out.println("The football boots feel good");
        }
        else {
            System.out.println("The football boots are uncomfortable");
        }
    }

    public Boots(String paramColor, String paramFit, int paramWeight,
                 int paramRatings, boolean paramFeelsGood){
        color = paramColor;
        fit = paramFit;
        weight = paramWeight;
        ratings = paramRatings;
        FeelsGood = paramFeelsGood;
    }
}