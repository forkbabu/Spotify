package com.spotify.encore.consumer.elements.heart;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.l;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.heart.Heart;
import kotlin.jvm.internal.h;

public final class AnimatedHeartButton extends AppCompatImageButton implements Heart {
    private final f activeHeart;
    private boolean animateNextRender;
    private final f heart;
    private boolean isHearted;

    public AnimatedHeartButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public AnimatedHeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedHeartButton(Context context, AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getActiveHeart$annotations() {
    }

    public static /* synthetic */ void getHeart$annotations() {
    }

    private final d getHeartComposition(boolean z) {
        l<d> j = e.j(getContext(), z ? R.raw.heart_positive_white : R.raw.heart_undo_white);
        h.d(j, "LottieCompositionFactory…esSync(context, rawResId)");
        d b = j.b();
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("Lottie composition cannot be null");
    }

    public final f getActiveHeart() {
        return this.activeHeart;
    }

    public final f getHeart() {
        return this.heart;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Boolean, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new AnimatedHeartButton$onEvent$1(this, nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedHeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        f fVar = new f();
        this.activeHeart = fVar;
        f fVar2 = new f();
        this.heart = fVar2;
        fVar.F(getHeartComposition(true));
        fVar2.F(getHeartComposition(false));
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public void render(Heart.Model model) {
        h.e(model, "model");
        if (getDrawable() == null || model.isLiked() != this.isHearted) {
            boolean isLiked = model.isLiked();
            this.isHearted = isLiked;
            f fVar = isLiked ? this.activeHeart : this.heart;
            setImageDrawable(fVar);
            Resources resources = getResources();
            h.d(resources, "resources");
            setContentDescription(ContentDescriptionHelperKt.getContentDescription(resources, this.isHearted, model.getContentDescContext()));
            if (this.animateNextRender) {
                fVar.B();
                this.animateNextRender = false;
                return;
            }
            fVar.H((int) fVar.p());
        }
    }
}
