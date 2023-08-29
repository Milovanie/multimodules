package cam.utilas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cam.models.User;

public class BDSort {
	public static final List<User> users = Arrays.asList(
			new User("John", 28),
			new User("Jane", 35),
			new User("Alex", 21));

	public static void main(String[] args) {
		System.out.println("Before sort:");

		printing(users);

		List<User> sortedUsers = mySort(users);
		List<User> mySortLambdas = mySortLambdas(users);

		System.out.println("\nAfter sort:");
		printing(users);
		System.out.println("\nAfter mySortLambdas:");
		printing(mySortLambdas);

		mySortIfs(users);
	}

	private static List<User> mySortIfs(List<User> users) {
		users.sort((o1, o2) -> {
			if (o1.getAge() == o2.getAge())
				return o1.getName().compareTo(o2.getName());
			else
				return o1.getAge() - o2.getAge();
		});
		return users;
	}

	private static List<User> mySortIfsOld(List<User> users) {
		Collections.sort(users, new Comparator<User>() {
			@Override
			public int compare(User o1,
				User o2) {
				if (o1.getAge() == o2.getAge()) {
					return o1.getName().compareTo(o2.getName());
				} else {
					return o1.getAge() - o2.getAge();
				}
			}
		});
		return users;
	}

	private static <T> void printing(List<T> users) {
		for (T user : users) {
			System.out.println(user);
		}
	}

	private static List<User> mySortLambdas(List<User> users) {
		Collections.sort(users, (o1,
			o2) -> o1.getAge() - o2.getAge());

		return users;
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
