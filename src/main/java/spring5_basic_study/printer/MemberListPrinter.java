package spring5_basic_study.printer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import spring5_basic_study.di.Member;
import spring5_basic_study.di.MemberDao;

public class MemberListPrinter {

	@Autowired
	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}

}
