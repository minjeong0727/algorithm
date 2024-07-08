# Stack
---
마지막에 넣은 데이터가 먼저 나오는 후입선출 자료구조(Last In First Out)

-대기열의 가장 위에 원소가 추가 추가되고, 가장 위의 원소부터 처리된다.

-기록을 쌓아가며 직전의 상태를 복원해야하는 상황에 유용하다.

ex)웹 브라우저 뒤로 가기, 프로그램 실행 취소, 함수 호출 등등

---
###  Linked List 기반의 Stack 구현
   - push : addLast를 사용해 리스트의 가장 마지막에 원소를 추가한다.

   - pop : removeLast를 사용해 리스트의 가장 뒷 원소를 삭제한다.

### Array 기반의 Stack 구현
    - push : topIndex를 증가시키고 원소를 추가한다.

    - pop : topIndex의 원소를 삭제하고 topIndex를 감소시킨다.

    - size를 따로 관리하지 않아도 topIndex를 통해 알 수 있다.