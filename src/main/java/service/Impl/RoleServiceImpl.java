package service.Impl;

import dto.RoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.RoleEntity;
import repository.RoleRepository;
import service.RoleService;

import java.util.List;

/**
 * Created by Vladimir on 12.07.2017.
 */
@Service
public class RoleServiceImpl extends  AbstractMapperService<RoleEntity, RoleDTO> implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public RoleDTO createRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void deleteRole(Integer id) {

    }

    @Override
    public RoleDTO updateRole(Integer Id, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO getRoleById(Integer roleId) {
        return toDTO(roleRepository.findOne(roleId));
    }

    @Override
    public List<RoleDTO> getAllRoleByName() {
        return null;
    }

    @Override
    protected Class getDTOClass() {
        return RoleDTO.class;
    }

    @Override
    protected Class getEntityClass() {
        return RoleEntity.class;
    }
}
