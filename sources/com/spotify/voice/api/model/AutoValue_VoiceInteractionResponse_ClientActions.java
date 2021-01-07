package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

final class AutoValue_VoiceInteractionResponse_ClientActions extends C$AutoValue_VoiceInteractionResponse_ClientActions {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_ClientActions> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_ClientActions> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_ClientActions createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_VoiceInteractionResponse_ClientActions(readString, str, parcel.readArrayList(VoiceInteractionResponse.ClientActions.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_ClientActions[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_ClientActions[i];
        }
    }

    AutoValue_VoiceInteractionResponse_ClientActions(String str, String str2, List<VoiceInteractionResponse.Action> list) {
        super(str, str2, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (interactionId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(interactionId());
        }
        if (voiceModuleRedirectUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(voiceModuleRedirectUri());
        }
        parcel.writeList(actions());
    }
}
