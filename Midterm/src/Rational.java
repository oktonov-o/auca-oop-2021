public class Rational {
    int numerator;
    int den;
    public Rational(String s){
        int index = s.indexOf("/");
        numerator = Integer.parseInt(s.substring(0, index));
        den = Integer.parseInt(s.substring(index+1, s.length()));
    }
    public Rational add(Rational x){
        int d, n;
        d = this.den * x.den;
        n = this.den*x.numerator + this.numerator*x.den;
        return new Rational(n+"/"+d);
    }

    public String toString(Rational t){
        return (t.numerator+"/"+t.den);
    }
}
