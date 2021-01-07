package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Navigate extends C$AutoValue_VoiceInteractionResponse_Navigate {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Navigate> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Navigate> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Navigate createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Navigate((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Navigate.NavigationData) parcel.readParcelable(VoiceInteractionResponse.Navigate.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Navigate[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Navigate[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Navigate(ClientAction clientAction, VoiceInteractionResponse.Navigate.NavigationData navigationData) {
        super(clientAction, navigationData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(navigationTarget(), i);
    }
}
