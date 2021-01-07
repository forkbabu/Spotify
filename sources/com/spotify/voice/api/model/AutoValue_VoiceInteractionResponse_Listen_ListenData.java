package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Listen_ListenData extends C$AutoValue_VoiceInteractionResponse_Listen_ListenData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Listen_ListenData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Listen_ListenData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Listen_ListenData createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Listen_ListenData((VoiceInteractionResponse.a) parcel.readParcelable(VoiceInteractionResponse.Listen.ListenData.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Listen_ListenData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Listen_ListenData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Listen_ListenData(VoiceInteractionResponse.a aVar) {
        super(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(duration(), i);
    }
}
