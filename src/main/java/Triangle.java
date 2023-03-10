public class Triangle {
    public String checkTriangle(int a, int b, int c){
        if (a < 1 || b < 1 || c < 1 || a > 200 || b > 200 || c > 200)
            return "Value not in range";
        else if (a >= (b + c) || b >= (a + c) || c >= (a + b))
            return "Not a triangle";
        else if (a==b && b==c)
            return "Equilateral triangle";
        else if (a==b||b==c||c==a)
            return "Isosceles triangle";
        else
            return "Scalene triangle";
}
}
