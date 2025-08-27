package Testing_Assignment_5.Exercise2;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh){
        super(canh, canh);
    }

    @Override
    public double chuvi() {
        System.out.println("Tính diện tích/ chu vi theo Hình Vuông/ Hình Chữ Nhật");
        return super.chuvi();
    }

    @Override
    public double dientich(){
        System.out.println("Tính diện tích/ chu vi theo Hình Vuông/ Hình Chữ Nhật");
        return super.dientich();
    }
}
