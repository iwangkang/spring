package me.wangkang.springboot.course.Chapter3_2_4.domain.s;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
