package com.example.practice.ant;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
// Vixen = 여치
// 공격받는 곤충이기 때문에 AttackedInsect 상속
public class Vixen extends AttackedInsect {

    public Vixen(Integer hp, String name) {
        this.setHp(hp);
        this.setName(name);
    }

    @Override
    public Integer attacked(FightingAnt ant, AttackedInsect attackedInsect, Integer attackedTimes) {
        log.info("현재 hp => {}", this.currentHp(attackedInsect));
        int resultHp = this.currentHp(attackedInsect) - ant.getAttackAbility() * attackedTimes;
        log.info("잔여 hp => {}", resultHp);
        attackedInsect.setHp(resultHp);
        return resultHp;
    }

    @Override
    public Integer currentHp(AttackedInsect attackedInsect) {
        return attackedInsect.getHp();
    }
}
