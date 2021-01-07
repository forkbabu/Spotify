package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.e0;
import com.spotify.music.playlist.ui.f0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.playlist.ui.m0;
import com.spotify.music.playlist.ui.row.Rows;
import com.spotify.music.podcastentityrow.b0;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.hi6;
import defpackage.pi6;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.f;

/* renamed from: ki6  reason: default package */
final class ki6 extends hi6 {
    static final int B = (hi6.class.hashCode() + 1);
    static final int C = (hi6.class.hashCode() + 2);
    static final int D = (hi6.class.hashCode() + 3);
    static final int E = (hi6.class.hashCode() + 4);
    static final int F = (hi6.class.hashCode() + 5);
    private boolean A;
    private final pi6 c;
    private final l0<ContextMenuItem> f;
    private final d n;
    private final c0 o;
    private final a p;
    private final Picasso q;
    private final b0 r;
    private final ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> s;
    private final d0 t;
    private final ajf<b4<ContextMenuItem>> u;
    private final c v;
    private final f0 w;
    private final gxc x;
    private List<l> y = Collections.emptyList();
    private ItemConfiguration z = ItemConfiguration.a().build();

    ki6(Picasso picasso, pi6 pi6, l0.a<ContextMenuItem> aVar, a aVar2, d dVar, b0 b0Var, ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> componentFactory, c cVar, f0 f0Var, gxc gxc, d0 d0Var, ajf<b4<ContextMenuItem>> ajf, c0 c0Var) {
        this.q = picasso;
        this.c = pi6;
        this.t = d0Var;
        this.u = ajf;
        this.f = aVar.a(d0Var, ajf);
        this.n = dVar;
        this.p = aVar2;
        this.o = c0Var;
        this.r = b0Var;
        this.s = componentFactory;
        this.v = cVar;
        this.w = f0Var;
        this.x = gxc;
        U(true);
    }

