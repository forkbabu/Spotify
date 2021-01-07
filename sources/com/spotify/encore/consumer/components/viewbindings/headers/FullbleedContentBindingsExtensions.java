package com.spotify.encore.consumer.components.viewbindings.headers;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.FullbleedContentBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class FullbleedContentBindingsExtensions {
    public static final void hideArtwork(FullbleedContentBinding fullbleedContentBinding) {
        h.e(fullbleedContentBinding, "$this$hideArtwork");
        ArtworkView artworkView = fullbleedContentBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setVisibility(8);
        setContentDimensionRatio(fullbleedContentBinding, null);
    }

    public static final View inflateActionRow(FullbleedContentBinding fullbleedContentBinding, int i) {
        h.e(fullbleedContentBinding, "$this$inflateActionRow");
        ViewStub viewStub = fullbleedContentBinding.actionRowContainer;
        h.d(viewStub, "actionRowContainer");
        viewStub.setLayoutResource(i);
        View inflate = fullbleedContentBinding.actionRowContainer.inflate();
        h.d(inflate, "actionRowContainer.inflate()");
        return inflate;
    }

    public static final void renderArtwork(FullbleedContentBinding fullbleedContentBinding, String str, nmf<? super Artwork.Events, f> nmf) {
        h.e(fullbleedContentBinding, "$this$renderArtwork");
        h.e(nmf, "event");
        if (str == null || str.length() == 0) {
            hideArtwork(fullbleedContentBinding);
            return;
        }
        showArtwork(fullbleedContentBinding);
        fullbleedContentBinding.artwork.onEvent(nmf);
        fullbleedContentBinding.artwork.render((Artwork.Model) new Artwork.Model.Album(new Artwork.ImageData(str), true));
    }

    public static final void setContentDimensionRatio(FullbleedContentBinding fullbleedContentBinding, String str) {
        h.e(fullbleedContentBinding, "$this$setContentDimensionRatio");
        Space space = fullbleedContentBinding.contentDimensionRatioSpace;
        h.d(space, "contentDimensionRatioSpace");
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams != null) {
            ((ConstraintLayout.LayoutParams) layoutParams).B = str;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public static final void showArtwork(FullbleedContentBinding fullbleedContentBinding) {
        h.e(fullbleedContentBinding, "$this$showArtwork");
        ArtworkView artworkView = fullbleedContentBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setVisibility(0);
        MotionLayout root = fullbleedContentBinding.getRoot();
        h.d(root, "root");
        setContentDimensionRatio(fullbleedContentBinding, root.getContext().getString(R.string.fullbleed_header_dimens_ratio));
    }

    public static final void updateMotionProgress(FullbleedContentBinding fullbleedContentBinding, int i, AppBarLayout appBarLayout) {
        h.e(fullbleedContentBinding, "$this$updateMotionProgress");
        h.e(appBarLayout, "appBarLayout");
        MotionLayout motionLayout = fullbleedContentBinding.contentContainer;
        h.d(motionLayout, "contentContainer");
        motionLayout.setProgress(((float) (-i)) / ((float) appBarLayout.getTotalScrollRange()));
    }
}
