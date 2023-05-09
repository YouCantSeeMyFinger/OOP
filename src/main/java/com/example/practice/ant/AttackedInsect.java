package com.example.practice.ant;

public interface AttackedInsect {


    /**
     * 공격당해서 남은 hp 반환
     *
     * @param ant
     * @return Integer
     */
    public abstract Integer attacked(Ant ant);

    public abstract Integer currentHp();
}
