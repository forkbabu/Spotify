package com.spotify.mobile.android.service.media;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class x1 implements w1 {
    private final y a;
    private final y b;
    private final Set<nd1> c;
    private final w d;
    private final g<SessionState> e;
    private final pk1 f;

    public x1(y yVar, y yVar2, Set<nd1> set, w wVar, g<SessionState> gVar, pk1 pk1) {
        this.a = yVar;
        this.b = yVar2;
        this.c = set;
        this.d = wVar;
        this.e = gVar;
        this.f = pk1;
    }

    public static z c(x1 x1Var, BrowserParams browserParams) {
        qh1 qh1;
        nd1 nd1;
        Iterator<nd1> it = x1Var.c.iterator();
        while (true) {
            qh1 = null;
            if (!it.hasNext()) {
                nd1 = null;
                break;
            }
            nd1 = it.next();
            if (nd1.b(browserParams)) {
                break;
            }
        }
        if (nd1 != null) {
            qh1 = nd1.a();
        }
        if (qh1 == null) {
            Logger.d("could not find a loader for browser params, %s", browserParams);
            return z.z(new ArrayList(0));
        } else if (browserParams.m()) {
            return x1Var.d.b().N0(1).B0().s(new i(qh1, browserParams));
        } else {
            Logger.l("Delegating the loading to %s", qh1);
            return qh1.b(browserParams);
        }
    }

    @Override // com.spotify.mobile.android.service.media.w1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Bundle bundle, long j, long j2) {
        return new v(this.e.O(q1.a)).I0(this.b).N0(1).W(new e(this, browserParams, bundle), false, Integer.MAX_VALUE).a0(new g(this)).N0(1).B0().A(d.a).B(this.a).m(new h(browserParams));
    }

    public /* synthetic */ io.reactivex.v b(BrowserParams browserParams, Bundle bundle, Boolean bool) {
        Logger.l("Loading content when logged in ? %s", bool);
        return this.f.a(bool.booleanValue()).N0(1).j0(new f(browserParams, bool, bundle));
    }
}
