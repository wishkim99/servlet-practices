package com.poscoict.emaillist.dao.test;

import java.util.List;

import com.poscoict.emaillist.dao.EmaillistDao;
import com.poscoict.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		testFindAll();
		testInsert();

	}
	
	private static void testInsert() {
		EmaillistVo vo=new EmaillistVo();
		vo.setFirstName("김");
		vo.setLastName("소원");
		vo.setEmail("kickscar@gammil.com");
		
		boolean result= new EmaillistDao().insert(vo);
		System.out.println(result ? "success": "fail");
		
	}

	private static void testFindAll() {
		// TODO Auto-generated method stub
		List <EmaillistVo> list=new EmaillistDao().findAll();
		for(EmaillistVo vo: list) {
			System.out.println(vo);
		}
		
//		assertEqual(2, list.size());
		
	
	}

}
