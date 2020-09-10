#Welcome in gamble program

    public class Gamble1
    {
    static int stakeMoney=100;
    static int betMoney=1;

    static int wonMoney=0;
    static int lossMoney=0;
    static int total_Won_Money=0;
    static int total_loss_Money=0;
    static int Won_Money=0;
    static int Loss_Money=0;
    static int wonAmount=0;
    static int lossAmount=0;
    static int LuckiestDay=0;
    static int UnLuckiestDay=0;



      public static void main(String[] args)
      {


       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the days");
       int Num_of_Days=scan.nextInt();
       System.out.println("Enter the percentage value you want to find");
       int percentage=scan.nextInt();
       int p=(stakeMoney*percentage)/100;
       int i;

              for(i=1;i<=Num_of_Days;i++)
                 {
                 while(stakeMoney>=p)
                 {

                     int pot = (int)Math.round(Math.random()*1+1);

                     if(pot == 1)
                       {
                        wonAmount++;
                        wonMoney=wonAmount + betMoney;
                        System.out.println("you win");
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
                      total_Won_Money = total_Won_Money + Won_Money;
                      total_loss_Money =total_loss_Money + Loss_Money;

                      System.out.println("Total Won Money in "+i+"day is="+total_Won_Money);
                      System.out.println("Total loss Money in "+i+"day is"+total_loss_Money);
      }
  }
