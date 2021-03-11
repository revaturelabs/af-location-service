package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dto.RoomRequestDto;
import com.revature.service.RoomService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(RoomController.class)
public class RoomControllerTests {

    @Autowired
    MockMvc mockMvc;


    @MockBean
    private RoomService roomService;

    private final ObjectMapper mapper = new ObjectMapper();

    private static  RoomRequestDto unsavedRoom1 = new RoomRequestDto();













}
