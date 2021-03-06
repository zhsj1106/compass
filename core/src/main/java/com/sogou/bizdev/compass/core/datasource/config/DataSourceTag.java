package com.sogou.bizdev.compass.core.datasource.config;

/**数据源配置标签常量
 * @author gly
 * @since 2.1.3
 */
public interface DataSourceTag 
{
	
	
	public static final String REF_SUFFIX = "-ref";
	public static final String CLASS = "class";
	public static final String REF = "ref";
	public static final String PROPERTY = "property";
	
	public final static String DATASOURCE="datasource";
		public final static String ID="id";
		public final static String DATASOURCE_PROTOTYPE="datasource-prototype";
		public final static String GROUP="group";
		public final static String NAME="name";
			public final static String MASTER="master";
			public final static String SLAVE="slave";
		public final static String AVAILABILITYDETECTOR="availabilityDetector";
			public final static String ENABLED="enabled";
			public final static String INTERVAL="interval";
			public final static String DETECTPOOLSIZE="detectPoolSize";
		public final static String PINGSTATEMENT="pingStatement";
		    public final static String PINGSTATEMENT_VALUE="value";
		public final static String ROUTER="router";
		public final static String LOADBALANCE="loadbalance";
			public final static String LOADBALANCESTRATEGY="loadBalanceStrategy";	
			public final static String WEIGHT="weight";	
		public final static String SQLINTERCEPTOR="sqlInterceptor";
			
}
