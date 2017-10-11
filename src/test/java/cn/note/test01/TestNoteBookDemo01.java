package cn.note.test01;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.note.dao.NoteBookDao;
import cn.note.entity.NoteBook;

public class TestNoteBookDemo01 {

	public static void main(String[] args) {
		//testFindAll();
		//testFindNotebookByUserId();
		testFindNoteBookByNoteBookId();
		
		
	}
	private static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	private static NoteBookDao nbd = ctx.getBean("noteBookDao", NoteBookDao.class);
	public static void testFindAll() {
		List<NoteBook> list = nbd.findAllNoteBook();
		for(NoteBook n : list) {
			System.out.println(n);
		}
	}
	public static void testFindNotebookByUserId() {
		List<NoteBook> list = nbd.findNoteBookByUserId("39295a3d-cc9b-42b4-b206-a2e7fab7e77c");
		for(NoteBook n : list) {
			System.out.println(n);
		}
	}
	public static void testFindNoteBookByNoteBookId() {
		NoteBook n = nbd.findNoteBookByNotebookId("0cd94778-4d52-486d-a35d-263b3cfe6de9");
		System.out.println(n);
	}

}
