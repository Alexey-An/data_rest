package com.example.accessingdatarest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Epic("Login Tests Epic")
@Feature("Invalid Login Features")
class AccessingDataRestApplicationTests {

	@Test
	@Story("User tries to login the system with empty username and invalid password.")
	@Description("Invalid Login Test with Empty Username and Invalid Password.")
	void contextLoads() {
	}

}
