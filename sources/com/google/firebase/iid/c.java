package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;

final /* synthetic */ class c implements a {
    private final Context a;
    private final Intent b;

    c(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // com.google.android.gms.tasks.a
    public final Object a(g gVar) {
        return f.c(this.a, this.b, gVar);
    }
}
