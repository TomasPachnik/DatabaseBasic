package sk.tomas.app.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sk.tomas.app.iam.model.output.Token;
import sk.tomas.app.util.Constants;

/**
 * Created by Tomas Pachnik on 27-Feb-17.
 */

@Component
public class HomeClient {

    public void authorize() {
        HttpHeaders httpHeaders = new HttpHeaders() {{
            set("Authorization", "Basic c3lzYWRtaW46SGVzbG8xMjM=");
        }};
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Token> response;
        response = restTemplate.exchange(Constants.IAM_ADDRESS + "/app/authenticate", HttpMethod.GET, new HttpEntity<Object>(httpHeaders), Token.class);
        System.out.println(response.getBody());
    }

}
