package com.veteBackEnd.veteBackEnd.controller;

import com.veteBackEnd.veteBackEnd.model.Animal;
import com.veteBackEnd.veteBackEnd.model.Veterinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class VeteController {
    @Autowired(required = true)
    private RestTemplate restTemplate;

    @Value("${spring.services.animalApi.save}")
    private String saveAnimalValidatorUri;

    @Value("${spring.services.animalApi.get}")
    private String animalUri;

    @Value("${spring.services.animalApi.getByName}")
    private String getByNameAnimalUri;

    @Value("${spring.services.veterinaryApi.save}")
    private String saveVeteUri;

    @Value("${spring.services.veterinaryApi.get}")
    private String veteUri;

    @GetMapping("/Animal")
    public ResponseEntity<String> getAnimalById(@RequestParam String animalId){

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(animalUri)
                .queryParam("animalId", "{animalId}")
                .encode()
                .toUriString();

        Map<String, String> params = new HashMap<String, String>();
        params.put("animalId", animalId);

        return restTemplate.exchange(
                urlTemplate,
                HttpMethod.GET,
                entity,
                String.class,
                params
        );
    }

    @GetMapping("/AnimalByName")
    public ResponseEntity<String> getAnimalByName(@RequestParam String animalName){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(getByNameAnimalUri)
                .queryParam("animalName", "{animalName}")
                .encode()
                .toUriString();

        Map<String, String> params = new HashMap<String, String>();
        params.put("animalName", animalName);

        return restTemplate.exchange(
                urlTemplate,
                HttpMethod.GET,
                entity,
                String.class,
                params
        );
    }

    @PutMapping("/Animals/save/{animalId}")
    public ResponseEntity<String> animalSave(@PathVariable int animalId, @RequestBody Animal animal){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<Object>(animal, headers);

        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("animalId", animalId);
        return restTemplate.exchange(
                saveAnimalValidatorUri,
                HttpMethod.PUT,
                entity,
                String.class,
                params
        );
    }

    @GetMapping("/Vete")
    public ResponseEntity<String> getVeterinary(@RequestParam int VeterinaryId){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        String urlTemplate = UriComponentsBuilder.fromHttpUrl(veteUri)
                .queryParam("VeterinaryId", "{VeterinaryId}")
                .encode()
                .toUriString();

        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("VeterinaryId", VeterinaryId);

        return restTemplate.exchange(
                urlTemplate,
                HttpMethod.GET,
                entity,
                String.class,
                params
        );
    }

    @PutMapping("/Vete/save/{veteid}")
    public ResponseEntity<String> veteSave(@PathVariable int veteid, @RequestBody Veterinary vete){
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<Object>(vete, headers);

        Map<String, Integer> params = new HashMap<String, Integer>();
        params.put("veteid", veteid);
        return restTemplate.exchange(
                saveVeteUri,
                HttpMethod.PUT,
                entity,
                String.class,
                params
        );
    }



}
