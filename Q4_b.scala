import scala.compiletime.ops.float
object Learn_Scala
{
    val ticket_p = 15.0f;
    val attend = 120;

    val inc_by = 5;
    val inc_crowd = -20;

    val dec_by = 5;
    val dec_crowd = 20;

    val attend_cost = 3;

    def highest_profit_inc(): Float =
    {
        var profit,p = 1f;
        
        var t_p = ticket_p;
        var att = attend;
        var max_t = 0f;
        while(profit > 0)
        {
            profit = (t_p*att) - ((attend_cost*att)+(500));
            //printf("%d \t %d \t %d",t_p,att,profit);
            if(profit>p)
            {
                p = profit;
                max_t = t_p;
            }
            t_p = t_p + 5;
            att = att - 20;
        }
        return (max_t).max(highest_profit_dec());
    }

    def highest_profit_dec(): Float =
    {
        var profit,p = 1f;
        
        var t_p = ticket_p;
        var att = attend;
        var max_t = 0f;
        while(profit > 0)
        {
            profit = (t_p*att) - ((attend_cost*att)+(500));
            if(profit>p)
            {
                p = profit;
                max_t = t_p;
            }
            t_p = t_p - 5;
            att = att + 20;
        }
        
        return max_t;    
    }


    def main(args:Array[String]):Int =
    {
        printf("Most profitable ticket value is Rs %.2f", highest_profit_inc())
        return 0;
    }
    
}