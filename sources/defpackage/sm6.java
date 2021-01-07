package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.playlist.ui.m0;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.playlist.models.l;
import java.util.Collections;
import java.util.List;

/* renamed from: sm6  reason: default package */
public class sm6 extends RecyclerView.e<b> {
    static final int u = sm6.class.hashCode();
    private List<l> c = Collections.emptyList();
    private ItemConfiguration f = ItemConfiguration.a().build();
    private boolean n;
    private final d o;
    private final l0<ContextMenuItem> p;
    private final om6 q;
    private final d0 r;
    private final com.spotify.music.features.playlistentity.itemlist.adapter.a s;
    private boolean t;

    /* renamed from: sm6$a */
    public interface a {
        sm6 a(d0 d0Var, ajf<b4<ContextMenuItem>> ajf, boolean z);
    }

    /* renamed from: sm6$b */
    public static class b extends vh6 {
        protected b(ViewProvider viewProvider) {
            super(viewProvider);
        }
    }

    public sm6(d dVar, com.spotify.music.features.playlistentity.itemlist.adapter.a aVar, l0.a<ContextMenuItem> aVar2, pm6 pm6, c cVar, d0 d0Var, ajf<b4<ContextMenuItem>> ajf, boolean z) {
        this.p = aVar2.a(d0Var, ajf);
        this.q = pm6.b(ajf, cVar);
        this.r = d0Var;
        this.s = aVar;
        this.o = dVar;
        this.t = z;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(b bVar, int i) {
        b bVar2 = bVar;
        l lVar = this.c.get(i);
        ContextMenuItem a2 = this.s.a(bVar2.a.getContext(), lVar, i);
        ((m0) this.p).a(bVar2, this.f, lVar, a2, new rm6(this, lVar), this.n, i);
        View view = bVar2.a;
        int i2 = e90.i;
        com.spotify.music.playlist.ui.row.a aVar = (com.spotify.music.playlist.ui.row.a) l70.o(view, com.spotify.music.playlist.ui.row.a.class);
        if (lVar.g() != null) {
            aVar.z(this.q.a(new em6(this, i, lVar), bVar2, a2, lVar.g().getOfflineState(), this.t));
        }
        if (this.f.d()) {
            bVar2.h0(lVar, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b M(ViewGroup viewGroup, int i) {
        if (i == u) {
            return new b(Rows.b(viewGroup.getContext(), viewGroup));
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public /* synthetic */ void Y(int i, l lVar, View view) {
        this.r.f(i, lVar);
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/spotify/playlist/models/j;Ljava/util/List<Lcom/spotify/playlist/models/l;>;)V */
    public void Z(List list) {
        list.getClass();
        this.c = list;
        z();
    }

    public void b0(ItemConfiguration itemConfiguration, boolean z) {
        this.t = z;
        if (this.f != itemConfiguration) {
            this.f = itemConfiguration;
            z();
        }
    }

    public void j(String str, boolean z) {
        if (this.o.c(str) || this.n != z) {
            z();
        }
        this.n = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        l lVar = this.c.get(i);
        long hashCode = (long) (hashCode() ^ lVar.getUri().hashCode());
        String f2 = lVar.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return u;
    }
}
