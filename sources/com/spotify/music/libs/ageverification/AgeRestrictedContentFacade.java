package com.spotify.music.libs.ageverification;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class AgeRestrictedContentFacade {
    protected final a a = new a();
    private final uy9 b;
    private final w c;
    private final Context d;
    private final n e;
    private final y f;

    public AgeRestrictedContentFacade(uy9 uy9, w wVar, Context context, n nVar, y yVar, final n nVar2) {
        this.b = uy9;
        this.c = wVar;
        this.d = context;
        this.e = nVar;
        this.f = yVar;
        nVar2.A().a(new m() {
            /* class com.spotify.music.libs.ageverification.AgeRestrictedContentFacade.AnonymousClass1 */

            @androidx.lifecycle.w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                nVar2.A().c(this);
            }

            @androidx.lifecycle.w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                AgeRestrictedContentFacade.this.a.f();
            }
        });
    }

    private void e(String str, String str2) {
        Context context = this.d;
        int i = AgeVerificationDialogActivity.H;
        Intent y = je.y(context, AgeVerificationDialogActivity.class, "EXTRA_ENTITY_URI", str);
        y.putExtra("EXTRA_COVER_ART_URI", str2);
        context.startActivity(y);
    }

    public /* synthetic */ void a(String str, Optional optional) {
        e(str, optional.isPresent() ? (String) optional.get() : null);
    }

    public /* synthetic */ void b(String str, Throwable th) {
        Logger.e(th, th.getMessage(), new Object[0]);
        e(str, null);
    }

    public s<Boolean> c() {
        return this.c.b().j0(this.b).E();
    }

    public void d(String str, String str2) {
        if (str2 == null) {
            this.a.b(this.e.e(str).J(2, TimeUnit.SECONDS, this.f).B(this.f).D(b.a).subscribe(new c(this, str), new a(this, str)));
        } else {
            e(str, str2);
        }
    }
}
