 package vehicle1.example.vehiclerent.tdd;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import vehicle1.example.vehiclerent.controller.UserController;
// import vehicle1.example.vehiclerent.model.User;
// import vehicle1.example.vehiclerent.service.Userservice;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.when;
// og 


// package vehicle1.example.vehiclerent.tdd;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import vehicle1.example.vehiclerent.controller.UserController;
// import vehicle1.example.vehiclerent.model.User;
// import vehicle1.example.vehiclerent.service.Userservice;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.when;

// @ExtendWith(MockitoExtension.class)
// public class UserControllerTest {

//     @Mock
//     private Userservice userService; // Mock the dependency

//     @InjectMocks
//     private UserController userController; // Inject mocks into the controller

//     private User validUser;
//     private User savedUser;

//     @BeforeEach
//     void setUp() {
//         // Setup common test data
//         validUser = createUser("john", "0763545232", "securePassword123", "13213213123");
//         savedUser = createUser("john", "0763545232", "securePassword123", "13213213123");
//     }

//     @Test
//     void registerUser_WithValidUser_ShouldReturn201Created() {
//         // Arrange
//         when(userService.registerUser(any(User.class))).thenReturn(savedUser);

//         // Act
//         ResponseEntity<User> response = userController.registerUser(validUser);

//         // Assert
//         assertNotNull(response);
//         assertEquals(HttpStatus.CREATED, response.getStatusCode());
//         assertNotNull(response.getBody());
//         assertEquals("john", response.getBody().getName());
//         assertEquals("0763545232", response.getBody().getPhoneNumber());
//     }

//     @Test
//     void registerUser_WithEmptyName_ShouldReturn400BadRequest() {
//         // Arrange
//         User invalidUser = createUser("", "0763545232", "securePassword123", "13213213123");

//         // Act
//         ResponseEntity<User> response = userController.registerUser(invalidUser);

//         // Assert
//         assertNotNull(response);
//         assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
//     }

//     @Test
//     void registerUser_WithEmptyPassword_ShouldReturn400BadRequest() {
//         // Arrange
//         User invalidUser = createUser("john", "0763545232", "", "13213213123");

//         // Act
//         ResponseEntity<User> response = userController.registerUser(invalidUser);

//         // Assert
//         assertNotNull(response);
//         assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
//     }

//     @Test
//     void registerUser_WithNullName_ShouldReturn400BadRequest() {
//         // Arrange
//         User invalidUser = createUser(null, "0763545232", "securePassword123", "13213213123");

//         // Act
//         ResponseEntity<User> response = userController.registerUser(invalidUser);

//         // Assert
//         assertNotNull(response);
//         assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
//     }

//     @Test
//     void registerUser_WithNullPassword_ShouldReturn400BadRequest() {
//         // Arrange
//         User invalidUser = createUser("john", "0763545232", null, "13213213123");

//         // Act
//         ResponseEntity<User> response = userController.registerUser(invalidUser);

//         // Assert
//         assertNotNull(response);
//         assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
//     }

//     // Helper method to create User objects
//     private User createUser(String name, String phoneNumber, String password, String nicOrPassport) {
//         User user = new User();
//         user.setName(name);
//         user.setPhoneNumber(phoneNumber);
//         user.setPassword(password);
//         user.setNicOrPassport(nicOrPassport);
//         return user;
//     }
// }
//
//@SpringBootTest
//public class UserTest {
//
//    @Autowired
//    private UserController userController;
//
//    @MockBean
//    private Userservice userService;
//
//    @Test
//    public void shouldReturn201WhenAddingValidUser() {
//
//        User newUser = new User();
//        newUser.setName("john");
//        newUser.setPhoneNumber("0763545232");
//        newUser.setPassword("123");
//        newUser.setNicOrPassport("13213213123");
//
//        User savedUser = new User();
//        savedUser.setName("john");
//        savedUser.setPhoneNumber("0763545232");
//        savedUser.setNicOrPassport("13213213123");
//
//        when(userService.registerUser(any(User.class))).thenReturn(savedUser);
//
//        ResponseEntity<User> response = userController.registerUser(newUser);
//
//        assertNotNull(response);
//        assertEquals(HttpStatus.CREATED, response.getStatusCode());
//        assertNotNull(response.getBody());
//        assertEquals("john", response.getBody().getName());
//    }
//
//    @Test
//    public void shouldReturn400WhenAddingEmptyName() {
//        // Arrange
//        User newUser = new User();
//        newUser.setName(""); // Empty name
//        newUser.setPhoneNumber("0763545232");
//        newUser.setPassword("123");
//        newUser.setNicOrPassport("13213213123");
//
//        // Act
//        ResponseEntity<User> response = userController.registerUser(newUser);
//
//        // Assert
//        assertNotNull(response);
//        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode()); // Check for 400 status
//    }
//
//    @Test
//    public void shouldReturn400WhenAddingEmptyPassword() {
//        // Arrange
//        User newUser = new User();
//        newUser.setName("john"); // Null name
//        newUser.setPhoneNumber("0763545232");
//        newUser.setPassword("");
//        newUser.setNicOrPassport("13213213123");
//
//        // Act
//        ResponseEntity<User> response = userController.registerUser(newUser);
//
//        // Assert
//        assertNotNull(response);
//        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode()); // Check for 400 status
//    }
//}