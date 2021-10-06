public class jobtitle {

    private String jobtitle;
    private int count = 0;

    public jobtitle(String stringa){
        this.jobtitle = stringa;
    }

    public jobtitle(String stringa, int num){
        this.jobtitle = stringa;
        this.count = num;
    }

    public String getJob() {return this.jobtitle;}
    public int getCount() {return this.count;}    
}