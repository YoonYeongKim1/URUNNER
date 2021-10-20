package com.urunner.khweb.entity.member;

<<<<<<< HEAD
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {

=======
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Entity
@Table(name = "member") @Getter
public class Member {
>>>>>>> upstream/main
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    private Long memberNo;
<<<<<<< HEAD

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String password;

=======
    private String email;
    private String name;
    private String password;

    public void setEmail() {
        this.email = email;
    }

    public void setName() {
        this.name = name;
    }

    public void setPassword() {
        this.password = password;
    }

>>>>>>> upstream/main
    @CreationTimestamp
    private Date regDate;

    @UpdateTimestamp
    private Date upDate;

    public Member(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}