package xprogrammer.wbc.dmn.crawler.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import xprogrammer.wbc.dmn.cmn.exception.DaoException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;

public class CrawlerDaoImpl implements CrawlerDaoIF {
	private SqlSessionFactory sqlSessionFactory = null;
	 
    public CrawlerDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
	@Override
	public List<UrlInfDvo> selectUrlInfList(UrlInfDvo dvo) throws DaoException {
		List<UrlInfDvo> result = null;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectList("CrawlerMapper.selectUrlInfList",dvo);
        } finally {
            session.close();
        }
        return result;
	}

	@Override
	public List<ItmInfDvo> selectItmInfList(ItmInfDvo dvo) throws DaoException {
		List<ItmInfDvo> result = null;
		SqlSession session = sqlSessionFactory.openSession();
        try {
        	result = session.selectList("CrawlerMapper.selectItmInfList",dvo);
        } finally {
            session.close();
        }
        return result;
	}

}
