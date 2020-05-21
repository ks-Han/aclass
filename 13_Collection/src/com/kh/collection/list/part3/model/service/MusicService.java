package com.kh.collection.list.part3.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.collection.list.part3.model.sort.ArtistDesc;
import com.kh.collection.list.part3.model.sort.TitleAsc;
import com.kh.collection.list.part3.model.sort.TitleDesc;
import com.kh.collection.list.part3.model.vo.Music;

public class MusicService {
	// 음악 목록 저장용 List 선언 및 생성
	private List<Music> list = new ArrayList<Music>();

	/**
	 * list에 전달받은 음악을 추가하는 service
	 * 
	 * @param m
	 * @return true
	 */
	public boolean addMusic(Music m) {
		return list.add(m);
	}

	/**
	 * 음악이 저장되어 있는 list를 반환화는 service
	 * 
	 * @return list
	 */
	public List<Music> selectAllMusic() {
		return list;
	}

	/**
	 * 전달받은 키워드를 제목으로 가지고 있는 음악 검색 service
	 * 
	 * @param keyword
	 * @return searchList (검색된 모든 음악 (0개 이상))
	 */
	public List<Music> searchMusic(String keyword) {

		// 검색된 음악을 저장할 list를 선언 및 생성
		List<Music> searchList = new ArrayList<Music>();

		// 검색 기능
		for (Music m : list) {
			if (m.getTitle().contains(keyword)) {
				// 현재 접근한 Music 객체(m)의 제목 중
				// 전달받은 keyword가 포함되어 있다면 if문 실행
				// -> 해당 객체를 searchList에 추가
				searchList.add(m);
			}
		}
		return searchList;
	}

	/**
	 * 전달받은 제목과 일치하는 제목을 가진 음악을 삭제하는 service
	 * 
	 * @param title
	 * @return m
	 */
	public Music removeMusic(String title) {
		// 삭제될 음악 객체를 임시 저장(참조)할 변수 선언
		Music m = null;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getTitle().equals(title)) {
				// 현재 접근한 Music 객체의 제목이 전달받은 title과 같다면 if문 실행
				m = list.remove(i);
			}
		}

		return m;
	}

	/**
	 * 전달 받은 title과 같은 제목을 가진 음악을 목록에서 검색하여 해당 음악을 전달받은 m으로 수정하는 service
	 * 
	 * @param title
	 * @param m
	 * @return 1(수정성공) / -1(수정실패)
	 */
	public int updateMusic(String title, Music m) {

		Music old = null;
		// 수정된 이전 Music 객체를 참조할 임시 변수 선언

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.set(i, m);
				// list에 i번째 인덱스에 전달받은 Music객체 m을 저장하고 수정전 객체를 old에 저장
				break;
			}
		}

		// old가 참조하는 값이 있으면 --> 수정 성공을 의미 --> 1을 리턴
		if (old != null) {
			return 1;
		} else {
			return -1;
		}

	}

	/**
	 * 전달받은 메뉴 번호에 따라 정렬된 list를 반환하는 service
	 * 
	 * @param sel
	 * @return list
	 */
	public List<Music> sortMusic(int sel) {

		switch (sel) {
		case 1: // 가수명 오른차순 --> Music의 기본 정렬
			Collections.sort(list);
			break;
		case 2: // 가수명 내림차순 --> 별도의 정렬 방법
			Collections.sort(list, new ArtistDesc());
			break;
		case 3:
			Collections.sort(list, new TitleAsc());
			break;
		case 4:
			Collections.sort(list, new TitleDesc());
			break;
		}

		return list;
	}
}