    private static Drawable Y(Context context, String str) {
        Integer num = null;
        try {
            if (!MoreObjects.isNullOrEmpty(str)) {
                num = Integer.valueOf(Color.parseColor(str));
            }
        } catch (IllegalArgumentException e) {
            Logger.o(e, "Invalid color %s", str);
        }
        if (num != null) {
            return new ColorDrawable(num.intValue());
        }
        return yc0.o(context);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(hi6.b bVar, int i) {
        hi6.b bVar2 = bVar;
        this.o.a(i);
        l lVar = this.y.get(i);
        Episode c2 = lVar.c();
        if (c2 != null && c2.l() == Episode.MediaType.VIDEO) {
            Map<String, String> d = lVar.d();
            ((m0) this.f).a(bVar2, this.z, lVar, this.p.a(bVar2.a.getContext(), lVar, i), new ji6(this, lVar), this.A, i);
            Episode c3 = lVar.c();
            if (c3 == null) {
                Assertion.p("Something horrific happen here. Episode cannot be null.");
            } else {
                Context context = bVar2.a.getContext();
                View view = bVar2.a;
                int i2 = e90.i;
                pi6.a aVar = (pi6.a) l70.o(view, pi6.a.class);
                Drawable Y = Y(context, d.get("primary_color"));
                Covers c4 = c3.c();
                Covers e = c3.e();
                Show w2 = c3.w();
                w2.getClass();
                String f2 = q.f(c4, e, w2, Covers.Size.XLARGE);
                z l = this.q.l(!TextUtils.isEmpty(f2) ? Uri.parse(f2) : Uri.EMPTY);
                l.w(Integer.valueOf((int) C0707R.id.image_on_item_in_list_loaded_with_picasso));
                l.t(Y);
                l.i();
                l.a();
                l.m(aVar.getImageView());
                String str = d.get("title");
                String str2 = d.get(ContextTrack.Metadata.KEY_SUBTITLE);
                if (MoreObjects.isNullOrEmpty(str)) {
                    str = c3.n();
                }
                aVar.setTitle(str);
                if (MoreObjects.isNullOrEmpty(str2)) {
                    str2 = c3.d();
                }
                aVar.setSubtitle(str2);
            }
        } else if (w(i) == F) {
            Component component = (Component) bVar2.m0();
            component.render(this.w.a(lVar, this.z, this.n.b(lVar)));
            Context context2 = bVar2.a.getContext();
            component.onEvent(new ci6(this, context2, i, lVar, this.p.a(context2, lVar, i)));
            if (this.z.j() && i == 0) {
                this.x.a(bVar2.a);
            }
        } else {
            Map<String, String> d2 = lVar.d();
            ContextMenuItem a = this.p.a(bVar2.a.getContext(), lVar, i);
            Drawable Y2 = Y(bVar2.a.getContext(), d2.get("primary_color"));
            ((m0) this.f).b(bVar2, this.z, lVar, a, new ii6(this, lVar), this.A, i, Y2, Y2, Y2);
        }
        if (this.z.d()) {
            bVar2.h0(lVar, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public hi6.b M(ViewGroup viewGroup, int i) {
        ni6 ni6;
        if (i == B) {
            pi6 pi6 = this.c;
            Context context = viewGroup.getContext();
            pi6.getClass();
            y90 j = e90.d().j(context, viewGroup, false);
            LinearLayout linearLayout = new LinearLayout(context);
            int g = nud.g(72.0f, context.getResources());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g));
            linearLayout.setMinimumHeight(g);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(j.getView());
            j.getView().setDuplicateParentStateEnabled(true);
            ni6 ni62 = new ni6(pi6, j, new e0((ViewGroup) j.getView().findViewById(C0707R.id.accessory)), linearLayout);
            ni62.getView().setTag(C0707R.id.glue_viewholder_tag, ni62);
            ni6 = ni62;
        } else if (i == F) {
            ni6 = this.s.make();
        } else if (i == C) {
            ni6 = Rows.d(viewGroup.getContext(), viewGroup);
        } else if (i == D) {
            pi6 pi62 = this.c;
            Context context2 = viewGroup.getContext();
            pi62.getClass();
            View inflate = LayoutInflater.from(context2).inflate(C0707R.layout.playlist_show_format_video_cell, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(16908308);
            TextView textView2 = (TextView) inflate.findViewById(16908309);
            ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.key_frame);
            imageView.setColorFilter(C0707R.color.cat_background_blur_tint);
            View findViewById = inflate.findViewById(C0707R.id.labels);
            e0 e0Var = new e0((ViewGroup) inflate.findViewById(C0707R.id.accessory));
            vc0.h(textView);
            vc0.i(textView2);
            vc0.g(findViewById);
            bvd c2 = dvd.c(inflate);
            c2.f(imageView);
            c2.g(textView, textView2);
            c2.a();
            oi6 oi6 = new oi6(pi62, e0Var, findViewById, imageView, textView, textView2, inflate);
            oi6.getView().setTag(C0707R.id.glue_viewholder_tag, oi6);
            ni6 = oi6;
        } else {
            ni6 = i == E ? this.r.a(viewGroup) : null;
        }
        if (ni6 != null) {
            return new hi6.b(ni6);
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public f Z(Context context, int i, l lVar, ContextMenuItem contextMenuItem, TrackRow.Events events) {
        switch (events.ordinal()) {
            case 0:
                this.t.d(i, lVar);
                break;
            case 1:
            case 2:
                ContextMenuFragment.b5(context, this.u.get(), contextMenuItem, this.v);
                break;
            case 3:
                this.t.i(i, lVar);
                break;
            case 4:
            case 5:
                this.t.g(i, lVar);
                break;
            case 6:
                this.t.b(i, lVar);
                break;
        }
        return f.a;
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void c(j jVar, List<l> list) {
        list.getClass();
        this.y = list;
        z();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$e' to match base method */
    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public hi6 e() {
        return this;
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void i(ItemConfiguration itemConfiguration) {
        if (this.z != itemConfiguration) {
            this.z = itemConfiguration;
            z();
        }
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void j(String str, boolean z2) {
        if (this.n.c(str) || this.A != z2) {
            z();
        }
        this.A = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        l lVar = this.y.get(i);
        long hashCode = (long) (hashCode() ^ lVar.getUri().hashCode());
        String f2 = lVar.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        l lVar = this.y.get(i);
        Episode c2 = lVar.c();
        boolean z2 = c2 != null && c2.l() == Episode.MediaType.VIDEO;
        if (c2 != null && !z2) {
            return E;
        }
        if (lVar.g() != null && this.z.l() != ItemConfiguration.PreviewOverlay.NONE) {
            return C;
        }
        if (z2) {
            return D;
        }
        return this.z.n() ? F : B;
    }
}
