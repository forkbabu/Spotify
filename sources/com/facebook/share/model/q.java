package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q extends d<q, Object> {
    public static final Parcelable.Creator<q> CREATOR = new a();
    private final ShareMedia p;
    private final o q;
    private final List<String> r;
    private final String s;

    static class a implements Parcelable.Creator<q> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public q[] newArray(int i) {
            return new q[i];
        }
    }

    q(Parcel parcel) {
        super(parcel);
        this.p = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.q = (o) parcel.readParcelable(o.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.r = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.s = parcel.readString();
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.s;
    }

    public ShareMedia i() {
        return this.p;
    }

    public List<String> j() {
        List<String> list = this.r;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public o k() {
        return this.q;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.p, 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeStringList(this.r);
        parcel.writeString(this.s);
    }
}
