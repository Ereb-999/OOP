public class Gryffindor extends Hogwarts{
    public int nobility;
    public int honor;
    public int brave;

    public Gryffindor(String name, int magicPower, int distance, int nobility, int honor, int brave){
        super(name, magicPower, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;}

    public void setBrave(int brave) {
        this.brave = brave;
    }

}
