const zipCode = document.querySelector('.zipCode');
const address = document.querySelector('.address');
const detailAddress = document.querySelector('.detailAddress');
function addressFunc() {
        new daum.Postcode({ // daum 주소 api 호출
            oncomplete: function(data) {
                let addr = ''; // 주소 변수
                if (data.userSelectedType === 'R') { //도로명 주소 선택한 경우(R)
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }
                console.log(data);
                zipCode.value = data.zonecode;  // data.zonecode 이게 zip코드 
                address.value = addr;   // 주소
                detailAddress.focus();  // detailinput으로 마우스 커서 움직임
            }
        }).open();
}