class InstaPost {
  String title;
  String content;
  int likes;

  protected void incrementLikes() {
    likes++;
  }
}

public class Post {
  public static void main(String[] args) {
    InstaPost myPost = new InstaPost();
    myPost.incrementLikes();
    System.out.println("Number of Likes: " + myPost.likes);
  }
}
