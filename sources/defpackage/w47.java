package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.music.features.podcast.entity.loadedpage.data.h;
import com.spotify.music.features.podcast.entity.loadedpage.data.k;
import com.spotify.music.features.podcast.entity.presentation.FilteringPresenter;
import com.spotify.music.features.podcast.entity.presentation.u;
import com.spotify.music.features.podcast.entity.trailer.PodcastTrailerPresenter;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcast.entity.adapter.description.f;
import com.spotify.music.podcast.entity.adapter.topics.TopicChipSectionAdapterDelegate;
import com.spotify.playlist.models.Show;
import defpackage.b57;
import defpackage.d77;
import defpackage.f57;
import defpackage.onc;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.y;
import java.util.ArrayList;

/* renamed from: w47  reason: default package */
public final class w47 implements u47, npa, FilteringPresenter.a, PodcastTrailerPresenter.a, d77.a, u.a, d0 {
    private final o47 A;
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private y47 b;
    private b c;
    private g57 f;
    private int n;
    private boolean o;
    private boolean p;
    private final c57 q;
    private final k47 r;
    private final y s;
    private final int t;
    private final h u;
    private final h57 v;
    private final k w;
    private final c.a x;
    private final etc y;
    private final spa z;

    /* access modifiers changed from: package-private */
    /* renamed from: w47$a */
    public static final class a<T> implements g<com.spotify.music.features.podcast.entity.loadedpage.data.b> {
        final /* synthetic */ w47 a;

        a(w47 w47) {
            this.a = w47;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(com.spotify.music.features.podcast.entity.loadedpage.data.b bVar) {
            com.spotify.music.features.podcast.entity.loadedpage.data.b bVar2 = bVar;
            w47 w47 = this.a;
            kotlin.jvm.internal.h.d(bVar2, "it");
            w47.q(w47, bVar2);
        }
    }

    public w47(c57 c57, k47 k47, y yVar, int i, h hVar, h57 h57, k kVar, c.a aVar, etc etc, spa spa, o47 o47) {
        kotlin.jvm.internal.h.e(c57, "headerModelConverter");
        kotlin.jvm.internal.h.e(k47, "coverArtLoader");
        kotlin.jvm.internal.h.e(yVar, "mainThreadScheduler");
        kotlin.jvm.internal.h.e(hVar, "dataLoader");
        kotlin.jvm.internal.h.e(h57, "presenterDelegator");
        kotlin.jvm.internal.h.e(kVar, "requestProvider");
        kotlin.jvm.internal.h.e(aVar, "viewUriProvider");
        kotlin.jvm.internal.h.e(etc, "episodeCardStateLogic");
        kotlin.jvm.internal.h.e(spa, "titleUpdater");
        kotlin.jvm.internal.h.e(o47, "autoScrollLogic");
        this.q = c57;
        this.r = k47;
        this.s = yVar;
        this.t = i;
        this.u = hVar;
        this.v = h57;
        this.w = kVar;
        this.x = aVar;
        this.y = etc;
        this.z = spa;
        this.A = o47;
        this.n = i;
    }

    public static final /* synthetic */ y47 p(w47 w47) {
        y47 y47 = w47.b;
        if (y47 != null) {
            return y47;
        }
        kotlin.jvm.internal.h.k("viewBinder");
        throw null;
    }

