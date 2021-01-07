package com.spotify.encore.consumer.elements.quickactions.profile;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.encore.consumer.elements.R;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.libs.facepile.c;
import com.spotify.libs.facepile.d;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class ProfileButton extends FacePileView implements Profile {
    private Picasso picasso;

    public ProfileButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public ProfileButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new ProfileButton$onEvent$1(nmf));
    }

    public final void setPicasso(Picasso picasso2) {
        h.e(picasso2, "picasso");
        this.picasso = picasso2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        setContentDescription(getResources().getString(R.string.profile_button_content_description));
    }

    public void render(List<? extends c> list) {
        h.e(list, "model");
        Picasso picasso2 = this.picasso;
        if (picasso2 != null) {
            setFacePile(picasso2, d.a(list));
        } else {
            h.k("picasso");
            throw null;
        }
    }
}
