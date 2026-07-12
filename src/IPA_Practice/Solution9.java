package IPA_Practice;
import java.util.*;
class Hotel{
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill){
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId(){
        return hotelId;
    }
    public void setHotelId(int hotelId){
        this.hotelId = hotelId;
    }
    public String getHotelName(){
        return hotelName;
    }
    public void setHotelName(String hotelName){
        this.hotelName = hotelName;
    }
    public String getDateOfBooking(){
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking){
        this.dateOfBooking = dateOfBooking;
    }
    public int getNoOfRoomsBooked(){
        return noOfRoomsBooked;
    }
    public void setNoOfRoomsBooked(int noOfRoomsBooked){
        this.noOfRoomsBooked = noOfRoomsBooked;
    }
    public String getWifiFacility(){
        return wifiFacility;
    }
    public void setWifiFacility(String wifiFacility){
        this.wifiFacility = wifiFacility;
    }
    public double getTotalBill(){
        return totalBill;
    }
    public void setTotalBill(double totalBill){
        this.totalBill = totalBill;
    }
}
public class Solution9 {
    public static int noRoomBook(Hotel[] hotels, String month ){
        int tRoomBooked = 0;
        for(Hotel hotel: hotels){
            if(hotel.getDateOfBooking().toLowerCase().contains(month.toLowerCase())){
                tRoomBooked+=hotel.getNoOfRoomsBooked();
            }
        }
        return tRoomBooked;
    }

    public static Hotel searchWifi(Hotel[] hotels,String wifi1 ){
        Hotel hBill = null;
        Hotel secondHighestBill = null;
        for(Hotel hotel: hotels){
            if(hotel.getWifiFacility().equalsIgnoreCase(wifi1)){
                if(hBill==null || hotel.getTotalBill()>hBill.getTotalBill()){
                    secondHighestBill = hBill;
                    hBill = hotel;
                } else if(secondHighestBill==null || hotel.getTotalBill() > hBill.getTotalBill()){
                    secondHighestBill = hotel;
                }
            }
        }
        return secondHighestBill;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];
        for(int i=0;i<hotels.length;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String hName = sc.nextLine();
            String bookingDate = sc.nextLine();
            int roomsBooked = sc.nextInt();
            sc.nextLine();
            String wifi = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            hotels[i] = new Hotel(id,hName,bookingDate,roomsBooked,wifi,totalBill);
        }
        String month = sc.nextLine();
        String wifi1 = sc.nextLine();

        int roomBooked = noRoomBook(hotels, month);
        Hotel hotelSecond = searchWifi(hotels, wifi1);
        if(roomBooked>0){
            System.out.println(roomBooked);
        } else{
            System.out.println("No rooms booked in the given month");
        }
        if(hotelSecond != null){
            System.out.println(hotelSecond.getHotelId());
        } else{
            System.out.println("No such option available");
        }
        sc.close();
    }
}
