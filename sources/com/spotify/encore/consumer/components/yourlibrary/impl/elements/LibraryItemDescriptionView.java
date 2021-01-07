package com.spotify.encore.consumer.components.yourlibrary.impl.elements;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class LibraryItemDescriptionView extends StateListAnimatorTextView implements LibraryItemDescription {
    public LibraryItemDescriptionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LibraryItemDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LibraryItemDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, kotlin.f> nmf) {
        h.e(nmf, "event");
        LibraryItemDescription.DefaultImpls.onEvent(this, nmf);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LibraryItemDescriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }

    public void render(LibraryItemDescription.Model model) {
        h.e(model, "model");
        Resources resources = getResources();
        h.d(resources, "resources");
        setText(LibraryItemDescriptionFormatterKt.format(resources, model));
    }
}
