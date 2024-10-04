package com.example.mobile.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String phone;

    private String firstname;

    private String lastname;

    private String email;

    private String status;

    private String avatar;

    private int limit_discount;

    private boolean deleted;

    private Date createAt;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private Set<Shop> shopList = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private  Set<Location> locations = new HashSet<>();

    // Mối quan hệ 1:N với Cart
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Cart> carts = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<PaymentMethod> paymentMethodSet = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Transaction> transactionSet = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Licenses> licensesSet = new HashSet<>();
}