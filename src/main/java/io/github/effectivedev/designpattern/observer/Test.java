package io.github.effectivedev.designpattern.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

	public static void main(String[] args) {
		testObserver();
	}

	private static void testObserver() {
		Publisher cafe = new InternetCafe();
		Observer person = new Person("Park", 1);
		Observer person2 = new Person("Lee", 3);

		//Case 1: Person 1, Person 2 구독, 레벨 제한 없음 => Person 1, Person 2에게 publish
		log.info("#####Case 1 Start####");
		person.subscribe(cafe);
		person2.subscribe(cafe);
		cafe.publish("쉬운정보","소금은 짜다");
		log.info("#####Case 1 End#######");

		//Case 2: 레벨제한 3 publish => Person2에게 publish
		log.info("#####Case 2 Start####");
		cafe.publish("고급정보","주가상", 3);
		log.info("#####Case 2 End#######");

		//Case 3: Person 2 구독해제 ==> 아무에게도 전달 안함
		log.info("#####Case 3 Start####");
		person2.unsubscribe(cafe);
		cafe.publish("고급정보2","주가하락", 3);
		log.info("#####Case 3 end####");
	}

}
