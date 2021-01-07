package com.spotify.effortlesslogin.prerequisites;

import com.spotify.effortlesslogin.backend.e;
import com.spotify.mobile.android.util.ui.m;
import io.reactivex.s;
import io.reactivex.v;

public class i extends m {
    private final k a;
    private final e b;
    private final z1e c;

    public i(k kVar, e eVar, z1e z1e) {
        this.a = kVar;
        this.b = eVar;
        this.c = z1e;
    }

    public /* synthetic */ v E2(b2e b2e) {
        return this.b.c(b2e.d());
    }

    public v F2(Boolean bool) {
        if (bool.booleanValue()) {
            return this.c.b().W(new e(this), false, Integer.MAX_VALUE).j0(c.a);
        }
        return s.i0(EffortlessLoginPrerequisitesResult.createFailure());
    }

    public s<EffortlessLoginPrerequisitesResult> G2() {
        return s.i0(Boolean.valueOf(this.a.a())).W(new d(this), false, Integer.MAX_VALUE);
    }
}
