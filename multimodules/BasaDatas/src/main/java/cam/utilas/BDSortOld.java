package cam.utilas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cam.models.User;

public class BDSortOld {
	public final static List<User> users = Arrays.asList(
			new User("John", 28),
			new User("Jane", 35),
			new User("Alex", 21));

	public static void main(String[] args) {

		System.out.println("Before sort:");
		for (User user : users) {
			System.out.println(user);
		}

		List<User> sortedUsers = mySort(users);

		System.out.println("\nAfter sort:");
		for (User user : sortedUsers) {
			System.out.println(user);
		}
	}

	private static List<User> mySort(List<User> users) {
		Collections.sort(users, new Comparator<User>() {
			@Override
			public int compare(User o1,
				User o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		return users;
	}
}
