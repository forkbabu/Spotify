package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.eventshub.model.EventsHubModel;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_EventsHubModel extends C$AutoValue_EventsHubModel {
    public static final Parcelable.Creator<AutoValue_EventsHubModel> CREATOR = new a();
    private static final EventsHubModel.a EVENT_RESULT_ADAPTER = new EventsHubModel.a();

    static class a implements Parcelable.Creator<AutoValue_EventsHubModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EventsHubModel createFromParcel(Parcel parcel) {
            EventsHubModel.a aVar = AutoValue_EventsHubModel.EVENT_RESULT_ADAPTER;
            aVar.getClass();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(aVar);
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_EventsHubModel(createTypedArrayList, readString, str);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EventsHubModel[] newArray(int i) {
            return new AutoValue_EventsHubModel[i];
        }
    }

    AutoValue_EventsHubModel(List<EventResult> list, String str, String str2) {
        super(list, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        EventsHubModel.a aVar = EVENT_RESULT_ADAPTER;
        List<EventResult> events = getEvents();
        aVar.getClass();
        parcel.writeTypedList(events);
        if (getHeaderImageUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getHeaderImageUri());
        }
        if (getUserLocation() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUserLocation());
    }
}
