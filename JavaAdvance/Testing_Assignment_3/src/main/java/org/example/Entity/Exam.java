package org.example.Entity;
import jakarta.persistence.*;
import jdk.jfr.Category;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Exam")
public class Exam {
    @Id
    @Column(name = "ExamID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ExamID;

    @Column(name = "`code`")
    private String code;

    @Column(name = "Title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryID", nullable = false)
    private CategoryQuestion category;

    @Column(name = "Duration", nullable = false)
    private int duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreatorID",nullable = false)
    private Account creator;

    @Column(name = "CreateDate", nullable = false)
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "exam",cascade = CascadeType.ALL)
    private List<ExamQuestion> examQuestions = new ArrayList<>();

    @PrePersist
    public void prePersist() {
        if (duration >= 180) {
            this.code = "L-1";
        } else if (duration >= 90) {
            this.code = "M-1";
        } else {
            this.code = "S-1";
        }
    }
    public Exam(){}

    public int getExamID() {
        return ExamID;
    }

    public void setExamID(int examID) {
        ExamID = examID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
