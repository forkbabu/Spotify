package com.spotify.music.explicitcontent;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class ExplicitContentFacade {
    private final f a;
    private final vg3 b;
    private final y c;
    private b d = EmptyDisposable.INSTANCE;

    public ExplicitContentFacade(f fVar, vg3 vg3, y yVar, final n nVar) {
        this.a = fVar;
        this.b = vg3;
        this.c = yVar;
        nVar.A().a(new m() {
            /* class com.spotify.music.explicitcontent.ExplicitContentFacade.AnonymousClass1 */

            @w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                nVar.A().c(this);
            }

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                ExplicitContentFacade.this.d.dispose();
            }
        });
    }

    public /* synthetic */ void b(String str, String str2, Boolean bool) {
        this.b.e(str, str2, bool.booleanValue());
    }

    public s<Boolean> c() {
        return this.a.b();
    }

    public s<Boolean> d() {
        return this.a.a();
    }

    public void e(String str, String str2) {
        this.d.dispose();
        this.d = this.a.a().T().B(this.c).I(2, TimeUnit.SECONDS).D(d.a).subscribe(new c(this, str, str2), b.a);
    }
}
