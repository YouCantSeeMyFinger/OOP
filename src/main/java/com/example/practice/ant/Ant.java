package com.example.practice.ant;

public interface Ant {

    /**
     * 각 개미의 공격력
     *
     * @return 각 개미의 공격력을 반환
     */

    public abstract Integer ack();

    public abstract boolean canAttack(AttackedInsect attackedInsect);

    public abstract Integer calculateMaxHits(AttackedInsect attackedInsect);

}
