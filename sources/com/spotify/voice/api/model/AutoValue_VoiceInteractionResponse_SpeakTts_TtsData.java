package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_SpeakTts_TtsData extends C$AutoValue_VoiceInteractionResponse_SpeakTts_TtsData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_SpeakTts_TtsData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_SpeakTts_TtsData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_SpeakTts_TtsData createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_SpeakTts_TtsData(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_SpeakTts_TtsData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_SpeakTts_TtsData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_SpeakTts_TtsData(String str, int i) {
        super(str, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (url() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(url());
        }
        parcel.writeInt(resId());
    }
}
