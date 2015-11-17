package spring.aop.core;

public interface BusinessService {

	void coreServiceBefore();

	void coreServiceBefore2(String name);

	String coreServiceAfterReturn();

	void coreServiceAfterThrow() throws Exception;

	void businessMethod();
}
