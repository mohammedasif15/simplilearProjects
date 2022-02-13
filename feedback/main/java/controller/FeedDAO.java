package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeedDAO {
    @Autowired
    FeedREp srepo;
    //insert a single object
public FeedbackForm insert(FeedbackForm s) {
    return srepo.save(s);
}
}
