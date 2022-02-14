<template>
  <body>
  <div class="banner">
    <img src="@/assets/aboutbanner.jpg" class="aboutImage" style="width:100%;">
    <div class="centered">캄보디아학교세우기모임</div>
  </div>
  <p class="aboutText">
    2007년 겨울방학 고등학교 교사와 학생, 둘이서 캄보디아 쁘렉농
    마을에 교육봉사를 갔었습니다. <br> 신발 없이 맨발로 다니고 지붕에서
    떨어지는 빗물을 받아 식수로 사용하고 상처가 생겨도 치료받지
    않고 다니는 쁘렉농 마을 아이들을 위해서 <br> 학교를 세워주고 싶은
    꿈을 가졌습니다. 그 후로 다음과 같은 활동을 하고 있습니다.
  </p>
  <div class="history">
  <p class="historyText">
    2007년 1월 : 캄보디아 교육봉사 여행(고등학교 교사 1명, 고등학생 제자 1명)하면서 학교 세우기 꿈을 가짐
    <br>
    2007년 8월 : 캄보디아 교육봉사 여행 (교사 7명, 대학생 2명)
    <br>
    2008년 5월 : 결연 운동 시작 (2010년 6월 현재 60명)
    <br>
    2009년 1월 : 캄보디아 교육봉사 여행(교사 2명)
    <br>
    2009년 10월 1일 : 학교 부지150평 구입
    <br>
    2010년 6월 17일 : 최광현 교장 선생님(전직 충남 아산 염작초 교장), 심혜숙 원장 선생님(전직 충남 천안 도솔
    유치원장) 부부 캄보디아 쁘랙농 학교(유치원, 초등학교) 세우기 위해 출국
    <br>
    2011년 1월 18일 : 교실 9개 신축
    <br>
    2011년 1월22일-27일 : 캄보디아 교육봉사 (결연회원 7명)
    <br>
    2011년 3월 4일 : 싸앙 유니온 초등학교 준공
    <br>
    2011년 8월 23일 : 캄보디아 교육부 허가(2242호)
    <br>
    2011년 10월 3일 : 쁘랙농 초등학교 개교일(첫 등교일)
    <br>
    2011년 10월 21일 : 쁘래농 초등학교 입학식 (쁘렉롱 쌕크다이 성큼 쌀라리언/쁘렉롱 희망학교)
    <br>
    2012년 1월1일-7일 쁘렉농 학 교 교육 봉사 (6명-초등교사3, 대학생2, 고등학생1) - 음악교육 중심
    <br>
    2012년 1월 14일-19일 - 쁘렉농 학교 교육 봉사(2명 - 부부) - 과학교육 중심
    <br>
    2012년 2월 11일-14일 - 쁘랙농 학교 교육봉사(3명- 중학교 교사, 초등학생) - 미술교육 중심
    <br>
    2012년 10월2일 : 쁘렉농 초등학교 2회 입학식(25명)
    <br>
    2012년 11월 20일 캄보디아학교세우기모임 비영리민간단체 등록(외교통상부)
    <br>
    2013년 3월 :  쁘렉농 초등학교 운동장 구입
    <br>
    2013년 4월 5일 : 비영리민간단체지원사업 단체로 선정(안전행정부)
    <br>
    2013년 4월 28일 : 제 2학교 운영자 결정- 김영근 (청주평촌초등학교 교장 2013년 2월 퇴직)
    <br>
    2013년 5월 22일-26일 : 제 2학교 부지 선정위해 출국(김영근, 황규일, 노장권)
    <br>
    2013년 10월 15일 : '꿈의 학교' 기공식
    <br>
    2014년 8월 8일-9일 : 깜뽕츠낭 꿈의 학교 1회 교육봉사. 윤기상(대전 전민고), 안소영(새종시 감성초) 가족
    <br>
    2014년 8월 14일-16일 : 깜뽕츠낭 꿈의 학교 의료봉사. 천안 파로스로타리 클럽 16명, 통역 재능 기부자 월드채널 9명
    <br>
    2014년 11월 3일 : 깜뽕츠낭 꿈의 학교 개교
    <br>
    2016년 4월 4일-7일 : 충청남도교육청과 쁘렉농학교.깜뽕츠낭 학교 해외교육봉사 업무협약(MOU) 체결
  </p>
  </div>
  </body>
</template>

<script>
// @ is an alias to /src
// import App from '../App.vue';
// import About from './About.vue'
export default {
  name: 'About',
  path: '/about',
  components: {
    // About
    // App
  }
}


</script>

<style>
body{
  min-height: 90vh;
  display: flex;
  flex-direction: column;
}
.banner {
  position: relative;
  text-align: center;
  color: white;
}
.aboutImage{
  width: auto;
  height: 70%;
  op
}
.aboutText{
  padding: 5vh;
  font-style: italic;
  line-height: 30px;
}
.history{
  text-align: left;
  line-height: 30px;
  padding-left: 3vh;
}
.centered {
  font-size: xxx-large;
  font-weight: bold;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
</style>
