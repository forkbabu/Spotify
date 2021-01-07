package com.spotify.music.features.yourlibrary.musicpages.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.List;

/* access modifiers changed from: package-private */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new a();

    static class a implements Parcelable.Creator<j> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel.readArrayList(MusicItem.e.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    j(List<va9> list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(a());
    }
}
