package com.patoCode.todolist.entites;

import java.time.LocalDate;
import com.patoCode.todolist.enums.ProgressionStatus;
import com.patoCode.todolist.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb-Duties")
public class Duties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String duties;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private ProgressionStatus progressionStatus;
    private LocalDate dueDate;

    public Duties(){}
    public Duties(Long id, String duties, Status status, ProgressionStatus progressionStatus, LocalDate dueDate) {
        this.id = id;
        this.duties = duties;
        this.status = status;
        this.progressionStatus = progressionStatus;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDuties() {
        return duties;
    }
    public void setDuties(String duties) {
        this.duties = duties;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public ProgressionStatus getProgressionStatus() {
        return progressionStatus;
    }
    public void setProgressionStatus(ProgressionStatus progressionStatus) {
        this.progressionStatus = progressionStatus;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    
}
