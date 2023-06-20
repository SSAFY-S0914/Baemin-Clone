package com.baeminclone.application.customer.entity;

import com.baeminclone.application.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    private String name;

    private String email;

    private String snsId;

    @Enumerated(EnumType.STRING)
    private SnsProvider snsProvider;

    @Builder
    public Customer(Long id, String name, String email, String snsId, SnsProvider snsProvider) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.snsId = snsId;
        this.snsProvider = snsProvider;
    }
}
