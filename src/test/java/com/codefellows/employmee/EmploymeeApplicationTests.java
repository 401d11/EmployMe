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

	// Black Box testing doesn't look inside the class, but merely checks if it works
	@Test
	public void contextLoads(){
	}

	@Test
	public void constructorTest() {
		Account sut = new Account("Test User", "123", "example@example.com", "8007654321", false);
		assertEquals("Test User", sut.getUsername());
		assertEquals("123", sut.getPassword());
		assertEquals("8007654321", sut.getPhone());
		assertEquals(false, sut.isBusiness());
	}


		// testing all get routes


		@Test
		void getHomePage() throws Exception {
			mockMvc.perform(get("/"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Employmee</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getLoginPage() throws Exception{
			mockMvc.perform(get("/login"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Employmee Login</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getAboutUsPage() throws Exception{
			mockMvc.perform(get("/aboutus"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>About Us</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getSignupPage() throws Exception{
			mockMvc.perform(get("/signup"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Signup</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getSignupCandidatePage() throws Exception{
			mockMvc.perform(get("/signup/candidate"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>My Login Page &mdash; Bootstrap 4 Login Page Snippet</title>")))
					.andExpect(status().isOk());
    }

		@Test
		void getSignupBusinessPage() throws Exception{
			mockMvc.perform(get("/signup/business"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Employmee Business</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getAccountPage() throws Exception{
			mockMvc.perform(get("/profile"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Profile</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getConnect() throws Exception{
			mockMvc.perform(get("/connect"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Connect</title>")))
					.andExpect(status().isOk());
		}

		@Test
		void getCandidateByLanguage() throws Exception{
			mockMvc.perform(get("/discover"))
					.andDo(print())
					.andExpect(content().string(containsString("<title>Discover</title>")))
					.andExpect(status().isOk());
		}
	}

