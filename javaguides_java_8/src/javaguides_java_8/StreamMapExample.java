package javaguides_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {

	private int id;

	private String userName;

	private String password;

	private String email;

	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

}

class UserDto {

	private int id;

	private String userName;
	private String email;

	public UserDto(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}

}

public class StreamMapExample {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Revan", "Sercret123", "siddurevan@gmail.com"));
		users.add(new User(2, "Tommy", "Sercret123", "tommyn@gmail.com"));
		users.add(new User(3, "Hardy", "Sercret123", "hardy@gmail.com"));
		users.add(new User(4, "Jaykumar", "Sercret123", "jaykumar@gmail.com"));

		List<UserDto> userDto = new ArrayList<UserDto>();
		for (User user : users) {
			userDto.add(new UserDto(user.getId(), user.getUserName(), user.getEmail()));

		}

		for (UserDto dto : userDto) {
			System.out.println(dto);

		}

		// Using Stream API
//		users.stream().map(new Function<User, UserDto>() {
//
//			@Override
//			public UserDto apply(User user) {
//
//				return new UserDto(user.getId(), user.getUserName(), user.getEmail());
//			}
//
//		});
		System.out.println("Using Stream API");
		users.stream().map((User user) -> new UserDto(user.getId(), user.getUserName(), user.getEmail()))
				.forEach(e -> System.out.println(e));

		// OR

		System.out.println("*****");
		List<UserDto> list = users.stream()
				.map((User user) -> new UserDto(user.getId(), user.getUserName(), user.getEmail()))
				.collect(Collectors.toList());
		list.forEach(System.out::println);

	}

}