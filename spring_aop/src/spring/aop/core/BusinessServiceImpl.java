package spring.aop.core;

public class BusinessServiceImpl implements BusinessService {
	
	

	@Override
	public void coreServiceBefore() {
		System.out.println("핵심로직 - BusinessServiceImpl.coreServiceBefore() 실행");
	}

	@Override
	public void coreServiceBefore2(String name) {
		System.out.println(
				"핵심로직 - BusinessServiceImpl.coreServiceBefore2() 실행 - " + name);

	}

	@Override
	public String coreServiceAfterReturn() {
		System.out.println(
				"핵심로직 - BusinessServiceImpl.coreServiceAfterReturn() 실행");
		return "리턴 문자열";
	}

	@Override
	public void coreServiceAfterThrow() throws Exception {
		System.out.println(
				"핵심로직 - BusinessServiceImpl.coreServiceAfterThrow() 실행");
		throw new Exception("핵심로직에서 예외 발생");

	}

	@Override
	public void businessMethod() {
		System.out.println("핵심로직 - BusinessServiceImpl.businessMethod() 실행");

	}

}
