package com.spotify.music.builtinauth.authenticator;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.net.HttpCookie;
import java.util.Arrays;

public class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();
    public final String a;
    public final AuthorizationRequest.ResponseType b;
    public final String c;
    public final ClientIdentity f;
    public final String[] n;
    public final HttpCookie o;

    static class a implements Parcelable.Creator<d0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d0[] newArray(int i) {
            return new d0[i];
        }
    }

    public d0(String str, AuthorizationRequest.ResponseType responseType, String str2, ClientIdentity clientIdentity, HttpCookie httpCookie, String[] strArr) {
        this.a = str;
        this.b = responseType;
        this.c = str2;
        this.f = clientIdentity;
        this.o = httpCookie;
        this.n = strArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!rw.equal(this.a, d0Var.a) || !rw.equal(this.b, d0Var.b) || !rw.equal(this.c, d0Var.c) || !rw.equal(this.f, d0Var.f) || !Arrays.equals(this.n, d0Var.n) || !rw.equal(this.o, d0Var.o)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f, Integer.valueOf(Arrays.hashCode(this.n)), this.o});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        gf0.q(parcel, this.b);
        parcel.writeString(this.c);
        gf0.v(parcel, this.f, i);
        parcel.writeStringArray(this.n);
        parcel.writeString(this.o.getName());
        parcel.writeString(this.o.getValue());
        parcel.writeString(this.o.getDomain());
        parcel.writeLong(this.o.getMaxAge());
        parcel.writeInt(this.o.getSecure() ? 1 : 0);
    }

    protected d0(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (AuthorizationRequest.ResponseType) gf0.j(parcel, AuthorizationRequest.ResponseType.class);
        this.c = parcel.readString();
        this.f = (ClientIdentity) gf0.n(parcel, ClientIdentity.CREATOR);
        this.n = parcel.createStringArray();
        HttpCookie httpCookie = new HttpCookie(parcel.readString(), parcel.readString());
        this.o = httpCookie;
        httpCookie.setDomain(parcel.readString());
        httpCookie.setMaxAge(parcel.readLong());
        httpCookie.setSecure(parcel.readInt() != 0);
    }
}
