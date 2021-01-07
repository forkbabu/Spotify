package com.spotify.mobile.android.hubframework.defaults.view;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.d;
import com.spotify.mobile.android.hubframework.defaults.view.f;
import com.spotify.mobile.android.util.ui.k;

public final class HubsGlueViewBinderFactories {

    public enum HeaderPolicy {
        ALWAYS_ON_TOP,
        PORTRAIT_ONLY
    }

    public interface b {
        e b();

        e c(Fragment fragment);
    }

    public interface c {
        b a(m mVar);
    }

    public interface d {
        c d(HeaderPolicy headerPolicy);
    }

    public interface e {
        public static final RecyclerView.q a = new a();

        static class a extends RecyclerView.q {
            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void a(RecyclerView recyclerView, int i) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void c(RecyclerView recyclerView, int i, int i2) {
            }
        }

        e61 a(Context context, w51 w51);

        e61 b(Context context, w51 w51, RecyclerView.q qVar);
    }

    /* access modifiers changed from: package-private */
    public static final class f {
        private final Fragment a;
        private final HeaderPolicy b;

        f(Fragment fragment, HeaderPolicy headerPolicy, k kVar, Boolean bool, a aVar) {
            headerPolicy.getClass();
            this.b = headerPolicy;
            this.a = fragment;
        }

        /* access modifiers changed from: package-private */
        public Fragment a() {
            return this.a;
        }

        public k b() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public HeaderPolicy d() {
            return this.b;
        }
    }

    private static final class g implements d, b, c {
        private HeaderPolicy a = HeaderPolicy.PORTRAIT_ONLY;
        private final com.spotify.music.libs.viewuri.c b;
        private m c;

        public g(com.spotify.music.libs.viewuri.c cVar) {
            this.b = cVar;
        }

        private e e(Fragment fragment) {
            f fVar = new f(fragment, this.a, null, null, null);
            f.c c2 = f.c.c(fVar, this.c, this.b);
            return fVar.d() == HeaderPolicy.PORTRAIT_ONLY ? g.c(c2, d.b.c(this.c)) : c2;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.c
        public b a(m mVar) {
            this.c = mVar;
            return this;
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.b
        public e b() {
            return e(null);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.b
        public e c(Fragment fragment) {
            fragment.getClass();
            return e(fragment);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.d
        public c d(HeaderPolicy headerPolicy) {
            this.a = headerPolicy;
            return this;
        }
    }

    static boolean a(RecyclerView recyclerView) {
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (recyclerView.X(childAt) == 0) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            if (layoutManager.e0(childAt) == 0) {
                return false;
            }
        }
        return true;
    }

    public static e b(m mVar) {
        return d.b.c(mVar);
    }

    public static d c(com.spotify.music.libs.viewuri.c cVar) {
        return new g(cVar);
    }
}
