package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import com.spotify.pageloader.w0;
import kotlin.jvm.internal.h;

/* renamed from: oac  reason: default package */
public final class oac<T> implements btd {
    private PageLoaderView<T> a;
    private final zac b;
    private final psd c;
    private final t0<T> d;
    private final nac<T> e;

    /* renamed from: oac$a */
    static final class a<I, O> implements sg0<T, s0> {
        final /* synthetic */ oac a;

        a(oac oac) {
            this.a = oac;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.sg0
        public s0 apply(Object obj) {
            return this.a.e.b().invoke(obj);
        }
    }

    /* renamed from: oac$b */
    static final class b<T> implements tg0<w0> {
        final /* synthetic */ oac a;

        b(oac oac) {
            this.a = oac;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public w0 get() {
            return this.a.e.d().invoke();
        }
    }

    /* renamed from: oac$c */
    static final class c<T> implements tg0<s0> {
        final /* synthetic */ oac a;

        c(oac oac) {
            this.a = oac;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public s0 get() {
            return this.a.e.c().invoke();
        }
    }

    /* renamed from: oac$d */
    static final class d<I, O> implements sg0<T, s0> {
        final /* synthetic */ oac a;

        d(oac oac) {
            this.a = oac;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.sg0
        public s0 apply(Object obj) {
            return this.a.e.a().invoke();
        }
    }

    public oac(zac zac, psd psd, t0<T> t0Var, nac<T> nac) {
        h.e(zac, "pageLoaderFactory");
        h.e(psd, "page");
        h.e(t0Var, "pageLoader");
        h.e(nac, "config");
        this.b = zac;
        this.c = psd;
        this.d = t0Var;
        this.e = nac;
    }

    @Override // defpackage.btd
    public void a() {
        this.a = null;
    }

    @Override // defpackage.btd
    public View b() {
        return this.a;
    }

    @Override // defpackage.btd
    public void c(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater, ftd ftd) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        h.e(ftd, "env");
        PageLoaderView.a<T> b2 = this.b.b(this.c.a().e(), this.c.a().d());
        b2.e(new a(this));
        if (this.e.d() != null) {
            b2.i(new b(this));
        }
        if (this.e.c() != null) {
            b2.g(new c(this));
        }
        if (this.e.a() != null) {
            b2.b(new d(this));
        }
        PageLoaderView<T> a2 = b2.a(context);
        a2.j0(ftd.a(), this.d);
        this.a = a2;
    }
}
