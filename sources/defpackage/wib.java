package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.a;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import com.spotify.music.marketingformats.playbutton.PlayPauseImageButton;
import com.squareup.picasso.Picasso;
import defpackage.zib;
import kotlin.jvm.internal.h;

/* renamed from: wib  reason: default package */
public final class wib extends hib<s81> {
    private final ImageView I;
    private final TextView J;
    private final TextView K;
    private final TextView L;
    private final PlayPauseImageButton M;
    private final ImageView N;
    private final CardView O;
    private String P;
    private final mhb Q;
    private final rhb R;
    private final Picasso S;
    private final thb T;
    private final dib U;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wib(android.view.ViewGroup r17, com.spotify.mobile.android.video.s r18, com.spotify.mobile.android.video.q r19, defpackage.sda r20, defpackage.mhb r21, defpackage.rhb r22, com.squareup.picasso.Picasso r23, defpackage.thb r24, defpackage.dib r25) {
        /*
            r16 = this;
            r9 = r16
            r0 = r17
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            java.lang.String r1 = "parent"
            kotlin.jvm.internal.h.e(r0, r1)
            java.lang.String r1 = "betamaxPlayerBuilder"
            r4 = r18
            kotlin.jvm.internal.h.e(r4, r1)
            java.lang.String r1 = "videoCache"
            r5 = r19
            kotlin.jvm.internal.h.e(r5, r1)
            java.lang.String r1 = "dataSaverModeActiveUtils"
            r6 = r20
            kotlin.jvm.internal.h.e(r6, r1)
            java.lang.String r1 = "logger"
            kotlin.jvm.internal.h.e(r10, r1)
            java.lang.String r1 = "navigationActionHandler"
            kotlin.jvm.internal.h.e(r11, r1)
            java.lang.String r1 = "picasso"
            kotlin.jvm.internal.h.e(r12, r1)
            java.lang.String r1 = "playbackActionHandler"
            kotlin.jvm.internal.h.e(r13, r1)
            java.lang.String r1 = "playerStateAwareViewManager"
            kotlin.jvm.internal.h.e(r14, r1)
            android.content.Context r1 = r17.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131624457(0x7f0e0209, float:1.8876094E38)
            r3 = 0
            android.view.View r15 = r1.inflate(r2, r0, r3)
            java.lang.String r0 = "LayoutInflater.from(pare…ity_slide, parent, false)"
            kotlin.jvm.internal.h.d(r15, r0)
            com.spotify.music.marketingformats.constants.MarketingFormatsComponentId r0 = com.spotify.music.marketingformats.constants.MarketingFormatsComponentId.n
            java.lang.String r3 = r0.d()
            r2 = 2131431911(0x7f0b11e7, float:1.8485565E38)
            r7 = 0
            r8 = 64
            r0 = r16
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.Q = r10
            r9.R = r11
            r9.S = r12
            r9.T = r13
            r9.U = r14
            r0 = 2131427605(0x7f0b0115, float:1.847683E38)
            android.view.View r0 = defpackage.q4.G(r15, r0)
            java.lang.String r1 = "requireViewById(itemView, R.id.background)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.I = r0
            android.view.View r0 = r9.a
            r1 = 2131430196(0x7f0b0b34, float:1.8482086E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.label)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.J = r0
            android.view.View r0 = r9.a
            r1 = 2131431668(0x7f0b10f4, float:1.8485072E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.title)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.K = r0
            android.view.View r0 = r9.a
            r1 = 2131430435(0x7f0b0c23, float:1.848257E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.metadata)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.L = r0
            android.view.View r0 = r9.a
            r1 = 2131430864(0x7f0b0dd0, float:1.848344E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.play_button)"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.music.marketingformats.playbutton.PlayPauseImageButton r0 = (com.spotify.music.marketingformats.playbutton.PlayPauseImageButton) r0
            r9.M = r0
            android.view.View r0 = r9.a
            r1 = 2131428932(0x7f0b0644, float:1.8479522E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.icon)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.N = r0
            android.view.View r0 = r9.a
            r1 = 2131427832(0x7f0b01f8, float:1.8477291E38)
            android.view.View r0 = defpackage.q4.G(r0, r1)
            java.lang.String r1 = "requireViewById(itemView, R.id.card)"
            kotlin.jvm.internal.h.d(r0, r1)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r9.O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wib.<init>(android.view.ViewGroup, com.spotify.mobile.android.video.s, com.spotify.mobile.android.video.q, sda, mhb, rhb, com.squareup.picasso.Picasso, thb, dib):void");
    }

    public static final void B0(wib wib, String str) {
        mhb mhb = wib.Q;
        String str2 = wib.P;
        if (str2 != null) {
            mhb.b(str2, "header-playable-entity", wib.w(), str);
        } else {
            h.k("loggablePageUri");
            throw null;
        }
    }

    public static final void C0(wib wib) {
        mhb mhb = wib.Q;
        String str = wib.P;
        if (str != null) {
            mhb.c(str, "header-playable-entity", wib.w());
        } else {
            h.k("loggablePageUri");
            throw null;
        }
    }

    public final void E0(String str) {
        h.e(str, "pageUri");
        this.P = str;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(Object obj, int i) {
        String uri;
        s81 s81 = (s81) obj;
        h.e(s81, "data");
        View view = this.a;
        h.d(view, "itemView");
        Context context = view.getContext();
        p81 custom = s81.custom();
        zib.a aVar = zib.a;
        String a = aVar.a(s81);
        this.K.setTextColor(a.b(context, aVar.h(a)));
        this.L.setTextColor(a.b(context, aVar.f(a)));
        this.J.setTextColor(a.b(context, aVar.e(a)));
        String b = aVar.b(s81);
        if (b != null) {
            this.S.m(b).n(this.I, null);
        }
        u0(aVar.c(s81));
        w81 text = s81.text();
        this.J.setText(text.accessory());
        this.K.setText(text.title());
        this.L.setText(text.subtitle());
        x81 main = s81.images().main();
        if (!(main == null || (uri = main.uri()) == null)) {
            this.S.m(uri).n(this.N, null);
        }
        this.O.setCardBackgroundColor(Color.parseColor(custom.string(MarketingFormatsCustomKey.KEY_ACCENT_COLOR.d())));
        String string = custom.string(MarketingFormatsCustomKey.KEY_SECONDARY_ACCENT_COLOR.d());
        PlayPauseImageButton playPauseImageButton = this.M;
        h.d(context, "context");
        playPauseImageButton.setBackground(new com.spotify.music.marketingformats.playbutton.a(context, Color.parseColor(string)));
        this.M.setPlaybackState(false);
        h.e(s81, "data");
        p81 metadata = s81.metadata();
        MarketingFormatsCustomKey marketingFormatsCustomKey = MarketingFormatsCustomKey.KEY_URI;
        String string2 = metadata.string(marketingFormatsCustomKey.d());
        if (string2 != null) {
            this.M.setOnClickListener(new gib(0, string2, this));
            this.O.setOnClickListener(new gib(1, string2, this));
        }
        h.e(s81, "data");
        String string3 = s81.metadata().string(marketingFormatsCustomKey.d());
        if (string3 != null) {
            this.U.a(this.M, string3);
        }
    }
}
