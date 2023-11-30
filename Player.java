//Player class for Assignment7B

public class Player {
    private int Width; //Setting all values to private
    private int Height;
    private int Depth;
    private int X_Position;
    private int Y_Position;
    private int Z_Position;

    Player(){ //Default constructor

    }
    Player(int w, int h, int d, int xP, int yP, int zP) { //Overloaded constructor w/assignable values
        Width = w;
        Height = h;
        Depth = d;
        X_Position = xP;
        Y_Position = yP;
        Z_Position = zP;
    }

    public int getWidth(){ //Getters
        return Width;
    }
    public int getHeight(){
        return Height;
    }
    public int getDepth(){
        return Depth;
    }
    public int getX_Position(){
        return X_Position;
    }
    public int getY_Position(){
        return Y_Position;
    }
    public int getZ_Position(){
        return Z_Position;
    }
    public void move_X(int x_delta){ //Setters for each movement
        X_Position = getX_Position() + x_delta; //gets position of the called upon player, then adds the user-entered value for movement
    }
    public void move_Y(int y_delta){
        Y_Position = getY_Position() + y_delta;
    }
    public void move_Z(int z_delta){
        Z_Position = getZ_Position() + z_delta;
    }
    public boolean didTheyCollide(Player other){ //Checks for collision
        if (this.getX_Position() < (other.getWidth() + other.getX_Position()) &&
                (this.getWidth() + this.getX_Position()) > other.getX_Position() &&
                this.getY_Position() < (other.getHeight() + other.getY_Position()) &&
                (this.getHeight() + this.getY_Position()) > other.getY_Position() &&
                this.getZ_Position() < (other.getDepth() + other.getZ_Position()) &&
                (this.getDepth() + this.getZ_Position()) > other.getZ_Position()) {
            return true;
        }
        return false;
    }
}
