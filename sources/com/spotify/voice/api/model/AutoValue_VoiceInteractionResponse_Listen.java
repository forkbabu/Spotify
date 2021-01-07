package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Listen extends C$AutoValue_VoiceInteractionResponse_Listen {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Listen> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Listen> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Listen createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Listen((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Listen.ListenData) parcel.readParcelable(VoiceInteractionResponse.Listen.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Listen[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Listen[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Listen(ClientAction clientAction, VoiceInteractionResponse.Listen.ListenData listenData) {
        super(clientAction, listenData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(listenData(), i);
    }
}
