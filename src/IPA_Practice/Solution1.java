package IPA_Practice;
import java.util.*;
public class Solution1 {
   public static void main(String args[]){
       Spotify[] spot = new Spotify[4];
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<spot.length;i++){
           int spotifyId = sc.nextInt();
           sc.nextLine();
           String profileName = sc.nextLine();
           String subscriptionType = sc.nextLine();
           double subscriptionPrice = sc.nextDouble();
           sc.nextLine();
           String groupSessionAvailable = sc.nextLine();
           spot[i] = new Spotify(spotifyId,profileName,subscriptionType,subscriptionPrice,groupSessionAvailable);
       }
       String subscriptionTypeInput = sc.nextLine();
       String groupSessionAvailableInput = sc.nextLine();

       double average = findAvgSpotifySubsByType(spot,subscriptionTypeInput,groupSessionAvailableInput);
       if(average>0){
           System.out.println(average);
       } else{
           System.out.println("There are no such Spotify Subscription");
       }


   }
   public static double findAvgSpotifySubsByType(Spotify[] spot,String subscriptionTypeInput, String group){
       int sum = 0;
       int count =0;
       double avg = 0;
       for(Spotify sp: spot){
           if(sp.getSubscriptionType().equalsIgnoreCase(subscriptionTypeInput) && sp.getGroupSessionAvailable().equalsIgnoreCase(group)){
               sum+=sp.getSubscriptionPrice();
               count++;
           }
       }
       if(count>0){
           avg = sum/count;
           return avg;
       } else{
           return avg;
       }
   }

}

class Spotify{
    private int spotifyId;
    private String profileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private String groupSessionAvailable;

    public  Spotify(int spotifyId, String profileName, String subscriptionType, double subscriptionPrice, String groupSessionAvailable){
        this.spotifyId = spotifyId;
        this.profileName = profileName;
        this.subscriptionType = subscriptionType;
        this.subscriptionPrice = subscriptionPrice;
        this.groupSessionAvailable = groupSessionAvailable;
    }
    public int getSpotifyId(){
        return spotifyId;
    }
    public void setSpotifyId(int spotifyId){
        this.spotifyId=spotifyId;
    }
    public String getProfileName(){
        return profileName;
    }
    public void setProfileName(String profileName){
        this.profileName = profileName;
    }
    public String getSubscriptionType(){
        return subscriptionType;
    }
    public void setSubscriptionType(String subscriptionType){
        this.subscriptionType = subscriptionType;
    }
    public double getSubscriptionPrice(){
        return subscriptionPrice;
    }
    public void setSubscriptionPrice(){
        this.subscriptionPrice = subscriptionPrice;
    }
    public String getGroupSessionAvailable(){
        return groupSessionAvailable;
    }
    public void setGroupSessionAvailable(){
        this.groupSessionAvailable=groupSessionAvailable;
    }
}
