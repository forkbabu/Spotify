package com.spotify.music.features.listeninghistory.ui.encore;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.music.C0707R;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import defpackage.s51;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.y;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class EncoreEpisodeRowComponent extends qk9<Holder> {
    private final q a = new q();
    private final HashMap<String, Integer> b = new HashMap<>();
    private final cqe c;
    private final y f;
    private final y n;
    private final wlf<EpisodeRowListeningHistory> o;
    private final vd3 p;
    private final g<PlayerState> q;

    public static final class Holder extends s51.c.a<View> {
        private s81 b = HubsImmutableComponentModel.Companion.a().l();
        private String c = "";
        private final EpisodeRowListeningHistory f;
        private final vd3 n;
        private final g<PlayerState> o;
        private final cqe p;
        private final y q;
        private final y r;
        private final q s;
        private final HashMap<String, Integer> t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(EpisodeRowListeningHistory episodeRowListeningHistory, vd3 vd3, g<PlayerState> gVar, cqe cqe, y yVar, y yVar2, q qVar, HashMap<String, Integer> hashMap) {
            super(episodeRowListeningHistory.getView());
            h.e(episodeRowListeningHistory, "episodeRow");
            h.e(vd3, "listener");
            h.e(gVar, "playerState");
            h.e(cqe, "clock");
            h.e(yVar, "mainThreadScheduler");
            h.e(yVar2, "compScheduler");
            h.e(qVar, "disposables");
            h.e(hashMap, "playedEpisodesDuration");
            this.f = episodeRowListeningHistory;
            this.n = vd3;
            this.o = gVar;
            this.p = cqe;
            this.q = yVar;
            this.r = yVar2;
            this.s = qVar;
            this.t = hashMap;
            qVar.a(new FlowableOnBackpressureDrop(g.M(0, 2, TimeUnit.SECONDS, yVar2).F(new a(this))).Q(yVar).subscribe(new b(this), new c(this)));
        }

        /* access modifiers changed from: private */
        public final EpisodeRowListeningHistory.Model J(boolean z, int i) {
            String str;
            int i2;
            String title = this.b.text().title();
            String str2 = title != null ? title : "";
            String string = this.b.metadata().string("creator_name");
            if (string != null) {
                str = string;
            } else {
                str = "";
            }
            x81 main = this.b.images().main();
            CoverArt.ImageData create = CoverArt.ImageData.create(main != null ? main.uri() : null);
            h.d(create, "CoverArt.ImageData.creat…a.images().main()?.uri())");
            int intValue = this.b.metadata().intValue("duration", 0);
            if (intValue != 0) {
                double d = (double) i;
                double d2 = (double) intValue;
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double d4 = (double) 100;
                Double.isNaN(d4);
                Double.isNaN(d4);
                i2 = (int) Math.ceil(d3 * d4);
            } else {
                i2 = 0;
            }
            return new EpisodeRowListeningHistory.Model(str2, str, create, z, i2);
        }

        static /* synthetic */ EpisodeRowListeningHistory.Model K(Holder holder, boolean z, int i, int i2) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            return holder.J(z, i);
        }

        /* access modifiers changed from: private */
        public final int L() {
            Integer num = this.t.get(this.c);
            if (num == null) {
                num = Integer.valueOf(this.b.metadata().intValue("duration_played", 0));
            }
            return num.intValue();
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String str;
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            this.b = s81;
            o81 o81 = (o81) s81.events().get("click");
            if (o81 == null || (str = an5.a(o81)) == null) {
                str = "";
            }
            this.c = str;
            this.f.render(J(false, L()));
            this.f.onEvent(new EncoreEpisodeRowComponent$Holder$onBind$1(this, s81));
        }
    }

    public EncoreEpisodeRowComponent(n nVar, cqe cqe, y yVar, y yVar2, wlf<EpisodeRowListeningHistory> wlf, vd3 vd3, g<PlayerState> gVar) {
        h.e(nVar, "lifecycleOwner");
        h.e(cqe, "clock");
        h.e(yVar, "mainThreadScheduler");
        h.e(yVar2, "compScheduler");
        h.e(wlf, "episodeRow");
        h.e(vd3, "clickListener");
        h.e(gVar, "playerState");
        this.c = cqe;
        this.f = yVar;
        this.n = yVar2;
        this.o = wlf;
        this.p = vd3;
        this.q = gVar;
        nVar.A().a(new m(this) {
            /* class com.spotify.music.features.listeninghistory.ui.encore.EncoreEpisodeRowComponent.AnonymousClass1 */
            final /* synthetic */ EncoreEpisodeRowComponent a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.a = r1;
            }

            @w(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                this.a.a.c();
            }
        });
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        EpisodeRowListeningHistory episodeRowListeningHistory = this.o.get();
        h.d(episodeRowListeningHistory, "episodeRow.get()");
        return new Holder(episodeRowListeningHistory, this.p, this.q, this.c, this.f, this.n, this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_episode_row;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(Trait.STACKABLE)");
        return of;
    }
}
