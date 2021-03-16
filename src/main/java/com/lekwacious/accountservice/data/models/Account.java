package com.lekwacious.accountservice.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
public class Account {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double balance;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_type")
    private String accountType;

    @Column(name = "branch_code")
    private String branchCode;

    private String bank;



}
