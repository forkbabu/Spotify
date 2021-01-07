package com.spotify.encore.consumer.elements.artistandaddedbyname;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.spotify.encore.consumer.elements.artistandaddedbyname.ArtistAndAddedByName;
import com.spotify.paste.widgets.internal.StateListAnimatorTextView;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ArtistAndAddedByNameView extends StateListAnimatorTextView implements ArtistAndAddedByName {
    public ArtistAndAddedByNameView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ArtistAndAddedByNameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArtistAndAddedByNameView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, kotlin.f> nmf) {
        h.e(nmf, "event");
        ArtistAndAddedByName.DefaultImpls.onEvent(this, nmf);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArtistAndAddedByNameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }

    public void render(ArtistAndAddedByName.Model model) {
        h.e(model, "model");
        Resources resources = getResources();
        h.d(resources, "resources");
        setText(ArtistAndAddedByNameFormatterKt.format(resources, model.getArtistName(), model.getAddedBy()));
    }
}
