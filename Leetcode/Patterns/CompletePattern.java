package Leetcode.Patterns;

/*
Basic Concept behind Pattern Programming ->


*/

public class CompletePattern {

    static void one(int numR, int numC) {
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void two(int numR) {
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void three(int numR) {
        for (int i = 0; i < numR; i++) {
            for (int j = numR; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void four(int numR) {
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void five(int numR) {
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j <= i && i < numR / 2; j++) {
                System.out.print("*");
            }
            for (int k = numR; k > i && i >= numR / 2; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void six(int numR, int numC) {
        for (int i = 1; i <= numR; i++) {
            for (int j = 0; j < numC; j++) {
                if (j < numR - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void seven(int numR, int numC) {
        for (int i = numR; i >= 0; i--) {
            for (int j = 0; j < numC; j++) {
                if (j < numR - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void eight(int numR) {
        for (int i = numR / 2; i <= numR; i++) {
            for (int j = 0; j < numR; j++) {
                if (j < numR - i || j >= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void nine(int numR) {
        for (int i = numR; i >= numR / 2; i--) {
            for (int j = 0; j < numR; j++) {
                if (j < numR - i || j >= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void ten(int numR) {
        for (int i = numR / 2; i <= numR; i++) {
            for (int j = 0; j < numR; j++) {
                if (j < numR - i || j >= i || j % 2 == i % 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void eleven(int numR) {
        for (int i = numR; i >= numR / 2; i--) {
            for (int j = 0; j < numR; j++) {
                if (j < numR - i || j >= i || j % 2 == i % 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void tweleve(int numR) {
        for (int i = numR; i > (numR / 2); i--) {
            for (int j = 0; j < numR; j++) {
                if (j < numR - i || j >= i || j % 2 == i % 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = numR / 2; i <= numR; i++) {
            for (int j = 0; j < numR; j++) {
                if (j < numR - i || j >= i || j % 2 == i % 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tweleve(9);
    }
}
