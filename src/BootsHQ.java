public class BootsHQ {

    public static void main(String[] args) {
        BootsHQ myFactory = new BootsHQ();
    }
//
//
    // constructor method


    public BootsHQ(){
        Boots AdidasCrazyfast;
        AdidasCrazyfast = new Boots("green", "slim", 190, 4, true);
        AdidasCrazyfast.printInfo();

        //another boot

        Boots NikeMercurial;
        NikeMercurial = new Boots("orange", "slim", 198, 4, true);
        NikeMercurial.printInfo();

        Boots PumaKing;
        PumaKing = new Boots("blue", "wide", 230,4,false);
        PumaKing.printInfo();

        //another boot

        Boots NikePhantom;
        NikePhantom = new Boots("white", "wide", 210, 5, false);
        NikePhantom.printInfo();
    }

}

