package com.spotify.page.lifetime;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class PageLifetimeHolder {
    private final d a = kotlin.a.b(new PageLifetimeHolder$viewModelProvider$2(this));
    private a b;
    private Boolean c;
    private final Fragment d;
    private final cmf<a> e;

    private static final class a extends e0 {
        private final a c;

        public a(a aVar) {
            h.e(aVar, "pageLifetime");
            this.c = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.e0
        public void e() {
            this.c.c();
        }

        public final a g() {
            return this.c;
        }
    }

    /* access modifiers changed from: private */
    public final class b implements g0.b {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            h.e(cls, "modelClass");
            if (cls.isAssignableFrom(a.class)) {
                return new a(PageLifetimeHolder.c(PageLifetimeHolder.this));
            }
            StringBuilder V0 = je.V0("this factory cannot create ");
            V0.append(cls.getName());
            throw new IllegalStateException(V0.toString().toString());
        }
    }

    public PageLifetimeHolder(Fragment fragment, cmf<a> cmf) {
        h.e(fragment, "fragment");
        h.e(cmf, "createPageLifetime");
        this.d = fragment;
        this.e = cmf;
        fragment.A().a(new m(this) {
            /* class com.spotify.page.lifetime.PageLifetimeHolder.AnonymousClass1 */
            final /* synthetic */ PageLifetimeHolder a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.a = r1;
            }

            @w(Lifecycle.Event.ON_CREATE)
            public final void onCreate() {
                z42.a("Not called on main looper");
                PageLifetimeHolder.b(this.a).a(a.class);
            }
        });
    }

    public static final g0 b(PageLifetimeHolder pageLifetimeHolder) {
        return (g0) pageLifetimeHolder.a.getValue();
    }

    public static final a c(PageLifetimeHolder pageLifetimeHolder) {
        pageLifetimeHolder.getClass();
        z42.a("Not called on main looper");
        a aVar = pageLifetimeHolder.b;
        if (aVar == null) {
            aVar = pageLifetimeHolder.e.invoke();
            aVar.b();
        }
        pageLifetimeHolder.b = null;
        pageLifetimeHolder.c = Boolean.FALSE;
        return aVar;
    }

    public final void d() {
        z42.a("Not called on main looper");
        Boolean bool = this.c;
        if (bool == null) {
            this.c = Boolean.TRUE;
        } else if (h.a(bool, Boolean.FALSE)) {
            throw new IllegalStateException("allowing an unscoped lifetime at this point would cause a leak".toString());
        }
    }

    public final a e() {
        z42.a("Not called on main looper");
        if (this.d.e3()) {
            return ((a) ((g0) this.a.getValue()).a(a.class)).g();
        }
        z42.a("Not called on main looper");
        if (!(!h.a(this.c, Boolean.TRUE))) {
            a aVar = this.b;
            if (aVar != null) {
                return aVar;
            }
            a invoke = this.e.invoke();
            invoke.b();
            this.b = invoke;
            return invoke;
        }
        throw new IllegalStateException("not allowed to start the page lifetime at this point".toString());
    }
}
