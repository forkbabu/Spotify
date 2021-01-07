package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

public final class o extends ShareMedia {
    public static final Parcelable.Creator<o> CREATOR = new a();
    private final Bitmap b;
    private final Uri c;
    private final boolean f;
    private final String n;

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    public static final class b extends ShareMedia.a<o, b> {
        private Bitmap b;
        private Uri c;
        private boolean d;
        private String e;

        public o g() {
            return new o(this, null);
        }

        /* access modifiers changed from: package-private */
        public Bitmap h() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public Uri i() {
            return this.c;
        }

        public b j(o oVar) {
            if (oVar == null) {
                return this;
            }
            b bVar = (b) b(oVar);
            bVar.b = oVar.c();
            bVar.c = oVar.f();
            bVar.d = oVar.g();
            bVar.e = oVar.e();
            return bVar;
        }

        public b k(Bitmap bitmap) {
            this.b = null;
            return this;
        }

        public b l(Uri uri) {
            this.c = uri;
            return this;
        }
    }

    o(b bVar, a aVar) {
        super(bVar);
        this.b = bVar.b;
        this.c = bVar.c;
        this.f = bVar.d;
        this.n = bVar.e;
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type a() {
        return ShareMedia.Type.PHOTO;
    }

    public Bitmap c() {
        return this.b;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.n;
    }

    public Uri f() {
        return this.c;
    }

    public boolean g() {
        return this.f;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeString(this.n);
    }

    o(Parcel parcel) {
        super(parcel);
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f = parcel.readByte() != 0;
        this.n = parcel.readString();
    }
}
