package com.altimetrik.platformworks.models;


import java.util.Objects;


import org.springframework.data.annotation.Id;





public class Platformworks  {
  
  
   
   
  
  private String presentation = null;
  
   
   
  
  private String overview = null;
  
   
   
  
  private String demoserver = null;
  
   
   
  
  private String repo = null;
  
   
   
  
  private String name = null;
  
   
   
  
  private String testbed = null;
  
   
   
  
  private String changelog = null;
  
   
  
  @Id
   
  
  private String id = null;

  
  /**
   * {}
   **/
  public String getPresentation() {
    return presentation;
  }
  public void setPresentation(String presentation) {
    this.presentation = presentation;
  }

  
  /**
   * {}
   **/
  public String getOverview() {
    return overview;
  }
  public void setOverview(String overview) {
    this.overview = overview;
  }

  
  /**
   * {}
   **/
  public String getDemoserver() {
    return demoserver;
  }
  public void setDemoserver(String demoserver) {
    this.demoserver = demoserver;
  }

  
  /**
   * {}
   **/
  public String getRepo() {
    return repo;
  }
  public void setRepo(String repo) {
    this.repo = repo;
  }

  
  /**
   * {}
   **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * {}
   **/
  public String getTestbed() {
    return testbed;
  }
  public void setTestbed(String testbed) {
    this.testbed = testbed;
  }

  
  /**
   * {}
   **/
  public String getChangelog() {
    return changelog;
  }
  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }

  
  /**
   * {"primaryKey":true}
   **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platformworks platformworks = (Platformworks) o;
    return Objects.equals(presentation, platformworks.presentation) &&
        Objects.equals(overview, platformworks.overview) &&
        Objects.equals(demoserver, platformworks.demoserver) &&
        Objects.equals(repo, platformworks.repo) &&
        Objects.equals(name, platformworks.name) &&
        Objects.equals(testbed, platformworks.testbed) &&
        Objects.equals(changelog, platformworks.changelog) &&
        Objects.equals(id, platformworks.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentation, overview, demoserver, repo, name, testbed, changelog, id);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platformworks {\n");
    
    sb.append("  presentation: ").append(presentation).append("\n");
    sb.append("  overview: ").append(overview).append("\n");
    sb.append("  demoserver: ").append(demoserver).append("\n");
    sb.append("  repo: ").append(repo).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  testbed: ").append(testbed).append("\n");
    sb.append("  changelog: ").append(changelog).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

