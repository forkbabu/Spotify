package com.spotify.music.libs.search.product.main.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.music.libs.search.product.main.util.SearchModelParcelable;
import org.apache.commons.lang3.tuple.Pair;

/* access modifiers changed from: package-private */
public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new a();

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel.readString(), (Optional) parcel.readSerializable(), (Optional) parcel.readSerializable());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(String str, Optional<Pair<SearchModelParcelable.SearchResultType, Object>> optional, Optional<SearchModelParcelable.SearchErrorType> optional2) {
        super(str, optional, optional2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeSerializable(e());
        parcel.writeSerializable(b());
    }
}
