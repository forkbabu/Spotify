package com.spotify.music.navigation;

import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.marquee.q;

public class l {
    private final h a;
    private final j b;
    private final m c;
    private final w d;

    public l(h hVar, j jVar, m mVar, w wVar) {
        this.a = hVar;
        this.b = jVar;
        this.c = mVar;
        this.d = wVar;
    }

    public void a(s sVar, Intent intent) {
        f fVar;
        boolean booleanExtra = intent.getBooleanExtra("extra_pop_current_fragment", false);
        String stringExtra = intent.getStringExtra("extra_fragment_tag");
        boolean booleanExtra2 = intent.getBooleanExtra("extra_clear_backstack", false);
        if (booleanExtra) {
            fVar = f.e();
        } else if (!MoreObjects.isNullOrEmpty(stringExtra)) {
            fVar = f.d(stringExtra);
        } else if (booleanExtra2) {
            fVar = f.c();
        } else {
            fVar = f.b();
        }
        g a2 = this.a.a(intent, sVar);
        c a3 = q.a(intent);
        this.d.a(sVar, intent);
        this.c.c(o.a(intent), "FragmentIdentifierPusher.push");
        this.b.a(fVar, sVar.e(), a2, a3);
    }
}
