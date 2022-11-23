package edit_timetable_use_case;

import entities.Timetable;

/**
 * The input boundary used in the RemoveCourse use case.
 */
public interface RemoveCourseInputBoundary {

    /**
     * @param requestModel: a EditTimetableRequestModel that contains the course code of the course to be removed.
     * @throws RemoveCourseFailedException when the course could not be removed. This is most likely when the
     * timetable contains no such course that has the input course code.
     */
    void remove(EditTimetableRequestModel requestModel) throws RemoveCourseFailedException;

    /**
     * @param timetable the Timetable from which the course is to be removed. Must be set before using the interactor.
     */
    void setTimetable(Timetable timetable);
}