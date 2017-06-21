package com.altimetrik.platformworks.api.service;

import com.altimetrik.platformworks.models.Platformworks;


import com.altimetrik.platformworks.exception.NotFoundException;
import java.util.List;

public interface PlatformworksApiService {
  
      List<Platformworks> findAllPlatformworks()
      throws NotFoundException;
  
      Platformworks updatePlatformworks(Platformworks platformworks)
      throws NotFoundException;
  
      Platformworks addPlatformworks(Platformworks platformworks)
      throws NotFoundException;
  
      Platformworks findByIdPlatformworks(String id)
      throws NotFoundException;
  
      void deletePlatformworks(String id)
      throws NotFoundException;
  
}

