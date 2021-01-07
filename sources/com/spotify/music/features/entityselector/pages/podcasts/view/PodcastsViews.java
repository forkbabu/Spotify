package com.spotify.music.features.entityselector.pages.podcasts.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.h;
import defpackage.gz4;
import defpackage.iz4;
import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;

public final class PodcastsViews implements Object {
    private final View a;
    private final PublishSubject<sy4> b;
    private final d c;
    private final View f;
    private final TextView n;
    private final TextView o;
    private final Button p;
    private final RecyclerView q;
    private final TextView r;
    private final hj0<kz4> s;
    private final pj0<iz4> t;

    public static final class a implements h<kz4> {
        final /* synthetic */ PodcastsViews a;
        final /* synthetic */ oj0 b;

        a(PodcastsViews podcastsViews, oj0 oj0) {
            this.a = podcastsViews;
            this.b = oj0;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            kz4 kz4 = (kz4) obj;
            kotlin.jvm.internal.h.e(kz4, "model");
            this.a.s.e(kz4);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    static final class b<T, R> implements xi0<View, iz4.b> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public /* bridge */ /* synthetic */ iz4.b apply(View view) {
            return iz4.b.a;
        }
    }

    static final class c<T, R> implements xi0<sy4, iz4.a> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public iz4.a apply(sy4 sy4) {
            sy4 sy42 = sy4;
            kotlin.jvm.internal.h.d(sy42, "podcastEpisode");
            return new iz4.a(sy42);
        }
    }

    static final class d<A> implements qj0<sy4> {
        final /* synthetic */ PodcastsViews a;

        static final class a implements oj0 {
            final /* synthetic */ io.reactivex.disposables.b a;

            a(io.reactivex.disposables.b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.oj0
            public final void dispose() {
                this.a.dispose();
            }
        }

        static final class b<T> implements g<sy4> {
            final /* synthetic */ wi0 a;

            b(wi0 wi0) {
                this.a = wi0;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: wi0 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.g
            public void accept(sy4 sy4) {
                this.a.a(sy4);
            }
        }

        d(PodcastsViews podcastsViews) {
            this.a = podcastsViews;
        }

