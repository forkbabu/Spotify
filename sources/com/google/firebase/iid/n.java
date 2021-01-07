package com.google.firebase.iid;

import com.google.android.gms.tasks.g;
import com.google.firebase.iid.i0;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements i0.a {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;

    n(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final g a() {
        return this.a.t(this.b, this.c, this.d);
    }
}
