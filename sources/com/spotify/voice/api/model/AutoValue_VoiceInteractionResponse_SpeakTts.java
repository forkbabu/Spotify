package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_SpeakTts extends C$AutoValue_VoiceInteractionResponse_SpeakTts {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_SpeakTts> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_SpeakTts> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_SpeakTts createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_SpeakTts((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.SpeakTts.TtsData) parcel.readParcelable(VoiceInteractionResponse.SpeakTts.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_SpeakTts[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_SpeakTts[i];
        }
    }

    AutoValue_VoiceInteractionResponse_SpeakTts(ClientAction clientAction, VoiceInteractionResponse.SpeakTts.TtsData ttsData) {
        super(clientAction, ttsData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(ttsData(), i);
    }
}
