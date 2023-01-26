package com.ssafy.collection.list;

import java.util.ArrayList;
import java.util.List;

/** 1. singleton pattern 적용 설계
 *  2. Collection Framework : List, 순서존재, 중복허용
 *  3. interface 구현 
 *  4. Exceptio Handling*/
public class MemberManagerimpl implements IMemberManager {
	/** 회원들의 정보를 저장 관리하기 위한 자료 저장구조*/
	private ArrayList<Member> list = new ArrayList<>();
	
	private static MemberManagerimpl instance = new MemberManagerimpl();
	public MemberManagerimpl() {}
	public static MemberManagerimpl getInstance() {
		return instance;
	}
	
	/** 
	 * 회원의 존재여부 검사
	 * @param memberId 회원아이디
	 * @return 존재시에 위치 반환, 미존재시 -1반환
	 * 
	 * --수행처리
	 * 1. Collection 자료 저장소 만큼 반복하면서 : size()
	 * 2. 저장된 Collection 요소를 하나씩 가져와서 : get()
	 * 3. 아규먼트로 전달받은 아이디와 가져온 요소의 아이디가 같은지 비교해서: equals(arg)
	 * 4. 같으면 현재 인덱스번호를 반환
	 * 5. 반복을 다했는데도 반환되지 않았다면 해당요소가 저장되어 있지 않으므로 -1 반환 */
	public int isExist(String memberId) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getMemberId().equals(memberId)) {
				return i;
			}
		}
		return -1;
	}
	
	/** 회원들옥 처리 순서
	 * 1. 등록위한 아이디가 존재하는지 조회.
	 * 2. 존재하지 않으면 등록
	 * 3. 존재하면 예외 발생.*/
	@Override
	public void addMember(Member dto) throws DuplicateException {
		// TODO Auto-generated method stub
		if(isExist(dto.getMemberId()) == -1) {
			list.add(dto); //add자체가 boolean타입 반환.
		} else {
			throw new DuplicateException();
		}
	}

	@Override
	public List<Member> getMemberList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Member getMember(String memberId) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		if(isExist(memberId) != -1) {
			return list.get(isExist(memberId));
		}else {
			throw new RecordNotFoundException(memberId);
		}
		
	}

	@Override
	public Member setMember(Member dto) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		int index = isExist(dto.getMemberId());
		if(index >= 0) {
			list.set(index, dto);
			return list.get(index);
		}
		throw new RecordNotFoundException(dto.getMemberId());
	}

	@Override
	public void setMemberPw(String memberId, String memberPw, String modifyMemberPw)
			throws RecordNotFoundException, InvalidDataException {
		// TODO Auto-generated method stub
		int index = isExist(memberId);
		if(index >= 0) {
			//Member m = list.get(index);
			if(list.get(index).getMemberPw().equals(memberPw)) {
				list.get(index).setMemberPw(modifyMemberPw);
			} else {
				throw new InvalidDataException();
			}
		} else {
			throw new RecordNotFoundException(memberId);
		}
	}

	@Override
	public void removeMember(String memberId, String memberPw) throws RecordNotFoundException, InvalidDataException {
		// TODO Auto-generated method stub
		int index = isExist(memberId);
		if(index >= 0 && list.get(index).getMemberPw().equals(memberPw)) {
			list.remove(index);
			return;
		} 
		throw new InvalidDataException();
	}

}
