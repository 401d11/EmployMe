package com.codefellows.employmee;

import com.codefellows.employmee.models.Account;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class EmploymeeApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void constructorTest() {
		Account sut = new Account("Test User", "123", "example@example.com", "8007654321", false);
		assertEquals("Test User", sut.getUsername());
		assertEquals("123", sut.getPassword());
		assertEquals("8007654321", sut.getPhone());
		assertEquals(false, sut.isBusiness());
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void routeGet() throws Exception {
		mockMvc.perform(get("/albums"))
				.andDo(print())
				.andExpect(content().string(containsString("<h1>Albums</h1>")))
				.andExpect(status().isOk());
	}

	@Test
	public void routePost() throws Exception {
		mockMvc.perform(post("/")
						.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
						.param("title", "Album Title"))
				.andExpect(content().string(containsString("the response text")));
	}


}
