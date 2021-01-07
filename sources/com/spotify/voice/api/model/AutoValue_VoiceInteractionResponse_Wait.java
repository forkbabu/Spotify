package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Wait extends C$AutoValue_VoiceInteractionResponse_Wait {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Wait> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Wait> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Wait createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Wait((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Wait.WaitData) parcel.readParcelable(VoiceInteractionResponse.Wait.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Wait[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Wait[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Wait(ClientAction clientAction, VoiceInteractionResponse.Wait.WaitData waitData) {
        super(clientAction, waitData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(waitData(), i);
    }
}
