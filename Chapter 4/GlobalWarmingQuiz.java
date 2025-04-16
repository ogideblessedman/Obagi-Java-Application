import java.util.Scanner;
public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = {
            "1. What gas is most associated with global warming?\n1. Oxygen\n2. Nitrogen\n3. Carbon Dioxide\n4. Helium",
            "2. Which human activity contributes most to global warming?\n1. Farming\n2. Burning fossil fuels\n3. Recycling\n4. Planting trees",
            "3. Which of the following is a greenhouse gas?\n1. Argon\n2. Krypton\n3. Methane\n4. Neon",
            "4. What is a common argument against global warming?\n1. It's a hoax\n2. Ice is melting\n3. Seas are rising\n4. Temperatures are increasing",
            "5. What international agreement aims to combat climate change?\n1. Kyoto Protocol\n2. Geneva Convention\n3. Warsaw Pact\n4. Brexit"
        };
        int[] answers = {3, 2, 3, 1, 1};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int answer = input.nextInt();
            if (answer == answers[i]) {
                score++;
            }
        }

        switch (score) {
            case 5 -> System.out.println("Excellent");
            case 4 -> System.out.println("Very good");
            default -> {
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Visit: https://climate.nasa.gov or https://skepticalscience.com");
            }
        }
    }
}