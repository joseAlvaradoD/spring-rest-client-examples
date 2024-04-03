package jjad.springframework.client.service;

import jjad.springframework.client.api.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testGetUsers(){
        //given

        //when
        List<User> users =apiService.getUsers();

        //then
        assertNotNull(users);
        assertNotEquals(users.size(), 0);
    }

}