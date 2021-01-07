package com.spotify.encore.consumer.elements.contextmenu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenu;
import com.spotify.encore.consumer.elements.quickactions.ActionIconUtils;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ContextMenuButton extends StateListAnimatorImageButton implements ContextMenu {
    public ContextMenuButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public ContextMenuButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final int getIconSize(Context context, AttributeSet attributeSet, int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.encore_action_button_icon_size);
        int[] iArr = R.styleable.ContextMenuButton;
        h.d(iArr, "R.styleable.ContextMenuButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ContextMenuButton_iconSize, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize2;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new ContextMenuButton$onEvent$1(nmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setImageDrawable(ActionIconUtils.getIconDrawable(context, SpotifyIconV2.MORE_ANDROID, R.color.encore_accessory, getIconSize(context, attributeSet, i)));
    }

    public void render(ContextMenu.Model model) {
        h.e(model, "model");
        setEnabled(model.getEnabled());
        Resources resources = getResources();
        h.d(resources, "resources");
        setContentDescription(ContextMenuFormatterKt.formatContentDescription(resources, model.getType(), model.getTitle()));
    }
}
