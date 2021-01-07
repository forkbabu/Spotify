package com.spotify.music.features.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

final class AutoValue_Autobiography extends C$AutoValue_Autobiography {
    public static final Parcelable.Creator<AutoValue_Autobiography> CREATOR = new a();
    private static final dpd STRING_LIST_TYPE_ADAPTER = new dpd();

    static class a implements Parcelable.Creator<AutoValue_Autobiography> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Autobiography createFromParcel(Parcel parcel) {
            return new AutoValue_Autobiography(parcel.readInt() == 0 ? parcel.readString() : null, AutoValue_Autobiography.STRING_LIST_TYPE_ADAPTER.a(parcel), (LinksModel) parcel.readParcelable(Autobiography.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Autobiography[] newArray(int i) {
            return new AutoValue_Autobiography[i];
        }
    }

    AutoValue_Autobiography(String str, List<String> list, LinksModel linksModel) {
        super(str, list, linksModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (body() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(body());
        }
        dpd dpd = STRING_LIST_TYPE_ADAPTER;
        List<String> urls = urls();
        dpd.getClass();
        parcel.writeStringList(urls);
        parcel.writeParcelable(links(), i);
    }
}
