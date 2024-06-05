import java.time.LocalDateTime;
public class worker extends Officer {
    private int level;

    public worker(String HoTen,int Tuoi,String GioiTinh, String DiaChi, int level){
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.level = level;
    }
    public int getlevel(){
        return level;
    }
    public void setlevel(int level){
        this.level = level;
    }
    @Override
    public String toString(){
        return "Worker: "+ "level: " + level 
        + "/Ho ten: "+ HoTen + "/Tuoi: "+Tuoi+
        "/Gioi tinh :"+ GioiTinh+"/Dia Chi: "+ DiaChi;
    }
}
