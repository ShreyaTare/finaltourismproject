package com.myexample.mytourism;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;

//import java.util.stream.Collectors;
//import java.util.stream.Stream;

//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

//import com.myexample.mytourism.MyModel.Usercontatct;
import com.myexample.mytourism.MyRepository.myRepository;
import com.myexample.mytourism.MyService.myservice;

@SpringBootTest
class MytourismApplicationTests {
    @Autowired
	myservice serv;

	@MockBean
	myRepository repo;

	// @Test
	// void contextLoads() {
    //     when(repo.findAll()).thenReturn(Stream.of(new Usercontatct(1, "abc@gmail.com", "shreya", "abc123")).collect(Collectors.toList()));
    //     assertEquals(1,serv.getAll().size());

	// }

}
