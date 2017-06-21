package com.altimetrik.platformworks.api;

import com.altimetrik.platformworks.models.*;

import com.altimetrik.platformworks.api.service.PlatformworksApiService;

import com.altimetrik.platformworks.exception.NotFoundException;

import com.altimetrik.platformworks.models.Platformworks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class PlatformworksApi {

   @Autowired
   private PlatformworksApiService service;
  

  @RequestMapping(value = "/platformworks", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Platformworks>> findAllPlatformworks()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Platformworks>>(service.findAllPlatformworks(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/platformworks", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Platformworks> updatePlatformworks(@RequestBody Platformworks platformworks
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Platformworks>(service.updatePlatformworks(platformworks), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/platformworks", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Platformworks> addPlatformworks(@RequestBody Platformworks platformworks
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Platformworks>(service.addPlatformworks(platformworks), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/platformworks/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Platformworks> findByIdPlatformworks(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Platformworks>(service.findByIdPlatformworks(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/platformworks/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePlatformworks(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deletePlatformworks(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

