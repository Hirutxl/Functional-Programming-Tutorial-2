object Learn_Scala
{
    def wage(hrs: Int): Int = hrs* 250
    def ot(hours:Int):Int=hours*85
    def income(hrs1:Int,hrs2:Int):Int=wage(hrs1)+ot(hrs2)
    def tax(income:Int):Double=income*0.12
    def takeHome(hrs1:Int,hrs2:Int):Double=income(hrs1,hrs2)-tax(income(hrs1,hrs2))

    def main(args:Array[String]):Int =
    {
        printf("Enter normal hours(week) : ");
        var normal_h = scala.io.StdIn.readInt();

        printf("Enter OT hours(week) : ");
        var OT_h = scala.io.StdIn.readInt();

        printf("Home salary is RS %.4f/=",takeHome(normal_h,OT_h));

        return 0;
    }
    
}
