package com.google.android.gms.cast.framework;

import android.os.Bundle;
import com.google.android.gms.tasks.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements e {
    private final a a;

    l(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.g((Bundle) obj);
    }
}
