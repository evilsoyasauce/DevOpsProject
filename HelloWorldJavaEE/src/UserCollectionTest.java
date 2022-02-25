


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 
 */

/**
 * @author Evilgamerism
 *
 */
class UserCollectionTest {

	private UserCollection uc;
	private User u1;
	private User u2;
	private User u3;
	private User u4;
	private final int USER_COLLECTION_SIZE = 4;
	private final int USER_CAPACITY_LIMIT = 20;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		uc = new UserCollection();
		u1 = new User("username1", "password1", "username1@gmail.com", "english");
		u2 = new User("username2", "password2", "username2@gmail.com", "chinese");
		u3 = new User("username3", "password3", "username3@gmail.com", "malay");
		u4 = new User("username4", "password4", "username4@gmail.com", "indian");
		uc.addUser(u1);
		uc.addUser(u2);
		uc.addUser(u3);
		uc.addUser(u4);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link UserCollection#UserCollection()}.
	 */
	@Test
	void testUserCollection() {
		UserCollection sc = new UserCollection();
		assertFalse(sc == null);
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link UserCollection#UserCollection(int)}.
	 */
	@Test
	void testUserCollectionInt() {
		UserCollection sc = new UserCollection(20);
		assertFalse(sc == null);
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link UserCollection#getUsers()}.
	 */
	@Test
	void testGetUsers() {
		// Act
		List<User> testUc = uc.getUsers();

		// Assert
		// Assert that User Collection is not empty after invoking getUsers function
		// assertTrue(!testSc.isEmpty());
		assertFalse(testUc.isEmpty());

		// Assert that  Collection size contains the correct amount of users inside
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);
	}

	/**
	 * Test method for {@link UserCollection#addUser(User)}.
	 */
	@Test
	void testAddUser() {
		// fail("Not yet implemented");
		List<User> testUc = uc.getUsers();

		// Assert that User Collection is equals to user collection size 4
		assertEquals(testUc.size(), USER_COLLECTION_SIZE);

		// Act
		uc.addUser(u1);

		// Assert that User Collection is equals to  collection size 4 + 1
		assertEquals(uc.getUsers().size(), USER_COLLECTION_SIZE + 1);

		// Act attempt to add 17 users to current 4 users
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		uc.addUser(u1);
		

		// Assert that User Collection cannot be more than 20 (capacity)
		assertEquals(uc.getUsers().size(), USER_CAPACITY_LIMIT);
	}

	/**
	 * Test method for {@link UserCollection#findUsersById(java.lang.String)}.
	 */
	@Test
	void testFindUsersById() {
		// Act
		User validUser = uc.findUsersById("username1");
		User invalidUser = uc.findUsersById("Invalid Id");

		// Assert we retrieve a valid User
		assertNotNull(validUser);
		// Assert we retrieve the accurate User base on Id
		assertEquals(validUser.getName(), "username1");
		// Assert we get a null when we input a invalid Id
		assertNull(invalidUser);

		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link UserCollection#findUserByEmail(java.lang.String)}.
	 */
	@Test
	void testFindUserByEmail() {
		// Act
		User validUser = uc.findUserByEmail("username2@gmail.com");
		User invalidUser = uc.findUserByEmail("Invalid User Email");

		// Assert we retrieve a valid User
		assertNotNull(validUser);
		// Assert we retrieve the accurate User base on Id
		assertEquals(validUser.getName(), "username2");
		// Assert we get a null when we input a invalid Title
		assertNull(invalidUser);

		// fail("Not yet implemented");
	}

}
