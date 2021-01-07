package com.spotify.encore.consumer.elements.downloadbutton;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.content.a;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;
import kotlin.reflect.c;

public final class DownloadButtonView extends StateListAnimatorImageButton implements DownloadButton {
    private final Map<c<? extends DownloadState>, String> contentDescriptors;
    private DownloadState currentState;
    private Animator downloadingAnimator;
    private Drawable downloadingDrawable;
    private final DrawableHandler drawableHandler;
    private boolean inDownloadingTransition;
    private Float progress;
    private boolean useLottieAnimations;

    public DownloadButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DownloadButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void hideDownloadButton() {
        setImageDrawable(null);
        setContentDescription(null);
        setVisibility(8);
        this.currentState = DownloadState.None.INSTANCE;
    }

    private final boolean ignoreDownloadingTransition(boolean z, DownloadState downloadState, Float f) {
        return !z || !h.a(downloadState, new DownloadState.Downloading(null, 1, null)) || f == null;
    }

    private final void renderState(DownloadState downloadState, DownloadState downloadState2) {
        if (downloadState == null) {
            throw new IllegalStateException("currentState should not be null here");
        } else if (this.drawableHandler.hasTransition(downloadState, downloadState2)) {
            if (downloadState2 instanceof DownloadState.Downloading) {
                this.inDownloadingTransition = true;
            }
            setImageDrawable(this.drawableHandler.getTransitionDrawable(downloadState, downloadState2, new DownloadButtonView$renderState$1(this, downloadState2)));
        } else {
            setDrawable(downloadState2);
        }
    }

    private final void renderWithoutLottieAnimations(DownloadState downloadState) {
        Animator animator = this.downloadingAnimator;
        if (animator != null) {
            animator.end();
            if (downloadState instanceof DownloadState.None) {
                hideDownloadButton();
                return;
            }
            if (!(downloadState instanceof DownloadState.Downloading) && !h.a(downloadState, DownloadState.Pending.INSTANCE)) {
                setImageDrawable(this.drawableHandler.getLottieDrawableForState(downloadState));
            } else {
                Drawable drawable = this.downloadingDrawable;
                if (drawable != null) {
                    setImageDrawable(drawable);
                    Animator animator2 = this.downloadingAnimator;
                    if (animator2 != null) {
                        animator2.start();
                    } else {
                        h.k("downloadingAnimator");
                        throw null;
                    }
                } else {
                    h.k("downloadingDrawable");
                    throw null;
                }
            }
            setContentDescription(this.contentDescriptors.get(j.b(downloadState.getClass())));
            return;
        }
        h.k("downloadingAnimator");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void setDrawable(DownloadState downloadState) {
        setImageDrawable(this.drawableHandler.getLottieDrawableForState(downloadState));
        setContentDescription(this.contentDescriptors.get(j.b(downloadState.getClass())));
        setVisibility(0);
        this.currentState = downloadState;
        if (downloadState instanceof DownloadState.Downloading) {
            this.inDownloadingTransition = false;
        }
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new DownloadButtonView$onEvent$1(nmf));
    }

    public final void renderInLists(DownloadState downloadState, DownloadState downloadState2) {
        h.e(downloadState2, "newState");
        if (this.useLottieAnimations) {
            if (downloadState2 instanceof DownloadState.Downloading) {
                this.progress = ((DownloadState.Downloading) downloadState2).getProgress();
            }
            if (ignoreDownloadingTransition(this.inDownloadingTransition, downloadState2, this.progress)) {
                Drawable drawable = getDrawable();
                com.airbnb.lottie.f fVar = null;
                if (!(drawable instanceof com.airbnb.lottie.f)) {
                    drawable = null;
                }
                com.airbnb.lottie.f fVar2 = (com.airbnb.lottie.f) drawable;
                if (fVar2 != null) {
                    fVar2.C();
                }
                Drawable drawable2 = getDrawable();
                if (drawable2 instanceof com.airbnb.lottie.f) {
                    fVar = drawable2;
                }
                com.airbnb.lottie.f fVar3 = fVar;
                if (fVar3 != null) {
                    fVar3.k();
                }
                this.inDownloadingTransition = false;
                if (downloadState2 instanceof DownloadState.None) {
                    hideDownloadButton();
                } else {
                    renderState(downloadState, downloadState2);
                }
            }
        } else {
            renderWithoutLottieAnimations(downloadState2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        DrawableHandler drawableHandler2 = new DrawableHandler(context);
        this.drawableHandler = drawableHandler2;
        this.useLottieAnimations = true;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (Build.VERSION.SDK_INT < 21) {
            this.useLottieAnimations = false;
            Drawable d = a.d(context, C0707R.drawable.progress_small_holo);
            if (d != null) {
                this.downloadingDrawable = d;
                if (d != null) {
                    this.downloadingAnimator = drawableHandler2.createSpotifyDrawableAnimator(d);
                } else {
                    h.k("downloadingDrawable");
                    throw null;
                }
            } else {
                throw new IllegalStateException("Could not get drawable for downloadingDrawable");
            }
        }
        this.contentDescriptors = d.y(new Pair(j.b(DownloadState.Downloadable.class), context.getResources().getString(R.string.download_button_downloadable_content_description)), new Pair(j.b(DownloadState.Pending.class), context.getResources().getString(R.string.download_button_pending_content_description)), new Pair(j.b(DownloadState.Downloading.class), context.getResources().getString(R.string.download_button_downloading_content_description)), new Pair(j.b(DownloadState.Downloaded.class), context.getResources().getString(R.string.download_button_downloaded_content_description)), new Pair(j.b(DownloadState.Error.class), context.getResources().getString(R.string.download_button_error_content_description)));
    }

    public void render(DownloadButton.Model model) {
        h.e(model, "model");
        if (this.currentState == null) {
            this.currentState = model.getDownloadState();
        }
        renderInLists(this.currentState, model.getDownloadState());
    }
}
