package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    void greet();
    /*default void record4KVideo(){
        System.out.println("Recording in 4k...");
    }*/
}
interface MyWifi{
    String[] getNetworks();
    String[] connectToNetwork(String[] network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    @Override
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    @Override
    public void recordVideo(){
        System.out.println("Record video");
    }
    @Override
    public void greet(){ System.out.println("Good Morning...."); }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks : ");
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

    public String[] connectToNetwork() {
        System.out.println("Find network and then connecting : ");
        String[] findNetwork = {"Searching......", "Connect To Network"};
        return findNetwork;
    }
}

public class Default_Method {

    public static void main(String[] args){
        MySmartPhone ms = new MySmartPhone();
        //ms.record4KVideo();   // because of default method
        //ms.greet();.....Error

        String[] ar = ms.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }

        String[] om = ms.connectToNetwork();
        for (String i:om) {
           System.out.println(i);
        }


        ms.callNumber(8484);
        ms.pickCall();
        ms.greet();
        ms.recordVideo();
        ms.takeSnap();
    }
}
