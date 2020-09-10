#Welcome in gamble program

    public class Gamble1
    {
    static int stakeMoney=100;
    static int betMoney=1;

      public static void main(String[] args) 
      {
       while(stakeMoney>=p)
           {
        
                 int pot = (int)Math.round(Math.random()*1+1);//UserCase2
                 
                     if(pot == 1)
                       {
                        wonAmount++;
                        wonMoney=wonAmount + betMoney;
                        System.out.println("you win");//UserCase
                        stakeMoney -= 1;
                        }
                      else
                       {
                       lossAmount--;
                       lossMoney=lossAmount-betMoney;
                       System.out.println("you loss");
                       stakeMoney -= 1;
                       }

                       Won_Money += wonMoney;
                       Loss_Money += lossMoney;

                       }
                       }
