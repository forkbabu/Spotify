package com.spotify.page.lifetime;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import kotlin.jvm.internal.h;

public final class a implements n {
    private final o a = new o(this);
    private final psd b;

    /* renamed from: com.spotify.page.lifetime.a$a  reason: collision with other inner class name */
    public static final class C0358a implements etd {
        final /* synthetic */ a a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0358a(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.etd
        public n a() {
            return this.a;
        }
    }

    public a(nmf<? super etd, ? extends psd> nmf) {
        h.e(nmf, "pageProducer");
        this.b = (psd) nmf.invoke(new C0358a(this));
    }

    @Override // androidx.lifecycle.n
    public Lifecycle A() {
        return this.a;
    }

    public final psd a() {
        return this.b;
    }

    public final void b() {
        this.b.b().a().start();
        this.a.k(Lifecycle.State.RESUMED);
    }

    public final void c() {
        this.a.k(Lifecycle.State.DESTROYED);
        this.b.b().a().stop();
    }
}
