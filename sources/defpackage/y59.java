package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.elements.quickactions.Action;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.domain.u0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.o;
import com.spotify.music.features.yourlibrary.musicpages.view.p0;
import com.spotify.music.features.yourlibrary.musicpages.view.r0;
import com.spotify.music.freetiercommon.uicomponents.Rows;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.spotify.playlist.models.offline.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.d39;
import java.util.Collections;
import java.util.List;
import kotlin.f;

/* renamed from: y59  reason: default package */
public class y59 implements d39.h<MusicItem.Type, MusicItem>, c39 {
    private final Context a;
    private final Picasso b;
    private final EncoreConsumerEntryPoint c;
    private final p0 f;
    private final q n;
    private final o o;
    private final r0 p;
    private final Drawable q;
    private String r;
    private a s = x39.b;
    private c t = k49.b;
    private b u = b49.b;

    /* renamed from: y59$a */
    public interface a {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    /* renamed from: y59$b */
    public interface b {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    /* renamed from: y59$c */
    public interface c {
        public static final /* synthetic */ int a = 0;

        void a(MusicItem musicItem, int i);
    }

    public y59(Context context, Picasso picasso, EncoreConsumerEntryPoint encoreConsumerEntryPoint, p0 p0Var, q qVar, o oVar, r0 r0Var) {
        this.a = context;
        this.b = picasso;
        this.c = encoreConsumerEntryPoint;
        this.f = p0Var;
        this.n = qVar;
        this.o = oVar;
        this.p = r0Var;
        this.q = l70.f(context);
    }

    private boolean b(String str) {
        return l0.b(str, LinkType.COLLECTION_TRACKS);
    }

    public static void c(y59 y59, ViewProvider viewProvider, MusicItem musicItem, int i) {
        y59.getClass();
        Rows.h hVar = (Rows.h) l70.o(viewProvider.getView(), Rows.h.class);
        MusicItem.g y = musicItem.y();
        boolean z = !y.f() || y.a();
        hVar.setTitle(musicItem.w());
        if (TextUtils.isEmpty(musicItem.u())) {
            hVar.getSubtitleView().setVisibility(8);
        } else {
            hVar.getSubtitleView().setVisibility(0);
            hVar.setSubtitle(musicItem.u());
            TextView subtitleView = hVar.getSubtitleView();
            if (((Boolean) x.n(musicItem.n(), Boolean.TRUE)).booleanValue()) {
                g.c(subtitleView, 0, C0707R.id.drawable_group_on_demand);
            } else {
                g.a(subtitleView.getContext(), subtitleView, 0, C0707R.id.drawable_group_on_demand, MoreObjects.ofInstance(y59.q));
                subtitleView.setCompoundDrawablePadding(nud.g(5.0f, subtitleView.getResources()));
            }
            MusicItem.g y2 = musicItem.y();
            TextLabelUtil.a(y59.a, hVar.getSubtitleView(), y2.i());
            TextLabelUtil.b(y59.a, hVar.getSubtitleView(), y2.g());
        }
        ImageView imageView = hVar.getImageView();
        Drawable c2 = y59.f.c(musicItem);
        z m = y59.b.m(musicItem.j().isEmpty() ? null : musicItem.j());
        m.g(c2);
        m.t(c2);
        if (musicItem.type() == MusicItem.Type.TRACK_SHUFFLE_ONLY) {
            m.o(t.c(imageView, y59.n, musicItem.y().f() ? musicItem.y().l() : "", null, z));
        } else {
            m.i();
            m.m(imageView);
        }
        y59.p.d(hVar, musicItem, i);
        View view = hVar.getView();
        view.setOnClickListener(new j49(y59, musicItem, i));
        view.setOnLongClickListener(new h49(y59, musicItem, i));
        hVar.getImageView().setOnClickListener(new w39(y59, musicItem, i));
        hVar.setAppearsDisabled(z);
        if (MoreObjects.isNullOrEmpty(y59.r)) {
            hVar.setActive(false);
        } else {
            hVar.setActive(musicItem.A().equals(y59.r));
        }
    }

