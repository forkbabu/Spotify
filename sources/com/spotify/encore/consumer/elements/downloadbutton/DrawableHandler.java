package com.spotify.encore.consumer.elements.downloadbutton;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.l;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;
import kotlin.reflect.c;

public final class DrawableHandler {
    private final Context context;
    private final f downloadingAnimation = getLottieDrawable(R.raw.download_status_downloading);
    private final f infiniteDownloadingAnimation = getLottieDrawable(R.raw.download_status_downloading_infinite);
    private final f pendingAnimation = getLottieDrawable(R.raw.download_status_pending);
    private Map<c<? extends DownloadState>, ? extends Map<? extends c<? extends DownloadState>, ? extends f>> transitions = d.y(new Pair(j.b(DownloadState.Downloadable.class), d.y(new Pair(j.b(DownloadState.Downloading.class), getLottieDrawable(R.raw.download_status_downloadable_to_downloading)), new Pair(j.b(DownloadState.Pending.class), getLottieDrawable(R.raw.download_status_downloadable_to_pending)))), new Pair(j.b(DownloadState.Downloading.class), d.y(new Pair(j.b(DownloadState.Downloadable.class), getLottieDrawable(R.raw.download_status_downloading_to_downloadable)), new Pair(j.b(DownloadState.Downloaded.class), getLottieDrawable(R.raw.download_status_downloading_to_downloaded)), new Pair(j.b(DownloadState.Error.class), getLottieDrawable(R.raw.download_status_downloading_to_error)))), new Pair(j.b(DownloadState.Pending.class), d.y(new Pair(j.b(DownloadState.Downloadable.class), getLottieDrawable(R.raw.download_status_pending_to_downloadable)), new Pair(j.b(DownloadState.Downloading.class), getLottieDrawable(R.raw.download_status_pending_to_downloading)), new Pair(j.b(DownloadState.Error.class), getLottieDrawable(R.raw.download_status_pending_to_error)))), new Pair(j.b(DownloadState.Downloaded.class), d.x(new Pair(j.b(DownloadState.Downloadable.class), getLottieDrawable(R.raw.download_status_downloaded_to_downloadable)))), new Pair(j.b(DownloadState.Error.class), d.x(new Pair(j.b(DownloadState.Downloadable.class), getLottieDrawable(R.raw.download_status_error_to_downloadable)))));

    public DrawableHandler(Context context2) {
        h.e(context2, "context");
        this.context = context2;
    }

    private final f getLottieDrawable(int i) {
        f fVar = new f();
        l<com.airbnb.lottie.d> j = e.j(this.context, i);
        h.d(j, "LottieCompositionFactory…awResSync(context, resId)");
        fVar.F(j.b());
        return fVar;
    }

    public final ObjectAnimator createSpotifyDrawableAnimator(Drawable drawable) {
        h.e(drawable, "drawable");
        ObjectAnimator duration = ObjectAnimator.ofInt(drawable, "level", 0, 10000).setDuration(3500L);
        h.d(duration, "ObjectAnimator.ofInt(\n  …ration(animationDuration)");
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        duration.addUpdateListener(new DrawableHandler$createSpotifyDrawableAnimator$1(drawable));
        return duration;
    }

    public final f getLottieDrawableForState(DownloadState downloadState) {
        f fVar;
        h.e(downloadState, "state");
        if (downloadState instanceof DownloadState.Downloadable) {
            Map map = (Map) this.transitions.get(j.b(downloadState.getClass()));
            if (map == null || (fVar = (f) map.get(j.b(DownloadState.Pending.class))) == null) {
                return null;
            }
            fVar.T(0.0f);
        } else if (downloadState instanceof DownloadState.Downloaded) {
            Map map2 = (Map) this.transitions.get(j.b(downloadState.getClass()));
            if (map2 == null || (fVar = (f) map2.get(j.b(DownloadState.Downloadable.class))) == null) {
                return null;
            }
            fVar.T(0.0f);
        } else if (downloadState instanceof DownloadState.Error) {
            Map map3 = (Map) this.transitions.get(j.b(downloadState.getClass()));
            if (map3 == null || (fVar = (f) map3.get(j.b(DownloadState.Downloadable.class))) == null) {
                return null;
            }
            fVar.T(0.0f);
        } else if (downloadState instanceof DownloadState.Downloading) {
            DownloadState.Downloading downloading = (DownloadState.Downloading) downloadState;
            if (downloading.getProgress() != null) {
                f fVar2 = this.downloadingAnimation;
                fVar2.T(downloading.getProgress().floatValue());
                return fVar2;
            }
            f fVar3 = this.infiniteDownloadingAnimation;
            fVar3.V(1);
            fVar3.U(-1);
            fVar3.B();
            return fVar3;
        } else if (!(downloadState instanceof DownloadState.Pending)) {
            return null;
        } else {
            f fVar4 = this.pendingAnimation;
            fVar4.V(1);
            fVar4.U(-1);
            fVar4.B();
            return fVar4;
        }
        return fVar;
    }

    public final f getTransitionDrawable(DownloadState downloadState, DownloadState downloadState2, Animator.AnimatorListener animatorListener) {
        f fVar;
        h.e(downloadState, "from");
        h.e(downloadState2, "to");
        Map map = (Map) this.transitions.get(j.b(downloadState.getClass()));
        if (map == null || (fVar = (f) map.get(j.b(downloadState2.getClass()))) == null) {
            return null;
        }
        fVar.B();
        fVar.c(animatorListener);
        return fVar;
    }

    public final boolean hasTransition(DownloadState downloadState, DownloadState downloadState2) {
        h.e(downloadState, "from");
        h.e(downloadState2, "to");
        Map map = (Map) this.transitions.get(j.b(downloadState.getClass()));
        return (map != null ? (f) map.get(j.b(downloadState2.getClass())) : null) != null;
    }
}
