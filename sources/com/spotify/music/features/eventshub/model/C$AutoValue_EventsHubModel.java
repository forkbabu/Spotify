package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_EventsHubModel  reason: invalid class name */
abstract class C$AutoValue_EventsHubModel extends EventsHubModel {
    private final List<EventResult> events;
    private final String headerImageUri;
    private final String userLocation;

    C$AutoValue_EventsHubModel(List<EventResult> list, String str, String str2) {
        if (list != null) {
            this.events = list;
            this.headerImageUri = str;
            this.userLocation = str2;
            return;
        }
        throw new NullPointerException("Null events");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventsHubModel)) {
            return false;
        }
        EventsHubModel eventsHubModel = (EventsHubModel) obj;
        if (this.events.equals(eventsHubModel.getEvents()) && ((str = this.headerImageUri) != null ? str.equals(eventsHubModel.getHeaderImageUri()) : eventsHubModel.getHeaderImageUri() == null)) {
            String str2 = this.userLocation;
            if (str2 == null) {
                if (eventsHubModel.getUserLocation() == null) {
                    return true;
                }
            } else if (str2.equals(eventsHubModel.getUserLocation())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.EventsHubModel
    @JsonProperty("events")
    public List<EventResult> getEvents() {
        return this.events;
    }

    @Override // com.spotify.music.features.eventshub.model.EventsHubModel
    @JsonProperty("headerImageUri")
    public String getHeaderImageUri() {
        return this.headerImageUri;
    }

    @Override // com.spotify.music.features.eventshub.model.EventsHubModel
    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.events.hashCode() ^ 1000003) * 1000003;
        String str = this.headerImageUri;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.userLocation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EventsHubModel{events=");
        V0.append(this.events);
        V0.append(", headerImageUri=");
        V0.append(this.headerImageUri);
        V0.append(", userLocation=");
        return je.I0(V0, this.userLocation, "}");
    }
}
