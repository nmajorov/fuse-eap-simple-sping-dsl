package biz.majorov.ws;

import javax.jws.WebService;

/**
 * simple web service
 * 
 * @author nikolaj@majorov.biz
 *
 */
@WebService(targetNamespace="http://ws.majorov.biz") 
public interface Ping {
	public String ping();
}
