
import java.time.LocalDateTime;;

public class Officer {
    protected String HoTen;
    protected int Tuoi;
    protected String GioiTinh;
    protected String DiaChi;
    
    public Officer(String HoTen, int Tuoi, String GioiTinh, String DiaChi){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public String getHoten(){
        return HoTen;
    }
    public void setHoten(String HoTen){
        this.HoTen = HoTen;
    }
    public int getTuoi(){
        return Tuoi;
    }
    public void setTuoi(int Tuoi){
        this.Tuoi = Tuoi;
    }
    public String GioiTinh(){
        return GioiTinh;
    }
    public void setGioiTinh(String GioiTinh){
        this.GioiTinh = GioiTinh;
    }
    public String DiaChi(){
        return DiaChi;
    }
    public void setDiachi(String DiaChi){
        this.DiaChi = DiaChi;
    }
} 