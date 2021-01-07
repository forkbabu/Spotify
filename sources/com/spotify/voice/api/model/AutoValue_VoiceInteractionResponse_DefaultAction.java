package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_DefaultAction extends C$AutoValue_VoiceInteractionResponse_DefaultAction {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_DefaultAction> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_DefaultAction> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_DefaultAction createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_DefaultAction((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_DefaultAction[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_DefaultAction[i];
        }
    }

    AutoValue_VoiceInteractionResponse_DefaultAction(ClientAction clientAction) {
        super(clientAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
    }
}
