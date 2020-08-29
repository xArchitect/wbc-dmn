package xprogrammer.wbc.dmn.crawler.svc;

import java.util.List;

import org.apache.log4j.Logger;

import xprogrammer.wbc.dmn.cmn.exception.SvcException;
import xprogrammer.wbc.dmn.cmn.mybatis.MyBatisFactory;
import xprogrammer.wbc.dmn.crawler.dao.CrawlerDaoIF;
import xprogrammer.wbc.dmn.crawler.dao.CrawlerDaoImpl;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;

public class CrawlerSvcImpl implements CrawlerSvcIF {
	private Logger logger = Logger.getLogger(CrawlerSvcImpl.class);
	
	private CrawlerDaoIF dao;

	public CrawlerSvcImpl() {
		this.dao = new CrawlerDaoImpl(MyBatisFactory.getSqlSessionFactory());
	}
	
	@Override
	public List<UrlInfDvo> selectUrlInfList(UrlInfDvo dvo) throws SvcException {
		try {
			return dao.selectUrlInfList(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

	@Override
	public List<ItmInfDvo> selectItmInfList(ItmInfDvo dvo) throws SvcException {
		try {
			return dao.selectItmInfList(dvo);
		} catch (Exception e) {
			logger.error(e, e);
			throw new SvcException(e.getMessage());
		}
	}

}
