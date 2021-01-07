package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowChartsConfiguration;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.elements.quickactions.Action;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.chart.model.ChartEntryStatus;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.features.playlistentity.itemlist.adapter.g;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.c0;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.playlist.ui.m0;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.q;
import com.spotify.remoteconfig.o9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.f;

/* renamed from: wj4  reason: default package */
public final class wj4 extends RecyclerView.e<b> implements g<wj4> {
    static final int x;
    static final int y;
    private static final kg0<ChartEntryStatus> z = kg0.a(ChartEntryStatus.class);
    private final ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> c;
    final Map<ChartEntryStatus, Drawable> f;
    private final d n;
    private final l0<ContextMenuItem> o;
    private final com.spotify.music.features.playlistentity.itemlist.adapter.a p;
    private final c q;
    private final ajf<b4<ContextMenuItem>> r;
    private List<l> s = Collections.emptyList();
    private ItemConfiguration t = ItemConfiguration.a().build();
    private final d0 u;
    private final boolean v;
    private boolean w;

    /* renamed from: wj4$a */
    public interface a {
        wj4 a(d0 d0Var, ajf<b4<ContextMenuItem>> ajf);
    }

    /* renamed from: wj4$b */
    public static class b extends jh6 {
        private final ViewProvider E;

        protected b(ViewProvider viewProvider) {
            super(viewProvider.getView());
            this.E = viewProvider;
        }

        public ViewProvider m0() {
            return this.E;
        }
    }

    static {
        int hashCode = wj4.class.hashCode();
        x = hashCode;
        y = hashCode + 1;
    }

