//Curry Williams
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class SoccerPlayerClient
{
   public static void main(String[]arg)
   {  
      int a=0;
      String[] stats=new String[6];
      //stats[1]="check";
      //System.out.println(stats[1]);
      int b=0;
      String lines=" ";
      try
		{
		   File data = new File("players.txt");
		   Scanner scan1 = new Scanner(data);
		   while(scan1.hasNext())
		   {
            lines=scan1.nextLine();
            System.out.println(lines);
		      stats[a]=lines;
			   a++;
            //System.out.println(stats[a]);

		   }
		}
		catch (IOException ioe)
		{
			System.out.println("Error reading file.");
		}
      SoccerPlayer[]player=new SoccerPlayer[6];
      String n;
 		int g;
  		String t; 
   	for(int c = 0; c < player.length; c++)
   	   {
            n = stats[c].split(",")[0];
            g = Integer.parseInt(stats[c].split(",")[1]);
   			t = stats[c].split(",")[2];
   	   	player[c] = new SoccerPlayer(n,g,t);
               System.out.println(player[c]);
         }
         for(int d=0;d<player.length;d++)
            {
               System.out.println("Please enter number of goals for player number "+player[d].getPlayerID());
         	   Scanner scan=new Scanner(System.in);
		         int goalsinput=scan.nextInt();
               player[d].setGoals(goalsinput);
             
            }
            SoccerPlayer bestave=player[0];
            double maxave=0.1;
            for(int e=0;e<player.length;e++)
            {
               if((maxave<player[e].getAveGoals())&&(player[e].getGames()!=0));
               {
                  maxave=player[e].getAveGoals();
                  bestave=player[e];
               }
               
            } 
            System.out.println("The player with the highest average is "+bestave.getName());
            System.out.println("The Highest average is "+maxave);
                  
   }
   
   
}                 