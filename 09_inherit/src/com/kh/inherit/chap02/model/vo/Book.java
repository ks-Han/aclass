package com.kh.inherit.chap02.model.vo;

public class Book {
	// extends Object 미작성 시
	// JVM에 의해서 컴파일 단계에서 자동추가

	// Object 클래스는 자바 클래스들 중 최상위 부모 클래스
	// --> 모든 클래스는 Object의 후손 클래스다.
	private String title;
	private String author;
	private int price;

	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	// hashCode()
	// 검색속도 향상

	// HashSet, HashMap, HashTable 등등에서 사용 됨

	@Override
	public int hashCode() {
		// 중복 되지않는 hashCode를 만드는데 왜 31을 사용 하는가?
		// --> 31은 홀수 이면서 적당히 큰 소수이고
		// 비트연산이 굉장히 빠르게 진행될 수 있는 수 이고
		// 이 수를 통해 만들어지는 hashCode의 충돌이 가장 적어서
		// 전통적으로 사용 되고 있음.
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	// Object.equals() 오버라이딩
	// 객체가 같은지를 판별
	// 오버라이딩 전 equals() : 두 객체의 시작주소가 같은지를 판별
	// 오버라이딩 후 equals() : 객체가 가지고 있는 필드 값이 같은지 판별

//	@Override
//	public boolean equals(Object obj) {
//
//		// 1. 객체의 시작 주소가 같은지 비교
//		// 시작 주소가 같다 == true(같은 객체)
//		if (this == obj) {
//			return true;
//		}
//
//		// 2. 전달받은 주소가 null 인지 판별
//		// null의 이미 : 참조 하는 곳이 없다.
//		// 전달받은 주소가 null인 경우 비교 가치가 없음. 무조건 false
//		if (obj == null) {
//			return false;
//		}
//
//		// 클래스 형변환
//		// obj는 object를 참조하는 변수였지만
//		// 이름 Book을 참조하는 변수로 형변환
//		Book other = (Book)obj; // 다형성
//		
//		// 3. 두 객체간의 필드 값 비교 시작
//		if (this.title != null && other.title != null) {
//			if (!this.title.equals(other.title)) {
//				return false;
//			}
//		} else { // 둘 중 하나 또는 둘다 null인 경우는 다른 것 --> false
//			return false;
//		}
//		
//		if (this.author != null && other.author != null) {
//			if (!this.author.equals(other.author)) {
//				return false;
//			}
//		} else { // 둘 중 하나 또는 둘다 null인 경우는 다른 것 --> false
//			return false;
//		}
//		
//		// 가격 비교
//		if(this.price != other.price) {
//			// price는 기본자료형 이기 때문에
//			// 주소 비교가 필요없고, 값 자체만 비교하면 됨
//			return false;
//		}
//		
//		// 여기까지 코드가 진행 되었다.
//		// == 필드값이 모두 같다.
//		// == 동등 객체이다.
//		return true;
//		
//		// 동등 , 동일
//		// 동등 : 서로 다른 객체지만 값이 같다
//		// 동일 : 완전 같은 객체
//
//	}

	public String informationTransfer() {
		// 정보 전달
		return "내부에 작성된 정보를 읽는사람에게 전달한다.";
	}

}
