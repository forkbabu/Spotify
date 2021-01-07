package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Wait_WaitData extends C$AutoValue_VoiceInteractionResponse_Wait_WaitData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Wait_WaitData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Wait_WaitData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Wait_WaitData createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Wait_WaitData((VoiceInteractionResponse.a) parcel.readParcelable(VoiceInteractionResponse.Wait.WaitData.class.getClassLoader()), parcel.readArrayList(VoiceInteractionResponse.Wait.WaitData.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Wait_WaitData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Wait_WaitData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Wait_WaitData(VoiceInteractionResponse.a aVar, List<String> list) {
        super(aVar, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(duration(), i);
        parcel.writeList(hintPhrases());
    }
}
