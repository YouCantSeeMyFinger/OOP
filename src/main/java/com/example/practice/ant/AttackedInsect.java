package com.example.practice.ant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AttackedInsect implements Attackedable {

    private String name;

    private Integer hp;

    /**
     * 공격당해서 남은 hp 반환
     *
     * @param ant
     * @return Integer
     */
    public abstract Integer attacked(FightingAnt ant, AttackedInsect attackedInsect, Integer attackedTimes);

    /**
     * 현재 체력을 반환
     *
     * @return Integer
     */
    public abstract Integer currentHp(AttackedInsect attackedInsect);
}
