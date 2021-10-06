public class employee {
    public String title;
    private String name;
    private int mobile;
    
    public employee(String stringa) {
        this.title = stringa;
    }

    public employee(String stringa, String stringb) {
        this.title = stringa;
        this.name = stringb;
    }

    public employee(String stringa, String stringb, int phone) {
        this.title = stringa;
        this.name = stringb;
        this.mobile = phone;
    }
    
    public String getTitle() {return this.title;}
    public String getName() {return this.name;}
    public int getMobile() {return this.mobile; }

    public String toString(){
        return "Name:"+ this.name + " -Mobile:"+ this.mobile;
    }
}