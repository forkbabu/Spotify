package com.spotify.mobile.android.service;

import com.spotify.cosmos.android.RxResolverImpl;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.y;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class w {
    private final RxPlayerState a;
    private final v b;
    private final com.spotify.mobile.android.rx.w c;
    private final yn1 d;
    private final RxResolverImpl e;
    private final ConnectManager f;
    private final g<PlayerState> g;
    private final nec h;

    w(RxPlayerState rxPlayerState, v vVar, com.spotify.mobile.android.rx.w wVar, yn1 yn1, RxResolverImpl rxResolverImpl, ConnectManager connectManager, g<PlayerState> gVar, nec nec) {
        this.a = rxPlayerState;
        this.b = vVar;
        this.c = wVar;
        this.d = yn1;
        this.e = rxResolverImpl;
        this.f = connectManager;
        this.g = gVar;
        this.h = nec;
    }

    public void a() {
        if (!ig0.b()) {
            g<PlayerState> gVar = this.g;
            if (gVar instanceof c0) {
                List<String> b2 = ((c0) gVar).b();
                if (!b2.isEmpty()) {
                    StringBuilder sb = new StringBuilder(100);
                    for (String str : b2) {
                        sb.append(str);
                        sb.append(',');
                    }
                    sb.setLength(sb.length() - 1);
                    Assertion.v(String.format("There were some unfinished player state subscriptions at the time of shutdown. %s", sb));
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.h.e());
            arrayList.addAll(this.b.unsubscribeAndReturnLeaks());
            arrayList.addAll(this.e.unsubscribeAndReturnLeaks());
            arrayList.addAll(this.a.unsubscribeAndReturnLeaks());
            arrayList.addAll(this.c.d());
            arrayList.addAll(this.d.b());
            arrayList.addAll(this.f.s());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                Assertion.w("Leaked subscription detected during shutdown", yVar.a(String.format("Leaked subscription detected during shutdown: %s. Subscription was originally created here:", yVar.b()), "The observable of the leaked subscription was originally created here:"));
            }
        }
    }
}
