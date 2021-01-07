package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Earcon extends C$AutoValue_VoiceInteractionResponse_Earcon {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Earcon> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Earcon> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Earcon createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Earcon((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Earcon.EarconData) parcel.readParcelable(VoiceInteractionResponse.Earcon.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Earcon[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Earcon[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Earcon(ClientAction clientAction, VoiceInteractionResponse.Earcon.EarconData earconData) {
        super(clientAction, earconData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(earconData(), i);
    }
}
