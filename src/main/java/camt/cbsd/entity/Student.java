package camt.cbsd.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Dto on 3/11/2017.
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @NonNull long id;
    @NonNull String studentId;
    @NonNull String name;
    @NonNull String surname;
    @NonNull double gpa;
    @NonNull String image;
    @NonNull boolean feature;
    @NonNull int penAmount;
    @NonNull String description;

    @ManyToMany
    List<Course> enrolledCourse;

    public List<Course> addCourse(Course course) {
        enrolledCourse = Optional.ofNullable(enrolledCourse).orElse(new ArrayList<>());
        enrolledCourse.add(course);
        return enrolledCourse;
    }


//    public Student(long id, String studentId, String name, String surname, double gpa, String image, boolean feature, int penAmount, String description) {
//        this.id = id;
//        this.studentId = studentId;
//        this.name = name;
//        this.surname = surname;
//        this.gpa = gpa;
//        this.image = image;
//        this.feature = feature;
//        this.penAmount = penAmount;
//        this.description = description;
//    }


}
