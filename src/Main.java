public class Main {
    public static void main(String[] args) {
        System.out.println(lessonIsUnlocked(4, false));
        System.out.println(lessonIsUnlocked(6, true));
        System.out.println(lessonIsUnlocked(0, true));
        System.out.println(lessonIsUnlocked(101, false));
    }
    public static boolean lessonIsUnlocked (int numberOfLesson, boolean userIsPremium) {
        if(numberOfLesson < 1 || numberOfLesson > 100) {
            System.out.println("the lesson does not meet the requirements");
            return false;
        }else{
            return userIsPremium || numberOfLesson ==1;
        }
    }
}