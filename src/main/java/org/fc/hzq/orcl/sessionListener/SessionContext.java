package org.fc.hzq.orcl.sessionListener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class SessionContext {
	private static SessionContext instance;
	private Map<String, HttpSession> sessionMap;

	private SessionContext() {
		sessionMap = new HashMap<String, HttpSession>();
	}

	public synchronized  static SessionContext getInstance() {
		if (instance == null) {
			instance = new SessionContext();
		}
		return instance;
	}

	public synchronized void AddSession(HttpSession session) {
		if (session != null) {
	            sessionMap.put(session.getId(), session);  
		}
	}

	public synchronized void DelSession(HttpSession session) {
		if (session != null) {
			 sessionMap.remove(session.getId());  
			// session.invalidate();
		}
	}

	public synchronized HttpSession getSession(String session_id) {
		if (session_id == null)
			return null;
		return (HttpSession) sessionMap.get(session_id);
	}

	public Map<String, HttpSession> getSessionMap() {
		return sessionMap;
	}

	public void setMymap(HashMap<String, HttpSession> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
