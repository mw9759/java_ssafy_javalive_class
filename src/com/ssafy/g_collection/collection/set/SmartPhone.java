package com.ssafy.g_collection.collection.set;

// TODO: SmartPhone이 다른 SmartPhone과 번호를 기준으로 비교가능하게 처리하시오.
    // END:
public class SmartPhone{
    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    public String toString() {
        return "전화 번호: " + number;
    }

    // TODO: 동일한 번호의 SmartPhone이면 하나만 추가될 수 있도록 처리하시오.
    @Override
    public boolean equals(Object obj) {
    	if(obj != null && obj instanceof SmartPhone) {
    		SmartPhone other = (SmartPhone)obj;
    		return this.number.equals(other.number);
    	}
    	return false;
    }
    // END:
    
    @Override
    public int hashCode() {
    	return this.number.hashCode();
    }
}
