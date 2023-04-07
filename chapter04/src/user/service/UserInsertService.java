package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserInsertService implements UserService {
	@Setter
	private UserDTO userDTO = null;
	@Setter
	private UserDAO userDAO = null;
	@Override
	public void execute() {
		//데이터
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		
		System.out.print("비밀번호를 입력하세요 :");
		String pwd = sc.next();
		
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		userDAO.write(userDTO);
		System.out.println(name+"님의 데이터를 저장하였습니다.");
		
		
			
	}
	

}


