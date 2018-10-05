package com.example.springdatajpabasics.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by mtumilowicz on 2018-10-03.
 */
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class Employee {
    @Id
    Integer id;
    
    String name;
    
    @Embedded
    Address address;
    
    @OneToMany
    Collection<Issue> issues;
}
