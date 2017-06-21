package com.altimetrik.platformworks.api.service.impl;

import com.altimetrik.platformworks.api.service.*;
import com.altimetrik.platformworks.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.platformworks.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.platformworks.models.Platformworks;


import java.util.List;
import com.altimetrik.platformworks.exception.NotFoundException;


@Service
@Transactional
public class PlatformworksApiServiceImpl implements PlatformworksApiService {
		  	  
	  @Autowired
	
  	  private PlatformworksRepository  platformworksRepository ;
	   
  
  
				
			
      @Override
      public List<Platformworks> findAllPlatformworks()
      throws NotFoundException {
      
        
  		
  		
  			return platformworksRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Platformworks updatePlatformworks(Platformworks platformworks)
      throws NotFoundException {
      
         
        	return platformworksRepository.save(platformworks);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Platformworks addPlatformworks(Platformworks platformworks)
      throws NotFoundException {
      
         
        	return platformworksRepository.save(platformworks);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Platformworks findByIdPlatformworks(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return platformworksRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePlatformworks(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

