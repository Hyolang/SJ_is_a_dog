import java.util.Random;

public class SJ {
    public static void main(String[] args){
        Random random = new Random();
        dogs bark = new dogs();
        bark.speak = "수";
        for(bark.a=1;bark.a<=100;bark.a++){
            if(bark.a == 100){
                if(random.nextInt(10)<=1)
                    System.out.println("성재는 " + bark.a + bark.speak + " 결과 한국공학대에 수석 입학하였습니다!!\n 성재는 " + (bark.a + 1) + "회 울부 짖으며 포기하였습니다.");
                if(random.nextInt(10)>1)
                    System.out.println("성재는 " + bark.a + bark.speak + " 결과 한국공학대에 입학하였습니다!!\n 성재는 " + (bark.a + 1) + "회 울부 짖으며 포기하였습니다.");
            }
            else{
                if(random.nextInt(10)<=1)
                    System.out.println("성재는 " + bark.a + bark.speak + " 결과 한국공학대에 수석 입학하였습니다!!\n 성재는 " + (bark.a + 1) + "회 울부 짖으며 재수하였습니다.");
                if(random.nextInt(10)>1)
                    System.out.println("성재는 " + bark.a + bark.speak + " 결과 한국공학대에 입학하였습니다!!\n 성재는 " + (bark.a + 1) + "회 울부 짖으며 재수하였습니다.");
            }
        }
    }
}