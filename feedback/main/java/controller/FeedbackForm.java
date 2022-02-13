package controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FeedbackForm {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column
	    String feed;

		public String getFeed() {
			return feed;
		}

		public void setFeed(String feed) {
			this.feed = feed;
		}
	

	}

