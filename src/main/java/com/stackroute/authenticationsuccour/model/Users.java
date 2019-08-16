package com.stackroute.authenticationsuccour.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="user_table")
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private int id;
  @Column(name = "active")
  private String active;
  @Column(name = "email")
  private String email;
  @Column(name = "name")
  private String name;
  @Column(name = "password")
  private String password;
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles;

  public Users() {

  }

  public Users(Users users) {
    this.id = users.getId();
    this.active = users.getActive();
    this.email = users.getEmail();
    this.name = users.getName();
    this.password = users.getPassword();

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }


}
