//Curry Williamms
import java.text.*;
public class SoccerPlayer
{
   DecimalFormat df = new DecimalFormat("#.##");
   String name=" ";
   int goals=0;
   double avegoals=0;
   int games=0;
   String team=" ";
   int playerID=0;
   static int id=0;
   public SoccerPlayer()
   { 
      name="noname";
      goals=0;
      games=0;
      team="the home";
      playerID=id;
      id++;
   }
   public SoccerPlayer(String nam,int gam,String tea)
   {
      name=nam;
      games=gam;
      team=tea;
      playerID=id;
      id++;
   }
   public String getName()
   {
      return name;
   }
   public int getGoals()
   {
      return goals;
   }
   public int getGames()
   {
      return games;
   }   
   public String getTeam()
   {
      return team;
   }
   public int getPlayerID()
   {
      return playerID;
   }
   public double getAveGoals()
   {
      return avegoals;
   }   
   public void setName(String na)
   {
      name=na;
   }
   public void setGoals(int go)
   {
      goals=go;
      if((goals>0)&&(games>0))
      avegoals=goals/games;
      //else
      //avegoals=1000000;
   }
   public void setGames(int ga)
   {
      games=ga;
   }
   public void setTeam(String te)
   {
      team=te;
   }
   public void setAveGoal(double ag)
   {
      avegoals=ag;
   }
   public String toString()
   {
      String output="The players name is "+name+" Goals scored "+goals+" Games played "+games+" The team they play for is "+team+" Their jersey number is "+playerID+" Their id is";
      return output;
   }
   public boolean equals(SoccerPlayer sp)
   {
      if((this.getAveGoals()==sp.getAveGoals())&&(this.getTeam()==sp.getTeam()))
         return true;
      else
         return false;
      
   }
   
}

   