class Solution {
    public double[] convertTemperature(double celsius) {
        
        double a[]=new double[2];
        a[0]=celsius+273.15d;
        a[1]=(celsius*1.80)+32;
        return a;
        
        
    }
}