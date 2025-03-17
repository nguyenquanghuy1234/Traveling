package com.mycompany.traveling.model.entity.hotel;



import com.mycompany.traveling.model.entity.base.BaseEntity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotel")
public class Hotel extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maKhachSan;

    @Column(nullable = false)
    private String ten;

    private String anh;
    private String diachi;
    private String mota;
    private double danhGia;
    private double gia;
}
