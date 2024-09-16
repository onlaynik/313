package ru.alexeykedr.springbootbootstrap.service;

import ru.alexeykedr.springbootbootstrap.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
