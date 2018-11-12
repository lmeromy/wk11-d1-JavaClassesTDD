public class WaterBottle {

    private int volume;


    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }


    public void drink() {
        this.volume = this.volume - 10;
//        return this.volume;
    }

    public void drinkAll() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
