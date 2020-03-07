public class calculate {
private int result;
public void add (int ... params)
{
for (Integer param:params){
this.result += param;
}
}
public int getResult()
{
return this.result;
}
public void cleanResult()
{
this.result = 0;
}

public static void main (String[] args)
{
System.out.println("Hello world!");
System.out.println("ПРОВЕРКА СВЯЗИ!");

 }
}
