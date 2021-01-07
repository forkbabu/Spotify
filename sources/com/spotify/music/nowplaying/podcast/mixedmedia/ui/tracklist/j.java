package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.f;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;

public final class j implements i {
    private TrackListAdapter a;
    private RecyclerView b;
    private View c;
    private final b d;
    private final Context e;
    private final h1c f;
    private final Picasso g;
    private final z1c h;
    private final f1c i;

    static final class a implements Runnable {
        final /* synthetic */ j a;
        final /* synthetic */ Ref$ObjectRef b;

        a(j jVar, Ref$ObjectRef ref$ObjectRef) {
            this.a = jVar;
            this.b = ref$ObjectRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            T t = this.b.element;
            if (t != null) {
                this.a.d.m(t.intValue());
                RecyclerView.m layoutManager = j.f(this.a).getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.J1(this.a.d);
                }
            }
        }
    }

    public static final class b extends t {
        b(j jVar, Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            h.e(displayMetrics, "displayMetrics");
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public int t() {
            return -1;
        }
    }

    public j(Context context, h1c h1c, Picasso picasso, z1c z1c, f1c f1c) {
        h.e(context, "context");
        h.e(h1c, "likeButtonPresenterFactory");
        h.e(picasso, "picasso");
        h.e(z1c, "promotionSnackbarManager");
        h.e(f1c, "trackListLogger");
        this.e = context;
        this.f = h1c;
        this.g = picasso;
        this.h = z1c;
        this.i = f1c;
        this.d = new b(this, context);
    }

    public static final /* synthetic */ RecyclerView f(j jVar) {
        RecyclerView recyclerView = jVar.b;
        if (recyclerView != null) {
            return recyclerView;
        }
        h.k("trackListRecyclerView");
        throw null;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.i
    public void a(Throwable th) {
        h.e(th, AppProtocol.LogMessage.SEVERITY_ERROR);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.i
    public void b(View view, f fVar, b bVar) {
        h.e(view, "rootView");
        this.c = view;
        float dimensionPixelSize = ((float) this.e.getResources().getDimensionPixelSize(C0707R.dimen.track_list_item_icon_size)) / 2.0f;
        Drawable o = yc0.o(this.e);
        Drawable h2 = yc0.h(this.e);
        Picasso picasso = this.g;
        h.d(o, "musicImagePlaceholder");
        h.d(h2, "spokenImagePlaceholder");
        this.a = new TrackListAdapter(picasso, o, h2, dimensionPixelSize, fVar, bVar, this.f, this.i);
        View findViewById = view.findViewById(C0707R.id.npv_recycler_tracklist);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        TrackListAdapter trackListAdapter = this.a;
        if (trackListAdapter != null) {
            recyclerView.setAdapter(trackListAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setFocusable(false);
            recyclerView.setItemAnimator(null);
            h.d(findViewById, "rootView.findViewById<Re…hen updates\n            }");
            this.b = (RecyclerView) findViewById;
            return;
        }
        h.k("trackListAdapter");
        throw null;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.i
    public void c(a aVar) {
        h.e(aVar, "model");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        List<com.spotify.music.nowplaying.podcast.mixedmedia.model.b> d2 = aVar.b().d();
        ArrayList arrayList = new ArrayList(d.e(d2, 10));
        int i2 = 0;
        for (T t : d2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                T t2 = t;
                boolean a2 = h.a(aVar.a().b(), t2);
                if (a2) {
                    ref$ObjectRef.element = (T) Integer.valueOf(i2);
                }
                Context context = this.e;
                boolean c2 = aVar.c();
                long j = t2.j();
                boolean d3 = aVar.d(t2.n());
                boolean a3 = aVar.b().a();
                h.e(context, "context");
                h.e(t2, "model");
                arrayList.add(new e(aVar, new c(t2.e(), t2.n(), iyb.b(t2), t2.i(), iyb.e(t2), iyb.d(t2, context), a2, c2, j, d3, a3)));
                i2 = i3;
            } else {
                d.L();
                throw null;
            }
        }
        TrackListAdapter trackListAdapter = this.a;
        if (trackListAdapter != null) {
            trackListAdapter.c0(arrayList, new a(this, ref$ObjectRef));
        } else {
            h.k("trackListAdapter");
            throw null;
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.i
    public void d() {
        z1c z1c = this.h;
        View view = this.c;
        if (view != null) {
            z1c.a(view);
        } else {
            h.k("rootView");
            throw null;
        }
    }
}
