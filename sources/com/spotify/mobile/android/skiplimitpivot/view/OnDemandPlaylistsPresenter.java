package com.spotify.mobile.android.skiplimitpivot.view;

import com.spotify.remoteconfig.ek;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class OnDemandPlaylistsPresenter {
    private b a;
    private final z<b91> b;
    private final g c;
    private final y d;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements g<Throwable> {
        final /* synthetic */ OnDemandPlaylistsPresenter a;

        a(OnDemandPlaylistsPresenter onDemandPlaylistsPresenter) {
            this.a = onDemandPlaylistsPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            this.a.c.b();
        }
    }

    public OnDemandPlaylistsPresenter(z<b91> zVar, g gVar, y yVar, op1 op1, ek ekVar) {
        h.e(zVar, "dataSource");
        h.e(gVar, "viewBinder");
        h.e(yVar, "mainScheduler");
        h.e(op1, "skipLimitInAppMessageTriggerManager");
        h.e(ekVar, "skipLimitPivotToOnDemandProperties");
        this.b = zVar;
        this.c = gVar;
        this.d = yVar;
        if (ekVar.b()) {
            op1.a();
        }
    }

    public final void b() {
        this.c.c();
        this.a = this.b.B(this.d).subscribe(new f(new OnDemandPlaylistsPresenter$startLoading$1(this.c)), new a(this));
    }

    public final f c() {
        b bVar = this.a;
        if (bVar == null) {
            return null;
        }
        bVar.dispose();
        return f.a;
    }
}
