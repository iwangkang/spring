package me.wangkang.springboot.course.Chapter3_2_4.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
