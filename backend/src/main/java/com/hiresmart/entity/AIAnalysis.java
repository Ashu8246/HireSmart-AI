package com.hiresmart.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ai_analysis")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AIAnalysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resume_id", nullable = false)
    private Resume resume;

    @Column(name = "score", precision = 5, scale = 2)
    private BigDecimal score;

    @Column(name = "strengths", columnDefinition = "LONGTEXT")
    private String strengths;

    @Column(name = "weaknesses", columnDefinition = "LONGTEXT")
    private String weaknesses;

    @Column(name = "missing_skills", columnDefinition = "LONGTEXT")
    private String missingSkills;

    @Column(name = "recommendations", columnDefinition = "LONGTEXT")
    private String recommendations;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}