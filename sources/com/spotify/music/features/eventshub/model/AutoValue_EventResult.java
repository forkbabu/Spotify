package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.eventshub.model.EventResult;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_EventResult extends C$AutoValue_EventResult {
    public static final Parcelable.Creator<AutoValue_EventResult> CREATOR = new a();
    private static final EventResult.a EVENT_RESULT_CONCERTS_PARCEL_ADAPTER = new EventResult.a();
    private static final dpd STRING_LIST_TYPE_ADAPTER = new dpd();

    static class a implements Parcelable.Creator<AutoValue_EventResult> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EventResult createFromParcel(Parcel parcel) {
            EventResult.a aVar = AutoValue_EventResult.EVENT_RESULT_CONCERTS_PARCEL_ADAPTER;
            aVar.getClass();
            return new AutoValue_EventResult(parcel.createTypedArrayList(aVar), AutoValue_EventResult.STRING_LIST_TYPE_ADAPTER.a(parcel), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_EventResult[] newArray(int i) {
            return new AutoValue_EventResult[i];
        }
    }

    AutoValue_EventResult(List<ConcertResult> list, List<String> list2, String str, String str2, String str3, String str4, String str5) {
        super(list, list2, str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        EventResult.a aVar = EVENT_RESULT_CONCERTS_PARCEL_ADAPTER;
        List<ConcertResult> concertResults = getConcertResults();
        aVar.getClass();
        parcel.writeTypedList(concertResults);
        dpd dpd = STRING_LIST_TYPE_ADAPTER;
        List<String> artists = getArtists();
        dpd.getClass();
        parcel.writeStringList(artists);
        if (getSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSource());
        }
        if (getOpeningDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOpeningDate());
        }
        if (getClosingDate() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getClosingDate());
        }
        if (getVenue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getVenue());
        }
        if (getLocation() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getLocation());
    }
}
