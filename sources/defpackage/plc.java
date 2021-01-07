package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector;
import com.spotify.music.podcast.freetierlikes.tabs.k;
import com.spotify.music.podcastentityrow.m;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import defpackage.bgc;
import defpackage.onc;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: plc  reason: default package */
public final class plc implements olc, m, npa {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private int b;
    private boolean c;
    private final y f;
    private final rlc n;
    private final k o;
    private final vjc p;
    private final int q;
    private final etc r;
    private final EpisodeTypeViewSelector s;

    /* access modifiers changed from: package-private */
    /* renamed from: plc$a */
    public static final class a<T> implements g<wjc> {
        final /* synthetic */ plc a;

        a(plc plc) {
            this.a = plc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(wjc wjc) {
            wjc wjc2 = wjc;
            plc plc = this.a;
            h.d(wjc2, "dataModel");
            plc.e(plc, wjc2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: plc$b */
    public static final class b<T> implements g<Throwable> {
        final /* synthetic */ plc a;

        b(plc plc) {
            this.a = plc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            plc plc = this.a;
            h.d(th2, "throwable");
            plc.c(plc, th2);
        }
    }

    public plc(y yVar, rlc rlc, k kVar, vjc vjc, int i, etc etc, EpisodeTypeViewSelector episodeTypeViewSelector) {
        h.e(yVar, "mainScheduler");
        h.e(rlc, "viewBinder");
        h.e(kVar, "episodeSegmentFactory");
        h.e(vjc, "dataSource");
        h.e(etc, "episodeCardStateLogic");
        h.e(episodeTypeViewSelector, "episodeTypeViewSelector");
        this.f = yVar;
        this.n = rlc;
        this.o = kVar;
        this.p = vjc;
        this.q = i;
        this.r = etc;
        this.s = episodeTypeViewSelector;
        this.b = i;
    }

    public static final void c(plc plc, Throwable th) {
        plc.getClass();
        Assertion.i("Error in Podcast Tab subscription after Success in Page Loader", th);
        plc.n.f();
    }

    public static final void e(plc plc, wjc wjc) {
        boolean z;
        plc.getClass();
        i<Episode> b2 = wjc.b();
        plc.c = b2.getUnrangedLength() >= plc.b;
        esc esc = new esc();
        boolean f2 = wjc.f();
        List<Episode> items = b2.getItems();
        ArrayList arrayList = new ArrayList(d.e(items, 10));
        Iterator<T> it = items.iterator();
        int i = 0;
        while (true) {
            T t = null;
            if (it.hasNext()) {
                T next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    T t2 = next;
                    k kVar = plc.o;
                    Object[] array = b2.getItems().toArray(new Episode[0]);
                    if (array != null) {
                        arrayList.add(kVar.a(t2, (Episode[]) array, i, f2 || !t2.g()));
                        i = i2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    d.L();
                    throw null;
                }
            } else {
                esc.g(arrayList);
                if (wjc.d() > 0) {
                    esc.e().add(new bgc.a(wjc.d()));
                    Iterator<T> it2 = b2.getItems().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (plc.s.a(next2) == EpisodeTypeViewSelector.EpisodeType.UNFINISHED) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            t = next2;
                            break;
                        }
                    }
                    if (t != null) {
                        Episode.a a2 = Episode.a();
                        a2.f("unfinished");
                        a2.i("unfinished");
                        a2.F(Episode.MediaType.AUDIO);
                        Episode build = a2.build();
                        dsc a3 = plc.o.a(build, new Episode[]{build}, 0, false);
                        if (a3 != null) {
                            esc.e().add(a3);
                        }
                    }
                }
                rlc rlc = plc.n;
                h.d(esc, "episodeElements");
                rlc.h(esc);
                if (b2.getItems().isEmpty()) {
                    plc.n.f();
                    return;
                }
                plc.n.i();
                onc c2 = wjc.c();
                c2.getClass();
                if ((c2 instanceof onc.b) || (c2 instanceof onc.a)) {
                    plc.r.d(new dtc(null, null, null, null, false, 0, 63));
                } else {
                    onc.c cVar = (onc.c) c2;
                    plc.r.d(new dtc(cVar.d(), cVar.b(), cVar.c(), cVar.a(), cVar.f(), cVar.e()));
                }
                plc.n.b();
                return;
            }
        }
    }

    private final void i(wjc wjc) {
        s<wjc> sVar;
        io.reactivex.disposables.a aVar = this.a;
        io.reactivex.a g = this.n.g();
        if (wjc == null) {
            sVar = this.p.b(0, this.b);
        } else {
            sVar = this.p.b(0, this.b).G0(wjc);
            h.d(sVar, "dataSource.getData(0, ra…d).startWith(initialData)");
        }
        aVar.b(g.g(sVar).o0(this.f).subscribe(new a(this), new b(this)));
    }

    @Override // com.spotify.music.podcastentityrow.m
    public void a() {
        this.a.f();
        i(null);
    }

    @Override // defpackage.olc
    public void b() {
        if (this.a.h() > 0) {
            this.n.c();
        }
    }

    @Override // defpackage.olc
    public void d(Bundle bundle) {
        h.e(bundle, "state");
        this.b = bundle.getInt("range_length", this.q);
        this.n.d(bundle);
    }

    @Override // defpackage.olc
    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt("range_length", this.b);
        bundle.putAll(this.n.e());
        return bundle;
    }

    @Override // defpackage.olc
    public void g(wjc wjc) {
        h.e(wjc, "initialData");
        i(wjc);
    }

    @Override // defpackage.npa
    public void h(int i) {
        this.b = i;
        this.a.f();
        i(null);
    }

    @Override // defpackage.npa
    public boolean j() {
        return this.c;
    }

    @Override // defpackage.olc
    public void stop() {
        this.a.f();
    }
}
