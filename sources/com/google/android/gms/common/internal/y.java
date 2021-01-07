package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.j;

/* access modifiers changed from: package-private */
public final class y extends v {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ j b;

    y(Intent intent, j jVar) {
        this.a = intent;
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.internal.v
    public final void c() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
