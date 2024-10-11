package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class UserServiceTest {
    @Test
    void canGetUserNameById() {
        //given
        UserDao userDau = mock(UserDao.class);
        User expectedUser = new User(1, "David");
        when(userDau.findById(1)).thenReturn(expectedUser);
        UserService userService = new UserService(userDau);

        //when
        String name = userService.getUserNameById(1);

        //then
        assertEquals("David", name);
        verify(userDau).findById(1);
    }

}