import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String[] answerArray = new String[5];
    System.out.println("=== Quiz Show ===");
    QuestionList mainQuestion = new QuestionList();
    Question[] questionArray = mainQuestion.questionArray;

    int score = 0, i = 0;
    for (Question q : questionArray) {
      q.showQuestion();
      Scanner sc = new Scanner(System.in);
      answerArray[i] = sc.nextLine();
      if (answerArray[i++].equals(q.getAns()))
        score++;
    }

    System.out.println("Quiz Ended!");
    System.out.println("Your Score is: " + score);
  }
}
