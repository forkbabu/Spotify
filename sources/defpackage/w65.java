package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.trackrow.Event;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.spotify.encore.consumer.components.artist.entrypoint.EncoreConsumerTrackRowArtistExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.f;

/* renamed from: w65  reason: default package */
public class w65 extends qk9<a> {
    private final EncoreConsumerEntryPoint a;
    private final vd3 b;
    private final kcb c;
    private final y65 f;
    private final gxc n;

    /* renamed from: w65$a */
    static class a extends s51.c.a<View> {
        private final Component<TrackRowArtist.Model, Event> b;
        private final vd3 c;
        private final kcb f;
        private final y65 n;
        private final gxc o;

        protected a(Component<TrackRowArtist.Model, Event> component, vd3 vd3, kcb kcb, y65 y65, gxc gxc) {
            super(component.getView());
            this.b = component;
            this.c = vd3;
            this.f = kcb;
            this.n = y65;
            this.o = gxc;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        public /* synthetic */ f B(s81 s81, int i, String str, Event event) {
            int ordinal = event.ordinal();
            if (ordinal == 0) {
                this.c.c(s81);
                this.n.b(i, str);
            } else if (ordinal == 1) {
                this.c.b();
            } else if (ordinal == 2) {
                this.c.a(s81);
                this.n.a(i, str);
            }
            return f.a;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // defpackage.s51.c.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void z(defpackage.s81 r17, defpackage.w51 r18, defpackage.s51.b r19) {
            /*
                r16 = this;
                r0 = r16
                p81 r1 = r17.custom()
                java.lang.String r2 = "disabled"
                r3 = 0
                boolean r1 = r1.boolValue(r2, r3)
                if (r1 != 0) goto L_0x001d
                p81 r1 = r17.custom()
                java.lang.String r4 = "hubs:glue:muted"
                boolean r1 = r1.boolValue(r4, r3)
                if (r1 != 0) goto L_0x001d
                r11 = 1
                goto L_0x001e
            L_0x001d:
                r11 = 0
            L_0x001e:
                p81 r1 = r17.custom()
                java.lang.String r4 = "hubs:glue:highlight"
                java.lang.String r5 = "0"
                java.lang.String r1 = r1.string(r4, r5)
                java.lang.String r4 = "1"
                boolean r10 = r1.equals(r4)
                p81 r1 = r17.custom()
                java.lang.String r4 = "rowNumber"
                java.lang.Integer r1 = r1.intValue(r4)
                int r1 = r1.intValue()
                p81 r4 = r17.metadata()
                java.lang.String r5 = "uri"
                java.lang.String r15 = r4.string(r5)
                com.spotify.encore.Component<com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist$Model, com.spotify.encore.consumer.components.artist.api.trackrow.Event> r4 = r0.b
                android.view.View r4 = r4.getView()
                v65 r5 = new v65
                r5.<init>(r10)
                defpackage.q4.I(r4, r5)
                com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist$Model r14 = new com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist$Model
                w81 r4 = r17.text()
                java.lang.String r6 = r4.title()
                w81 r4 = r17.text()
                java.lang.String r7 = r4.subtitle()
                r81 r4 = r17.images()
                x81 r4 = r4.main()
                java.lang.String r4 = r4.uri()
                com.spotify.encore.consumer.elements.coverart.CoverArt$ImageData r8 = com.spotify.encore.consumer.elements.coverart.CoverArt.ImageData.create(r4)
                p81 r4 = r17.custom()
                java.lang.String r5 = "label"
                java.lang.String r4 = r4.string(r5)
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x009e
                java.lang.String r5 = "explicit"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L_0x0093
                com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r4 = com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction.Explicit
                goto L_0x00a0
            L_0x0093:
                java.lang.String r5 = "19"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x009e
                com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r4 = com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction.Over19Only
                goto L_0x00a0
            L_0x009e:
                com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction r4 = com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction.None
            L_0x00a0:
                r9 = r4
                p81 r4 = r17.custom()
                java.lang.String r5 = "isPremium"
                boolean r12 = r4.boolValue(r5, r3)
                kcb r4 = r0.f
                boolean r4 = r4.b()
                if (r4 == 0) goto L_0x00c1
                p81 r4 = r17.custom()
                java.lang.String r5 = "hasLyrics"
                boolean r4 = r4.boolValue(r5, r3)
                if (r4 == 0) goto L_0x00c1
                r13 = 1
                goto L_0x00c2
            L_0x00c1:
                r13 = 0
            L_0x00c2:
                com.spotify.encore.consumer.elements.badge.download.DownloadState r3 = com.spotify.encore.consumer.elements.badge.download.DownloadState.Empty
                r4 = r14
                r5 = r1
                r2 = r14
                r14 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                com.spotify.encore.Component<com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist$Model, com.spotify.encore.consumer.components.artist.api.trackrow.Event> r3 = r0.b
                r3.render(r2)
                com.spotify.encore.Component<com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist$Model, com.spotify.encore.consumer.components.artist.api.trackrow.Event> r2 = r0.b
                u65 r3 = new u65
                r4 = r17
                r3.<init>(r0, r4, r1, r15)
                r2.onEvent(r3)
                r2 = 1
                if (r1 != r2) goto L_0x00ea
                gxc r1 = r0.o
                com.spotify.encore.Component<com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist$Model, com.spotify.encore.consumer.components.artist.api.trackrow.Event> r2 = r0.b
                android.view.View r2 = r2.getView()
                r1.a(r2)
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.w65.a.z(s81, w51, s51$b):void");
        }
    }

    public w65(EncoreConsumerEntryPoint encoreConsumerEntryPoint, vd3 vd3, kcb kcb, y65 y65, gxc gxc) {
        this.a = encoreConsumerEntryPoint;
        this.b = vd3;
        this.c = kcb;
        this.f = y65;
        this.n = gxc;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(EncoreConsumerTrackRowArtistExtensions.trackRowArtistFactory(this.a.getRows()).make(), this.b, this.c, this.f, this.n);
    }

    @Override // defpackage.s51.c, defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_track_row_artist;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
