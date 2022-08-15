package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImp implements IRoleService {
	@Autowired
	IRoleService roleRepository;
	@Override
	public List<Role> findAllRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAllRoles();
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.saveRole(role);
	}

	@Override
	public Role deleteRoleById(Long id) {
		Role role = roleRepository.findRoleById(id);
		roleRepository.deleteRoleById(id);
		return role;
	}

	@Override
	public Role findRoleById(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findRoleById(id);
	}

}
