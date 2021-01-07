package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class g extends d<g, Object> {
    public static final Parcelable.Creator<g> CREATOR = new a();
    private final List<ShareMedia> p;

    static class a implements Parcelable.Creator<g> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    g(Parcel parcel) {
        super(parcel);
        this.p = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public List<ShareMedia> h() {
        return this.p;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.p.toArray(), i);
    }
}
