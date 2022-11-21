package screens;

import edit_timetable_use_case.RemoveCourseOutputBoundary;
import edit_timetable_use_case.EditTimetableResponseModel;
import edit_timetable_use_case.RemoveCourseFailedException;
import retrieve_timetable_use_case.TimetableResponseConverter;
import retrieve_timetable_use_case.TimetableResponseModel;

/**
 *
 */
public class RemoveCoursePresenter implements RemoveCourseOutputBoundary {

    private EditTimetableView view;

    /**
     * @param
     * @return
     */

    public RemoveCoursePresenter(){}
    public RemoveCoursePresenter(EditTimetableView view){
        this.view = view;
    }
    @Override
    public void prepareView(EditTimetableResponseModel responseModel) {
        TimetableResponseModel updatedTimetable = responseModel.getUpdatedTimetable();
        TimetableViewModel ttViewModel = TimetableResponseConverter.timetableToView(updatedTimetable);
        view.updateTimetable(ttViewModel);
        view.displayResponse(responseModel.getCourseCode() + " was succesfully removed.");
    }

    public void setView(EditTimetableView view){
        this.view = view;
    }
}
