package Testing_Assignment_6.backend.Exercise1;

public abstract class HinhHoc {
    private static int count = 0;

    public HinhHoc() throws HinhHocException{
        if(count >= Configs.SoLuongHinhToiDa){
            throw new HinhHocException("So luogn hinh toi da la " + Configs.SoLuongHinhToiDa);
        }
        count++;
    }

    public static int getCount(){
        return count;
    }

    public abstract double chuvi();
    public abstract double dientich();
}
