package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Generic extends C$AutoValue_VoiceInteractionResponse_Generic {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Generic> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Generic> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Generic createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Generic((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Generic.GenericData) parcel.readParcelable(VoiceInteractionResponse.Generic.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Generic[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Generic[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Generic(ClientAction clientAction, VoiceInteractionResponse.Generic.GenericData genericData) {
        super(clientAction, genericData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(genericData(), i);
    }
}
