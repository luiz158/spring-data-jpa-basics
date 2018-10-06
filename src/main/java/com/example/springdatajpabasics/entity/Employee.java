package com.example.springdatajpabasics.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
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
    @JoinColumn
    Collection<Issue> issues;
}
