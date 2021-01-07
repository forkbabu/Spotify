package com.spotify.paste.spotifyicon;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;

public final class SpotifyIconView extends AppCompatImageView implements zud {
    private static final int[] f = {16843105, 16843106, 16843107, 16843108};
    private SpotifyIconV2 a;
    private SpotifyIconDrawable b;
    private final yud c;

    public SpotifyIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.c.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.c.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.c();
    }

    public void setColor(int i) {
        this.b.r(i);
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.b.s(colorStateList);
    }

    public void setIcon(SpotifyIcon spotifyIcon) {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ADD_TO_PLAYLIST;
        SpotifyIconV2 g = spotifyIcon.g();
        this.a = g;
        this.b.u(g);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.c.d(lVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SpotifyIconView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            com.spotify.android.paste.graphics.SpotifyIconV2 r0 = com.spotify.android.paste.graphics.SpotifyIconV2.ALBUM
            r9.a = r0
            yud r0 = new yud
            r0.<init>(r9)
            r9.c = r0
            int[] r0 = com.spotify.paste.spotifyicon.b.a
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            r2 = 2
            r3 = -1
            int r4 = r0.getInt(r2, r3)
            if (r4 == r3) goto L_0x0037
            com.spotify.android.paste.graphics.SpotifyIconV2[] r5 = com.spotify.android.paste.graphics.SpotifyIconV2.n3
            int r6 = r5.length
            if (r4 < r6) goto L_0x0033
            com.spotify.android.paste.graphics.SpotifyIcon[] r6 = com.spotify.android.paste.graphics.SpotifyIcon.ah
            int r5 = r5.length
            int r4 = r4 - r5
            r4 = r6[r4]
            com.spotify.android.paste.graphics.SpotifyIconV2 r5 = r4.g()
            r9.a = r5
            int r4 = r4.d()
            goto L_0x0038
        L_0x0033:
            r4 = r5[r4]
            r9.a = r4
        L_0x0037:
            r4 = -1
        L_0x0038:
            r5 = 1
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r0.getDimension(r5, r6)
            android.content.res.ColorStateList r8 = r0.getColorStateList(r1)
            r0.recycle()
            int[] r0 = com.spotify.paste.spotifyicon.SpotifyIconView.f
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            r11 = 3
            r12 = 0
            float r11 = r10.getFloat(r11, r12)
            float r0 = r10.getFloat(r5, r12)
            float r12 = r10.getFloat(r2, r12)
            int r1 = r10.getColor(r1, r1)
            r10.recycle()
            int r10 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0073
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r10 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            android.content.Context r2 = r9.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r4 = r9.a
            r10.<init>(r2, r4, r7)
            r9.b = r10
            goto L_0x00a5
        L_0x0073:
            if (r4 == r3) goto L_0x008d
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r10 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            android.content.Context r2 = r9.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r5 = r9.a
            float r4 = (float) r4
            android.content.res.Resources r6 = r9.getResources()
            int r4 = defpackage.nud.g(r4, r6)
            float r4 = (float) r4
            r10.<init>(r2, r5, r4)
            r9.b = r10
            goto L_0x00a5
        L_0x008d:
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r10 = new com.spotify.paste.spotifyicon.SpotifyIconDrawable
            android.content.Context r2 = r9.getContext()
            com.spotify.android.paste.graphics.SpotifyIconV2 r4 = r9.a
            r5 = 1107296256(0x42000000, float:32.0)
            android.content.res.Resources r6 = r9.getResources()
            int r5 = defpackage.nud.g(r5, r6)
            float r5 = (float) r5
            r10.<init>(r2, r4, r5)
            r9.b = r10
        L_0x00a5:
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r10 = r9.b
            if (r8 == 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r3)
        L_0x00ae:
            r10.s(r8)
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r10 = r9.b
            r9.setImageDrawable(r10)
            com.spotify.paste.spotifyicon.SpotifyIconDrawable r10 = r9.b
            r10.v(r11, r0, r12, r1)
            boolean r10 = r9.isInEditMode()
            if (r10 != 0) goto L_0x00c8
            bvd r10 = defpackage.dvd.a(r9)
            r10.a()
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.spotifyicon.SpotifyIconView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.ImageView
    public SpotifyIconDrawable getDrawable() {
        return this.b;
    }

    public void setIcon(SpotifyIconV2 spotifyIconV2) {
        this.a = spotifyIconV2;
        this.b.u(spotifyIconV2);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }
}
