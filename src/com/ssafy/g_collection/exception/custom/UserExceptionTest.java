package com.ssafy.g_collection.exception.custom;

public class UserExceptionTest {
    private static String[] fruits = { "사과", "오렌지", "토마토" };

    public static void main(String[] args) {
        boolean result = getFruit1("사과");
        if (!result) {
            System.out.println("사과는 없습니다.");
        }
        result = getFruit1("사과");
        if (!result) {
            System.out.println("사과는 없습니다.");
        }
        // TODO: 2. getFruit2를 이용해서 오렌지 2개를 소비해서 예외 상황을 테스트 하시오.
        // END:
        try {
			getFruit2("오렌지");
		} catch (FruitNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
        
        try {
			getFruit2("오렌지");
		} catch (FruitNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
        // TODO: 4. 수박, 멜론, 복숭아을 저장해서 예외 상황을 테스트 하시오.
        // END:
        //NoSpaceException extends RuntimeException(unchecked exception)
        setFruit("수박"); //  등록성공
        setFruit("멜론"); // 등록 성공
        setFruit("복숭아"); //등록실패. error
        
        System.out.println("창고 관리 끝~");
    }

    private static boolean getFruit1(String name) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return true;
            }
        }
        return false;
    }

    // TODO: 1. getFruit1을 참조하여 예외를 활용하는 형태로 getFruit2를 작성하시오.
    // 메서드 선언문에 throws 예외 전가시킴 => 해당 메서드를 사용하는 사용자 측에 예외 처리 전가시킴
    // END:
    private static boolean getFruit2(String name) throws FruitNotFoundException{
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return true;
            }
        }
        // 명시적으로 예외를 발생시킴: 사용자 예외
        //throw new FruitNotFoundException();
        throw new FruitNotFoundException(name);
        
        //return false;
    }
    // TODO: 3. 배열의 null인 지점에 과일을 저장하도록 작성하시오.
    // 만약, 배열의 null 지점이 없으면 NoSpaceException(name) 사용자 예외 발생시키기
    // NoSpaceException 사용자 예외는 RuntimeException을 상속받아서 unchecked exception으로 처리.
    private static void setFruit(String name) {//throws NoSpaceException
    	for(int i = 0; i < fruits.length; i++) {
    		if(fruits[i] == null) {
    			fruits[i] = name;
    			return; //null 요소에 과일을 저장했으므로 더이상 반보갈필요없으니 호출측으로 return
    		} 
    	}
    	//반복을 다했는데도 return되지 않았다면
    	// 배열요소에 null 공간이 없어서 전달받은 name을 등록할 공간이 없으므로
    	// 명시적 예외발생.
    	throw new NoSpaceException(name);
    	// unchecked user exception 이므로
    	// method 선언문에 throws NoSpaceException 발생시키지 않아도댐.
    }
    // END:
}
