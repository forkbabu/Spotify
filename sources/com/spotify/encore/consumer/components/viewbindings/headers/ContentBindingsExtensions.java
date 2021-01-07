package com.spotify.encore.consumer.components.viewbindings.headers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.ContentBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkShadow;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ContentBindingsExtensions {
    public static final void applySystemWindowInsetTop(ContentBinding contentBinding, int i) {
        h.e(contentBinding, "$this$applySystemWindowInsetTop");
        ConstraintLayout root = contentBinding.getRoot();
        ConstraintLayout root2 = contentBinding.getRoot();
        h.d(root2, "root");
        int paddingLeft = root2.getPaddingLeft();
        ConstraintLayout root3 = contentBinding.getRoot();
        h.d(root3, "root");
        int paddingTop = root3.getPaddingTop() + i;
        ConstraintLayout root4 = contentBinding.getRoot();
        h.d(root4, "root");
        int paddingRight = root4.getPaddingRight();
        ConstraintLayout root5 = contentBinding.getRoot();
        h.d(root5, "root");
        root.setPadding(paddingLeft, paddingTop, paddingRight, root5.getPaddingBottom());
    }

    public static final void hideArtwork(ContentBinding contentBinding) {
        h.e(contentBinding, "$this$hideArtwork");
        ArtworkView artworkView = contentBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setVisibility(8);
        ArtworkShadow artworkShadow = contentBinding.artworkShadow;
        h.d(artworkShadow, "artworkShadow");
        artworkShadow.setVisibility(8);
        TextView textView = contentBinding.title;
        h.d(textView, "title");
        textView.setVisibility(0);
        setContentDimensionRatio(contentBinding, null);
    }

    public static final View inflateActionRow(ContentBinding contentBinding, int i) {
        h.e(contentBinding, "$this$inflateActionRow");
        ViewStub viewStub = contentBinding.actionRowContainer;
        h.d(viewStub, "actionRowContainer");
        viewStub.setLayoutResource(i);
        View inflate = contentBinding.actionRowContainer.inflate();
        h.d(inflate, "actionRowContainer.inflate()");
        return inflate;
    }

    public static final void renderArtwork(ContentBinding contentBinding, String str, boolean z, nmf<? super Artwork.Events, f> nmf) {
        h.e(contentBinding, "$this$renderArtwork");
        h.e(nmf, "event");
        if (str == null || str.length() == 0) {
            hideArtwork(contentBinding);
            return;
        }
        showArtwork(contentBinding);
        contentBinding.artwork.onEvent(nmf);
        contentBinding.artwork.render((Artwork.Model) new Artwork.Model.Album(new Artwork.ImageData(str), z));
    }

    public static /* synthetic */ void renderArtwork$default(ContentBinding contentBinding, String str, boolean z, nmf nmf, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        renderArtwork(contentBinding, str, z, nmf);
    }

    public static final void setContentDimensionRatio(ContentBinding contentBinding, String str) {
        h.e(contentBinding, "$this$setContentDimensionRatio");
        Space space = contentBinding.contentDimensionRatioSpace;
        h.d(space, "contentDimensionRatioSpace");
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams != null) {
            ((ConstraintLayout.LayoutParams) layoutParams).B = str;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public static final void showArtwork(ContentBinding contentBinding) {
        h.e(contentBinding, "$this$showArtwork");
        ArtworkView artworkView = contentBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setVisibility(0);
        ArtworkShadow artworkShadow = contentBinding.artworkShadow;
        h.d(artworkShadow, "artworkShadow");
        artworkShadow.setVisibility(0);
        ConstraintLayout root = contentBinding.getRoot();
        h.d(root, "root");
        ArtworkShadow artworkShadow2 = contentBinding.artworkShadow;
        ArtworkView artworkView2 = contentBinding.artwork;
        h.d(artworkView2, "artwork");
        artworkShadow2.attachArtwork(artworkView2, (float) root.getResources().getDimensionPixelSize(R.dimen.header_artwork_shadow_radius));
        ConstraintLayout root2 = contentBinding.getRoot();
        h.d(root2, "root");
        setContentDimensionRatio(contentBinding, root2.getContext().getString(R.string.header_dimens_ratio));
    }

    public static final void updateArtworkWithOffset(ContentBinding contentBinding, int i) {
        float f;
        h.e(contentBinding, "$this$updateArtworkWithOffset");
        ArtworkView artworkView = contentBinding.artwork;
        h.d(artworkView, "artwork");
        int height = artworkView.getHeight();
        if (height != 0) {
            ArtworkView artworkView2 = contentBinding.artwork;
            h.d(artworkView2, "artwork");
            Context context = artworkView2.getContext();
            h.d(context, "artwork.context");
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.header_artwork_scale_cutoff_height);
            float f2 = (float) dimensionPixelSize;
            float f3 = (float) height;
            float f4 = f2 / f3;
            int i2 = height + i;
            if (height > dimensionPixelSize) {
                float c = ((float) knf.c(i2, dimensionPixelSize, height)) / f3;
                ArtworkView artworkView3 = contentBinding.artwork;
                h.d(artworkView3, "artwork");
                artworkView3.setScaleX(c);
                ArtworkView artworkView4 = contentBinding.artwork;
                h.d(artworkView4, "artwork");
                artworkView4.setScaleY(c);
                ArtworkShadow artworkShadow = contentBinding.artworkShadow;
                h.d(artworkShadow, "artworkShadow");
                artworkShadow.setScaleX(c);
                ArtworkShadow artworkShadow2 = contentBinding.artworkShadow;
                h.d(artworkShadow2, "artworkShadow");
                artworkShadow2.setScaleY(c);
            }
            ArtworkView artworkView5 = contentBinding.artwork;
            h.d(artworkView5, "artwork");
            if (artworkView5.getScaleX() > f4) {
                f = 1.0f;
            } else {
                int i3 = dimensionPixelSize / 2;
                f = ((float) (knf.c(i2, i3, dimensionPixelSize) - i3)) / (f2 / 2.0f);
            }
            ArtworkView artworkView6 = contentBinding.artwork;
            h.d(artworkView6, "artwork");
            artworkView6.setAlpha(f);
            ArtworkShadow artworkShadow3 = contentBinding.artworkShadow;
            h.d(artworkShadow3, "artworkShadow");
            artworkShadow3.setAlpha(f);
            ArtworkView artworkView7 = contentBinding.artwork;
            h.d(artworkView7, "artwork");
            if (artworkView7.getY() != 0.0f) {
                ArtworkView artworkView8 = contentBinding.artwork;
                h.d(artworkView8, "artwork");
                float f5 = (float) (-(i / 2));
                artworkView8.setTranslationY(f5);
                ArtworkShadow artworkShadow4 = contentBinding.artworkShadow;
                h.d(artworkShadow4, "artworkShadow");
                artworkShadow4.setTranslationY(f5);
            }
        }
    }
}
