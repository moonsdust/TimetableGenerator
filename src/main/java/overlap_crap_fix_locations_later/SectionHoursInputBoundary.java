package overlap_crap_fix_locations_later;

import retrieve_timetable_use_case.SectionModel;

/** An input boundary that's used for getting the number of hours in a section. **/
public interface SectionHoursInputBoundary {

    /** calculate the length, in Hours, of a section. **/
    public Double calculateHoursOfSection(SectionModel section);

}
