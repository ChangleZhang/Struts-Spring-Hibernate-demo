package member;
import org.hibernate.*;
import java.util.*;
import hibernatesession.HibernateSessionFactory;

public class MemberDAO {
	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
	
	public void save(Member transientInstance){
		try{
			Transaction tx = getSession().beginTransaction();
			getSession().save(transientInstance);
			tx.commit();
		}catch(RuntimeException re){re.printStackTrace();}
	}
	
	public List findByProperty(String propertyName,Object value){
		try{
			String queryString = "from Member as model where model."+propertyName+"=?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0,value);
			return queryObject.list();
		}catch(RuntimeException re){throw re;}
	}
}
