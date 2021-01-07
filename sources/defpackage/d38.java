package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: d38  reason: default package */
public abstract class d38 extends e38 {
    public static final SpotifyIconV2 v = SpotifyIconV2.PLAY;
    public static final SpotifyIconV2 w = SpotifyIconV2.PAUSE;
    private a0 r;
    private final int s;
    private final int t;
    private final boolean u;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d38(android.content.Context r15, com.spotify.music.libs.viewuri.c r16, android.view.ViewGroup r17, int r18, int r19, com.spotify.android.paste.graphics.SpotifyIconV2 r20, com.spotify.android.paste.graphics.SpotifyIconV2 r21, com.spotify.android.paste.graphics.SpotifyIconV2 r22, com.spotify.android.paste.graphics.SpotifyIconV2 r23, int r24, int r25, boolean r26, com.spotify.mobile.android.cosmos.player.v2.Player r27, com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat r28, defpackage.nfd r29, boolean r30) {
        /*
            r14 = this;
            r12 = r14
            r13 = r26
            if (r13 == 0) goto L_0x000b
            r22.getClass()
            r6 = r22
            goto L_0x000d
        L_0x000b:
            r6 = r20
        L_0x000d:
            if (r13 == 0) goto L_0x0015
            r23.getClass()
            r7 = r23
            goto L_0x0017
        L_0x0015:
            r7 = r21
        L_0x0017:
            if (r30 == 0) goto L_0x001e
            if (r13 != 0) goto L_0x001e
            r0 = 1
            r11 = 1
            goto L_0x0020
        L_0x001e:
            r0 = 0
            r11 = 0
        L_0x0020:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r24
            r12.s = r0
            r0 = r25
            r12.t = r0
            r12.u = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d38.<init>(android.content.Context, com.spotify.music.libs.viewuri.c, android.view.ViewGroup, int, int, com.spotify.android.paste.graphics.SpotifyIconV2, com.spotify.android.paste.graphics.SpotifyIconV2, com.spotify.android.paste.graphics.SpotifyIconV2, com.spotify.android.paste.graphics.SpotifyIconV2, int, int, boolean, com.spotify.mobile.android.cosmos.player.v2.Player, com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat, nfd, boolean):void");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.e38
    public View h() {
        if (!this.u) {
            return super.h();
        }
        this.r.getClass();
        return e0.g(this.r, this.s, this.t, o(), j());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.e38
    public void s() {
        if (!this.u) {
            super.s();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.e38
    public void t() {
        if (this.u) {
            Button button = (Button) n(false);
            button.setText(m());
            button.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(k(), l(), (float) nud.g(24.0f, button.getResources())), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        super.t();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.e38
    public void u() {
        if (this.u) {
            Button button = (Button) n(false);
            button.setText(p());
            button.setCompoundDrawablesWithIntrinsicBounds(new SpotifyIconDrawable(k(), o(), (float) nud.g(24.0f, button.getResources())), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        super.u();
    }

    public void w(a0 a0Var) {
        if (this.u) {
            this.r = a0Var;
        }
    }
}
