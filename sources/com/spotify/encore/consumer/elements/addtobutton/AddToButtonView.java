package com.spotify.encore.consumer.elements.addtobutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class AddToButtonView extends StateListAnimatorImageButton implements AddToButton {
    private float drawableSize;
    private AddToButtonState state;

    public AddToButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AddToButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddToButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? (AttributeSet) AddToButtonViewKt.access$getNO_ATTRS$p() : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final float readDrawableSizeAttr(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AddToButtonViewKt.access$getSTYLE$p(), i, 0);
        h.d(obtainStyledAttributes, "context.obtainStyledAttr…, defStyleAttr, NO_STYLE)");
        Context context = getContext();
        h.d(context, "context");
        float dimension = obtainStyledAttributes.getDimension(AddToButtonViewKt.access$getDRAWABLE_SIZE_ATTR$p(), context.getResources().getDimension(AddToButtonViewKt.access$getDEFAULT_DRAWABLE_SIZE_DIMEN$p()));
        obtainStyledAttributes.recycle();
        return dimension;
    }

    private final void updateDrawable() {
        AddToButtonDrawables addToButtonDrawables = AddToButtonDrawables.INSTANCE;
        Context context = getContext();
        h.d(context, "context");
        setImageDrawable(addToButtonDrawables.createDrawable(context, this.state, this.drawableSize));
    }

    public final float getDrawableSize() {
        return this.drawableSize;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super AddToButtonState, kotlin.f> nmf) {
        h.e(nmf, "event");
        super.setOnClickListener(new AddToButtonView$onEvent$1(this, nmf));
    }

    public final void setDrawableSize(float f) {
        this.drawableSize = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void render(AddToButtonState addToButtonState) {
        h.e(addToButtonState, "model");
        this.state = addToButtonState;
        updateDrawable();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.state = AddToButtonState.ADD;
        this.drawableSize = readDrawableSizeAttr(attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackgroundResource(0);
        updateDrawable();
    }
}
