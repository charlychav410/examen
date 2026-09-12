package mx.com.kairos.examen.implement;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

import mx.com.kairos.examen.Constants.Constants;

@Service
public class RestSendService {

	public HttpResponse<String> postSender(String url, String jsonBody) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header(Constants.HEADDER_APP, Constants.HEADDER_TYPE)
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
	} 
	
	public HttpResponse<String> putSender(String url, String jsonBody) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header(Constants.HEADDER_APP, Constants.HEADDER_TYPE)                
                .PUT(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
	} 
	
	public HttpResponse<String> getSender(String url) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
	} 
	
	
}