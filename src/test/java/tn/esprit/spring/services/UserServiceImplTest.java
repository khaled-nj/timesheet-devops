package tn.esprit.spring.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddUser() {
        // Créer un utilisateur fictif pour le test
        User user = new User();

        user.setLastName("Doe");

        // Configurer le comportement simulé du UserRepository
        Mockito.when(userRepository.save(user)).thenReturn(user);

        // Appeler la méthode addUser de UserServiceImpl
        User savedUser = userService.addUser(user);

        // Vérifier que l'utilisateur renvoyé n'est pas nul
        assertNotNull(savedUser);

        // Vérifier que les détails de l'utilisateur sont corrects

        assertEquals("Doe", savedUser.getLastName());
    }

    // Ajoutez d'autres tests pour les autres méthodes de UserServiceImpl

    @Test
    public void testUpdateUser() {
        // Implement your test for updateUser method
    }

    @Test
    public void testDeleteUser() {
        // Implement your test for deleteUser method
    }

    @Test
    public void testRetrieveUser() {
        // Implement your test for retrieveUser method
    }
}
