package com.infy;

import org.springframework.beans.factory.annotation.Value;

public class SubjectService {
    @Value("123")
    private int subId;
    @Value("Java")
    private String subName;

    public int getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }
}
