package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Play extends C$AutoValue_VoiceInteractionResponse_Play {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Play> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Play> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Play createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Play((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.b) parcel.readParcelable(VoiceInteractionResponse.Play.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Play[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Play[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Play(ClientAction clientAction, VoiceInteractionResponse.b bVar) {
        super(clientAction, bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(playContext(), i);
    }
}
