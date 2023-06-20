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
@Table(name = "customers", uniqueConstraints = {
        @UniqueConstraint(
                name = "sns",
                columnNames = { "sns_id", "sns_provider" }
        )
})
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String snsId;

    @Column(nullable = false)
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