        @Override // defpackage.qj0
        public final oj0 a(wi0<sy4> wi0) {
            return new a(this.a.b.subscribe(new b(wi0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.spotify.music.features.entityselector.pages.podcasts.view.c] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00ad: APUT  
      (r2v3 hj0[])
      (0 ??[int, short, byte, char])
      (wrap: hj0 : 0x00a9: INVOKE  (r3v3 hj0) = 
      (wrap: xi0 : 0x0099: CHECK_CAST (r3v2 xi0) = (xi0) (r3v1 kotlin.reflect.g))
      (wrap: hj0 : 0x00a5: INVOKE  (r4v1 hj0) = 
      (wrap: com.spotify.music.features.entityselector.pages.podcasts.view.b : 0x00a2: CONSTRUCTOR  (r5v0 com.spotify.music.features.entityselector.pages.podcasts.view.b) = 
      (wrap: com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$diffuser$2 : 0x009d: CONSTRUCTOR  (r4v0 com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$diffuser$2) = (r6v0 'this' com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews A[IMMUTABLE_TYPE, THIS]) call: com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$diffuser$2.<init>(com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews):void type: CONSTRUCTOR)
     call: com.spotify.music.features.entityselector.pages.podcasts.view.b.<init>(nmf):void type: CONSTRUCTOR)
     type: STATIC call: hj0.a(wi0):hj0)
     type: STATIC call: hj0.d(xi0, hj0):hj0)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PodcastsViews(android.view.LayoutInflater r7, android.view.ViewGroup r8, com.squareup.picasso.Picasso r9) {
        /*
            r6 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.h.e(r7, r0)
            java.lang.String r0 = "picasso"
            kotlin.jvm.internal.h.e(r9, r0)
            r6.<init>()
            r0 = 2131624824(0x7f0e0378, float:1.8876839E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            java.lang.String r8 = "inflater.inflate(R.layou…_fragment, parent, false)"
            kotlin.jvm.internal.h.d(r7, r8)
            r6.a = r7
            io.reactivex.subjects.PublishSubject r8 = io.reactivex.subjects.PublishSubject.h1()
            java.lang.String r0 = "PublishSubject.create<PodcastEpisode>()"
            kotlin.jvm.internal.h.d(r8, r0)
            r6.b = r8
            com.spotify.music.features.entityselector.pages.podcasts.view.d r0 = new com.spotify.music.features.entityselector.pages.podcasts.view.d
            r0.<init>(r9, r8)
            r6.c = r0
            r8 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r8 = defpackage.q4.G(r7, r8)
            java.lang.String r9 = "requireViewById<View>(root, R.id.loading)"
            kotlin.jvm.internal.h.d(r8, r9)
            r6.f = r8
            r8 = 2131428356(0x7f0b0404, float:1.8478354E38)
            android.view.View r8 = defpackage.q4.G(r7, r8)
            java.lang.String r9 = "requireViewById<TextView…d.empty_podcast_episodes)"
            kotlin.jvm.internal.h.d(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.n = r8
            r8 = 2131431116(0x7f0b0ecc, float:1.8483952E38)
            android.view.View r8 = defpackage.q4.G(r7, r8)
            java.lang.String r9 = "requireViewById<TextView>(root, R.id.retry_text)"
            kotlin.jvm.internal.h.d(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.o = r8
            r8 = 2131431115(0x7f0b0ecb, float:1.848395E38)
            android.view.View r8 = defpackage.q4.G(r7, r8)
            java.lang.String r9 = "requireViewById<Button>(root, R.id.retry_button)"
            kotlin.jvm.internal.h.d(r8, r9)
            android.widget.Button r8 = (android.widget.Button) r8
            r6.p = r8
            r9 = 2131431048(0x7f0b0e88, float:1.8483814E38)
            android.view.View r9 = defpackage.q4.G(r7, r9)
            java.lang.String r2 = "requireViewById<Recycler…ntly_played_recyclerview)"
            kotlin.jvm.internal.h.d(r9, r2)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r6.q = r9
            r2 = 2131431047(0x7f0b0e87, float:1.8483812E38)
            android.view.View r7 = defpackage.q4.G(r7, r2)
            java.lang.String r2 = "requireViewById<TextView…ot, R.id.recently_played)"
            kotlin.jvm.internal.h.d(r7, r2)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.r = r7
            r7 = 1
            hj0[] r2 = new defpackage.hj0[r7]
            kotlin.reflect.g r3 = com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$diffuser$1.a
            if (r3 == 0) goto L_0x0099
            com.spotify.music.features.entityselector.pages.podcasts.view.c r4 = new com.spotify.music.features.entityselector.pages.podcasts.view.c
            r4.<init>(r3)
            r3 = r4
        L_0x0099:
            xi0 r3 = (defpackage.xi0) r3
            com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$diffuser$2 r4 = new com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$diffuser$2
            r4.<init>(r6)
            com.spotify.music.features.entityselector.pages.podcasts.view.b r5 = new com.spotify.music.features.entityselector.pages.podcasts.view.b
            r5.<init>(r4)
            hj0 r4 = defpackage.hj0.a(r5)
            hj0 r3 = defpackage.hj0.d(r3, r4)
            r2[r1] = r3
            hj0 r2 = defpackage.hj0.b(r2)
            r6.s = r2
            r2 = 2
            pj0[] r2 = new defpackage.pj0[r2]
            com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$b r3 = com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews.b.a
            pj0 r8 = defpackage.bj0.a(r8)
            pj0 r8 = defpackage.pj0.b(r3, r8)
            r2[r1] = r8
            com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$c r8 = com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews.c.a
            com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$d r1 = new com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews$d
            r1.<init>(r6)
            pj0 r1 = defpackage.pj0.c(r1)
            pj0 r8 = defpackage.pj0.b(r8, r1)
            r2[r7] = r8
            pj0 r7 = new pj0
            r7.<init>(r2)
            r6.t = r7
            r9.setAdapter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews.<init>(android.view.LayoutInflater, android.view.ViewGroup, com.squareup.picasso.Picasso):void");
    }

    public static final void c(PodcastsViews podcastsViews, gz4 gz4) {
        podcastsViews.getClass();
        if (gz4 instanceof gz4.a) {
            podcastsViews.f.setVisibility(8);
            podcastsViews.n.setVisibility(0);
            podcastsViews.r.setVisibility(8);
            podcastsViews.q.setVisibility(8);
            podcastsViews.o.setVisibility(8);
            podcastsViews.p.setVisibility(8);
        } else if (gz4 instanceof gz4.b) {
            podcastsViews.f.setVisibility(8);
            podcastsViews.o.setVisibility(0);
            podcastsViews.p.setVisibility(0);
            podcastsViews.n.setVisibility(8);
            podcastsViews.r.setVisibility(8);
            podcastsViews.q.setVisibility(8);
        } else if (gz4 instanceof gz4.d) {
            podcastsViews.f.setVisibility(0);
            podcastsViews.n.setVisibility(8);
            podcastsViews.o.setVisibility(8);
            podcastsViews.p.setVisibility(8);
            podcastsViews.r.setVisibility(8);
            podcastsViews.q.setVisibility(8);
        } else if (gz4 instanceof gz4.c) {
            podcastsViews.f.setVisibility(8);
            podcastsViews.n.setVisibility(8);
            podcastsViews.r.setVisibility(0);
            podcastsViews.q.setVisibility(0);
            podcastsViews.o.setVisibility(8);
            podcastsViews.p.setVisibility(8);
            podcastsViews.c.b0(((gz4.c) gz4).a());
        }
    }

    public final View d() {
        return this.a;
    }

    public h<kz4> t(da2<iz4> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        return new a(this, this.t.a(new b(new PodcastsViews$connect$disposable$1(da2))));
    }
}
