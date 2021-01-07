package com.spotify.music.homecomponents.experimental.inlineonboarding.header;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import io.reactivex.disposables.b;
import io.reactivex.y;

public class HomeInlineOnboardingHeaderCommandHandler implements a71, m {
    public static final /* synthetic */ int o = 0;
    private final y a;
    private final lq8 b;
    private final HomeInlineOnboardingDoneButtonLogger c;
    private final hha f;
    private b n;

    public HomeInlineOnboardingHeaderCommandHandler(y yVar, lq8 lq8, n nVar, HomeInlineOnboardingDoneButtonLogger homeInlineOnboardingDoneButtonLogger, hha hha) {
        this.a = yVar;
        this.b = lq8;
        this.c = homeInlineOnboardingDoneButtonLogger;
        this.f = hha;
        nVar.A().a(this);
    }

    public /* synthetic */ void a() {
        this.f.k(true);
        this.f.a(true);
        this.f.b(true);
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        if (((o81) n61.d().events().get("inlineOnboardingDoneClick")) != null) {
            b bVar = this.n;
            if (bVar != null) {
                bVar.dispose();
            }
            this.c.a(n61);
            this.n = this.b.e().A(this.a).B().subscribe(new a(this), b.a);
        }
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        b bVar = this.n;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
