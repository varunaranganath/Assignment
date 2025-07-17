package Com.revature.Assignment03;

public class ConditionalStatements {
    int a = 10;
    int b = 1;
    int c = 29;
    int n = 10;

    public String condition_if() {
        if (a > b) {
            return "Greater";
        } else {
            return "Lesser";
        }
    }

    public String else_if_condition() {
        if (a > b) {
            return "Greater is a";
        } else if (b > c) {
            return "Greater is b";
        } else {
            return "Greater is c";
        }
    }

    public String condtion_far() {
        StringBuilder result = new StringBuilder("for loop:\n");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            sum += sum + i;
            result.append("i = ").append(i).append(", sum = ").append(sum).append("\n");
        }
        return result.toString();
    }

    public String condtion_while() {
        int num = 1;
        StringBuilder result = new StringBuilder("while loop: ");
        while (num < 10) {
            result.append(num).append(" ");
            num++;
        }
        return result.toString();
    }

    public String condtion_switch() {
        int i = 2;
        switch (i) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            default:
                return "greater than two";
        }
    }

    public String conditionbreak() {
        StringBuilder result = new StringBuilder("break loop:\n");
        for (int a = 0; a < 10; a++) {
            if (a == 2) break;
            result.append(a).append("\n");
        }
        result.append("hi");
        return result.toString();
    }

    public String condtioncontinue() {
        StringBuilder result = new StringBuilder("continue loop: ");
        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            result.append(i).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ConditionalStatements e = new ConditionalStatements();

        System.out.println("if condition: " + e.condition_if());
        System.out.println("else-if condition: " + e.else_if_condition());
        System.out.println(e.condtion_far());
        System.out.println(e.condtion_while());
        System.out.println("switch condition: " + e.condtion_switch());
        System.out.println(e.conditionbreak());
        System.out.println(e.condtioncontinue());
    }
}
