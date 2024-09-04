package TelegramProjects;

public class Admacs {
    private String students[];
    private int ranks[];
    public Admacs(){}
    public Admacs(String[]students , int[] ranks){
        this.students=students;
        this.ranks=ranks;
    }
    public String highestRankStudent(){
        String student;
        int i=0,j=0,max=ranks[0];
        for(i=0;i<ranks.length;i++){
            if(max<=ranks[i]){
                max=ranks[i];
                j=i;
            }
        }
        student=students[j];
        return student;
    }
    public String lowestRankStudent(){
        String student;
        int i=0,j=0,max=ranks[0];
        for(i=0;i<ranks.length;i++){
            if(max>=ranks[i]){
                max=ranks[i];
                j=i;
            }
        }
        student=students[j];
        return student;
    }
}
