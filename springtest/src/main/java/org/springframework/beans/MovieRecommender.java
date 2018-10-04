package org.springframework.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {
	private final CustomerPreferenceDao customerPreferenceDao;

    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }

    // ...
}
