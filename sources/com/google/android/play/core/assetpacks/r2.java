package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r2 implements a {
    static final a a = new r2();

    private r2() {
    }

    @Override // com.google.android.play.core.tasks.a
    public final void b(Exception exc) {
        s2.e.g(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
