package com.ess.timer.usr;

import com.ess.timer.event.Event;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "usr")
public class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String usrName;

    private String pw;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events;
}