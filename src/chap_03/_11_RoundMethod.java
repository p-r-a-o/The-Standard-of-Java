package chap_03;

public class _11_RoundMethod {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi*1000+0.5)/1000.0;

        System.out.println(shortPi); // 3.142
    }
}
