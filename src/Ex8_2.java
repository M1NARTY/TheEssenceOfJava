class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0/0);  // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
            System.out.println(2);  // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            System.out.println(3);
        }  // end of try-catch
        System.out.println(4);
    }  // end of main method
}
