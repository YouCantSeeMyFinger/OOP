package com.example.practice.ant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// Vixen = 여치
// 공격받는 곤충이기 때문에 AttackedInsect 상속
public class Vixen implements AttackedInsect {
    private Integer hp;

    public Vixen(Integer hp) {
        this.hp = hp;
    }

    @Override
    public Integer attacked(Ant ant) {
        int resultHp = this.hp - ant.ack();
        this.hp = resultHp;
        return this.hp;
    }

    @Override
    public Integer currentHp() {
        return this.hp;
    }
}
