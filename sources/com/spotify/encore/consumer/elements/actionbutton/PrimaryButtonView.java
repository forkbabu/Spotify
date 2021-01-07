package com.spotify.encore.consumer.elements.actionbutton;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.core.widget.c;
import com.spotify.encore.consumer.elements.R;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class PrimaryButtonView extends StateListAnimatorButton implements ActionButton {
    public PrimaryButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PrimaryButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrimaryButtonView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setAppearance(ButtonSize buttonSize) {
        int i;
        q4.L(this, i0.a(getContext(), R.color.encore_primary_button));
        if (buttonSize == ButtonSize.LARGE) {
            i = com.spotify.encore.foundation.R.style.TextAppearance_Encore_BalladBold;
        } else {
            i = com.spotify.encore.foundation.R.style.TextAppearance_Encore_MestoBold;
        }
        c.n(this, i);
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        h.d(context, "context");
        context.getTheme().resolveAttribute(com.spotify.encore.foundation.R.attr.textBase, typedValue, true);
        setTextColor(typedValue.data);
    }

    private final void setPadding(ButtonSize buttonSize) {
        int i;
        int i2;
        Context context = getContext();
        h.d(context, "context");
        Resources resources = context.getResources();
        ButtonSize buttonSize2 = ButtonSize.LARGE;
        if (buttonSize == buttonSize2) {
            i = R.dimen.encore_action_button_vertical_padding_large;
        } else {
            i = R.dimen.encore_action_button_vertical_padding_small;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        Context context2 = getContext();
        h.d(context2, "context");
        Resources resources2 = context2.getResources();
        if (buttonSize == buttonSize2) {
            i2 = R.dimen.encore_action_button_horizontal_padding_large;
        } else {
            i2 = R.dimen.encore_action_button_horizontal_padding_small;
        }
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new PrimaryButtonView$onEvent$1(nmf));
    }

    public final void setButtonSize(ButtonSize buttonSize) {
        h.e(buttonSize, "size");
        setPadding(buttonSize);
        setAppearance(buttonSize);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimaryButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        setSingleLine(true);
        setBackground(i0.b(context, R.drawable.action_button_background));
        ButtonSize buttonSize = ButtonSize.LARGE;
        int[] iArr = R.styleable.ActionButton;
        h.d(iArr, "R.styleable.ActionButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ButtonSize buttonSize2 = ButtonSize.values()[obtainStyledAttributes.getInt(R.styleable.ActionButton_actionButtonSize, 0)];
        obtainStyledAttributes.recycle();
        setButtonSize(buttonSize2);
    }

    public void render(String str) {
        h.e(str, "model");
        setText(str);
    }
}
