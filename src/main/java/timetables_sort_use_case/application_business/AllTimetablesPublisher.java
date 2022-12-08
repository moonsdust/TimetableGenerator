package timetables_sort_use_case.application_business;

import entities.Timetable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class AllTimetablesPublisher implements AllTimetablesInputBoundary,
        Flow.Publisher<Object>, Flow.Subscriber<List<Timetable>>{
    private final ArrayList<Flow.Subscriber<Object>> subscribers = new ArrayList<>();
    private List<Timetable> timetables;

    public AllTimetablesPublisher() {
        this.timetables = null;
    }

    public void subscribe(Flow.Subscriber<Object> subscriber) {
        this.subscribers.add(subscriber);
    }

    public void updateSubscribers(int i) {
        for (Flow.Subscriber<Object> subscriber : subscribers) {
            Timetable timetable = this.timetables.get(i);
            subscriber.onNext(timetable);
        }

    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(List<Timetable> timetables) {
        this.timetables = timetables;
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
