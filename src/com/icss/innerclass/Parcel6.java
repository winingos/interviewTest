package com.icss.innerclass;

/**
 * 局部内部类
 * 它是嵌套在作用域内的
 * 它的作用域发生了改变，它只能在该方法和属性中被使用，出了该方法和属性就会失效
 * @author wining
 */
public class Parcel6 {

	private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("chenssy");
            String string = ts.getSlip();
            System.out.println(string);
        }
    }
    
    public void track(){
        internalTracking(true);
    }
    
    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }


}
