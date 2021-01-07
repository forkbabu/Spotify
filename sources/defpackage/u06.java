package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistallsongs.i;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.playlist.ui.m0;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.music.podcastentityrow.b0;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import defpackage.s06;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u06  reason: default package */
public class u06 extends RecyclerView.e<RecyclerView.b0> {
    static final int s = u06.class.hashCode();
    static final int t = (u06.class.hashCode() + 1);
    private final b c;
    private final l0<t06> f;
    private final b0 n;
    private final i o;
    private List<l> p = new ArrayList();
    private ItemConfiguration q;
    private boolean r;

    /* renamed from: u06$a */
    public interface a {
        u06 a(b4<t06> b4Var, b bVar, i iVar);
    }

    /* renamed from: u06$b */
    public interface b extends d0 {
        void e(l lVar, int i);
    }

    public u06(l0.a<t06> aVar, b0 b0Var, b4<t06> b4Var, b bVar, i iVar) {
        ItemConfiguration.a a2 = ItemConfiguration.a();
        a2.j(ItemConfiguration.HeartAndBan.ONLY_HEART);
        ItemConfiguration.PreviewOverlay previewOverlay = ItemConfiguration.PreviewOverlay.WITH_PLAY_ICON;
        a2.b(previewOverlay);
        a2.k(previewOverlay);
        this.q = a2.build();
        this.c = bVar;
        this.f = aVar.a(bVar, new q06(b4Var));
        this.n = b0Var;
        this.o = iVar;
        U(true);
    }

    private static void g0(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        e2.t(marginLayoutParams, i);
        e2.s(marginLayoutParams, i);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        t06 t06;
        i iVar = this.o;
        if (iVar != null) {
            iVar.b(i);
        }
        l lVar = this.p.get(i);
        o g = lVar.g();
        Episode c2 = lVar.c();
        if (g != null) {
            s06.b bVar = (s06.b) t06.a();
            bVar.g(g.getName());
            bVar.i(g.getUri());
            bVar.e(i);
            bVar.h(lVar.f());
            bVar.d(this.r);
            bVar.c(this.q.c() == ItemConfiguration.HeartAndBan.HEART_AND_BAN);
            bVar.a(lVar.d());
            t06 = bVar.b();
        } else if (c2 != null) {
            s06.b bVar2 = (s06.b) t06.a();
            bVar2.g(c2.n());
            bVar2.i(c2.getUri());
            bVar2.e(i);
            bVar2.h(lVar.f());
            bVar2.d(this.r);
            bVar2.f(c2.l());
            bVar2.a(lVar.d());
            t06 = bVar2.b();
        } else {
            t06 = null;
        }
        l0.c c3 = ((m0) this.f).c(b0Var, this.q, lVar, t06, false, false, i);
        Context context = b0Var.a.getContext();
        ImageView imageView = ((y90) l70.o(b0Var.a, y90.class)).getImageView();
        imageView.setOnClickListener(new r06(this, lVar, i));
        imageView.setVisibility(0);
        if (c3.a()) {
            imageView.setContentDescription(context.getString(C0707R.string.generic_content_description_cover_art));
        } else {
            imageView.setContentDescription(context.getString(C0707R.string.preview_play_pause_content_description));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (i == s) {
            return h90.h0(Rows.b(viewGroup.getContext(), viewGroup));
        }
        if (i == t) {
            g90 a2 = this.n.a(viewGroup);
            Resources resources = viewGroup.getContext().getResources();
            voc voc = (voc) a2;
            View view = voc.getView();
            view.setBackgroundResource(C0707R.drawable.bg_large_row_rounded);
            g0(view, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            view.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams2.bottomMargin = 0;
            view.setLayoutParams(marginLayoutParams2);
            int g = nud.g(16.0f, resources);
            g0(view.findViewById(C0707R.id.time_label), g);
            g0(view.findViewById(C0707R.id.description), g);
            View findViewById = view.findViewById(C0707R.id.top_container);
            g0(findViewById, g);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams3.topMargin = g;
            findViewById.setLayoutParams(marginLayoutParams3);
            View view2 = voc.getView();
            int i2 = e90.i;
            uoc uoc = (uoc) l70.o(view2, uoc.class);
            uoc.Q();
            uoc.p2(false);
            return h90.h0(a2);
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public /* synthetic */ void X(l lVar, int i, View view) {
        this.c.e(lVar, i);
    }

    public void Y(boolean z) {
        ItemConfiguration.HeartAndBan heartAndBan = z ? ItemConfiguration.HeartAndBan.HEART_AND_BAN : ItemConfiguration.HeartAndBan.ONLY_HEART;
        if (this.q.c() != heartAndBan) {
            ItemConfiguration.a m = this.q.m();
            m.j(heartAndBan);
            this.q = m.build();
            z();
        }
    }

    public void Z(boolean z) {
        if (this.r != z) {
            this.r = z;
            z();
        }
    }

    public void b0(List<l> list) {
        this.p = list;
        z();
    }

    public void c0(boolean z) {
        if (this.q.f() != z) {
            ItemConfiguration.a m = this.q.m();
            m.e(z);
            this.q = m.build();
            z();
        }
    }

    public void f0(ItemConfiguration.AddedBy addedBy) {
        if (this.q.g() != addedBy) {
            ItemConfiguration.a m = this.q.m();
            m.l(addedBy);
            this.q = m.build();
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        l lVar = this.p.get(i);
        long hashCode = (long) (hashCode() ^ lVar.getUri().hashCode());
        String f2 = lVar.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        if (this.p.get(i).c() != null) {
            return t;
        }
        return s;
    }
}
