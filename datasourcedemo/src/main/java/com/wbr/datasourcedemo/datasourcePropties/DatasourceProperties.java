package com.wbr.datasourcedemo.datasourcePropties;


/**
 * properties of datasource
 *
 * @author WangBoran
 * @since 2020/10/14 11:15
 */
public class DatasourceProperties {

	public static final String JDBC_URL = "jdbc:log4jdbc:ArteryBase://172.18.19.40:6543/DB_RDCS";

	public static final String DRIVER_CLASS_NAME = "org.postgresql.Driver";

	public static final String USER_NAME = "sa";

	public static final String PASSWORD = "tusc@6789#JKL";

	/**
	 * 线程池初始化连接数目
	 */
	public static final int INITIAL_SIZE = 20;

	/**
	 * 最小空闲连接数
	 */
	public static final int MIN_IDLE = 5;

	/**
	 * 最大活跃连接数
	 */
	public static final int MAX_ACTIVE = 20;

	/**
	 * 是否开启回收泄漏连接，默认为false
	 * 和logAbandoned，removeAbandonedTimeoutMillis共同使用
	 * logAbandoned：如果回收了泄漏的连接，是否打印一条log，默认false
	 * removeAbandonedTimeoutMillis：连接回收的超时时间，默认五分钟
	 */
	public static final boolean REMOVE_ABANDONED = false;

	/**
	 * 获取连接的最大等待时间，单位为毫秒
	 */
	public static final int MAX_WAIT = 20000;

	/**
	 * testWhileIdle：如果为true（默认true），
	 * testOnBorrow为false时，连接池将会判断连接是否处于空闲状态，如果是，则验证这条连接是否可用。
	 */
	public static boolean TEST_WHILE_IDLE = true;

	public static final int TIME_BETWEEN_EVICTION_RUNS = 20000;

	public static final String VALIDATION_QUERY = "SELECT 1";

	/**
	 * 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
	 * testOnBorrow和testOnReturn在生产环境一般是不开启的，主要是性能考虑。
	 */
	public static final boolean TEST_ON_BORROW = false;

	/**
	 * 单位为ms，如果连接数超过了最小空闲连接数，且此连接的空闲时间大于此值，则关闭此连接
	 */
	public static final long MIN_EVICTABLE_IDLE_TIME_MILLIS = 5*60*1000;

	/**
	 * 单位为ms，如果连接空间时间大于此值，则关闭此连接
	 */
	public static final long MAX_EVICTABLE_IDLE_TIME_MILLIS = 8*60*60*1000;


}