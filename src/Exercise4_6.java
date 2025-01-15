// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
//public class Exercise4_6 {
//    public static void main(String[] args) {
//        // 어케 함? 나 밥 다 됐네...
//        int dice1, dice2;
//        int i = 0;
//        while (i < 35) {
//            dice1 = (int) (Math.random() * 6) + 1;
//            dice2 = (int) (Math.random() * 6) + 1;
//
//            if(dice1 + dice2 == 6) {
//                System.out.println(dice1 + " " + dice2);
//            }
//            i++;
//        }
//    }
//}

public class Exercise4_6 {
    public static void main(String[] args) {
        int dice1, dice2;

        for (int i=1; i<=6; i++) {
            for(int j=1; j<6; j++) {
                dice1 = i;
                dice2 = j;
                if(dice1 + dice2 == 6) {
                    System.out.println(dice1 + " + " + dice2);
                }
            }
        }
    }
}

// 히히히히 해냈당!