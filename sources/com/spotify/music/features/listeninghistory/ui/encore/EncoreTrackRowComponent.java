package com.spotify.music.features.listeninghistory.ui.encore;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.components.glue.t;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.music.C0707R;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import defpackage.s51;
import io.reactivex.g;
import io.reactivex.y;
import java.util.EnumSet;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class EncoreTrackRowComponent extends qk9<Holder> {
    private final q a = new q();
    private final wlf<TrackRow> b;
    private final vd3 c;
    private g<PlayerState> f;

    public static final class Holder extends s51.c.a<View> {
        private s81 b = HubsImmutableComponentModel.Companion.a().l();
        private final TrackRow c;
        private final vd3 f;
        private final g<PlayerState> n;
        private final q o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(TrackRow trackRow, vd3 vd3, g<PlayerState> gVar, q qVar) {
            super(trackRow.getView());
            h.e(trackRow, "trackRow");
            h.e(vd3, "listener");
            h.e(gVar, "playerState");
            h.e(qVar, "disposables");
            this.c = trackRow;
            this.f = vd3;
            this.n = gVar;
            this.o = qVar;
            qVar.a(gVar.l(PlayerStateTransformers.c()).subscribe(new f(this), new g(this)));
        }

        /* access modifiers changed from: private */
        public final TrackRow.Model F(boolean z) {
            boolean z2 = !this.b.custom().boolValue("disabled", false) && !t.b(this.b);
            String title = this.b.text().title();
            String str = "";
            String str2 = title != null ? title : str;
            String string = this.b.metadata().string("creator_name");
            if (string != null) {
                str = string;
            }
            List t = d.t(str);
            x81 main = this.b.images().main();
            return new TrackRow.Model(str2, t, new Artwork.ImageData(main != null ? main.uri() : null), null, null, null, null, z, z2, false, false, 1656, null);
        }

        static /* synthetic */ TrackRow.Model G(Holder holder, boolean z, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            return holder.F(z);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            this.b = s81;
            this.c.render(F(false));
            this.c.onEvent(new EncoreTrackRowComponent$Holder$onBind$1(this, s81));
        }
    }

    public EncoreTrackRowComponent(y yVar, n nVar, wlf<TrackRow> wlf, vd3 vd3, g<PlayerState> gVar) {
        h.e(yVar, "mainThreadScheduler");
        h.e(nVar, "lifecycleOwner");
        h.e(wlf, "trackRowProvider");
        h.e(vd3, "listener");
        h.e(gVar, "playerState");
        this.b = wlf;
        this.c = vd3;
        this.f = gVar;
        g<PlayerState> Q = this.f.Q(yVar);
        h.d(Q, "playerState.observeOn(mainThreadScheduler)");
        this.f = Q;
        nVar.A().a(new m(this) {
            /* class com.spotify.music.features.listeninghistory.ui.encore.EncoreTrackRowComponent.AnonymousClass1 */
            final /* synthetic */ EncoreTrackRowComponent a;

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
        TrackRow trackRow = this.b.get();
        h.d(trackRow, "trackRowProvider.get()");
        return new Holder(trackRow, this.c, this.f, this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_track_row;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(Trait.STACKABLE)");
        return of;
    }
}
