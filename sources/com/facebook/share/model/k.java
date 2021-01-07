package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.n;

public final class k extends n<k, b> {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* access modifiers changed from: package-private */
    public static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public static final class b extends n.a<k, b> {
    }

    k(b bVar, a aVar) {
        super(bVar);
    }

    public String f() {
        return c("og:type");
    }

    k(Parcel parcel) {
        super(parcel);
    }
}
