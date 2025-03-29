class vehicle {
    public void displayinfo(){
        System.out.println("This is the vehicle information");
    }
}
class car extends vehicle{
    String car_company;
    String car_model;
    int car_price;
    int car_seating_capacity;
    boolean petrol;

    public void displayinfo(String car_company , String car_model, int car_price,int car_seating_capacity,boolean petrol){
        
        System.out.println("the car company is " + car_company+'\n'+"the car model is "+car_model +'\n'+"the car price is "+car_price+'\n'/+"the car seating capacity"+ car_sating car_seating_capacityty'\n'+"car fuel tank type is "+petrol);
    }
}
class main{
    public static void main(String[] args) {
        vehicle v = new vehicle();
        car c = new car( BMW,Mrcedies,19934,6,desiel);
        v.displayinfo();
        c.displayinfo();
    }
}


