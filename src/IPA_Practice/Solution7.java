package IPA_Practice;
import java.awt.*;
import java.util.*;

class Laptop{
    private int id;
    private String brand;
    private String os;
    private double price;
    private int rating;

    public Laptop(int id, String brand, String os, double price, int rating){
        this.id = id;
        this.brand = brand;
        this.os = os;
        this.price = price;
        this.rating = rating;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getOs(){
        return os;
    }
    public void setOs(String os){
        this.os = os;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating = rating;
    }
}
public class Solution7 {
    public static int countByBrand(Laptop[] laptops, String qbrand){
        int count=0;
        for(int i=0;i<laptops.length;i++){
            if(laptops[i].getBrand().equalsIgnoreCase(qbrand) && laptops[i].getRating()>3){
                count++;
            }
        }
        return count;
    }

    public static int[] countByOs(Laptop[] laptops, String qos){
        int[] ans = {-1,-1,-1,-1};
        for(int i=0;i<laptops.length;i++){
            if(laptops[i].getOs().equalsIgnoreCase(qos)){
                ans[i] = i;
            }
        }
        return ans;
    }

    static boolean check(int[] laptops){
        for(int i=0;i<laptops.length;i++){
            if(laptops[i]!=-1){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];
        for(int i=0;i<4;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String os = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt();
            sc.nextLine();

            laptops[i] = new Laptop(id,brand,os,price,rating);

        }
        String qbrand = sc.nextLine();
        String qos = sc.nextLine();
        int ans1 = countByBrand(laptops,qbrand);
        if(ans1>0){
            System.out.println(ans1);
        }
        else{
            System.out.println("The given brand is not available");
        }
         int[] ans2 = countByOs(laptops, qos);
        Arrays.sort(ans2);
        if(check(ans2)){
            System.out.println("The given os is not available");
        } else{
            for(int i= ans2.length-1;i>=0;i--){
                if(ans2[i]!=-1){
                    System.out.println(laptops[ans2[i]].getId());
                    System.out.println(laptops[ans2[i]].getRating());
                }
            }
        }
    }
}
