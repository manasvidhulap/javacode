package june13;

public class Convert 
{
	public static String convertToStr (String htmlStr) {
        htmlStr=htmlStr.replace("&nbsp;", " ");
        htmlStr=htmlStr.replace("<br>","\n");
        htmlStr=htmlStr.replaceAll("<.*?>", "");
       // return htmlStr.trim();
        return htmlStr;
    }
       public static void main(String[] args) {
           // TODO Auto-generated method stub
           String str="<div><b>John&nbsp;Jonnz</b><br><i>Area&nbsp;51,&nbsp;Arizona&nbsp;&nbsp;U.S.A</i></div>";
               String s=convertToStr(str);
               System.out.println(s);
       }
}
