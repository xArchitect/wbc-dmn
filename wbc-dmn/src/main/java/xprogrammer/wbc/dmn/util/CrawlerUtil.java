package xprogrammer.wbc.dmn.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.NoRouteToHostException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.log4j.Logger;

@SuppressWarnings("deprecation")
public class CrawlerUtil {
	private static Logger logger = Logger.getLogger(CrawlerUtil.class);
	private static HttpClient httpClient;

	public static String getHTMLContent(String strUrl){
		String content = "";
	    httpClient = new DefaultHttpClient();
        DefaultHttpRequestRetryHandler retryHandler = new DefaultHttpRequestRetryHandler(3, true);
        ((AbstractHttpClient) httpClient).setHttpRequestRetryHandler(retryHandler);
        httpClient.getParams().setParameter("http.protocol.expect-continue", false);
        httpClient.getParams().setParameter("http.connection.timeout", 5000);
        httpClient.getParams().setParameter("http.socket.timeout", 5000);

		try {
            HttpGet httpGet = new HttpGet(strUrl);
            HttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            
            ContentType contentType = ContentType.getOrDefault(httpEntity);
//            String mimeType = contentType.getMimeType();
            Charset charset = contentType.getCharset();

            // 
            logger.debug(httpResponse.getStatusLine());
            if (httpEntity != null) {
            	logger.debug("Response content length: " + httpEntity.getContentLength());
            	BufferedReader rd = null;
                if (charset.toString().toUpperCase().indexOf("UTF-8") != -1){
                	rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(),"UTF-8"));
    			} else {
    				rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(),"EUC-KR"));
    			}
                StringBuffer sb = new StringBuffer();
                String line = null;
                while( (line = rd.readLine())!=null ){
    				sb.append(line);
    				sb.append("\n");
    			}
    			content = sb.toString();
            }
            httpGet.abort();
            httpClient.getConnectionManager().shutdown();
            
			/*
			URL url = new URL(strUrl);
			urlConnection = url.openConnection();
			urlConnection.setConnectTimeout(1000);
			urlConnection.setDoOutput(true);
			urlConnection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			urlConnection.setAllowUserInteraction(false);
			
			String headerType = urlConnection.getContentType();
			BufferedReader in;
			if (headerType.toUpperCase().indexOf("UTF-8") != -1){
				in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
			} else {
				in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"EUC-KR"));
			}
			
			StringBuffer sb = new StringBuffer();
			String thisLine = null;
			while( (thisLine = in.readLine())!=null ){
				sb.append(thisLine);
				sb.append("\n");
			}
			content = sb.toString();
			*/
			
			/*
		    InputStream urlStream = url.openStream();
		    //String type = urlConnection.guessContentTypeFromStream(urlStream);
		    byte b[] = new byte[5000];
		    int numRead = urlStream.read(b);
		    content = new String(b, 0, numRead);
		    while (numRead != -1 && numRead > 0) {
		    	numRead = urlStream.read(b);
		    	if (numRead != -1) {
		    		String newContent = new String(b, 0, numRead);
		    			content += newContent;
		    	}
		    }
		    urlStream.close();
		    */
//		} catch (SocketTimeoutException e){
//			getHTMLContent(strUrl);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			content = "ERROR";
			return content;
		} catch (NoRouteToHostException e){
			e.printStackTrace();
			content = "ERROR";
			return content;
		} catch (IOException e) {
			e.printStackTrace();
			content = "ERROR";
			return content;
		} catch (Exception e) {
			e.printStackTrace();
			content = "ERROR";
			return content;
		} finally {
			httpClient.getConnectionManager().shutdown();
		}
	    return content;
	}
	
	public static String getTextContent(String content) {
		Pattern SCRIPTS = Pattern.compile("<(no)?script[^>]*>.*?</(no)?script>",Pattern.DOTALL);
		Pattern STYLE = Pattern.compile("<style[^>]*>.*</style>",Pattern.DOTALL);
		Pattern TAGS = Pattern.compile("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>");
		Pattern nTAGS = Pattern.compile("<\\w+\\s+[^<]*\\s*>");
		Pattern ENTITY_REFS = Pattern.compile("&[^;]+;");
		Pattern WHITESPACE = Pattern.compile("\\s\\s+");
		
		Matcher m;
		
		m = SCRIPTS.matcher(content);
		content = m.replaceAll("");
		m = STYLE.matcher(content);
		content = m.replaceAll("");
		m = TAGS.matcher(content);
		content = m.replaceAll("");
		m = nTAGS.matcher(content);
		content = m.replaceAll("");
		m = ENTITY_REFS.matcher(content);
		content = m.replaceAll("");
		m = WHITESPACE.matcher(content);
		content = m.replaceAll(" "); 		
		
		return content;
	}

}
