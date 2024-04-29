package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {
		private ArrayList<Submissions> submissions;

    public NewsFeed() {
        this.submissions = new ArrayList<>();
    }
    //adds a submission
    void addSubmission(Submissions submission) {
        submissions.add(submission);
    }
    //prints all submissions
    void printSubmissions() {
        for (Submissions s : submissions) {
            System.out.println(s);
        }
    }
    //prints all submissions by user
    void printSubmissionsByUser(String userName) {
        for (Submissions s : submissions) {
            if (s.getUserName().equals(userName)) {
                System.out.println(s);
            }
        }
    }
    //deletes a submission
    void deleteSubmission(Submissions submission) {
            submissions.remove(submission);
    }
    // Finds a user from class Submissions from his or her posts
    ArrayList<Submissions> findUser(String userName, boolean onlyPhotos) {
        ArrayList<Submissions> result = new ArrayList<>();
        for (Submissions submission : submissions) {
            if (submission.getUserName().equals(userName) && (!onlyPhotos || submission instanceof PhotoBroadcast)) {
                result.add(submission);
            }
        }
        System.out.println("Die User: " + result);
        return result;
    }
}
	
	
	


