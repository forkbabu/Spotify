package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_ShuffleOn extends C$AutoValue_VoiceInteractionResponse_ShuffleOn {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_ShuffleOn> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_ShuffleOn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_ShuffleOn createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_ShuffleOn((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.b) parcel.readParcelable(VoiceInteractionResponse.ShuffleOn.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_ShuffleOn[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_ShuffleOn[i];
        }
    }

    AutoValue_VoiceInteractionResponse_ShuffleOn(ClientAction clientAction, VoiceInteractionResponse.b bVar) {
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
