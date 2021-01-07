package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m28  reason: default package */
public class m28 extends RecyclerView.e<h90<com.spotify.android.glue.components.card.b>> {
    private final View.OnLongClickListener A = new c();
    List<RadioStationModel> c = new ArrayList();
    private final Activity f;
    private String n;
    private boolean o;
    private final Picasso p;
    private final ifd q = kfd.a1;
    private final com.spotify.music.libs.viewuri.c r;
    private final boolean s;
    private final int t;
    private final com.spotify.android.flags.c u;
    private final t v;
    private final jz1 w;
    private final cqe x;
    private final b4<RadioStationModel> y = new a();
    private final View.OnClickListener z = new b();

    /* renamed from: m28$a */
    class a implements b4<RadioStationModel> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(RadioStationModel radioStationModel) {
            RadioStationModel radioStationModel2 = radioStationModel;
            ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
            new c38(m28.this.f, m28.this.q, m28.this.r, contextMenuViewModel, m28.this.v, m28.this.w, m28.this.x).e(radioStationModel2.title, m28.this.u, radioStationModel2.seeds[0]);
            contextMenuViewModel.x(!TextUtils.isEmpty(radioStationModel2.imageUri) ? Uri.parse(radioStationModel2.imageUri) : Uri.EMPTY);
            contextMenuViewModel.i().n(radioStationModel2.title);
            contextMenuViewModel.i().m(radioStationModel2.subtitle);
            return cx1.b(contextMenuViewModel);
        }
    }

    /* renamed from: m28$b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m28.this.getClass();
            RadioStationModel radioStationModel = (RadioStationModel) view.getTag();
            n.a a2 = n.a(radioStationModel.uri);
            a2.h(radioStationModel.title);
            m28.this.v.e(a2.a());
        }
    }

    /* renamed from: m28$c */
    class c implements View.OnLongClickListener {
        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            m28.this.k0(view);
            return true;
        }
    }

    public m28(androidx.fragment.app.c cVar, com.spotify.music.libs.viewuri.c cVar2, boolean z2, com.spotify.android.flags.c cVar3, t tVar, Picasso picasso, jz1 jz1, cqe cqe) {
        this.f = cVar;
        this.r = cVar2;
        this.s = z2;
        this.t = nud.g(100.0f, cVar.getResources());
        this.u = cVar3;
        this.v = tVar;
        this.p = picasso;
        this.w = jz1;
        this.x = cqe;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(h90<com.spotify.android.glue.components.card.b> h90, int i) {
        boolean z2;
        com.spotify.android.glue.components.card.b j0 = h90.j0();
        RadioStationModel radioStationModel = this.c.get(i);
        boolean z3 = false;
        if (MoreObjects.isNullOrEmpty(this.n)) {
            z2 = false;
        } else {
            z2 = radioStationModel.isMyContext(this.n);
        }
        if (z2 || !this.s) {
            j0.getView().setOnLongClickListener(null);
        } else {
            j0.getView().setOnLongClickListener(this.A);
        }
        j0.getView().setTag(radioStationModel);
        j0.setTitle(Joiner.on('\n').skipNulls().join(radioStationModel.title, radioStationModel.subtitle, new Object[0]));
        l0 z4 = l0.z(radioStationModel.seeds[0]);
        j0.setSubtitle(agd.e(this.f, z4));
        j0.setActive(z2 && this.o);
        ImageView imageView = j0.getImageView();
        if (z4.q() == LinkType.ARTIST) {
            z3 = true;
        }
        z l = this.p.l(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY);
        l.s(C0707R.drawable.cat_placeholder_radio);
        l.d(Bitmap.Config.ARGB_8888);
        l.x(new com.spotify.android.glue.components.cards.effects.a(this.f, z3));
        l.f(C0707R.drawable.cat_placeholder_radio);
        int i2 = this.t;
        l.u(i2, i2);
        l.r();
        l.b();
        l.m(imageView);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public h90<com.spotify.android.glue.components.card.b> M(ViewGroup viewGroup, int i) {
        com.spotify.android.glue.components.card.b e = e90.a().e(this.f, viewGroup);
        com.spotify.android.glue.components.card.glue.a aVar = (com.spotify.android.glue.components.card.glue.a) e;
        aVar.getView().setOnClickListener(this.z);
        aVar.setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
        return h90.h0(e);
    }

    public void i0(List<RadioStationModel> list) {
        this.c.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        z();
    }

    public void j0(boolean z2) {
        this.o = z2;
    }

    /* access modifiers changed from: protected */
    public void k0(View view) {
        ContextMenuFragment.b5(this.f, this.y, (RadioStationModel) view.getTag(), this.r);
    }

    public void l0(String str) {
        this.n = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