    public static void e(y59 y59, ViewProvider viewProvider, MusicItem musicItem, int i) {
        DownloadState downloadState;
        ContentRestriction contentRestriction;
        Action action;
        y59.getClass();
        TrackRow trackRow = (TrackRow) viewProvider;
        String str = y59.r;
        String w = musicItem.w();
        List singletonList = Collections.singletonList(musicItem.u());
        Artwork.ImageData imageData = new Artwork.ImageData(musicItem.j());
        com.spotify.playlist.models.offline.a p2 = musicItem.p();
        if (p2 == null) {
            downloadState = DownloadState.Empty;
        } else if (p2 instanceof a.C0377a) {
            downloadState = DownloadState.Downloaded;
        } else if (p2 instanceof a.b) {
            downloadState = DownloadState.Downloading;
        } else if (p2 instanceof a.c) {
            downloadState = DownloadState.Error;
        } else if (p2 instanceof a.h) {
            downloadState = DownloadState.Waiting;
        } else {
            downloadState = DownloadState.Empty;
        }
        MusicItem.g y = musicItem.y();
        if (y == null) {
            contentRestriction = ContentRestriction.None;
        } else if (y.i()) {
            contentRestriction = ContentRestriction.Over19Only;
        } else if (y.g()) {
            contentRestriction = ContentRestriction.Explicit;
        } else {
            contentRestriction = ContentRestriction.None;
        }
        MusicItem.g y2 = musicItem.y();
        if (y2 == null) {
            action = Action.None.INSTANCE;
        } else if (y2.c() && y2.h()) {
            action = Action.Heart.INSTANCE;
        } else if (!y2.b() || !y2.a()) {
            action = Action.None.INSTANCE;
        } else {
            action = Action.Ban.INSTANCE;
        }
        boolean z = false;
        boolean equals = !MoreObjects.isNullOrEmpty(str) ? musicItem.A().equals(str) : false;
        MusicItem.g y3 = musicItem.y();
        if (y3 != null && (!y3.f() || y3.a())) {
            z = true;
        }
        trackRow.render(new TrackRow.Model(w, singletonList, imageData, downloadState, contentRestriction, null, action, equals, true ^ z, false, false));
        trackRow.onEvent(new v39(y59, musicItem, i));
    }

    @Override // defpackage.d39.h
    public ImmutableList<d39.d<MusicItem.Type, MusicItem>> a() {
        return ImmutableList.of(d39.d.a(ImmutableSet.of(MusicItem.Type.TRACK), new a49(this), new i49(this)), d39.d.a(ImmutableSet.of(MusicItem.Type.TRACK_SHUFFLE_ONLY), new y39(this), new c49(this)));
    }

    @Override // defpackage.c39
    public void d(u0 u0Var, String str) {
        this.r = (String) u0Var.a(new z39(this, str), new d49(this, str), m49.a, l49.a);
    }

    public /* synthetic */ String f(String str, u0.c cVar) {
        return ((!b(str) || !b(cVar.e())) && !cVar.e().equals(str)) ? "" : cVar.f();
    }

    public /* synthetic */ String g(String str, u0.b bVar) {
        return ((!b(str) || !b(bVar.e())) && !bVar.e().equals(str)) ? "" : bVar.f();
    }

    public f h(MusicItem musicItem, int i, TrackRow.Events events) {
        int ordinal = events.ordinal();
        if (ordinal == 0) {
            this.o.g(musicItem, i);
        } else if (ordinal == 1) {
            this.o.h(musicItem);
        } else if (ordinal == 2) {
            this.o.e(musicItem);
        } else if (ordinal == 3) {
            this.o.f(musicItem, i, true);
        }
        return f.a;
    }

    public /* synthetic */ boolean i(MusicItem musicItem, int i, View view) {
        this.t.a(musicItem, i);
        return true;
    }

    public /* synthetic */ ViewProvider j(ViewGroup viewGroup) {
        return EncoreConsumerExtensions.trackRowFactory(this.c.getRows()).make();
    }

    public /* synthetic */ void k(MusicItem musicItem, int i, View view) {
        this.s.a(musicItem, i);
    }

    public /* synthetic */ void l(MusicItem musicItem, int i, View view) {
        this.u.a(musicItem, i);
    }

    public void m(a aVar) {
        int i = a.a;
        this.s = (a) x.n(aVar, e49.b);
    }

    public void n(b bVar) {
        int i = b.a;
        this.u = (b) x.n(bVar, f49.b);
    }

    public void o(c cVar) {
        int i = c.a;
        this.t = (c) x.n(cVar, g49.b);
    }
}
