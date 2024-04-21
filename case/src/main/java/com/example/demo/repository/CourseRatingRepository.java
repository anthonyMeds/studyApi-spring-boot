package com.example.demo.repository;

import com.example.demo.domain.courseRating.CourseRating;
import com.example.demo.domain.courses.Course;
import com.example.demo.domain.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRatingRepository extends JpaRepository<CourseRating, Long> {
    boolean existsByUserAndCourse(User user, Course course);
}
