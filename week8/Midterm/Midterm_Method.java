public interface Method {
    final int day_pay = 85000;
    int basic();   // 기본급
    int incentive();// 인센티브
    int commission();// 커미션
    int salary();   // 급여액
    int tax();      // 세금
    int pay();      // 지급액
}
/*
* 직무
* 정규직, 영업직, 점장직, 일용직
*
* 정규직
* -> 호봉에 따른 기본급
*
* 일용직
* -> 일당제에 따른 기본급
*
* 영업직
* -> 정규직 + 판매수당을 판매금액을 기준으로 추가지급
*
* 점장직
* -> 정규직 + 인센티브
* */