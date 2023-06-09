/**
 *  유효성 체크
 */

function input_check(){
	
	if(document.join.name.value.length == 0){
		alert("이름을 입력해주세요.");
		join.name.focus();
		return false;
	}
	
	if(document.join.rrn.value == ""){
		alert("주민 등록 번호는 필수 입력입니다.");
		join.rrn.focus();
		return false;
	} 
	
	if(document.join.rrn.value.length != 6){
		alert("주민 등록 앞번호는 6글자 입니다.");
		join.rrn.focus();
		return false;
	} 
	
	if(document.join.rrn2.value.length != 7){
		alert("주민 등록 뒷번호는 7글자 입니다.");
		join.rrn2.focus();
		return false;
	}
	
	if(document.join.userid.value.length == 0){
		alert("아이디를 입력해주세요.");
		join.userid.focus();
		return false;
	}
		
	if(document.join.userid.value.length < 2){
		alert("아이디는 2글자 이상입력해야 합니다.");
		join.userid.focus();
		return false;
	}
	
	if(document.join.userpwd.value == ""){
		alert("비밀번호를 필수 입력입니다.");
		join.userpwd.focus();
		return false;
	} 
	
	if (document.join.userpwd.value != document.join.userpwd_chk.value){ // 비밀번호 체크
		alert("비밀번호가 일치하지 않습니다.");
		join.userpwd_chk.focus();
		return false;
	}
		
	return true;
}	