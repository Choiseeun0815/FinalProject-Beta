## 주제
다양한 업무 환경에서 사용할 수 있는 직원 종합 관리 시스템. 직원들의 결근 · 복장 규정 준수 여부, 출/퇴근 시간, 및 개인의 업무 스케줄 정보등을 제공해주는 스케줄러(달력) UI 제공.

## 결과 예상도 
<img width="811" alt="KakaoTalk_20231024_102157965" src="https://github.com/Choiseeun0815/FinalProject/assets/103297048/64202f39-a1dc-4aaf-b251-3c56e41992be">



## 블록도
(상반기 블록도)
<img width="956" alt="242261466-381418a7-6a09-464c-9e02-7334d5df0181" src="https://github.com/Choiseeun0815/FinalProject/assets/103297048/b75a7cac-ba27-415e-97ce-5931a5863e16">

(하반기 블록도)
<img width="947" alt="KakaoTalk_20231024_040714863" src="https://github.com/Choiseeun0815/FinalProject/assets/103297048/64ba5116-1b20-4743-acc5-b8405eabe60b">


# FaceRecognition
▶ 특정 인물이 태블릿 PC의 '출석'버튼을 눌렀을 때 사전에 등록된 직원인지를 판별하기 위한 시스템. 버튼을 누르면 얼굴 인식을 위해 카메라가 활성화되며 약 10초동안 face Recognition이 진행된다. 얼굴을 인식한 결과는 애플리케이션 메시지 및 실시간 카메라 화면의 바운딩박스 내부 text를 통해 확인할 수 있다. (샘플 데이터는 인물당 300장정도 사용.)

https://github.com/Choiseeun0815/FinalProject/assets/103297048/3aeabeed-2ef9-401e-aad1-61c4378e3ef0


▶ 직원이 '퇴근'버튼을 눌렀을 때 실제 시간에 대한 정보를 불러와 퇴근 가능한 시간인지 아닌지를 판별해주는 기능. 임의로 퇴근 불가능한 시간을 오전 9시 ~ 오후 6시로 지정하고, 그 외적인 시간은 퇴근 가능 시간대로 설정하였다. 추후 퇴근 시간에 대한 정보는 스케줄러(달력)에 자동으로 기록이 되도록 개발할 예정. 

https://github.com/Choiseeun0815/FinalProject/assets/103297048/e6799394-3276-4078-9ba8-21a2c33920b5

# ShowInfo
▶ 앞선 과정에서 사전에 등록된 직원임이 확인되었을 때 해당 직원의 정보를 화면에 출력해주는 기능. 직원들에 대한 정보는 엑셀 파일(.xls)에 저장되어 이를 깃에 업로드를 하고, url 주소를 통해 해당 파일의 정보를 접근할 수 있게 된다. 임의로 정한 직원의 정보로는 해당 직원의 사진, 이름, 직무가 있다. 

https://github.com/Choiseeun0815/FinalProject/assets/103297048/368457f1-58de-4623-8945-d0fdf5fe18b3

# Object Detector
▶ 직원의 직무를 파악하고, 해당 직무가 복장에 있어서 지켜야 하는 규정이 있다면 해당 복장 규정을 준수했는지 확인해주는 객체 인식 기능. 임의의 직무로는 중장비 관리자를, 해당 직무가 갖추어야 할 복장 규정으로는 헬멧과 조끼를 상정하였다. 만일 복장 규정 중 일부나 전부를 준수하지 못했다면 직원의 스케줄러(달력)에 해당 정보를 기록한다. ex. (!복장 미흡! 안전 조끼 미착용. 2023-10-24 오후 2:00.)

### 진행 과정
헬멧과 조끼에 대한 착용/미착용 상태를 학습시켜 model.tflite 모델을 확보하고, 이에 대한 객체 검사가 이루어지도록 카메라를 활성화함. 그러나 객체를 인식 및 검출함에 있어 오류가 있음. (하기의 사진 참고) 

![image](https://github.com/Choiseeun0815/FinalProject/assets/103297048/aed8e44f-4ffb-49f0-b562-400899b65bfe)

객체 학습 참고 동영상 : https://www.youtube.com/watch?v=JQksHAX8VJk&list=PL0aoTDj9Nwghdp04hgPPSC8pSzgOkyCXS&index=4

### 종합 진행 영상

https://github.com/Choiseeun0815/FinalProject/assets/103297048/2bf4eeef-4cef-4435-ac33-f977d71a597a


