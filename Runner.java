public class Runner{

  public static void main(String[] args){
    GrizzlyBear yogi = new GrizzlyBear();
    roar(yogi);
    PolarBear popo = new PolarBear();
    roar(popo);
  }


//always try to code to an interface, makes testing easier.
  public static void roar(Roarable bear){
    bear.roar();
  }

}