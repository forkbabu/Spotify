package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.internal.common.m;
import java.util.Arrays;
import java.util.concurrent.Executor;

class w implements f<q00, Void> {
    final /* synthetic */ Executor a;
    final /* synthetic */ m.j b;

    w(m.j jVar, Executor executor) {
        this.b = jVar;
        this.a = executor;
    }

    /* Return type fixed from 'com.google.android.gms.tasks.g' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.tasks.f
    public g<Void> a(q00 q00) {
        q00 q002 = q00;
        if (q002 == null) {
            ty.f().h("Received null app settings, cannot send reports at crash time.");
            return j.e(null);
        }
        m.c(m.this, q002, true);
        return j.f(Arrays.asList(m.d(m.this), m.this.t.k(this.a, DataTransportState.d(q002))));
    }
}
