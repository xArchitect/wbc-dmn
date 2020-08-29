package xprogrammer.wbc.dmn.crawler.svc;

import java.util.List;

import xprogrammer.wbc.dmn.cmn.exception.SvcException;
import xprogrammer.wbc.dmn.crawler.dvo.ItmInfDvo;
import xprogrammer.wbc.dmn.crawler.dvo.UrlInfDvo;

public interface CrawlerSvcIF {
	
	public List<UrlInfDvo> selectUrlInfList(UrlInfDvo dvo) throws SvcException;

	public List<ItmInfDvo> selectItmInfList(ItmInfDvo dvo) throws SvcException;
	
}
