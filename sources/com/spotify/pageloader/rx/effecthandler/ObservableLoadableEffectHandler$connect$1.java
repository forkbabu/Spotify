package com.spotify.pageloader.rx.effecthandler;

import com.spotify.pageloader.l0;
import defpackage.hud;
import io.reactivex.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ObservableLoadableEffectHandler$connect$1 extends Lambda implements nmf<hud, l0<s<T>>> {
    final /* synthetic */ ObservableLoadableEffectHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ObservableLoadableEffectHandler$connect$1(ObservableLoadableEffectHandler observableLoadableEffectHandler) {
        super(1);
        this.this$0 = observableLoadableEffectHandler;
    }

    /* renamed from: a */
    public final l0<s<T>> invoke(hud hud) {
        h.e(hud, "$this$asLoadState");
        if (hud instanceof hud.c) {
            return l0.c();
        }
        if (hud instanceof hud.b) {
            return l0.b(this.this$0.b.e());
        }
        if (hud instanceof hud.e) {
            return l0.g();
        }
        if (hud instanceof hud.a) {
            return l0.a(this.this$0.b.e());
        }
        if (hud instanceof hud.d) {
            hud.d dVar = (hud.d) hud;
            return l0.f(dVar.a(), dVar.b());
        } else if (hud instanceof hud.f) {
            return l0.h(((hud.f) hud).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
