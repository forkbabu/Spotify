package com.spotify.music.features.queue.v2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.p;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class o extends RecyclerView.e<h90<y90>> {
    private final List<ContextTrack> c = new ArrayList();
    private final PublishProcessor<a> f;
    private final b n;
    private final p o;
    private final Context p;
    private final Picasso q;

    public static final class a {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackMoved(from=");
            V0.append(this.a);
            V0.append(", to=");
            return je.B0(V0, this.b, ")");
        }
    }

    public static final class b extends p.d {
        private int d = -1;
        private int e = -1;
        final /* synthetic */ o f;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(o oVar) {
            this.f = oVar;
        }

        @Override // androidx.recyclerview.widget.p.d
        public int f(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            h.e(recyclerView, "recyclerView");
            h.e(b0Var, "viewHolder");
            return p.d.m(3, 0);
        }

        @Override // androidx.recyclerview.widget.p.d
        public boolean k() {
            return false;
        }

        @Override // androidx.recyclerview.widget.p.d
        public boolean l() {
            return false;
        }

        @Override // androidx.recyclerview.widget.p.d
        public boolean o(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
            h.e(recyclerView, "recyclerView");
            h.e(b0Var, "viewHolder");
            h.e(b0Var2, "target");
            this.d = b0Var2.w();
            o.b0(this.f, b0Var.w(), b0Var2.w());
            return true;
        }

        @Override // androidx.recyclerview.widget.p.d
        public void p(RecyclerView.b0 b0Var, int i) {
            if (i == 2 && b0Var != null) {
                this.e = b0Var.w();
            } else if (i == 0 && this.e != -1) {
                this.f.f.s0(new a(this.e, this.d));
                this.e = -1;
            }
        }

        @Override // androidx.recyclerview.widget.p.d
        public void q(RecyclerView.b0 b0Var, int i) {
            h.e(b0Var, "viewHolder");
        }
    }

    public static final class c extends m.b {
        final /* synthetic */ o a;
        final /* synthetic */ List b;

        c(o oVar, List list) {
            this.a = oVar;
            this.b = list;
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean a(int i, int i2) {
            ContextTrack contextTrack = (ContextTrack) this.a.c.get(i);
            ContextTrack contextTrack2 = (ContextTrack) this.b.get(i2);
            return h.a(contextTrack.uri(), contextTrack.uri()) && h.a(contextTrack.metadata(), contextTrack2.metadata()) && h.a(contextTrack.provider(), contextTrack2.provider());
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean b(int i, int i2) {
            ContextTrack contextTrack = (ContextTrack) this.a.c.get(i);
            ContextTrack contextTrack2 = (ContextTrack) this.b.get(i2);
            return h.a(contextTrack.uid(), contextTrack2.uid()) && h.a(kxd.n(contextTrack), kxd.n(contextTrack2));
        }

        @Override // androidx.recyclerview.widget.m.b
        public int d() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public int e() {
            return this.a.c.size();
        }
    }

    static final class d<T> implements n<a> {
        public static final d a = new d();

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(a aVar) {
            a aVar2 = aVar;
            h.e(aVar2, "it");
            return aVar2.a() != aVar2.b();
        }
    }

    public o(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        this.p = context;
        this.q = picasso;
        PublishProcessor<a> r0 = PublishProcessor.r0();
        h.d(r0, "PublishProcessor.create()");
        this.f = r0;
        b bVar = new b(this);
        this.n = bVar;
        this.o = new p(bVar);
    }

    public static final void b0(o oVar, int i, int i2) {
        oVar.c.add(i2, oVar.c.remove(i));
        oVar.D(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void J(RecyclerView recyclerView) {
        h.e(recyclerView, "recyclerView");
        this.o.g(recyclerView);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h90<y90> h90, int i) {
        h90<y90> h902 = h90;
        h.e(h902, "holder");
        y90 j0 = h902.j0();
        ContextTrack contextTrack = this.c.get(i);
        j0.setTitle(contextTrack.metadata().get("title"));
        j0.setSubtitle(contextTrack.metadata().get("artist_name"));
        z m = this.q.m(contextTrack.metadata().get("image_small_url"));
        m.s(C0707R.drawable.album_placeholder);
        h.d(j0, "viewBinder");
        m.m(j0.getImageView());
        j0.W1().setOnTouchListener(new p(this, h902));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h90<y90> M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        y90 i2 = e90.d().i(this.p, viewGroup);
        h.d(i2, "row");
        Context context = this.p;
        i2.z0(z42.h(context, z42.e(context, SpotifyIconV2.DRAG_AND_DROP)));
        h90<y90> h0 = h90.h0(i2);
        h.d(h0, "GlueViewHolder.forViewBinder(row)");
        return h0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void N(RecyclerView recyclerView) {
        h.e(recyclerView, "recyclerView");
        this.o.g(null);
    }

    public final void c0(List<? extends ContextTrack> list) {
        h.e(list, "list");
        m.c b2 = m.b(new c(this, list), true);
        h.d(b2, "DiffUtil.calculateDiff(o…\n            }\n        })");
        this.c.clear();
        this.c.addAll(list);
        b2.a(new androidx.recyclerview.widget.b(this));
    }

    public final g<a> f0() {
        g<a> C = this.f.C(d.a);
        h.d(C, "processor.filter { it.from != it.to }");
        return C;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
