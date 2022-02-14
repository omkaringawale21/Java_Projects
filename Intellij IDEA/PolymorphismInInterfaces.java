package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    void greet();
    /*default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }*/
}
interface MyWifi2 extends MyCamera2{
    String[] getNetworks();
    String[] connectToNetwork(String[] network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public void greet(){ System.out.println("Good Morning...."); }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks :");
        String[] networkList = {"Omkar", "Prashanth", "Anjali5G"};
        return networkList;
    }

    @Override
    public String[] connectToNetwork(String[] network) {
        String[] findNetwork = {"Searching......", "Connect To Network"};
        return findNetwork;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }
    public void sampleMeth(){ System.out.println("meth"); }
    public String[] connectToNetwork() {
        System.out.println("Find network and then connecting : ");
        String[] findNetwork = {"Searching......", "Connect To Network"};
        return findNetwork;
    }
}


public class PolymorphismInInterfaces {
    public static void main(String[] args){
        MySmartPhone2 s = new MySmartPhone2();
        //MyCamera2 cam1 = new MySmartPhone2();  This is Allowed
        //MyWifi2 w = new MySmartPhone2();     This is Allowed

        //cam1.record4KVideo();....This is Allowed
        //s.record4KVideo();....This is Allowed

        /*String[] arr = w.getNetworks();  //This is Allowed
        for(String item:arr) {
            System.out.println(item);
        }
        String[] om = w.connectToNetwork();
        for (String i:om) {
            System.out.println(i);
        }
        */

        String[] arr = s.getNetworks();
        for(String item:arr) {
            System.out.println(item);
        }
        String[] om = s.connectToNetwork();
        for (String i:om) {
            System.out.println(i);
        }
        s.callNumber(8484);
        s.pickCall();
        s.greet();
        s.takeSnap();
        s.recordVideo();
        //cam1.greet();   //This is Allowed
        //cam1.takeSnap();   //This is Allowed
        //cam1.recordVideo();    //This is Allowed
        s.sampleMeth();

    }
}
