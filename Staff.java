public class Staff extends Officer {
    private String job;
    public Staff(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String task) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        //TODO Auto-generated constructor stub
    }
    
    
    public String Staff(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String job){
        return this.job = job;
    }
    public String getjob(){
        return job;
    }
    public void setjob(){
        this.job = job;
    }
    @Override
    public String toString(){
        return "Staff: "+ "/Cong viec: "+job+
        "/Ho va ten: "+HoTen+
        "/Tuoi: " + Tuoi +"/Gioi tinh: " +GioiTinh+
        "/Dia chi"+DiaChi;
    }
}
