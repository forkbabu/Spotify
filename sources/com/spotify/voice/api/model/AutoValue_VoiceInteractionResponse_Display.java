package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Display extends C$AutoValue_VoiceInteractionResponse_Display {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Display> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Display> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Display createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Display((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Display.DisplayData) parcel.readParcelable(VoiceInteractionResponse.Display.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Display[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Display[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Display(ClientAction clientAction, VoiceInteractionResponse.Display.DisplayData displayData) {
        super(clientAction, displayData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(data(), i);
    }
}
