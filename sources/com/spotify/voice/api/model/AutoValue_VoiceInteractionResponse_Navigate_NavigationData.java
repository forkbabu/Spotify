package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Navigate_NavigationData extends C$AutoValue_VoiceInteractionResponse_Navigate_NavigationData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Navigate_NavigationData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Navigate_NavigationData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Navigate_NavigationData createFromParcel(Parcel parcel) {
            VoiceInteractionResponse.Navigate.NavigationData.Target target = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                target = (VoiceInteractionResponse.Navigate.NavigationData.Target) Enum.valueOf(VoiceInteractionResponse.Navigate.NavigationData.Target.class, parcel.readString());
            }
            return new AutoValue_VoiceInteractionResponse_Navigate_NavigationData(readString, target);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Navigate_NavigationData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Navigate_NavigationData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Navigate_NavigationData(String str, VoiceInteractionResponse.Navigate.NavigationData.Target target) {
        super(str, target);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (uri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(uri());
        }
        if (target() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(target().name());
    }
}
