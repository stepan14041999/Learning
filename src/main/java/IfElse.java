import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c;

        if (...) {
            c = ...; // +
        } else{
            c = ...; // -
        }

        System.out.println(c);
    }
}
