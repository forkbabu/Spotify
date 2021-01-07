package com.spotify.encore.consumer.components.viewbindings.headers;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.ContentMotionBinding;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ContentMotionBindingsExtensions {
    public static final void hideArtwork(ContentMotionBinding contentMotionBinding) {
        h.e(contentMotionBinding, "$this$hideArtwork");
        ArtworkView artworkView = contentMotionBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setVisibility(8);
        setContentDimensionRatio(contentMotionBinding, null);
    }

    public static final View inflateActionRow(ContentMotionBinding contentMotionBinding, int i) {
        h.e(contentMotionBinding, "$this$inflateActionRow");
        ViewStub viewStub = contentMotionBinding.actionRowContainer;
        h.d(viewStub, "actionRowContainer");
        viewStub.setLayoutResource(i);
        View inflate = contentMotionBinding.actionRowContainer.inflate();
        h.d(inflate, "actionRowContainer.inflate()");
        return inflate;
    }

    public static final void renderArtwork(ContentMotionBinding contentMotionBinding, String str, nmf<? super Artwork.Events, f> nmf) {
        h.e(contentMotionBinding, "$this$renderArtwork");
        h.e(nmf, "event");
        if (str == null || str.length() == 0) {
            hideArtwork(contentMotionBinding);
            return;
        }
        showArtwork(contentMotionBinding);
        contentMotionBinding.artwork.onEvent(nmf);
        contentMotionBinding.artwork.render((Artwork.Model) new Artwork.Model.Album(new Artwork.ImageData(str), false, 2, null));
    }

    public static final void setContentDimensionRatio(ContentMotionBinding contentMotionBinding, String str) {
        h.e(contentMotionBinding, "$this$setContentDimensionRatio");
        Space space = contentMotionBinding.contentRatioSpace;
        h.d(space, "contentRatioSpace");
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams != null) {
            ((ConstraintLayout.LayoutParams) layoutParams).B = str;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public static final void showArtwork(ContentMotionBinding contentMotionBinding) {
        h.e(contentMotionBinding, "$this$showArtwork");
        ArtworkView artworkView = contentMotionBinding.artwork;
        h.d(artworkView, "artwork");
        artworkView.setVisibility(0);
        View root = contentMotionBinding.getRoot();
        h.d(root, "root");
        setContentDimensionRatio(contentMotionBinding, root.getContext().getString(R.string.header_dimens_ratio));
    }
}
