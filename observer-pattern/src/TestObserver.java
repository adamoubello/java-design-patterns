import observable.Commentary;
import observable.CommentaryObject;
import observable.Subject;
import observer.Observer;
import observer.SMSUsers;

import java.util.ArrayList;

public class TestObserver {

	public static void main(String[] args) {
		Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Match [2024AUG28]");
		Observer observer = new SMSUsers(subject, "Verush Amang [Mintaba]");
		observer.subscribe();
		
		System.out.println();
		
		Observer observer2 = new SMSUsers(subject, "Arthur Alexxy Nkom [Nkondjock]");
		observer2.subscribe();
		
		Commentary cObject = ((Commentary)subject);
		cObject.setDesc("Welcome to live Soccer match");
		cObject.setDesc("Current score 0-0");
		
		System.out.println();
		
		observer2.unSubscribe();
		
		System.out.println();
		
		cObject.setDesc("It's a goal!!");
		cObject.setDesc("Current score 1-0");
		
		System.out.println();
		
		Observer observer3 = new SMSUsers(subject, "Mimi Patou Fifi [Edea]");
		observer3.subscribe();
		
		System.out.println();
		
		cObject.setDesc("It's another goal!!");
		cObject.setDesc("Half-time score 2-0");
		
	}

}
