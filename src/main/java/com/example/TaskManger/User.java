package com.example.TaskManger;


    import jakarta.persistence.*;

    @Entity
    @Table(name = "users")

    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false, unique = true)
        private String email;

        public User() {}

        public User(String username, String email) {
            this.username = username;
            this.email = email;
        }

        // Getters и Setters
        public Long getId() { return id; }
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }
