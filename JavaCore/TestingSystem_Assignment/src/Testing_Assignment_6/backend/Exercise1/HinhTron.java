package Testing_Assignment_6.backend.Exercise1;

public class HinhTron extends HinhHoc{
    private double bankinh;

    public HinhTron(double bankinh) throws Exception{
        super();
        this.bankinh = bankinh;
    }

    @Override
    public double chuvi() {
        return 2 * Math.PI * bankinh;
    }

    @Override
    public double dientich() {
        return Math.PI * bankinh * bankinh;
    }
}
