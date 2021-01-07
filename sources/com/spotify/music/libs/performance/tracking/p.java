package com.spotify.music.libs.performance.tracking;

import android.content.Intent;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;

public final class p implements ColdStartTracker.a {
    private final ColdStartTracker a;
    private final String b;
    private final long c;

    public p(ColdStartTracker coldStartTracker, String str, long j) {
        this.a = coldStartTracker;
        this.b = str;
        this.c = j;
    }

    public void a(long j, long j2, Intent intent) {
        boolean z = true;
        if (j2 - j < this.c) {
            if (intent == null || intent.getComponent() == null || !"android.intent.action.MAIN".equals(intent.getAction()) || !intent.getComponent().getClassName().equals(this.b) || intent.getData() != null) {
                z = false;
            }
            if (!z) {
                this.a.c("non_default_uri_requested", null);
                return;
            }
            return;
        }
        this.a.c("no_main_activity", null);
    }
}
