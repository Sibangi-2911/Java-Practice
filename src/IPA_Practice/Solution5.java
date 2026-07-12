package IPA_Practice;
import java.awt.*;
import java.util.*;
class Player{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType){
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public int getRuns(){
        return runs;
    }
    public void setRuns(int runs){
        this.runs = runs;
    }
    public String getPlayerType(){
        return playerType;
    }
    public void setPlayerType(String playerType){
        this.playerType = playerType;
    }
    public String getMatchType(){
        return matchType;
    }
    public void setMatchType(String matchType){
        this.matchType = matchType;
    }
}
public class Solution5 {
    public static int findPlayerWithLowestRuns(Player[] players, String p1){
        int ans[] = new int[0];
        for(int i=0;i<players.length;i++){
            if(players[i].getPlayerType().equalsIgnoreCase(p1)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = players[i].getRuns();
            }
        }
        Arrays.sort(ans);
        if(ans.length>0){
            return ans[0];
        }
        return 0;
    }
    public static Player[] findPlayerByMatchType(Player[] players, String m1){
        Player[] ans = new Player[0];
        for(int i=0;i<players.length;i++){
            if(players[i].getMatchType().equalsIgnoreCase(m1)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = players[i];
            }
        }
        if(ans.length>0){
            return ans;
        }
        return null;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];
        for(int i=0;i<4;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String pType = sc.nextLine();
            String mType = sc.nextLine();
            players[i] = new Player(id,name,runs,pType,mType);
        }
        String p1 = sc.nextLine();
        String m1 = sc.nextLine();

        int answer1 = findPlayerWithLowestRuns(players,p1);
        if(answer1>0){
            System.out.println(answer1);
        } else{
            System.out.println("No such player");
        }
        Player[] answer2 = findPlayerByMatchType(players, m1);
        if(answer2!=null){
            for(int i=0;i<answer2.length;i++){
                for(int j=i;j<answer2.length;j++){
                    if(answer2[i].getPlayerId()<answer2[j].getPlayerId()){
                        Player temp = answer2[i];
                        answer2[i] = answer2[j];
                        answer2[j] = temp;
                    }
                }
            }
            for(Player a: answer2){
                System.out.println(a.getPlayerId());
            }
        } else{
            System.out.println("No Player with given matchType");
        }
    }
}
