package com.spotify.music.libs.assistedcuration.provider;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import java.util.List;

/* access modifiers changed from: package-private */
public class v extends x<v> {
    public static final Parcelable.Creator<v> CREATOR = new a();

    static class a implements Parcelable.Creator<v> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public v createFromParcel(Parcel parcel) {
            return new v(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public v[] newArray(int i) {
            return new v[i];
        }
    }

    v(List<e> list, b bVar) {
        super(list, bVar);
    }

    v(Parcel parcel, a aVar) {
        super(parcel);
    }
}
