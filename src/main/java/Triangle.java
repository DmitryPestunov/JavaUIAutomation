public class Triangle {

    public boolean judge(double a,double b,double c){
        boolean flag = false;
        if(a + b > c && a + c > b && b + c > a){
            flag = true;
        }
        if(a <= 0 || b <= 0 || c <= 0){
            flag = false;
        }
        return flag;
    }
    public double cal(double a,double b,double c) {
        double area = -1.0;
        if(judge(a, b, c)){
            if(a == b && b == c){
                area = Math.sqrt(3) / 4 * a * a ;
            }else{
                double p = (a + b + c)/2;
                area = Math.sqrt( (p * ( p - a ) * ( p - b ) * ( p - c ) ) );
            }
            return area;
        }
        return area;
    }

}
