package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		AttackUnit unit1 = new AttackUnit();
		//무기의 상태 설정
		unit1.setWeaponState(AttackUnit.FIST);
		//공격
		unit1.attack();
	}
}
