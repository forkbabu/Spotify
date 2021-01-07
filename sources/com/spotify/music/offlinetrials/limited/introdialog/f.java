package com.spotify.music.offlinetrials.limited.introdialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.slate.model.u;

/* access modifiers changed from: package-private */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new a();

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f((u) parcel.readParcelable(i.class.getClassLoader()), (u) parcel.readParcelable(i.class.getClassLoader()), (u) parcel.readParcelable(i.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    f(u uVar, u uVar2, u uVar3) {
        super(uVar, uVar2, uVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(b(), i);
        parcel.writeParcelable(a(), i);
    }
}
