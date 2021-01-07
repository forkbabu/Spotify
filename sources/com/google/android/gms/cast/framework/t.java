package com.google.android.gms.cast.framework;

import android.os.Bundle;
import com.google.android.gms.tasks.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements e {
    private final a a;

    t(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.i((Bundle) obj);
    }
}
