package com.spotify.music.slate.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new a();

    static class a implements Parcelable.Creator<g> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public g createFromParcel(Parcel parcel) {
            return new g((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    g(CharSequence charSequence) {
        super(charSequence);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(e(), parcel, i);
    }
}
