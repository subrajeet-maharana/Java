public class QuestionList {

  Question[] questionArray = new Question[5];

  public QuestionList() {
    questionArray[0] = new Question(1, "Which is OOPs?", new String[] { "Java", "Go", "C", "SQL" }, "A");
    questionArray[1] = new Question(2, "First among these?", new String[] { "Java", "Go", "C", "SQL" }, "C");
    questionArray[2] = new Question(3, "Current Language?", new String[] { "Java", "Go", "C", "SQL" }, "A");
    questionArray[3] = new Question(4, "Not Programming Language?", new String[] { "Java", "Go", "C", "SQL" }, "D");
    questionArray[4] = new Question(5, "Favourite Language?", new String[] { "Java", "Go", "C", "SQL" }, "B");
  }
}
