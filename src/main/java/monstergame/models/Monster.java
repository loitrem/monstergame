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
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int mId;
    String mName;
    String mDesc;
    int mLevel;
    int mHp;
    int mDefense;
    int mBaseAttackRangeBottom;
    int mBaseAttackRangeTop;
    int mSpecialAttackRangeBottom;
    int mSpecialAttackRangeTop;
    String mBaseAttackType;
    String mSpecialAttackType;

}
