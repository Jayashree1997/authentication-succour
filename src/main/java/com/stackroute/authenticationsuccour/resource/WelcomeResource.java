package com.stackroute.authenticationsuccour.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/rest/Welcome")
@RestController
public class WelcomeResource {
@GetMapping("/all")
  public String Welcome(){
  return "Welcome to succour";
}
@PreAuthorize("hasAnyRole('admin','stakeholder','architect','developer','full stack developer','sprint master','test engineer','Manager','Supervisor')")
@GetMapping("/secured/all")
  public String securedWelcome(){
  return "Secured Welcome";
}

}

