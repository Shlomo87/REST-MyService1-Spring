package main.groovy.test

/**
 * Created by klevshin on 6/24/2016.
 */
import org.springframework.web.client.RestTemplate

class SendingArticleTemplate {

    public DriveSubscriberStructure getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        DriveSubscriberStructure sendingArticle = restTemplate.getForObject("http://localhost:8080/sendingArticle?article=LexusGS350", DriveSubscriberStructure.class);

        return sendingArticle;
    }

}