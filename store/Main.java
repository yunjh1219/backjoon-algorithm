package store;

public class Main {
    public static void main(String[] args) {
        Data1 d1 = new Data1(10);
    }
}

class Data1 {
    // 생성자에서 출력
    public Data1(int x) {
        System.out.printf("x의 값은: %d",x);
    }
}
