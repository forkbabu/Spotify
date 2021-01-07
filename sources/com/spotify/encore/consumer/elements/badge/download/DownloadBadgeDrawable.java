package com.spotify.encore.consumer.elements.badge.download;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class DownloadBadgeDrawable extends Drawable {
    private static final int ANIMATION_DURATION = 3500;
    private static final int MAX_LEVEL = 10000;
    private ObjectAnimator mAnimator;
    private State mDownloadState = State.WAITING;
    private final ColorStateList mDownloadedColor;
    private final ColorStateList mErrorColor;
    private final SpotifyIconDrawable mIconDrawable;
    private final Drawable mProgressDrawable;
    private final ColorStateList mWaitingColor;

    /* renamed from: com.spotify.encore.consumer.elements.badge.download.DownloadBadgeDrawable$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadBadgeDrawable$State;

        static {
            State.values();
            int[] iArr = new int[4];
            $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadBadgeDrawable$State = iArr;
            try {
                State state = State.WAITING;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadBadgeDrawable$State;
                State state2 = State.DOWNLOADED;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadBadgeDrawable$State;
                State state3 = State.ERROR;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$spotify$encore$consumer$elements$badge$download$DownloadBadgeDrawable$State;
                State state4 = State.DOWNLOADING;
                iArr4[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum State {
        WAITING,
        DOWNLOADING,
        DOWNLOADED,
        ERROR
    }

    public DownloadBadgeDrawable(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_badge_size);
        this.mProgressDrawable = a.d(context, C0707R.drawable.progress_small_holo);
        this.mDownloadedColor = a.c(context, R.color.encore_download_downloaded);
        ColorStateList c = a.c(context, R.color.encore_download_waiting);
        this.mWaitingColor = c;
        this.mErrorColor = a.c(context, R.color.encore_download_error);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOAD, (float) dimensionPixelSize);
        this.mIconDrawable = spotifyIconDrawable;
        spotifyIconDrawable.s(c);
    }

    private void startAnimation() {
        if (this.mAnimator == null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(this.mProgressDrawable, "level", 0, MAX_LEVEL).setDuration(3500L);
            this.mAnimator = duration;
            duration.setRepeatCount(-1);
            this.mAnimator.setRepeatMode(2);
            this.mAnimator.addUpdateListener(new a(this));
        }
        this.mAnimator.start();
    }

    private void stopAnimation() {
        ObjectAnimator objectAnimator = this.mAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void syncBounds() {
        this.mIconDrawable.setBounds(getBounds());
        this.mProgressDrawable.setBounds(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        syncBounds();
        int ordinal = this.mDownloadState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.mProgressDrawable.draw(canvas);
                return;
            } else if (!(ordinal == 2 || ordinal == 3)) {
                return;
            }
        }
        this.mIconDrawable.draw(canvas);
    }

    public State getDownloadState() {
        return this.mDownloadState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mIconDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mIconDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mDownloadState == State.DOWNLOADING) {
            return this.mProgressDrawable.getOpacity();
        }
        return this.mIconDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        int ordinal = this.mDownloadState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.mProgressDrawable.isStateful();
            }
            if (!(ordinal == 2 || ordinal == 3)) {
                return false;
            }
        }
        return this.mIconDrawable.isStateful();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mIconDrawable.setBounds(rect);
        this.mProgressDrawable.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int ordinal = this.mDownloadState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.mProgressDrawable.setState(iArr);
            }
            if (!(ordinal == 2 || ordinal == 3)) {
                return super.onStateChange(iArr);
            }
        }
        return this.mIconDrawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mIconDrawable.setAlpha(i);
        this.mProgressDrawable.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mIconDrawable.setColorFilter(colorFilter);
        this.mProgressDrawable.setColorFilter(colorFilter);
    }

    public void setDownloadState(State state) {
        if (this.mDownloadState != state) {
            this.mDownloadState = state;
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                stopAnimation();
                this.mIconDrawable.u(SpotifyIconV2.DOWNLOAD);
                this.mIconDrawable.s(this.mWaitingColor);
            } else if (ordinal == 1) {
                startAnimation();
            } else if (ordinal == 2) {
                stopAnimation();
                this.mIconDrawable.u(SpotifyIconV2.AVAILABLE_OFFLINE);
                this.mIconDrawable.s(this.mDownloadedColor);
            } else if (ordinal == 3) {
                stopAnimation();
                this.mIconDrawable.u(SpotifyIconV2.EXCLAMATION_CIRCLE);
                this.mIconDrawable.s(this.mErrorColor);
            }
            invalidateSelf();
        }
    }
}
