package Testing_Assignment_6.backend.Exercise1;

public class HinhChuNhat extends HinhHoc {
    private double chieudai;
    private double chieurong;

    public HinhChuNhat(double chieudai, double chieurong) throws Exception {
        super();
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    @Override
    public double chuvi(){
        return (chieurong + chieudai) * 2;
    }

    @Override
    public double dientich(){
        return chieudai * chieurong;
    }
}

