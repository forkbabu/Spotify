package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

final class AutoValue_VoiceInteractionResponse extends C$AutoValue_VoiceInteractionResponse {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse((VoiceInteractionResponse.ClientActions) parcel.readParcelable(VoiceInteractionResponse.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse[i];
        }
    }

    AutoValue_VoiceInteractionResponse(VoiceInteractionResponse.ClientActions clientActions) {
        super(clientActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(interactionResponse(), i);
    }
}
