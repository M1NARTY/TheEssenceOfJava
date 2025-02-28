class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student {
    String name;
    int ban, no, kor, eng, math;

    Student() {}

    Student(String name, int b, int n, int k, int e, int m) {
        this.name = name;
        this.ban = b;
        this.no = n;
        this.kor = k;
        this.eng = e;
        this.math = m;
    }

    int getTotal() {
        return (kor+eng+math);
    }

    float getAverage() {
        return ((int)(getTotal() / 3f * 10 + 0.5f)) / 10f;
    }

    public String info() {
     //   return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + (kor+eng+math) + ", " + ((int)((kor+eng+math)/ 3f * 10 +0.5f) / 10f);
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}