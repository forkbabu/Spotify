package defpackage;

import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.f0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.playlist.ui.m0;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.music.podcastentityrow.b0;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import defpackage.xi6;
import java.util.Collections;
import java.util.List;
import kotlin.f;

/* renamed from: zi6  reason: default package */
final class zi6 extends xi6 {
    static final int A = (xi6.class.hashCode() + 1);
    static final int B = (xi6.class.hashCode() + 2);
    static final int C = (xi6.class.hashCode() + 3);
    static final int z = xi6.class.hashCode();
    private final c0 c;
    private final d f;
    private final l0<ContextMenuItem> n;
    private final a o;
    private final ajf<b4<ContextMenuItem>> p;
    private final b0 q;
    private final d0 r;
    private final ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> s;
    private final c t;
    private final f0 u;
    private final gxc v;
    private List<l> w = Collections.emptyList();
    private ItemConfiguration x = ItemConfiguration.a().build();
    private boolean y;

    zi6(d dVar, l0.a<ContextMenuItem> aVar, a aVar2, b0 b0Var, ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> componentFactory, c cVar, f0 f0Var, gxc gxc, d0 d0Var, ajf<b4<ContextMenuItem>> ajf, c0 c0Var) {
        this.c = c0Var;
        this.n = aVar.a(d0Var, ajf);
        this.o = aVar2;
        this.p = ajf;
        this.q = b0Var;
        this.r = d0Var;
        this.s = componentFactory;
        this.f = dVar;
        this.t = cVar;
        this.u = f0Var;
        this.v = gxc;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(xi6.b bVar, int i) {
        xi6.b bVar2 = bVar;
        this.c.a(i);
        l lVar = this.w.get(i);
        ContextMenuItem a = this.o.a(bVar2.a.getContext(), lVar, i);
        if (w(i) == C) {
            Component component = (Component) bVar2.m0();
            component.render(this.u.a(lVar, this.x, this.f.b(lVar)));
            component.onEvent(new si6(this, bVar2, lVar, a, i));
            if (this.x.j() && i == 0) {
                this.v.a(bVar2.a);
            }
        } else {
            ((m0) this.n).a(bVar2, this.x, lVar, a, new yi6(this, lVar), this.y, i);
        }
        if (this.x.d()) {
            bVar2.h0(lVar, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public xi6.b M(ViewGroup viewGroup, int i) {
        if (i == z) {
            return new xi6.b(Rows.c(viewGroup.getContext(), viewGroup));
        }
        if (i == C) {
            return new xi6.b(this.s.make());
        }
        if (i == A) {
            return new xi6.b(Rows.d(viewGroup.getContext(), viewGroup));
        }
        if (i == B) {
            return new xi6.b(this.q.a(viewGroup));
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public f Y(xi6.b bVar, l lVar, ContextMenuItem contextMenuItem, int i, TrackRow.Events events) {
        switch (events.ordinal()) {
            case 0:
                this.r.d(i, lVar);
                break;
            case 1:
            case 2:
                ContextMenuFragment.b5(bVar.a.getContext(), this.p.get(), contextMenuItem, this.t);
                break;
            case 3:
                this.r.i(i, lVar);
                break;
            case 4:
            case 5:
                this.r.g(i, lVar);
                break;
            case 6:
                this.r.b(i, lVar);
                break;
        }
        return f.a;
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void c(j jVar, List<l> list) {
        list.getClass();
        this.w = list;
        z();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$e' to match base method */
    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public xi6 e() {
        return this;
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void i(ItemConfiguration itemConfiguration) {
        if (this.x != itemConfiguration) {
            this.x = itemConfiguration;
            z();
        }
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void j(String str, boolean z2) {
        if (this.f.c(str) || this.y != z2) {
            z();
        }
        this.y = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        l lVar = this.w.get(i);
        long hashCode = (long) (hashCode() ^ lVar.getUri().hashCode());
        String f2 = lVar.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        l lVar = this.w.get(i);
        if (lVar.c() != null) {
            return B;
        }
        if (lVar.g() != null && this.x.l() != ItemConfiguration.PreviewOverlay.NONE) {
            return A;
        }
        if (lVar.c() != null || !this.x.n()) {
            return z;
        }
        return C;
    }
}
