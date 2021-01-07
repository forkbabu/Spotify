package com.spotify.paste.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

@Deprecated
public class DownloadIndicatorDrawable extends Drawable implements Runnable {
    private final int a;
    private final int b;
    private long c;
    private final SpotifyIconDrawable f;
    private final Drawable n;
    private DownloadState o;

    public enum DownloadState {
        WAITING,
        DOWNLOADING,
        DOWNLOADED
    }

    public DownloadIndicatorDrawable(Context context) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.DOWNLOAD_16);
        this.f = spotifyIconDrawable;
        int g = nud.g(16.0f, context.getResources());
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0707R.attr.pasteDownloadIndicatorStyle, typedValue, true)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, lvd.a);
            g = obtainStyledAttributes.getDimensionPixelSize(3, g);
            this.n = obtainStyledAttributes.getDrawable(2);
            this.a = obtainStyledAttributes.getColor(0, -16711936);
            this.b = obtainStyledAttributes.getColor(1, -7829368);
            obtainStyledAttributes.recycle();
        } else {
            this.n = new ColorDrawable();
            this.a = -16777216;
            this.b = -16777216;
            Assertion.g("Is the theme missing?");
        }
        spotifyIconDrawable.w((float) g);
        this.o = DownloadState.WAITING;
    }

    public void a(DownloadState downloadState) {
        if (this.o != downloadState) {
            this.o = downloadState;
            if (downloadState == DownloadState.DOWNLOADING) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.c = uptimeMillis;
                scheduleSelf(this, uptimeMillis);
            } else {
                unscheduleSelf(this);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setCallback(getCallback());
        this.f.setBounds(getBounds());
        this.n.setBounds(getBounds());
        int ordinal = this.o.ordinal();
        if (ordinal == 0) {
            this.f.r(this.b);
            this.f.draw(canvas);
        } else if (ordinal == 1) {
            this.n.draw(canvas);
        } else if (ordinal == 2) {
            this.f.r(this.a);
            this.f.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.o == DownloadState.DOWNLOADING) {
            return this.n.getOpacity();
        }
        return this.f.getOpacity();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f.setBounds(rect);
        this.n.setBounds(rect);
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.setLevel((int) ((((float) ((uptimeMillis - this.c) % 3500)) / 3500.0f) * 10000.0f));
        invalidateSelf();
        scheduleSelf(this, uptimeMillis + 16);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f.setAlpha(i);
        this.n.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        this.n.setColorFilter(colorFilter);
    }
}
