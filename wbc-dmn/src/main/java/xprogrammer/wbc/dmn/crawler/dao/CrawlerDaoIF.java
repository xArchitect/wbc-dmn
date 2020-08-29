package xprogrammer.wbc.dmn.crawler.dao;

import java.util.List;

import xprogrammer.wbc.dmn.cmn.exception.DaoException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;

public interface CrawlerDaoIF {
	public List<UrlInfDvo> selectUrlInfList(UrlInfDvo dvo) throws DaoException;

	public List<ItmInfDvo> selectItmInfList(ItmInfDvo dvo) throws DaoException;
}
