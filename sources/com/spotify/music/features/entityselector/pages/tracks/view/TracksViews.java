package com.spotify.music.features.entityselector.pages.tracks.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.entityselector.common.a;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import defpackage.d05;
import defpackage.g05;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

public final class TracksViews implements g<f05, d05> {
    private final View a;
    private final PublishSubject<com.spotify.music.features.entityselector.common.a> b;
    private final a c;
    private final View f;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final Button q;
    private final TextView r;
    private final ToolbarSearchFieldView s;
    private final RecyclerView t;
    private final hj0<f05> u;
    private final pj0<d05> v;

    public static final class a implements ToolbarSearchFieldView.e {
        final /* synthetic */ da2 a;

        a(da2 da2) {
            this.a = da2;
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void a() {
            this.a.accept(d05.f.a);
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void b() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void c() {
        }
    }

    public static final class b implements h<f05> {
        final /* synthetic */ TracksViews a;
        final /* synthetic */ oj0 b;
        final /* synthetic */ io.reactivex.disposables.b c;

        b(TracksViews tracksViews, oj0 oj0, io.reactivex.disposables.b bVar) {
            this.a = tracksViews;
            this.b = oj0;
            this.c = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f05 f05 = (f05) obj;
            kotlin.jvm.internal.h.e(f05, "model");
            this.a.u.e(f05);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            this.a.s.setOnClickListener(null);
            this.c.dispose();
        }
    }

    static final class c<T> implements io.reactivex.functions.g<com.spotify.music.features.entityselector.common.a> {
        final /* synthetic */ da2 a;

        c(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(com.spotify.music.features.entityselector.common.a aVar) {
            com.spotify.music.features.entityselector.common.a aVar2 = aVar;
            if (aVar2 instanceof a.c) {
                this.a.accept(new d05.d(((a.c) aVar2).a()));
            } else if (aVar2 instanceof a.b) {
                this.a.accept(new d05.c(((a.b) aVar2).a()));
            } else if (aVar2 instanceof a.C0229a) {
                this.a.accept(new d05.a(((a.C0229a) aVar2).a()));
            }
        }
    }

    static final class d<T, R> implements xi0<View, d05.b> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public /* bridge */ /* synthetic */ d05.b apply(View view) {
            return d05.b.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.spotify.music.features.entityselector.pages.tracks.view.d] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00d2: APUT  
      (r9v3 hj0[])
      (0 ??[int, short, byte, char])
      (wrap: hj0 : 0x00ce: INVOKE  (r2v3 hj0) = 
      (wrap: xi0 : 0x00be: CHECK_CAST (r2v2 xi0) = (xi0) (r2v1 kotlin.reflect.g))
      (wrap: hj0 : 0x00ca: INVOKE  (r3v1 hj0) = 
      (wrap: com.spotify.music.features.entityselector.pages.tracks.view.c : 0x00c7: CONSTRUCTOR  (r4v0 com.spotify.music.features.entityselector.pages.tracks.view.c) = 
      (wrap: com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$diffuser$2 : 0x00c2: CONSTRUCTOR  (r3v0 com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$diffuser$2) = (r5v0 'this' com.spotify.music.features.entityselector.pages.tracks.view.TracksViews A[IMMUTABLE_TYPE, THIS]) call: com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$diffuser$2.<init>(com.spotify.music.features.entityselector.pages.tracks.view.TracksViews):void type: CONSTRUCTOR)
     call: com.spotify.music.features.entityselector.pages.tracks.view.c.<init>(nmf):void type: CONSTRUCTOR)
     type: STATIC call: hj0.a(wi0):hj0)
     type: STATIC call: hj0.d(xi0, hj0):hj0)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TracksViews(android.view.LayoutInflater r6, android.view.ViewGroup r7, com.squareup.picasso.Picasso r8, com.spotify.music.preview.q r9) {
        /*
            r5 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.h.e(r6, r0)
            java.lang.String r0 = "picasso"
            kotlin.jvm.internal.h.e(r8, r0)
            java.lang.String r0 = "previewOverlay"
            kotlin.jvm.internal.h.e(r9, r0)
            r5.<init>()
            r0 = 2131625060(0x7f0e0464, float:1.8877317E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r7, r1)
            java.lang.String r7 = "inflater.inflate(R.layou…_fragment, parent, false)"
            kotlin.jvm.internal.h.d(r6, r7)
            r5.a = r6
            io.reactivex.subjects.PublishSubject r7 = io.reactivex.subjects.PublishSubject.h1()
            java.lang.String r0 = "PublishSubject.create<UserInteraction>()"
            kotlin.jvm.internal.h.d(r7, r0)
            r5.b = r7
            com.spotify.music.features.entityselector.pages.tracks.view.a r0 = new com.spotify.music.features.entityselector.pages.tracks.view.a
            r0.<init>(r8, r9, r7)
            r5.c = r0
            r7 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<View>(root, R.id.loading)"
            kotlin.jvm.internal.h.d(r7, r8)
            r5.f = r7
            r7 = 2131428364(0x7f0b040c, float:1.847837E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<TextView…t, R.id.empty_track_view)"
            kotlin.jvm.internal.h.d(r7, r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.n = r7
            r7 = 2131428365(0x7f0b040d, float:1.8478372E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<TextView…mpty_track_view_subtitle)"
            kotlin.jvm.internal.h.d(r7, r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.o = r7
            r7 = 2131431116(0x7f0b0ecc, float:1.8483952E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<TextView>(root, R.id.retry_text)"
            kotlin.jvm.internal.h.d(r7, r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.p = r7
            r7 = 2131431115(0x7f0b0ecb, float:1.848395E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<Button>(root, R.id.retry_button)"
            kotlin.jvm.internal.h.d(r7, r8)
            android.widget.Button r7 = (android.widget.Button) r7
            r5.q = r7
            r8 = 2131431564(0x7f0b108c, float:1.848486E38)
            android.view.View r8 = defpackage.q4.G(r6, r8)
            java.lang.String r9 = "requireViewById<TextView>(root, R.id.suggested)"
            kotlin.jvm.internal.h.d(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5.r = r8
            r8 = 2131431230(0x7f0b0f3e, float:1.8484183E38)
            android.view.View r8 = defpackage.q4.G(r6, r8)
            java.lang.String r9 = "requireViewById<ToolbarS…oot, R.id.search_toolbar)"
            kotlin.jvm.internal.h.d(r8, r9)
            com.spotify.music.libs.search.view.ToolbarSearchFieldView r8 = (com.spotify.music.libs.search.view.ToolbarSearchFieldView) r8
            r5.s = r8
            r8 = 2131431565(0x7f0b108d, float:1.8484863E38)
            android.view.View r6 = defpackage.q4.G(r6, r8)
            java.lang.String r8 = "requireViewById<Recycler…d.suggested_recyclerview)"
            kotlin.jvm.internal.h.d(r6, r8)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r5.t = r6
            r8 = 1
            hj0[] r9 = new defpackage.hj0[r8]
            kotlin.reflect.g r2 = com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$diffuser$1.a
            if (r2 == 0) goto L_0x00be
            com.spotify.music.features.entityselector.pages.tracks.view.d r3 = new com.spotify.music.features.entityselector.pages.tracks.view.d
            r3.<init>(r2)
            r2 = r3
        L_0x00be:
            xi0 r2 = (defpackage.xi0) r2
            com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$diffuser$2 r3 = new com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$diffuser$2
            r3.<init>(r5)
            com.spotify.music.features.entityselector.pages.tracks.view.c r4 = new com.spotify.music.features.entityselector.pages.tracks.view.c
            r4.<init>(r3)
            hj0 r3 = defpackage.hj0.a(r4)
            hj0 r2 = defpackage.hj0.d(r2, r3)
            r9[r1] = r2
            hj0 r9 = defpackage.hj0.b(r9)
            r5.u = r9
            pj0[] r8 = new defpackage.pj0[r8]
            com.spotify.music.features.entityselector.pages.tracks.view.TracksViews$d r9 = com.spotify.music.features.entityselector.pages.tracks.view.TracksViews.d.a
            pj0 r7 = defpackage.bj0.a(r7)
            pj0 r7 = defpackage.pj0.b(r9, r7)
            r8[r1] = r7
            pj0 r7 = new pj0
            r7.<init>(r8)
            r5.v = r7
            r6.setAdapter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.entityselector.pages.tracks.view.TracksViews.<init>(android.view.LayoutInflater, android.view.ViewGroup, com.squareup.picasso.Picasso, com.spotify.music.preview.q):void");
    }

    public static final void c(TracksViews tracksViews, g05 g05) {
        tracksViews.getClass();
        if (g05 instanceof g05.a) {
            tracksViews.f.setVisibility(8);
            tracksViews.n.setVisibility(0);
            tracksViews.o.setVisibility(0);
            tracksViews.r.setVisibility(8);
            tracksViews.t.setVisibility(8);
            tracksViews.p.setVisibility(8);
            tracksViews.q.setVisibility(8);
        } else if (g05 instanceof g05.b) {
            tracksViews.f.setVisibility(8);
            tracksViews.p.setVisibility(0);
            tracksViews.q.setVisibility(0);
            tracksViews.n.setVisibility(8);
            tracksViews.o.setVisibility(8);
            tracksViews.r.setVisibility(8);
            tracksViews.t.setVisibility(8);
        } else if (g05 instanceof g05.d) {
            tracksViews.f.setVisibility(0);
            tracksViews.n.setVisibility(8);
            tracksViews.o.setVisibility(8);
            tracksViews.p.setVisibility(8);
            tracksViews.q.setVisibility(8);
            tracksViews.r.setVisibility(8);
            tracksViews.t.setVisibility(8);
        } else if (g05 instanceof g05.c) {
            List<uy4> a2 = ((g05.c) g05).a();
            tracksViews.f.setVisibility(8);
            tracksViews.n.setVisibility(8);
            tracksViews.o.setVisibility(8);
            tracksViews.r.setVisibility(0);
            tracksViews.t.setVisibility(0);
            tracksViews.p.setVisibility(8);
            tracksViews.q.setVisibility(8);
            tracksViews.c.b0(a2);
        }
    }

    public final View d() {
        return this.a;
    }

    @Override // com.spotify.mobius.g
    public h<f05> t(da2<d05> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        oj0 a2 = this.v.a(new c(new TracksViews$connect$disposable$1(da2)));
        this.s.setToolbarSearchFieldCallbacks(new a(da2));
        return new b(this, a2, this.b.subscribe(new c(da2)));
    }
}
