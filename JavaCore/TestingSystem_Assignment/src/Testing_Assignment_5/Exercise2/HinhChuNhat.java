package Testing_Assignment_5.Exercise2;

public class HinhChuNhat {
    private double chieudai;
    private double chieurong;

    public double chuvi(){
        return (chieurong + chieudai) *2;
    }
    public double dientich(){
        return chieudai * chieurong;
    }

    public HinhChuNhat(double chieudai, double chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
}
