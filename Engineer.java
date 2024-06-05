import java.time.LocalDateTime;
public class Engineer extends Officer{

    
    private String branch;
    
    public Engineer(String HoTen, int Tuoi, String DiaChi, String GioiTinh, String branch ){
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.branch = branch;
    }
    public String getbranch(){
        return branch;
    }
    public void setbranch(String brach){
        this.branch = branch;
    }
    @Override
    public String toString(){
        return "Engineer: " + "Branch: "+ branch+
        "/Ho ten: " + HoTen +"/Tuoi: "+ Tuoi+
        "/Gioi Tinh: "+ GioiTinh +"/Dia chi: " + DiaChi;
    }
}