    public static final void q(w47 w47, com.spotify.music.features.podcast.entity.loadedpage.data.b bVar) {
        w47.getClass();
        if (bVar.b().getItems().isEmpty()) {
            y47 y47 = w47.b;
            if (y47 != null) {
                y47.h();
            } else {
                kotlin.jvm.internal.h.k("viewBinder");
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        esc esc = new esc();
        esc.h(arrayList);
        kotlin.jvm.internal.h.d(esc, "blueprint.setStartSegments(startSegments)");
        esc.f(arrayList2);
        w47.v.a(new f57.e(bVar.b(), esc, bVar.c()));
        y47 y472 = w47.b;
        if (y472 != null) {
            y472.l(esc);
            g57 g57 = w47.f;
            if (g57 != null) {
                y47 y473 = w47.b;
                if (y473 != null) {
                    y473.c(g57);
                    w47.f = null;
                } else {
                    kotlin.jvm.internal.h.k("viewBinder");
                    throw null;
                }
            }
            Show d = bVar.b().d();
            kotlin.jvm.internal.h.d(d, "dataModel.showEntity.header");
            boolean z2 = true;
            if (!w47.p) {
                w47.p = true;
                b57 a2 = w47.A.a(d);
                if (!(a2 instanceof b57.a) && (a2 instanceof b57.b)) {
                    y47 y474 = w47.b;
                    if (y474 != null) {
                        y474.f(((b57.b) a2).a());
                    } else {
                        kotlin.jvm.internal.h.k("viewBinder");
                        throw null;
                    }
                }
            }
            if (bVar.b().getUnrangedLength() <= bVar.b().getItems().size()) {
                z2 = false;
            }
            w47.o = z2;
            onc a3 = bVar.a();
            a3.getClass();
            if ((a3 instanceof onc.a) || (a3 instanceof onc.b)) {
                w47.y.d(new dtc(null, null, null, null, false, 0, 63));
                y47 y475 = w47.b;
                if (y475 != null) {
                    y475.b();
                } else {
                    kotlin.jvm.internal.h.k("viewBinder");
                    throw null;
                }
            } else {
                onc.c cVar = (onc.c) a3;
                w47.y.d(new dtc(cVar.d(), cVar.b(), cVar.c(), cVar.a(), cVar.f(), cVar.e()));
                y47 y476 = w47.b;
                if (y476 != null) {
                    y476.b();
                    y47 y477 = w47.b;
                    if (y477 != null) {
                        y477.m(cVar.d());
                    } else {
                        kotlin.jvm.internal.h.k("viewBinder");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.h.k("viewBinder");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    private final void r() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    private final void s() {
        this.c = this.u.a(this.w.a(this.n)).o0(this.s).subscribe(new a(this));
    }

    @Override // defpackage.u47
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("range_length", this.n);
        y47 y47 = this.b;
        if (y47 != null) {
            g57 p2 = y47.p();
            bundle.putBoolean("scroll_position_restored", this.p);
            bundle.putParcelable("layout_manager_state", p2.a());
            this.v.a(new f57.g(bundle));
            return bundle;
        }
        kotlin.jvm.internal.h.k("viewBinder");
        throw null;
    }

    @Override // com.spotify.music.features.podcast.entity.trailer.PodcastTrailerPresenter.a
    public void b() {
        y47 y47 = this.b;
        if (y47 != null) {
            y47.b();
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    @Override // defpackage.u47
    public void d(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        this.n = bundle.getInt("range_length", this.n);
        this.p = bundle.getBoolean("scroll_position_restored", false);
        this.f = new g57(bundle.getParcelable("layout_manager_state"));
        this.v.a(new f57.f(bundle));
    }

    @Override // defpackage.d77.a
    public void f(Class<? extends TopicChipSectionAdapterDelegate.a> cls) {
        kotlin.jvm.internal.h.e(cls, "segmentClass");
        y47 y47 = this.b;
        if (y47 != null) {
            y47.n(cls);
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        kotlin.jvm.internal.h.e(a0Var, "toolbarMenu");
        this.v.a(new f57.b(a0Var));
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c viewUri = this.x.getViewUri();
        kotlin.jvm.internal.h.d(viewUri, "viewUriProvider.viewUri");
        return viewUri;
    }

    @Override // defpackage.npa
    public void h(int i) {
        this.n = i;
        this.v.a(f57.c.a);
        y47 y47 = this.b;
        if (y47 != null) {
            y47.b();
            r();
            s();
            return;
        }
        kotlin.jvm.internal.h.k("viewBinder");
        throw null;
    }

    @Override // defpackage.u47
    public void i(y47 y47, com.spotify.music.features.podcast.entity.loadedpage.data.a aVar) {
        kotlin.jvm.internal.h.e(y47, "viewBinder");
        kotlin.jvm.internal.h.e(aVar, "data");
        this.b = y47;
        View view = y47.getView();
        if (view != null) {
            this.v.a(new f57.d(view));
        }
        this.z.setTitle(aVar.d());
        r67 a2 = this.q.a(aVar);
        y47 y472 = this.b;
        if (y472 != null) {
            y472.o(a2);
            Uri b2 = a2.b();
            kotlin.jvm.internal.h.d(b2, "headerModel.imageUri()");
            this.a.b(this.r.a(b2).o0(this.s).subscribe(new v47(this)));
            s();
            return;
        }
        kotlin.jvm.internal.h.k("viewBinder");
        throw null;
    }

    @Override // defpackage.npa
    public boolean j() {
        return this.o;
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.u.a
    public void k(Class<? extends f.a> cls) {
        kotlin.jvm.internal.h.e(cls, "descriptionSegmentClass");
        y47 y47 = this.b;
        if (y47 != null) {
            y47.n(cls);
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.FilteringPresenter.a
    public void l(View view) {
        kotlin.jvm.internal.h.e(view, "container");
        y47 y47 = this.b;
        if (y47 != null) {
            y47.e(view);
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.FilteringPresenter.a
    public void m() {
        y47 y47 = this.b;
        if (y47 != null) {
            y47.k();
            r();
            s();
            return;
        }
        kotlin.jvm.internal.h.k("viewBinder");
        throw null;
    }

    @Override // com.spotify.music.features.podcast.entity.presentation.FilteringPresenter.a
    public void n(com.spotify.music.features.podcast.entity.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "model");
        y47 y47 = this.b;
        if (y47 != null) {
            y47.i(cVar);
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }

    @Override // defpackage.u47
    public void stop() {
        this.a.f();
        r();
        y47 y47 = this.b;
        if (y47 != null) {
            y47.d();
        } else {
            kotlin.jvm.internal.h.k("viewBinder");
            throw null;
        }
    }
}
