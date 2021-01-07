package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.j;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.squareup.picasso.g;

@Deprecated
public abstract class c<T extends j> {

    public static class a<T extends j> {
        private final Context a;
        private final e b;

        a(Context context, e eVar) {
            this.a = context;
            this.b = eVar;
        }

        public c<T> a(Fragment fragment) {
            boolean z = this.b.k;
            u k = l70.k(this.a);
            n nVar = (n) MoreObjects.firstNonNull(null, new a());
            if (z) {
                return new d(GluePrettyListCompatStates.PRETTY_RECYCLER_VIEW, this.b, this.a, fragment, k, nVar);
            }
            return new d(GluePrettyListCompatStates.PRETTY_LIST_VIEW, this.b, this.a, fragment, k, nVar);
        }

        public a<T> b(boolean z) {
            this.b.h = z;
            return this;
        }

        public a<T> c(boolean z) {
            this.b.j = z;
            return this;
        }

        public a<T> d(boolean z) {
            this.b.l = z;
            return this;
        }

        public a<T> e(boolean z) {
            this.b.k = z;
            return this;
        }

        public a<T> f(View view) {
            this.b.f = view;
            return this;
        }

        public a<T> g(com.spotify.paste.widgets.a aVar) {
            this.b.i = aVar;
            return this;
        }

        public a<T> h(View view) {
            this.b.g = view;
            return this;
        }
    }

    public static class b {
        private final Context a;
        private final e b;

        b(Context context, e eVar) {
            this.a = context;
            this.b = eVar;
        }

        public a<g> a() {
            e eVar = this.b;
            eVar.c = 0;
            eVar.d = null;
            eVar.e = 0;
            return new a<>(this.a, eVar);
        }

        public a<g> b(Button button, int i) {
            e eVar = this.b;
            eVar.c = 0;
            eVar.d = button;
            eVar.e = i;
            return new a<>(this.a, eVar);
        }

        public a<h> c() {
            e eVar = this.b;
            eVar.c = 5;
            eVar.d = null;
            eVar.e = 0;
            return new a<>(this.a, eVar);
        }

        public a<i> d() {
            e eVar = this.b;
            eVar.c = 1;
            eVar.d = null;
            eVar.e = 0;
            return new a<>(this.a, eVar);
        }

        public a<i> e(Button button, int i) {
            e eVar = this.b;
            eVar.c = 1;
            eVar.d = button;
            eVar.e = i;
            return new a<>(this.a, eVar);
        }
    }

    /* renamed from: com.spotify.android.glue.patterns.prettylist.compat.c$c  reason: collision with other inner class name */
    public static class C0149c {
        private final Context a;
        private final e b;

        C0149c(Context context, int i) {
            this.a = context;
            e eVar = new e();
            this.b = eVar;
            eVar.a = i;
        }

        public b a(int i) {
            e eVar = this.b;
            eVar.b = i;
            return new b(this.a, eVar);
        }

        public b b() {
            e eVar = this.b;
            eVar.b = 0;
            return new b(this.a, eVar);
        }

        public b c() {
            e eVar = this.b;
            eVar.b = 1;
            return new b(this.a, eVar);
        }
    }

    public static C0149c b(Context context) {
        return new C0149c(context, 0);
    }

    public static C0149c c(Context context) {
        return new C0149c(context, 1);
    }

    public static C0149c d(Context context) {
        return new C0149c(context, 2);
    }

    public g a() {
        return null;
    }

    public abstract ImageView e();

    public abstract ImageView f();

    public RecyclerView g() {
        throw new UnsupportedOperationException("not supported");
    }

    public abstract StickyListView h();

    public abstract View i();

    public abstract T j();

    public abstract void k(a0 a0Var, Context context);

    public abstract void l(boolean z);

    public abstract void m(boolean z);

    public abstract void n(View view);

    public abstract void o(int i);

    public abstract void p(int i);

    public abstract void q(View view);
}
