package spring5_basic_study.printer;

import spring5_basic_study.di.Member;
import spring5_basic_study.di.MemberDao;
import spring5_basic_study.di.MemberNotFoundException;

public class MemberInfoPrinter {

	private MemberDao memDao;
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			throw new MemberNotFoundException("데이터 없음");
		
		}
		printer.print(member);
		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}
