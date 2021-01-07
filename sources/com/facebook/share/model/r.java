package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

public final class r extends ShareMedia {
    public static final Parcelable.Creator<r> CREATOR = new a();
    private final Uri b;

    static class a implements Parcelable.Creator<r> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public r[] newArray(int i) {
            return new r[i];
        }
    }

    public static final class b extends ShareMedia.a<r, b> {
        private Uri b;

        /* access modifiers changed from: package-private */
        public b d(Parcel parcel) {
            r rVar = (r) parcel.readParcelable(r.class.getClassLoader());
            if (rVar == null) {
                return this;
            }
            b bVar = (b) b(rVar);
            bVar.b = rVar.c();
            return bVar;
        }
    }

    r(b bVar, a aVar) {
        super(bVar);
        this.b = bVar.b;
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type a() {
        return ShareMedia.Type.VIDEO;
    }

    public Uri c() {
        return this.b;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
    }

    r(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
