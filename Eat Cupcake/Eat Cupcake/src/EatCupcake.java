import java.util.Scanner;

public class EatCupcake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Did anyone see you?");
        String answer = in.next();
        if (answer.equals("YES.")) {
            System.out.println("Was it a boss/lover/parent?");
            answer = in.next();
            if (answer.equals("YES.")) {
                System.out.println("Was it expensive?");
                answer = in.next();
                if (answer.equals("YES.")) {
                    System.out.println("Can you cut off the part that touched the floor?");
                    answer = in.next();
                    if (answer.equals("YES.")) {
                        System.out.println("EAT IT.");
                    } else {
                        System.out.println("YOUR CALL");
                    }
                } else{// if (answer.equals("No.")) {
                    System.out.println("Is it chocolate?");
                    answer = in.next();
                    if (answer.equals("YES.")) {
                        System.out.println("EAT IT.");
                    } else {
                        System.out.println("DON'T EAT IT");
                    }
                }
            } else {
                System.out.println("EAT IT.");
            }
        } else {
            System.out.println("Was it sticky?");
            answer = in.next();
            if (answer.equals("YES.")) {
                System.out.println("Is it a raw steak?");
                answer = in.next();
                if (answer.equals("YES.")) {
                    System.out.println("Are you a puma?");
                    answer = in.next();
                    if (answer.equals("YES.")) {
                        System.out.println("EAT IT.");
                    } else {
                        System.out.println("DON'T EAT IT");
                    }
                } else {
                    System.out.println("Did the cat lick it?");
                    answer = in.next();
                    if (answer.equals("YES.")) {
                        System.out.println("Is your cat healthy?");
                        answer = in.next();
                        if (answer.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("YOUR CALL");
                        }
                    } else {
                        System.out.println("EAT IT.");
                    }
                }
            } else {
                System.out.println("Is it an Emausaurus?");
                answer = in.next();
                if (answer.equals("YES.")) {
                    System.out.println("Are you a Megalosaurus?");
                    answer = in.next();
                    if (answer.equals("YES.")) {
                        System.out.println("EAT IT.");
                    } else {
                        System.out.println("DON'T EAT IT");
                    }
                } else {
                    System.out.println("Did the cat lick it?");
                    answer = in.next();
                    if (answer.equals("YES.")) {
                        System.out.println("Is your cat healthy?");
                        answer = in.next();
                        if (answer.equals("YES.")) {
                            System.out.println("EAT IT.");
                        } else {
                            System.out.println("YOUR CALL");
                        }
                    } else {
                        System.out.println("EAT IT.");
                    }
                }
            }
        }
    }
}
