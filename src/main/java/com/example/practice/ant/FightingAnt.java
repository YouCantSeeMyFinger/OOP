package com.example.practice.ant;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// 1. 각 개미들은 공격을 할 수 있는 지를 판단해야한다 때문에 Interface로 Attackable을 상속받았다. <br>
// 2. Ant라는 추상클래스를 상속받은 개미들은 각각 (HP ,공격능력을 공통적으로 갖고있다.)
// 3. 추후 Main 클래스에서는 각 공격을 행하는 개미가 살상능력을 갖고있는 개미인지( Attackable를 상속)
//    확인하고 공격을 할 것이다.
// 4. 만약 왜 Attackable을 상속받아야만 공격을 할 수 있냐고 질문을 한다면 다음과 같이 설명한다.
//   4-1. 서비스 확장 측면에서 공격을 하지 않고 마치 SCV처럼 오롯이 일만하는 개미가 있다고 가정하면 이 개미는 공격을 못한다.
//        때문에 Attackable을 상속 받아야지만 공격을 할 수 있다.

public abstract class FightingAnt implements Attackable {

    private String name;
    private Integer attackAbility;

    public abstract boolean canAttack(AttackedInsect attackedInsect);

    // 이 메소드는 Interface로 수정하도록 하자
    public abstract Integer calculateMaxHits(AttackedInsect attackedInsect);

}