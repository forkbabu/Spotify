package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ShareMedia implements Parcelable {
    private final Bundle a;

    public enum Type {
        PHOTO,
        VIDEO
    }

    public static abstract class a<M extends ShareMedia, B extends a> {
        private Bundle a = new Bundle();

        public B b(M m) {
            this.a.putAll(m.b());
            return this;
        }
    }

    protected ShareMedia(a aVar) {
        this.a = new Bundle(aVar.a);
    }

    public abstract Type a();

    @Deprecated
    public Bundle b() {
        return new Bundle(this.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    ShareMedia(Parcel parcel) {
        this.a = parcel.readBundle();
    }
}
