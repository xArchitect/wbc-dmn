package xprogrammer.wbc.dmn;

import org.apache.log4j.Logger;

import xprogrammer.wbc.dmn.cmn.exception.SvcException;
import xprogrammer.wbc.dmn.crawler.biz.CrawlerBiz;

public class WebBoardCrawlerDaemon {
	private final static Logger logger = Logger.getLogger(WebBoardCrawlerDaemon.class);

	public static void main(String[] args) throws SvcException {
		String program = null	; // C: 수집
		String action = null	; // 수행할 동작
		String mode = null		; // dev:개발 | svc:서비스
		if (args.length > 0) {
			program	= args[0];
			action  = args[1];
			mode    = args[2];
		} else {
			logger.debug("Usage: Option is Required");
		}

		if("C".contentEquals(program)) {
			CrawlerBiz.crawling(action, mode);
		} else if("A".contentEquals(program)) {
			
		} else {
			logger.debug("C: Crawling, A: Analyzing");
		}

	}

}
