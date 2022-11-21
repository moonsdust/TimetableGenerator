package fileio_use_case;

import entities.CalendarCourse;
import entities.Session;

import java.util.HashMap;

public class SessionBuilderInteractor {
    public SessionBuilderInteractor() {}
    /**
     * Returns HashMap<String, Session> containing Sessions from Fall and Winter
     */
    public HashMap<String, Session> allSessionBuilder(HashMap<String, CalendarCourse> allCourses) {
        SessionStorerInteractor sessionStorer = new SessionStorerInteractor();
        Session Fall = new Session("F");
        sessionStorer.addSession("F", Fall);
        Session Winter = new Session("S");
        sessionStorer.addSession("S", Winter);

        for (String courseName : allCourses.keySet()) {
            CalendarCourse calCourse = allCourses.get(courseName);
            if (calCourse.getCourseSession().equals("F")) {
                Fall.addCourse(calCourse);
            }
            else {
                Winter.addCourse(calCourse);
            }
        }
        return sessionStorer.getAllSessions();
    }

}
