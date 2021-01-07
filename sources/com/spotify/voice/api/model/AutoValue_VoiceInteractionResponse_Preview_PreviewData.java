package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Preview_PreviewData extends C$AutoValue_VoiceInteractionResponse_Preview_PreviewData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Preview_PreviewData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Preview_PreviewData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Preview_PreviewData createFromParcel(Parcel parcel) {
            return new AutoValue_VoiceInteractionResponse_Preview_PreviewData(parcel.readArrayList(VoiceInteractionResponse.Preview.PreviewData.class.getClassLoader()), (VoiceInteractionResponse.a) parcel.readParcelable(VoiceInteractionResponse.Preview.PreviewData.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Preview_PreviewData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Preview_PreviewData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Preview_PreviewData(List<VoiceInteractionResponse.Preview.AudioFile> list, VoiceInteractionResponse.a aVar) {
        super(list, aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(audioFiles());
        parcel.writeParcelable(playDuration(), i);
    }
}
