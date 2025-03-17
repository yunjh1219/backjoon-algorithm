package b250309;


class User {

    private MessageService messageService = new MessageService(); // 강한 결합

    public void send(String message) {
        messageService.sendMessage(message);
        
    }
}


class MessageService {
	   // 메시지를 전송하는 클래스 (의존성 주입 없이 직접 생성)
	    public void sendMessage(String message) {
	        System.out.println("메시지 전송이다: " + message);
	    }
}


public class Main {
    public static void main(String[] args) {
    	
        User user = new User();
        
        user.send("안녕하세요!");
    }
}