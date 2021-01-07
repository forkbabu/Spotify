package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.b;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q2 implements b {
    private final z a;

    private q2(z zVar) {
        this.a = zVar;
    }

    static b a(z zVar) {
        return new q2(zVar);
    }

    @Override // com.google.android.play.core.tasks.b
    public final void onSuccess(Object obj) {
        this.a.e((List) obj);
    }
}
