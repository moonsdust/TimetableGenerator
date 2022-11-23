package screens;

import edit_timetable_use_case.AddCourseOutputBoundary;
import edit_timetable_use_case.EditTimetableResponseModel;
import edit_timetable_use_case.RemoveCourseFailedException;
import retrieve_timetable_use_case.TimetableModel;
import retrieve_timetable_use_case.TimetableModelConverter;
import retrieve_timetable_use_case.TimetableModelConverter;
import retrieve_timetable_use_case.TimetableModel;

public class AddCoursePresenter implements AddCourseOutputBoundary {
    private EditTimetableView view;

    /**
     * @param
     * @return
     */

    public AddCoursePresenter(){}
    public AddCoursePresenter(EditTimetableView view){
        this.view = view;
    }
    @Override
    public void prepareView(EditTimetableResponseModel responseModel)  {
        TimetableModel updatedTimetable = responseModel.getUpdatedTimetable();
        TimetableViewModel ttViewModel = TimetableModelConverter.timetableToView(updatedTimetable);
        view.updateTimetable(ttViewModel);
        view.displayResponse(responseModel.getCourseCode() + " was successfully added.");
    }

    public void setView(EditTimetableView view){
        this.view = view;
    }
}