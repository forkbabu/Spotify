package com.spotify.music.spotlets.radio.formatlist;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

final class AutoValue_RadioFormatListSourceModel extends C$AutoValue_RadioFormatListSourceModel {
    public static final Parcelable.Creator<AutoValue_RadioFormatListSourceModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_RadioFormatListSourceModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RadioFormatListSourceModel createFromParcel(Parcel parcel) {
            return new AutoValue_RadioFormatListSourceModel(parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(RadioFormatListSourceModel.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RadioFormatListSourceModel[] newArray(int i) {
            return new AutoValue_RadioFormatListSourceModel[i];
        }
    }

    AutoValue_RadioFormatListSourceModel(Integer num, List<Map<String, String>> list) {
        super(num, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (total() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(total().intValue());
        }
        parcel.writeList(mediaItems());
    }
}
