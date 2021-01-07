package com.spotify.music.features.queue.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.g0;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.previous.e;
import com.spotify.nowplaying.ui.components.repeat.d;
import com.squareup.picasso.Picasso;
import io.reactivex.disposables.b;
import java.util.Iterator;
import java.util.List;
import kotlin.f;

public final class QueueViews implements g<j, d> {
    private g0<ProgressBar> a;
    private View b;
    private final List<nmf<View, f>> c;
    private final List<cmf<f>> f;
    private o n;
    private final Picasso o;

    public static final class a implements h<j> {
        final /* synthetic */ QueueViews a;
        final /* synthetic */ b b;

        a(QueueViews queueViews, b bVar) {
            this.a = queueViews;
            this.b = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            j jVar = (j) obj;
            kotlin.jvm.internal.h.e(jVar, "model");
            if (!kotlin.jvm.internal.h.a(jVar.g(), jVar.f())) {
                QueueViews.c(this.a).c0(jVar.c());
            }
            QueueViews.b(this.a).f(jVar.d().b(), jVar.d().a(), jVar.d().c());
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            for (cmf cmf : this.a.f) {
                cmf.invoke();
            }
        }
    }

    public QueueViews(Picasso picasso, e eVar, com.spotify.nowplaying.ui.components.controls.playpause.e eVar2, com.spotify.nowplaying.ui.components.controls.next.f fVar, d dVar, com.spotify.nowplaying.ui.components.shuffle.d dVar2) {
        kotlin.jvm.internal.h.e(picasso, "picasso");
        kotlin.jvm.internal.h.e(eVar, "prevButtonPresenter");
        kotlin.jvm.internal.h.e(eVar2, "playPauseButtonPresenter");
        kotlin.jvm.internal.h.e(fVar, "nextButtonPresenter");
        kotlin.jvm.internal.h.e(dVar, "repeatButtonPresenter");
        kotlin.jvm.internal.h.e(dVar2, "shuffleButtonPresenter");
        this.o = picasso;
        this.c = kotlin.collections.d.u(new QueueViews$onConnectActions$1(this), new QueueViews$onConnectActions$2(eVar2), new QueueViews$onConnectActions$3(eVar), new QueueViews$onConnectActions$4(fVar), new QueueViews$onConnectActions$5(dVar2), new QueueViews$onConnectActions$6(dVar));
        this.f = kotlin.collections.d.u(new QueueViews$onDisposeActions$1(this), new QueueViews$onDisposeActions$2(eVar2), new QueueViews$onDisposeActions$3(eVar), new QueueViews$onDisposeActions$4(fVar), new QueueViews$onDisposeActions$5(dVar), new QueueViews$onDisposeActions$6(dVar2));
    }

    public static final /* synthetic */ g0 b(QueueViews queueViews) {
        g0<ProgressBar> g0Var = queueViews.a;
        if (g0Var != null) {
            return g0Var;
        }
        kotlin.jvm.internal.h.k("progressAnimatorHolder");
        throw null;
    }

    public static final /* synthetic */ o c(QueueViews queueViews) {
        o oVar = queueViews.n;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.h.k("queueTrackAdapter");
        throw null;
    }

    public static final void d(QueueViews queueViews, View view) {
        queueViews.getClass();
        queueViews.a = new g0<>((ProgressBar) view.findViewById(C0707R.id.progress_bar), Optional.absent());
    }

    public final View e() {
        return this.b;
    }

    public final void f(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        this.n = new o(context, this.o);
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_queue_v2, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.queue_items);
        kotlin.jvm.internal.h.d(recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        o oVar = this.n;
        if (oVar != null) {
            recyclerView.setAdapter(oVar);
            this.b = inflate;
            return;
        }
        kotlin.jvm.internal.h.k("queueTrackAdapter");
        throw null;
    }

    @Override // com.spotify.mobius.g
    public h<j> t(da2<d> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            View view = this.b;
            kotlin.jvm.internal.h.c(view);
            it.next().invoke(view);
        }
        o oVar = this.n;
        if (oVar != null) {
            return new a(this, oVar.f0().O(new r(new QueueViews$connect$disposable$1(this))).subscribe(new q(new QueueViews$connect$disposable$2(da2))));
        }
        kotlin.jvm.internal.h.k("queueTrackAdapter");
        throw null;
    }
}
