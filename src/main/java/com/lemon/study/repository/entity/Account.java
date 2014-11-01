package com.lemon.study.repository.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by limeng0402 on 14-11-1.
 */
@Entity
@Data
@Table(name = "t_account")
public class Account {
    @Id
    @GeneratedValue
    private Long accountId;
    private String name;
    private String phone;
}
