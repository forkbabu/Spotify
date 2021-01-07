package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Preview_AudioFile extends C$AutoValue_VoiceInteractionResponse_Preview_AudioFile {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Preview_AudioFile> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Preview_AudioFile> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Preview_AudioFile createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Preview_AudioFile(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Preview_AudioFile[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Preview_AudioFile[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Preview_AudioFile(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(fileId());
        parcel.writeString(format());
    }
}
