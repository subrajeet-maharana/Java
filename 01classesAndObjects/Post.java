class InstaPost {
  String title;
  String content;
  int likes;
  
  InstaPost() {
    title = "Hello World";
    content = "First Post as an object after instantiating from class InstaPost";
    likes = 84;
  }

  InstaPost(String customTitle, int customLikes) {
    title = customTitle; //content is set to null by default
    likes = customLikes;
  }

  protected void incrementLikes() {
    likes++;
  }
}

public class Post {
  public static void main(String[] args) {
    InstaPost myPost = new InstaPost();
    myPost.incrementLikes();
    System.out.println("Title: " + myPost.title + "\nContent: " + myPost.content);
    System.out.println("Number of Likes: " + myPost.likes);
    InstaPost myPost2 = new InstaPost("New Post from Para Military", 500);
    myPost2.incrementLikes();
    System.out.println("Title: " + myPost2.title + "\nContent: " + myPost2.content);
    System.out.println("Number of Likes: " + myPost2.likes);
  }
}
