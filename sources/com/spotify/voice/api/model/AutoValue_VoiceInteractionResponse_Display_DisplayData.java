package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Display_DisplayData extends C$AutoValue_VoiceInteractionResponse_Display_DisplayData {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Display_DisplayData> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Display_DisplayData> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Display_DisplayData createFromParcel(Parcel parcel) {
            VoiceInteractionResponse.Display.DisplayData.DisplayError displayError = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            ArrayList readArrayList = parcel.readArrayList(VoiceInteractionResponse.Display.DisplayData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                displayError = (VoiceInteractionResponse.Display.DisplayData.DisplayError) Enum.valueOf(VoiceInteractionResponse.Display.DisplayData.DisplayError.class, parcel.readString());
            }
            return new AutoValue_VoiceInteractionResponse_Display_DisplayData(readString, readString2, readArrayList, displayError);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Display_DisplayData[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Display_DisplayData[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Display_DisplayData(String str, String str2, List<VoiceInteractionResponse.Display.Result> list, VoiceInteractionResponse.Display.DisplayData.DisplayError displayError) {
        super(str, str2, list, displayError);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (title() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(title());
        }
        if (subtitle() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(subtitle());
        }
        parcel.writeList(results());
        if (error() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(error().name());
    }
}
