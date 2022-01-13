import java.util.Scanner;
public class ClassArray {
    private int roll;
    private int marks;
    private String name;

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ClassArray[] cla = new ClassArray[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cla.length; i++) {
            cla[i] = new ClassArray();
            System.out.println("For student " + (i + 1));
            System.out.print("\tEnter roll number:");
            cla[i].setRoll(sc.nextInt());
            System.out.print("\tEnter marks:");
            cla[i].setMarks(sc.nextInt());
            System.out.print("\tEnter name:");
            cla[i].setName(sc.next());
        }
        int tempm = 0, tempr = 0;
        String tempn = "";
        for (int i = 0; i < cla.length; i++) {
            for (int j = i + 1; j < cla.length; j++) {
                if (cla[i].getMarks() > cla[j].getMarks()) {
                    tempm = cla[i].getMarks();
                    cla[i].setMarks(cla[j].getMarks());
                    cla[j].setMarks(tempm);
                    tempr = cla[i].getRoll();
                    cla[i].setRoll(cla[j].getRoll());
                    cla[j].setRoll(tempr);
                    tempn = cla[i].getName();
                    cla[i].setName(cla[j].getName());
                    cla[j].setName(tempn);
                }
            }
        }
        System.out.println("\nRecord of student having minimum marks:");
        System.out.println("Name:" + cla[0].getName() + "\nRoll:" + cla[0].getRoll() + "\nMarks:" + cla[0].getMarks());
        System.out.println("\nRecord of student having maximum marks:");
        System.out.println("Name:" + cla[cla.length - 1].getName() + "\nRoll:" + cla[cla.length - 1].getRoll() + "\nMarks:" + cla[cla.length - 1].getMarks());
    }
}