package com.ess.timer.domain;

import lombok.Data;
import org.joda.time.Instant;

import javax.persistence.*;

@Data
@Entity
@Table(name = "event")
public class Event {
    @JoinColumn(
            name = "usr_id",
            foreignKey = @ForeignKey(name ="usr_name")
    )
    private Long id;
    private Instant starting;
    private Instant ending;
    @Id
    private Category category;
    private String description;


}
