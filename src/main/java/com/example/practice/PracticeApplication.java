package com.example.practice;

import com.example.practice.ant.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@Slf4j
@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        Ant generalAnt = new GeneralAnt(5);
        Ant soldierAnt = new SoldierAnt(3);
        Ant workingAnt = new WorkingAnt(1);

        AttackedInsect vixen = new Vixen(41);

        while (vixen.currentHp() != 0) {
            if (generalAnt.canAttack(vixen)) {
                log.info("GeneralAnt can Hit {} times", generalAnt.calculateMaxHits(vixen));
                vixen.attacked(generalAnt);
                log.info("Attacked Insect CurrentHp => {}", vixen.currentHp());
            } else if (soldierAnt.canAttack(vixen)) {
                log.info("soldierAnt can Hit {} times", soldierAnt.calculateMaxHits(vixen));
                vixen.attacked(soldierAnt);
                log.info("Attacked Insect CurrentHp => {}", vixen.currentHp());
            } else if (workingAnt.canAttack(vixen)) {
                log.info("workingAnt can Hit {} times", workingAnt.calculateMaxHits(vixen));
                vixen.attacked(workingAnt);
                log.info("Attacked Insect CurrentHp => {}", vixen.currentHp());
            } else {
                break;
            }
        } // End While
    } // End Main
} // End Class
