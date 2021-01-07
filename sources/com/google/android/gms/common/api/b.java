package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.k1;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.tasks.h;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public class b<O extends a.d> implements d<O> {
    private final Context a;
    private final String b;
    private final a<O> c;
    private final O d;
    private final com.google.android.gms.common.api.internal.b<O> e;
    private final Looper f;
    private final int g;
    @NotOnlyInitialized
    private final c h = new e0(this);
    private final com.google.android.gms.common.api.internal.a i;
    private final g j;

    public static class a {
        @RecentlyNonNull
        public static final a c = new C0096a().a();
        @RecentlyNonNull
        public final com.google.android.gms.common.api.internal.a a;
        @RecentlyNonNull
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.b$a$a  reason: collision with other inner class name */
        public static class C0096a {
            private com.google.android.gms.common.api.internal.a a;
            private Looper b;

            @RecentlyNonNull
            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, null, this.b);
            }

            @RecentlyNonNull
            public C0096a b(@RecentlyNonNull Looper looper) {
                com.google.android.exoplayer2.util.g.k(looper, "Looper must not be null.");
                this.b = looper;
                return this;
            }

            @RecentlyNonNull
            public C0096a c(@RecentlyNonNull com.google.android.gms.common.api.internal.a aVar) {
                com.google.android.exoplayer2.util.g.k(aVar, "StatusExceptionMapper must not be null.");
                this.a = aVar;
                return this;
            }
        }

        a(com.google.android.gms.common.api.internal.a aVar, Account account, Looper looper) {
            this.a = aVar;
            this.b = looper;
        }
    }

    public b(@RecentlyNonNull Activity activity, @RecentlyNonNull a<O> aVar, @RecentlyNonNull O o, @RecentlyNonNull a aVar2) {
        com.google.android.exoplayer2.util.g.k(activity, "Null activity is not permitted.");
        com.google.android.exoplayer2.util.g.k(aVar, "Api must not be null.");
        com.google.android.exoplayer2.util.g.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        this.a = applicationContext;
        String t = t(activity);
        this.b = t;
        this.c = aVar;
        this.d = o;
        this.f = aVar2.b;
        com.google.android.gms.common.api.internal.b<O> a2 = com.google.android.gms.common.api.internal.b.a(aVar, o, t);
        this.e = a2;
        g f2 = g.f(applicationContext);
        this.j = f2;
        this.g = f2.r();
        this.i = aVar2.a;
        if (!(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            k1.n(activity, f2, a2);
        }
        f2.j(this);
    }

    private final <TResult, A extends a.b> com.google.android.gms.tasks.g<TResult> s(int i2, s<A, TResult> sVar) {
        h hVar = new h();
        this.j.l(this, i2, sVar, hVar, this.i);
        return hVar.a();
    }

    private static String t(Object obj) {
        if (!e.d()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.d
    @RecentlyNonNull
    public com.google.android.gms.common.api.internal.b<O> b() {
        return this.e;
    }

    @RecentlyNonNull
    public c c() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public c.a d() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount d0;
        GoogleSignInAccount d02;
        c.a aVar = new c.a();
        O o = this.d;
        if (!(o instanceof a.d.b) || (d02 = ((a.d.b) o).d0()) == null) {
            O o2 = this.d;
            account = o2 instanceof a.d.AbstractC0095a ? ((a.d.AbstractC0095a) o2).G1() : null;
        } else {
            account = d02.G1();
        }
        aVar.c(account);
        O o3 = this.d;
        if (!(o3 instanceof a.d.b) || (d0 = ((a.d.b) o3).d0()) == null) {
            set = Collections.emptySet();
        } else {
            set = d0.Q1();
        }
        aVar.e(set);
        aVar.d(this.a.getClass().getName());
        aVar.b(this.a.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> com.google.android.gms.tasks.g<TResult> e(@RecentlyNonNull s<A, TResult> sVar) {
        return s(2, sVar);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T f(@RecentlyNonNull T t) {
        t.l();
        this.j.k(this, 0, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> com.google.android.gms.tasks.g<TResult> g(@RecentlyNonNull s<A, TResult> sVar) {
        return s(0, sVar);
    }

    @RecentlyNonNull
    public <A extends a.b> com.google.android.gms.tasks.g<Void> h(@RecentlyNonNull p<A, ?> pVar) {
        com.google.android.exoplayer2.util.g.k(pVar.a.b(), "Listener has already been released.");
        com.google.android.exoplayer2.util.g.k(pVar.b.a(), "Listener has already been released.");
        return this.j.h(this, pVar.a, pVar.b, pVar.c);
    }

    @RecentlyNonNull
    public com.google.android.gms.tasks.g<Boolean> i(@RecentlyNonNull k.a<?> aVar) {
        com.google.android.exoplayer2.util.g.k(aVar, "Listener key cannot be null.");
        return this.j.g(this, aVar, 0);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T j(@RecentlyNonNull T t) {
        t.l();
        this.j.k(this, 1, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> com.google.android.gms.tasks.g<TResult> k(@RecentlyNonNull s<A, TResult> sVar) {
        return s(1, sVar);
    }

    @RecentlyNonNull
    public O l() {
        return this.d;
    }

    @RecentlyNonNull
    public Context m() {
        return this.a;
    }

    @RecentlyNonNull
    public Looper n() {
        return this.f;
    }

    @RecentlyNonNull
    public <L> k<L> o(@RecentlyNonNull L l, @RecentlyNonNull String str) {
        return l.a(l, this.f, str);
    }

    public final int p() {
        return this.g;
    }

    public final a.f q(Looper looper, g.a<O> aVar) {
        c a2 = d().a();
        a.AbstractC0094a<?, O> a3 = this.c.a();
        com.google.android.exoplayer2.util.g.l(a3);
        a.f a4 = a3.a(this.a, looper, a2, this.d, aVar, aVar);
        String str = this.b;
        if (str != null && (a4 instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) a4).G(str);
        }
        if (str != null && (a4 instanceof m)) {
            ((m) a4).getClass();
        }
        return a4;
    }

    public final p0 r(Context context, Handler handler) {
        return new p0(context, handler, d().a());
    }

    public b(@RecentlyNonNull Context context, @RecentlyNonNull a<O> aVar, @RecentlyNonNull O o, @RecentlyNonNull a aVar2) {
        com.google.android.exoplayer2.util.g.k(context, "Null context is not permitted.");
        com.google.android.exoplayer2.util.g.k(aVar, "Api must not be null.");
        com.google.android.exoplayer2.util.g.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        String t = t(context);
        this.b = t;
        this.c = aVar;
        this.d = o;
        this.f = aVar2.b;
        this.e = com.google.android.gms.common.api.internal.b.a(aVar, o, t);
        g f2 = g.f(applicationContext);
        this.j = f2;
        this.g = f2.r();
        this.i = aVar2.a;
        f2.j(this);
    }
}
