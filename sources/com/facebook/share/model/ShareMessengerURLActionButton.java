package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.h;

@Deprecated
public final class ShareMessengerURLActionButton extends h {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new a();
    private final Uri b;
    private final Uri c;
    private final boolean f;
    private final boolean n;
    private final WebviewHeightRatio o;

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    /* access modifiers changed from: package-private */
    public static class a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    public static final class b extends h.a<ShareMessengerURLActionButton, b> {
        private Uri b;
        private boolean c;

        public ShareMessengerURLActionButton e() {
            return new ShareMessengerURLActionButton(this, null);
        }

        public b f(boolean z) {
            this.c = z;
            return this;
        }

        public b g(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    ShareMessengerURLActionButton(b bVar, a aVar) {
        super(bVar);
        this.b = bVar.b;
        this.f = bVar.c;
        this.c = null;
        this.o = null;
        this.n = false;
    }

    public Uri b() {
        return this.c;
    }

    public boolean c() {
        return this.f;
    }

    public boolean e() {
        return this.n;
    }

    public Uri f() {
        return this.b;
    }

    public WebviewHeightRatio g() {
        return this.o;
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = true;
        this.f = parcel.readByte() != 0;
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.o = (WebviewHeightRatio) parcel.readSerializable();
        this.n = parcel.readByte() == 0 ? false : z;
    }
}
