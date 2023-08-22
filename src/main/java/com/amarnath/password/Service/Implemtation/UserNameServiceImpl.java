package com.amarnath.password.Service.Implemtation;

import com.amarnath.password.DTO.UserNameDTO;
import com.amarnath.password.Repository.UserNameRepo;
import com.amarnath.password.Service.UsernameService;
import com.amarnath.password.entity.UserName;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserNameServiceImpl implements UsernameService {

    private final ModelMapper mapper;
    private final UserNameRepo userNameRepo;

    @Autowired
    public UserNameServiceImpl(ModelMapper mapper, UserNameRepo userNameRepo) {
        super();
        this.mapper = mapper;
        this.userNameRepo = userNameRepo;
    }

    @Override
    public UserNameDTO createNewUser(UserNameDTO userNameDto) {

        UserName userNameReceaved = mapToEntity(userNameDto);

        UserName savedResponse = userNameRepo.save(userNameReceaved);

        return mapToDto(savedResponse);

    }

    private UserNameDTO mapToDto(UserName userName){

        return mapper.map(userName, UserNameDTO.class);

    }

    private UserName mapToEntity(UserNameDTO userNameDTO){

        return mapper.map(userNameDTO, UserName.class);

    }

}
