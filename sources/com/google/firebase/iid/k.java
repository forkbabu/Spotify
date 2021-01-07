package com.google.firebase.iid;

import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;

final /* synthetic */ class k implements a {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;

    k(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.tasks.a
    public final Object a(g gVar) {
        return this.a.u(this.b, this.c);
    }
}
