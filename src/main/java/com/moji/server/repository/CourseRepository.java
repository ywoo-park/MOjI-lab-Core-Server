package com.moji.server.repository;

import com.moji.server.domain.Course;
import com.moji.server.domain.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, String> {
    Course findBy_id(String idx);

//    @Query(value = "{'photos.represent':true, 'boardIdx': ?0}", fields="{'photos.photoUrl' : 1, '_id' : 0}")
    @Query(value = "{'photos.represent':true, 'boardIdx': ?0}")
    List<Course> findByBoardIdxAndRepresentPhotos(String boardIdx);
}
