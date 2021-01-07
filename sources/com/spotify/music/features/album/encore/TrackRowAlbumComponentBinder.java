package com.spotify.music.features.album.encore;

import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.entrypoint.EncoreConsumerExtensions;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.album.f;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.offline.c;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class TrackRowAlbumComponentBinder extends qk9<Holder> {
    private final EncoreConsumerEntryPoint a;
    private final vd3 b;
    private final m c;
    private final gxc f;

    public static final class Holder extends s51.c.a<View> {
        private final TrackRowAlbum b;
        private final vd3 c;
        private final m f;
        private final gxc n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(TrackRowAlbum trackRowAlbum, vd3 vd3, m mVar, gxc gxc) {
            super(trackRowAlbum.getView());
            h.e(trackRowAlbum, "trackRowAlbum");
            h.e(vd3, "trackRowInteractionsListener");
            h.e(mVar, "trackRowAlbumInteractionLogger");
            h.e(gxc, "premiumMiniTooltipManager");
            this.b = trackRowAlbum;
            this.c = vd3;
            this.f = mVar;
            this.n = gxc;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            a aVar;
            DownloadState downloadState;
            String str;
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            byte[] byteArray = s81.custom().byteArray("availability");
            if (byteArray == null) {
                aVar = a.f.a;
            } else {
                c cVar = new c();
                Parcel obtain = Parcel.obtain();
                h.d(obtain, "Parcel.obtain()");
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                aVar = cVar.a(obtain);
                obtain.recycle();
            }
            if (aVar instanceof a.C0377a) {
                downloadState = DownloadState.Downloaded;
            } else if (aVar instanceof a.b) {
                downloadState = DownloadState.Downloading;
            } else if (aVar instanceof a.h) {
                downloadState = DownloadState.Waiting;
            } else if (aVar instanceof a.c) {
                downloadState = DownloadState.Error;
            } else {
                downloadState = DownloadState.Empty;
            }
            String subtitle = s81.text().subtitle();
            String str2 = subtitle != null ? subtitle : "";
            boolean a = h.a(s81.custom().string("hubs:glue:highlight", Ad.DEFAULT_SKIPPABLE_AD_DELAY), "1");
            q4.I(this.b.getView(), new k(a));
            boolean z = !s81.custom().boolValue("disabled", false) && !s81.custom().boolValue("hubs:glue:muted", false);
            boolean boolValue = s81.custom().boolValue("appears_disabled", false);
            String title = s81.text().title();
            if (title != null) {
                str = title;
            } else {
                str = "";
            }
            TrackRowAlbum.Model model = new TrackRowAlbum.Model(str, e.w(str2, new String[]{","}, false, 0, 6, null), downloadState, f.a(s81), a, z, boolValue, false, false, 384, null);
            Integer intValue = s81.logging().intValue("ui:index_in_block");
            String string = s81.metadata().string("uri");
            if (string == null) {
                string = "";
            }
            this.b.render(model);
            this.b.onEvent(new TrackRowAlbumComponentBinder$Holder$onBind$1(this, s81, string, intValue));
            if (intValue != null && intValue.intValue() == 0) {
                this.n.a(this.b.getView());
            }
        }
    }

    public TrackRowAlbumComponentBinder(EncoreConsumerEntryPoint encoreConsumerEntryPoint, vd3 vd3, m mVar, gxc gxc) {
        h.e(encoreConsumerEntryPoint, "encoreConsumer");
        h.e(vd3, "trackRowInteractionsListener");
        h.e(mVar, "trackRowAlbumInteractionLogger");
        h.e(gxc, "premiumMiniTooltipManager");
        this.a = encoreConsumerEntryPoint;
        this.b = vd3;
        this.c = mVar;
        this.f = gxc;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new Holder(EncoreConsumerExtensions.trackRowAlbumFactory(this.a.getRows()).make(), this.b, this.c, this.f);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_track_row_album;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }
}
