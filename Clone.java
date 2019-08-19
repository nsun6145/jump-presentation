

class Ball implements Cloneable{
    private int radius;
    private String color;

    public Ball(int r, String c){
        radius = r;
        color = c;
    }

    public void printProperites(){
        System.out.println("The radius of this " + color + " ball is " + radius + " units.");
    }

    public Ball cloneBall(){
        return (Ball)this.clone();
    }
}

class Clone {

    public static void main(String[] args){

        Ball ball1 = new Ball(12,"Blue");
        Ball ball2 = ball1.cloneBall();

        ball1.printProperites();
        ball2.printProperites();

    }

}