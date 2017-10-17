package me.wangkang.springboot.course.Chapter3_2_4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.wangkang.springboot.course.Chapter3_2_4.Application;
import me.wangkang.springboot.course.Chapter3_2_4.domain.p.User;
import me.wangkang.springboot.course.Chapter3_2_4.domain.p.UserRepository;
import me.wangkang.springboot.course.Chapter3_2_4.domain.s.Message;
import me.wangkang.springboot.course.Chapter3_2_4.domain.s.MessageRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MessageRepository messageRepository;

	@Before
	public void setUp() {
	}

	@Test
	public void test() throws Exception {

		userRepository.save(new User("aaa", 10));
		userRepository.save(new User("bbb", 20));
		userRepository.save(new User("ccc", 30));
		userRepository.save(new User("ddd", 40));
		userRepository.save(new User("eee", 50));

		Assert.assertEquals(5, userRepository.findAll().size());

		messageRepository.save(new Message("o1", "aaaaaaaaaa"));
		messageRepository.save(new Message("o2", "bbbbbbbbbb"));
		messageRepository.save(new Message("o3", "cccccccccc"));

		Assert.assertEquals(3, messageRepository.findAll().size());

	}


}