package com.baeminclone.application.customer.entity;

import com.baeminclone.application.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    private String name;

    @Email
    private String email;

    @NotNull
    private String snsId;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SnsProvider snsProvider;
}
