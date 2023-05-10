package com.example.practice;

import com.example.practice.ant.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {

        List<FightingAnt> attackAnt = List.of(
                new GeneralAnt(5, "장군개미")
                , new SoldierAnt(3, "병정개미")
                , new WorkingAnt(1, "일꾼개미")
        );

        List<AttackedInsect> attackedInsects = List.of(new Vixen(124, "여치"));

        for (AttackedInsect attackedInsect : attackedInsects) {
            for (FightingAnt fightingAnt : attackAnt) {
                if (fightingAnt.canAttack(attackedInsect) && attackedInsect != null) {
                    int attackTimes = fightingAnt.calculateMaxHits(attackedInsect);
                    log.info("{}가 {}번 공격", fightingAnt.getName(), attackTimes);
                    attackedInsect.attacked(fightingAnt, attackedInsect, attackTimes);
                } else {
                    return;// End if
                }
            } // End for
        } // End While
    } // End Main
} // End Class
