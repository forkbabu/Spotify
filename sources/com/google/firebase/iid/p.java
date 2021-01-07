package com.google.firebase.iid;

import com.google.firebase.iid.FirebaseInstanceId;

final /* synthetic */ class p implements p10 {
    private final FirebaseInstanceId.a a;

    p(FirebaseInstanceId.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.p10
    public final void a(o10 o10) {
        FirebaseInstanceId.a aVar = this.a;
        synchronized (aVar) {
            if (aVar.b()) {
                FirebaseInstanceId.b(FirebaseInstanceId.this);
            }
        }
    }
}
