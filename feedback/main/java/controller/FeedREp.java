package controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FeedREp extends JpaRepository<FeedbackForm, Integer> {

}
