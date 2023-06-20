package com.baeminclone.application.customer.entity;

import com.baeminclone.application.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer extends BaseEntity {

    @Id
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "customer_id")
    private String name;

    @Column(name = "customer_email")
    @Email
    private String email;

    @NotNull
    private String snsId;

    @NotNull
    private SnsProvider snsProvider;
}
