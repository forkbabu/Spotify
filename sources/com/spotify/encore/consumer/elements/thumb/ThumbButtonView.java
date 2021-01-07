package com.spotify.encore.consumer.elements.thumb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ThumbButtonView extends StateListAnimatorImageButton implements ThumbButton {
    public static final Companion Companion = new Companion(null);
    private float drawableSize;
    private ThumbButtonState state;
    private final ThumbButtonType type;

    public static final class Companion {
        private Companion() {
        }

        public final ThumbButtonView down(Context context) {
            h.e(context, "context");
            View inflate = View.inflate(context, ThumbButtonViewKt.access$getTHUMB_DOWN_LAYOUT$p(), (ViewGroup) ThumbButtonViewKt.access$getNO_ROOT$p());
            if (inflate != null) {
                return (ThumbButtonView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.elements.thumb.ThumbButtonView");
        }

        public final ThumbButtonView up(Context context) {
            h.e(context, "context");
            View inflate = View.inflate(context, ThumbButtonViewKt.access$getTHUMB_UP_LAYOUT$p(), (ViewGroup) ThumbButtonViewKt.access$getNO_ROOT$p());
            if (inflate != null) {
                return (ThumbButtonView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.elements.thumb.ThumbButtonView");
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ThumbButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ThumbButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? (AttributeSet) ThumbButtonViewKt.access$getNO_ATTRS$p() : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final ThumbButtonView down(Context context) {
        return Companion.down(context);
    }

    public static final ThumbButtonView up(Context context) {
        return Companion.up(context);
    }

    private final void updateDrawable() {
        ThumbButtonDrawables thumbButtonDrawables = ThumbButtonDrawables.INSTANCE;
        Context context = getContext();
        h.d(context, "context");
        setImageDrawable(thumbButtonDrawables.createDrawable(context, this.type, this.state, this.drawableSize));
    }

    public final float getDrawableSize() {
        return this.drawableSize;
    }

    public final ThumbButtonType getType() {
        return this.type;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super ThumbButtonEvent, kotlin.f> nmf) {
        h.e(nmf, "event");
        super.setOnClickListener(new ThumbButtonView$onEvent$1(this, nmf));
    }

    public final void setDrawableSize(float f) {
        this.drawableSize = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // com.spotify.encore.consumer.elements.thumb.ThumbButton
    public void swing() {
        ThumbButtonAnimator.INSTANCE.animate(this);
    }

    public void render(ThumbButtonState thumbButtonState) {
        h.e(thumbButtonState, "model");
        this.state = thumbButtonState;
        updateDrawable();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.state = ThumbButtonState.NOT_ACTIVATED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ThumbButtonViewKt.access$getSTYLE$p(), i, 0);
        h.d(obtainStyledAttributes, "context.obtainStyledAttr…, defStyleAttr, NO_STYLE)");
        this.type = ThumbButtonType.values()[obtainStyledAttributes.getInt(ThumbButtonViewKt.access$getTYPE_ATTR$p(), 0)];
        this.drawableSize = obtainStyledAttributes.getDimension(ThumbButtonViewKt.access$getDRAWABLE_SIZE_ATTR$p(), context.getResources().getDimension(ThumbButtonViewKt.access$getDEFAULT_DRAWABLE_SIZE_DIMEN$p()));
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackgroundResource(0);
        updateDrawable();
    }
}
