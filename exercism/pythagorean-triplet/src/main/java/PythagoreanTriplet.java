import java.util.*;

public class PythagoreanTriplet{
    private int a,b,c;
    private static List<PythagoreanTriplet> tripletList;
    private static PythagoreanTriplet instance = new PythagoreanTriplet();
    private static int N;

    public PythagoreanTriplet() {}

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static PythagoreanTriplet makeTripletsList() {
        tripletList = new ArrayList<>();
        return instance;
    }

    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit) {
        return instance;
    }

    public PythagoreanTriplet thatSumTo(int sum) {
        N = sum;
        return instance;
    }
    
    public List<PythagoreanTriplet> build() {
        for (int a = 1; a <= N; a++) {
            for (int b = a+1; b <= N; b++) 
            {
                 int c = N - a - b;
                 if ( a*a + b*b == c*c )
                {
                    tripletList.add(new PythagoreanTriplet(a,b,c));
                }
            }
        }
        return tripletList;
    }

    @Override
    public boolean equals(Object instance) {
        if (! (instance instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet triplet = (PythagoreanTriplet) instance;
        return (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }
   
}