    public wj4(Context context, d dVar, l0.a<ContextMenuItem> aVar, com.spotify.music.features.playlistentity.itemlist.adapter.a aVar2, ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> componentFactory, c cVar, o9 o9Var, d0 d0Var, ajf<b4<ContextMenuItem>> ajf) {
        EnumMap enumMap = new EnumMap(ChartEntryStatus.class);
        this.f = enumMap;
        this.c = componentFactory;
        this.o = aVar.a(d0Var, ajf);
        this.p = aVar2;
        this.n = dVar;
        this.u = d0Var;
        this.r = ajf;
        this.q = cVar;
        this.v = o9Var.a();
        U(true);
        int f2 = nud.f(16.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.CHART_DOWN_16);
        spotifyIconDrawable.r(androidx.core.content.a.b(context, C0707R.color.charts_legend_arrow_down));
        spotifyIconDrawable.setBounds(0, 0, f2, f2);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIcon.CHART_UP_16);
        spotifyIconDrawable2.r(androidx.core.content.a.b(context, C0707R.color.charts_legend_arrow_up));
        spotifyIconDrawable2.setBounds(0, 0, f2, f2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new bk4(context.getResources().getDimensionPixelSize(C0707R.dimen.charts_chart_legend_icon_size)));
        shapeDrawable.getPaint().setColor(androidx.core.content.a.b(context, C0707R.color.charts_legend_circle));
        shapeDrawable.setBounds(0, 0, f2, f2);
        enumMap.put((EnumMap) ChartEntryStatus.DOWN, (ChartEntryStatus) spotifyIconDrawable);
        enumMap.put((EnumMap) ChartEntryStatus.UP, (ChartEntryStatus) spotifyIconDrawable2);
        enumMap.put((EnumMap) ChartEntryStatus.NEW, (ChartEntryStatus) shapeDrawable);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(b bVar, int i) {
        b bVar2;
        l lVar;
        TrackRowCharts.Model model;
        TrackRowCharts.ChartEntryStatus chartEntryStatus;
        Action action;
        b bVar3 = bVar;
        l lVar2 = this.s.get(i);
        ContextMenuItem a2 = this.p.a(bVar3.a.getContext(), lVar2, i);
        Map<String, String> d = lVar2.d();
        int parseInt = Integer.parseInt((String) x.n(d.get("current_pos"), Ad.DEFAULT_SKIPPABLE_AD_DELAY));
        Optional<ChartEntryStatus> f2 = z.f((String) x.n(d.get("status"), "UNKNOWN"));
        if ((this.v ? y : x) == y) {
            Component component = (Component) bVar3.m0();
            ItemConfiguration itemConfiguration = this.t;
            ChartEntryStatus or = f2.or((Optional<ChartEntryStatus>) ChartEntryStatus.UNKNOWN);
            boolean b2 = this.n.b(lVar2);
            o g = lVar2.g();
            if (g != null || lVar2.c() == null) {
                if (g == null) {
                    model = new TrackRowCharts.Model(parseInt, "", new ArrayList(0), new Artwork.ImageData(null), ContentRestriction.None, false, false, false, false, DownloadState.Empty, TrackRowCharts.ChartEntryStatus.NONE, Action.None.INSTANCE);
                } else {
                    Artwork.ImageData imageData = new Artwork.ImageData(q.e(g, Covers.Size.NORMAL), C0707R.id.image_on_item_in_list_loaded_with_picasso);
                    String e = lVar2.e();
                    List<String> a3 = c0.a(g);
                    ContentRestriction b3 = c0.b(g);
                    boolean z2 = !g.isBanned() && g.isCurrentlyPlayable();
                    boolean z3 = !g.isCurrentlyPlayable() && g.isPremiumOnly();
                    boolean z4 = itemConfiguration.i() && g.getHasLyrics();
                    DownloadState c2 = c0.c(g);
                    int ordinal = or.ordinal();
                    if (ordinal == 1) {
                        chartEntryStatus = TrackRowCharts.ChartEntryStatus.UP;
                    } else if (ordinal == 2) {
                        chartEntryStatus = TrackRowCharts.ChartEntryStatus.DOWN;
                    } else if (ordinal != 3) {
                        chartEntryStatus = TrackRowCharts.ChartEntryStatus.NONE;
                    } else {
                        chartEntryStatus = TrackRowCharts.ChartEntryStatus.NEW;
                    }
                    if (g.isBanned()) {
                        action = Action.Hide.INSTANCE;
                    } else if (g.isInCollection()) {
                        action = Action.Heart.INSTANCE;
                    } else {
                        action = Action.None.INSTANCE;
                    }
                    model = new TrackRowCharts.Model(parseInt, e, a3, imageData, b3, b2, z2, z3, z4, c2, chartEntryStatus, action);
                }
                component.render(model);
                component.onEvent(new qj4(this, bVar3, lVar2, a2, i));
                lVar = lVar2;
                bVar2 = bVar3;
            } else {
                throw new UnsupportedOperationException("This mapper only supports Tracks in Playlists");
            }
        } else {
            lVar = lVar2;
            bVar2 = bVar3;
            ((m0) this.o).c(bVar3, this.t, lVar2, a2, this.n.b(lVar2), this.w, i);
            View view = bVar2.a;
            int i2 = e90.i;
            da0 da0 = (da0) l70.o(view, da0.class);
            da0.X(parseInt);
            if (f2.isPresent()) {
                da0.d1(this.f.get(f2.get()));
            }
        }
        if (this.t.d()) {
            bVar2.h0(lVar, i);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b M(ViewGroup viewGroup, int i) {
        if (i == x) {
            return new b(e90.d().k(viewGroup.getContext(), viewGroup, false));
        }
        if (i == y) {
            return new b(this.c.make());
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public f X(b bVar, l lVar, ContextMenuItem contextMenuItem, int i, TrackRowCharts.Events events) {
        int ordinal = events.ordinal();
        if (ordinal == 0) {
            this.u.d(i, lVar);
        } else if (ordinal == 1 || ordinal == 2) {
            ContextMenuFragment.b5(bVar.a.getContext(), this.r.get(), contextMenuItem, this.q);
        } else if (ordinal == 3) {
            this.u.i(i, lVar);
        } else if (ordinal == 4 || ordinal == 5) {
            this.u.g(i, lVar);
        }
        return f.a;
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void c(j jVar, List<l> list) {
        list.getClass();
        this.s = list;
        z();
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$e' to match base method */
    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public wj4 e() {
        return this;
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void i(ItemConfiguration itemConfiguration) {
        if (this.t != itemConfiguration) {
            this.t = itemConfiguration;
            z();
        }
    }

    @Override // com.spotify.music.features.playlistentity.itemlist.adapter.g
    public void j(String str, boolean z2) {
        if (this.n.c(str) || this.w != z2) {
            z();
        }
        this.w = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        l lVar = this.s.get(i);
        long hashCode = (long) (hashCode() ^ lVar.getUri().hashCode());
        String f2 = lVar.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.v ? y : x;
    }
}
