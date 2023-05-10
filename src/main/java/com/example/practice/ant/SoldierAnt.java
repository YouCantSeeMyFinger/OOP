package com.example.practice.ant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 공격력을 갖고 오거나 추후에 밸런스 패치로 병정 개미의 공격력을 낮춰야 할 필요가 있을 때를 대비해서
// @Getter , @Setter 사용

public class SoldierAnt extends FightingAnt {

    public SoldierAnt(Integer attackAbility, String name) {
        this.setAttackAbility(attackAbility);
        this.setName(name);
    } // End Constructor

    @Override
    public boolean canAttack(AttackedInsect attackedInsect) {
        if (attackedInsect.currentHp(attackedInsect) / this.getAttackAbility() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer calculateMaxHits(AttackedInsect attackedInsect) {
        return attackedInsect.currentHp(attackedInsect) / this.getAttackAbility();
    }
}
