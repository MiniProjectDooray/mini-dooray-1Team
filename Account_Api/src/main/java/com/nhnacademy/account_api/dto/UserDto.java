package com.nhnacademy.account_api.dto;

import com.nhnacademy.account_api.entity.User;
import com.nhnacademy.account_api.entity.UserStatus;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserDto {
    private Long id;

    private String userId;

    private String userPassword;

    private String userEmail;

    private String status;
    public UserDto(User user){
        this.id = user.getId();
        this.userId=user.getUserId();
        this.userPassword = user.getUserPassword();
        this.userEmail = user.getUserEmail();
        this.status = user.getStatus().getStatus();
    }
}
