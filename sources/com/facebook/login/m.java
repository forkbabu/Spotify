package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.a0;
import com.facebook.internal.f;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.login.LoginClient;

class m extends r {
    public static final Parcelable.Creator<m> CREATOR = new a();

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    m(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public String f() {
        return "katana_proxy_auth";
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean k(LoginClient.d dVar) {
        boolean z = k.o && f.a() != null && dVar.h().d();
        String h = LoginClient.h();
        Intent i = a0.i(this.b.f(), dVar.a(), dVar.i(), h, dVar.k(), dVar.j(), dVar.e(), e(dVar.b()), dVar.c(), z);
        a("e2e", h);
        int j = LoginClient.j();
        if (i == null) {
            return false;
        }
        try {
            this.b.c.H4(i, j, null);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // com.facebook.login.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
    }

    m(Parcel parcel) {
        super(parcel);
    }
}
