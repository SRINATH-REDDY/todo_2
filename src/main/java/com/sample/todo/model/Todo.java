package com.sample.todo.model;

import lombok.*;

//import javax.persistence.*;
import java.util.Date;
//import org.springframework.cloud.gcp.data.datastore.core.mapping.Embedded;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity(name="list")
@Data
//@Table
@AllArgsConstructor

@NoArgsConstructor

public class Todo
{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private Boolean isDone;
    private Date targetDate;
}
