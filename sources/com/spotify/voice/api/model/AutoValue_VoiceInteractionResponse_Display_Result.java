package com.spotify.voice.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_VoiceInteractionResponse_Display_Result extends C$AutoValue_VoiceInteractionResponse_Display_Result {
    public static final Parcelable.Creator<AutoValue_VoiceInteractionResponse_Display_Result> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_VoiceInteractionResponse_Display_Result> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Display_Result createFromParcel(Parcel parcel) {
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_VoiceInteractionResponse_Display_Result(readString, readString2, readString3, readString4, readString5, z2, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_VoiceInteractionResponse_Display_Result[] newArray(int i) {
            return new AutoValue_VoiceInteractionResponse_Display_Result[i];
        }
    }

    AutoValue_VoiceInteractionResponse_Display_Result(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        super(str, str2, str3, str4, str5, z, z2);
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
        if (image() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(image());
        }
        if (uri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(uri());
        }
        if (navigation() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(navigation());
        }
        parcel.writeInt(explicit() ? 1 : 0);
        parcel.writeInt(playing() ? 1 : 0);
    }
}
