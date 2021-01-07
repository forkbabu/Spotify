package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.models.f;
import com.spotify.music.features.playlistentity.homemix.models.g;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.playlist.ui.m0;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.music.playlist.ui.row.e;
import com.spotify.playlist.models.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: he6  reason: default package */
public class he6 extends RecyclerView.e<a> {
    private final d c;
    private final l0<ContextMenuItem> f;
    private final com.spotify.music.features.playlistentity.itemlist.adapter.a n;
    private final yd6 o;
    private HomeMix p;
    List<g> q = Collections.emptyList();
    private ItemConfiguration r = ItemConfiguration.a().build();
    private final HomeMixFormatListAttributesHelper s;

    /* renamed from: he6$a */
    public static class a extends jh6 {
        protected a(ViewProvider viewProvider) {
            super(viewProvider.getView());
        }
    }

    public he6(d dVar, l0.a<ContextMenuItem> aVar, com.spotify.music.features.playlistentity.itemlist.adapter.a aVar2, zd6 zd6, c cVar, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, d0 d0Var, ajf<b4<ContextMenuItem>> ajf) {
        this.f = aVar.a(d0Var, ajf);
        this.n = aVar2;
        this.c = dVar;
        this.s = homeMixFormatListAttributesHelper;
        this.o = zd6.b(ajf, cVar);
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        g gVar = this.q.get(i);
        Context context = aVar2.a.getContext();
        l c2 = gVar.c();
        ContextMenuItem a2 = this.n.a(context, c2, i);
        ((m0) this.f).c(aVar2, this.r, c2, a2, this.c.b(c2), false, i);
        View view = aVar2.a;
        int i2 = e90.i;
        e eVar = (e) l70.o(view, e.class);
        List emptyList = Collections.emptyList();
        HomeMix homeMix = this.p;
        if (homeMix != null) {
            Map<String, HomeMixUser> homeMixUsersMap = homeMix.homeMixUsersMap();
            homeMixUsersMap.getClass();
            ArrayList arrayList = new ArrayList();
            for (f fVar : gVar.a()) {
                HomeMixUser homeMixUser = homeMixUsersMap.get(fVar.c());
                if (homeMixUser != null) {
                    arrayList.add(homeMixUser.getFace());
                }
            }
            emptyList = this.o.a(aVar2.a.getContext(), a2, com.spotify.libs.facepile.d.a(arrayList), c2.getUri(), i);
        }
        eVar.z(emptyList);
        if (this.r.d()) {
            aVar2.h0(c2, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        e c2 = Rows.c(viewGroup.getContext(), viewGroup);
        c2.getTitleView().setTextSize(14.0f);
        c2.getSubtitleView().setTextSize(12.0f);
        return new a(c2);
    }

    public void X(String str) {
        if (this.c.c(str)) {
            z();
        }
    }

    public void Y(HomeMix homeMix, List<l> list) {
        this.p = homeMix;
        this.q = this.s.d(list);
        z();
    }

    public void i(ItemConfiguration itemConfiguration) {
        if (this.r != itemConfiguration) {
            this.r = itemConfiguration;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.q.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        l c2 = this.q.get(i).c();
        long hashCode = (long) (hashCode() ^ c2.getUri().hashCode());
        String f2 = c2.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }
}
