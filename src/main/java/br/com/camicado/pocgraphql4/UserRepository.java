package br.com.camicado.pocgraphql4;

/**
 * Manages user persistence
 */
public class UserRepository {

	public UserRepository() {
	}

	public User findByEmail(String email) {
		return new User("ads", "sadfasd", "asfasd", "aasdfas");
	}

	public User findById(String id) {
		return new User("ads", "sadfasd", "asfasd", "aasdfas");
	}

	public User saveUser(User user) {
		return user;
	}
}
