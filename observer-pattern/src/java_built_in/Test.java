package java_built_in;

public class Test {

	public static void main(String[] args) {
		CommentaryObjectObservable obj = new CommentaryObjectObservable("Soccer Match [2024AUG28]");
		SMSUsersObserver observer = new SMSUsersObserver(obj, "Verush Amang [Mintaba]");
		SMSUsersObserver observer2 = new SMSUsersObserver(obj,"Arthur Alexxy Nkom [Nkondjock]");
		observer.subscribe();
		observer2.subscribe();
		System.out.println("------------------------------------------------------");
		obj.setDesc("Welcome to live Soccer match");
		obj.setDesc("Current score 0-0");
		
		observer.unSubscribe();
		
		obj.setDesc("It's a goal!!");
		obj.setDesc("Current score 1-0");
	}
}
