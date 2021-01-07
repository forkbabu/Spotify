package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.a0;
import com.facebook.internal.f0;
import com.facebook.login.LoginClient;

class i extends r {
    public static final Parcelable.Creator<i> CREATOR = new a();

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public String f() {
        return "fb_lite_login";
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean k(LoginClient.d dVar) {
        String h = LoginClient.h();
        Intent e = a0.e(this.b.f(), dVar.a(), dVar.i(), h, dVar.k(), dVar.j(), dVar.e(), e(dVar.b()), dVar.c());
        a("e2e", h);
        int j = LoginClient.j();
        if (e != null) {
            try {
                this.b.c.H4(e, j, null);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // com.facebook.login.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
    }

    i(Parcel parcel) {
        super(parcel);
    }
}
