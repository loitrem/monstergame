package monstergame.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Log4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int hId;
    String hName;
    int hLevel;
    int hHp;
    int hDefense;
    int hBaseAttackRangeBottom;
    int hBaseAttackRangeTop;
    int hSpecialAttackRangeBottom;
    int hSpecialAttackRangeTop;
    String hBaseAttackType;
    String hSpecialAttackType;

}
