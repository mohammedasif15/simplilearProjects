package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
	@Autowired
   FeedDAO dao;
    
@PostMapping("insert")
public FeedbackForm insert(@RequestBody FeedbackForm s) {
    return dao.insert(s);
}
}
