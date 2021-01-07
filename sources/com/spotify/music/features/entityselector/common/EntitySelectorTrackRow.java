package com.spotify.music.features.entityselector.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class EntitySelectorTrackRow extends ConstraintLayout implements f0 {
    private final TextView a;
    private final TextView b;
    private boolean c;
    private final ImageView f;
    private final View n;
    private final Drawable o;

    static final class a implements View.OnClickListener {
        final /* synthetic */ EntitySelectorTrackRow a;
        final /* synthetic */ cmf b;
        final /* synthetic */ cmf c;

        a(EntitySelectorTrackRow entitySelectorTrackRow, cmf cmf, cmf cmf2) {
            this.a = entitySelectorTrackRow;
            this.b = cmf;
            this.c = cmf2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.a.c) {
                this.b.invoke();
            } else {
                this.c.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntitySelectorTrackRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        Drawable d = androidx.core.content.a.d(getContext(), C0707R.drawable.cat_placeholder_track);
        if (d != null) {
            this.o = d;
            LayoutInflater.from(getContext()).inflate(C0707R.layout.entity_selector_track_row, (ViewGroup) this, true);
            View G = q4.G(this, C0707R.id.track_image);
            h.d(G, "requireViewById(this, R.id.track_image)");
            this.f = (ImageView) G;
            View G2 = q4.G(this, C0707R.id.track_title);
            h.d(G2, "requireViewById(this, R.id.track_title)");
            this.a = (TextView) G2;
            View G3 = q4.G(this, C0707R.id.artists);
            h.d(G3, "requireViewById(this, R.id.artists)");
            this.b = (TextView) G3;
            View G4 = q4.G(this, C0707R.id.icon_plus);
            h.d(G4, "requireViewById(this, R.id.icon_plus)");
            this.n = G4;
            return;
        }
        throw new IllegalStateException(AppProtocol.LogMessage.SEVERITY_ERROR.toString());
    }

    public final void D(cmf<f> cmf, cmf<f> cmf2) {
        h.e(cmf, "playConsumer");
        h.e(cmf2, "pauseConsumer");
        this.f.setOnClickListener(new a(this, cmf2, cmf));
    }

    public final View getAddIcon() {
        return this.n;
    }

    public final ImageView getImage() {
        return this.f;
    }

    public final Drawable getTrackPlaceholder() {
        return this.o;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.f.setImageBitmap(bitmap);
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        h.e(drawable, "placeHolderDrawable");
        this.f.setImageDrawable(drawable);
    }

    public final void setTrackData(uy4 uy4) {
        h.e(uy4, AppProtocol.TrackData.TYPE_TRACK);
        this.a.setText(uy4.e());
        this.b.setText(uy4.b());
        this.c = uy4.f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EntitySelectorTrackRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        Drawable d = androidx.core.content.a.d(getContext(), C0707R.drawable.cat_placeholder_track);
        if (d != null) {
            this.o = d;
            LayoutInflater.from(getContext()).inflate(C0707R.layout.entity_selector_track_row, (ViewGroup) this, true);
            View G = q4.G(this, C0707R.id.track_image);
            h.d(G, "requireViewById(this, R.id.track_image)");
            this.f = (ImageView) G;
            View G2 = q4.G(this, C0707R.id.track_title);
            h.d(G2, "requireViewById(this, R.id.track_title)");
            this.a = (TextView) G2;
            View G3 = q4.G(this, C0707R.id.artists);
            h.d(G3, "requireViewById(this, R.id.artists)");
            this.b = (TextView) G3;
            View G4 = q4.G(this, C0707R.id.icon_plus);
            h.d(G4, "requireViewById(this, R.id.icon_plus)");
            this.n = G4;
            return;
        }
        throw new IllegalStateException(AppProtocol.LogMessage.SEVERITY_ERROR.toString());
    }
}
