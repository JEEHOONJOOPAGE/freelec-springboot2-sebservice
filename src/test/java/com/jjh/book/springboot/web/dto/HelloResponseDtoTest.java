package com.jjh.book.springboot.web.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloResponseDtoTest {

    @Test
    public void lombokRunningTest(){
        String name = "nameTest";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);


        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }

}
