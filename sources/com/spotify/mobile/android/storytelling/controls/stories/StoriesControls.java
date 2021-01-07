package com.spotify.mobile.android.storytelling.controls.stories;

import android.content.Context;
import android.view.View;
import defpackage.gx1;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class StoriesControls implements nx1 {
    private final StoriesForegroundView a;
    private final StoriesBackgroundView b;

    public StoriesControls(Context context) {
        h.e(context, "context");
        this.a = new StoriesForegroundView(context);
        this.b = new StoriesBackgroundView(context);
    }

    @Override // defpackage.nx1
    public View a() {
        return this.a;
    }

    @Override // defpackage.nx1
    public void b(gx1 gx1) {
        h.e(gx1, "update");
        if (gx1 instanceof gx1.a) {
            this.a.K(((gx1.a) gx1).a());
        } else if (gx1 instanceof gx1.f) {
            this.a.V(((gx1.f) gx1).a());
        } else if (gx1 instanceof gx1.g) {
            this.a.W(((gx1.g) gx1).a());
        } else if (gx1 instanceof gx1.d) {
            this.a.P();
        } else if (gx1 instanceof gx1.e) {
            this.a.U();
        } else if (gx1 instanceof gx1.b) {
            this.a.G();
        } else if (gx1 instanceof gx1.c) {
            this.a.J();
        }
    }

    @Override // defpackage.nx1
    public View c() {
        return this.b;
    }

    @Override // defpackage.nx1
    public s<ox1> d() {
        s<ox1> y = s.y(new StoriesControls$userRequests$1(this));
        h.d(y, "Observable.create { emit…er = null\n        }\n    }");
        return y;
    }

    @Override // defpackage.nx1
    public void dispose() {
        this.a.E();
    }

    public StoriesBackgroundView e() {
        return this.b;
    }

    public StoriesForegroundView f() {
        return this.a;
    }
}
