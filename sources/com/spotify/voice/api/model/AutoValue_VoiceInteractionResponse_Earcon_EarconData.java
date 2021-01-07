package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Earcon_EarconData extends C$AutoValue_VoiceInteractionResponse_Earcon_EarconData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Earcon_EarconData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Earcon_EarconData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Earcon_EarconData createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Earcon_EarconData((VoiceInteractionResponse.Earcon.EarconValue) Enum.valueOf(VoiceInteractionResponse.Earcon.EarconValue.class, parcel.readString()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Earcon_EarconData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Earcon_EarconData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Earcon_EarconData(VoiceInteractionResponse.Earcon.EarconValue earconValue) {
        super(earconValue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(earcon().name());
    }
}
