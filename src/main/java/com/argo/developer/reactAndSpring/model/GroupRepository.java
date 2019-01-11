package com.argo.developer.reactAndSpring.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ruslan on 11.01.2019.
 */
public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}
