package com.example.colors.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.colors.model.Color;
import com.example.colors.model.ColorConverter;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @CsvBindByPosition(position = -1)
  private Long id;
  
  @CsvBindByPosition(position = 0)
  private String name;
  
  @CsvBindByPosition(position = 1)
  private String lastname;

  @CsvBindByPosition(position = 2)
  private long zipcode;  

  @CsvBindByPosition(position = 3)
  private String city;
  
  @CsvCustomBindByPosition(position = 4, converter = ColorConverter.class)
  private Color color;
}
