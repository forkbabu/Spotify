package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.spotlets.radio.model.c;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new a();
    private static final c.a b = new c.a();

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(b.b.a(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    b(List<RadioStationModel> list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a aVar = b;
        List<RadioStationModel> b2 = b();
        aVar.getClass();
        parcel.writeTypedList(b2);
    }
}
