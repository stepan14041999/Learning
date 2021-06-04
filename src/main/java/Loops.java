import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = 1;

        for (int i = 0; i < a; i++) {
            ... // *
        }

        System.out.println(c);
    }
}
