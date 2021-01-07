package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Generic_GenericData extends C$AutoValue_VoiceInteractionResponse_Generic_GenericData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Generic_GenericData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Generic_GenericData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Generic_GenericData createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Generic_GenericData(parcel.readString(), parcel.readHashMap(VoiceInteractionResponse.Generic.GenericData.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Generic_GenericData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Generic_GenericData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Generic_GenericData(String str, Map<String, String> map) {
        super(str, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(actionType());
        parcel.writeMap(data());
    }
}
