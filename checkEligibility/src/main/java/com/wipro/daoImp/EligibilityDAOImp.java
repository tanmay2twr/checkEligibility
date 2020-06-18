package com.wipro.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.dao.EligibilityDAO;
import com.wipro.model.CreditCardDetails;
import com.wipro.util.HibernateConfig;

@Component
public class EligibilityDAOImp implements EligibilityDAO {
	private Session session;
	private Transaction transaction;

	@Autowired
	public EligibilityDAOImp(HibernateConfig connect) {
		this.session = connect.getSessionFactory().openSession();
		this.transaction = this.session.beginTransaction();
	}
	public void InsertData(List<CreditCardDetails> bulkData) {
		for (CreditCardDetails creditCardDetails : bulkData) {
			session.save(creditCardDetails);
		}
		transaction.commit();
		transaction.begin();
	}
	

	public CreditCardDetails getCreditCardDetails(String PANNumber) {
		Query query = session.createQuery("from CreditCardDetails where PANNumber=:PANNumberval");
		query.setParameter("PANNumberval", PANNumber);
		CreditCardDetails pandetail = (CreditCardDetails) query.uniqueResult();

		return pandetail;
	}
}
