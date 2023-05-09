package com.example.practice.ant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 공격력을 갖고 오거나 추후에 밸런스 패치로 병정 개미의 공격력을 낮춰야 할 필요가 있을 때를 대비해서
// @Getter , @Setter 사용

public class SoldierAnt implements Ant {
    private Integer ack;

    public SoldierAnt(Integer ack) {
        this.ack = ack;
    } // End Constructor

    @Override
    public Integer ack() {
        return this.ack;
    } // End ack

    @Override
    public boolean canAttack(AttackedInsect attackedInsect) {
        if (attackedInsect.currentHp() / this.ack >= 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer calculateMaxHits(AttackedInsect attackedInsect) {
        return attackedInsect.currentHp() / this.ack;
    }
}
