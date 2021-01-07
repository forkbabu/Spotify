package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EventsHubModel implements JacksonModel, Parcelable {
    public static final EventsHubModel EMPTY = create(new ArrayList(), null, null);

    /* access modifiers changed from: package-private */
    public static final class a extends zod<EventResult> {
        protected a() {
            super(EventsHubModel.getEventResultCreator());
        }
    }

    @JsonCreator
    public static EventsHubModel create(@JsonProperty("events") List<EventResult> list, @JsonProperty("headerImageUri") String str, @JsonProperty("userLocation") String str2) {
        return new AutoValue_EventsHubModel(gf0.a(list), str, str2);
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends EventResult> getEventResultCreator() {
        return AutoValue_EventResult.CREATOR;
    }

    @JsonProperty("events")
    public abstract List<EventResult> getEvents();

    @JsonProperty("headerImageUri")
    public abstract String getHeaderImageUri();

    @JsonIgnore
    public int getNumberOfConcerts() {
        List<EventResult> events = getEvents();
        int i = 0;
        if (events.isEmpty()) {
            return 0;
        }
        for (EventResult eventResult : events) {
            for (ConcertResult concertResult : eventResult.getConcertResults()) {
                if (concertResult != null) {
                    i++;
                }
            }
        }
        return i;
    }

    @JsonProperty("userLocation")
    public abstract String getUserLocation();
}
