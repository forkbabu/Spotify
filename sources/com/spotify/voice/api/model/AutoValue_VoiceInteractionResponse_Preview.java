package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Preview extends C$AutoValue_VoiceInteractionResponse_Preview {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Preview> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Preview> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Preview createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Preview((ClientAction) Enum.valueOf(ClientAction.class, parcel.readString()), (VoiceInteractionResponse.Preview.PreviewData) parcel.readParcelable(VoiceInteractionResponse.Preview.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Preview[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Preview[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Preview(ClientAction clientAction, VoiceInteractionResponse.Preview.PreviewData previewData) {
        super(clientAction, previewData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(action().name());
        parcel.writeParcelable(preview(), i);
    }
}
