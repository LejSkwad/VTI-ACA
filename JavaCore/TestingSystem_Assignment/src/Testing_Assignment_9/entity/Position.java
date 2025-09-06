package Testing_Assignment_9.entity;

public class Position {
    private int PositionID;
    private String PositionName;

    public Position(){}

    public Position(int PositionID, String PositionName) {
        this.PositionID = PositionID;
        this.PositionName = PositionName;
    }

    public int getPositionID() {
        return PositionID;
    }
    public void setPositionID(int PositionID) {
        this.PositionID = PositionID;
    }
    public String getPositionName() {
        return PositionName;
    }
    public void setPositionName(String PositionName) {
        this.PositionName = PositionName;
    }

    @Override
    public String toString() {
        return "Position{id=" + PositionID + ", name='" + PositionName + "'}";
    }
}
