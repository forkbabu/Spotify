package com.google.firebase.iid;

import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements f {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;

    o(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.google.android.gms.tasks.f
    public final g a(Object obj) {
        return this.a.s(this.b, this.c, this.d, (String) obj);
    }
}
