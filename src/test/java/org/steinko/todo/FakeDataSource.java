package org.steinko.todo;

import org.springframework.stereotype.Component;

@Component
public class FakeDataSource {
   
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
