object slip8
{
	def main(args:Array[String])
	{
		var str:Array[String]=Array("Hello Good Morning","Hello Good Night","Hello Good Afternoon");
		var str1=" ";
		println("string is :")
		for(j<-str)
		{
			println(j);
		}
		println("Enter string:");
		str1=Console.readLine();
		var str2=str:+str1;
		for(j<-str2)
		{
			println(j);
		}
	}
}
