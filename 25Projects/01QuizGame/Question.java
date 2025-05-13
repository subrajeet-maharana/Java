public class Question {
  private int id;
  private String title;
  private String[] opts;
  private String answer;

  public Question(int id, String title, String[] opts, String answer) {
    this.id = id;
    this.title = title;
    this.opts = opts;
    this.answer = answer;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String[] getOpts() {
    return opts;
  }

  public void setOpts(String[] opts) {
    this.opts = opts;
  }

  public String getAns() {
    return answer;
  }

  public void setAns(String answer) {
    this.answer = answer;
  }

  public void showQuestion() {
    System.out.println("\nQuestion ID: " + id);
    System.out.println("Title: " + title);
    char key = 'A';
    for (String opt : opts) {
      System.out.println(key + ": " + opt);
      key++;
    }
  }
}
