package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.cast.framework.f;

public final class u extends qs implements IInterface {
    private final Context a;

    public u(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = context;
    }

    private final void D3() {
        if (!f.e(this.a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qs
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            D3();
            c b = c.b(this.a);
            GoogleSignInAccount c = b.c();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.z;
            if (c != null) {
                googleSignInOptions = b.d();
            }
            c a2 = a.a(this.a, googleSignInOptions);
            if (c != null) {
                a2.v();
                return true;
            }
            a2.w();
            return true;
        } else if (i != 2) {
            return false;
        } else {
            D3();
            o.c(this.a).a();
            return true;
        }
    }
}
