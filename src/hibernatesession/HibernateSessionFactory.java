package hibernatesession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSessionFactory {
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static Configuration configuration = new Configuration();
	//ConfigurationÊµÀý
	private static org.hibernate.SessionFactory sessionFactory;
	private static String configFile = CONFIG_FILE_LOCATION;
	static{
		try{
			configuration.configure(configFile);
			//sessionFactory = configuration.buildSessionFactory();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Session getSession() throws HibernateException{
		Session session = (Session)threadLocal.get();
		if(session==null || !session.isOpen()){
			if(sessionFactory==null){
				rebuildSessionFactory();
			}
			session = (sessionFactory!=null)?sessionFactory.openSession():null;
			threadLocal.set(session);
		}
		return session;
	}
	
	public static void rebuildSessionFactory(){
		try{
			configuration.configure(configFile);
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void closeSession() throws HibernateException{
		Session session = (Session)threadLocal.get();
		threadLocal.set(null);
		if(session!=null){
			session.close();
		}
	}
}
