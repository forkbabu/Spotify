package com.spotify.encore.consumer.components.home.impl.recsplanationsectionheading;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.home.impl.R;
import com.spotify.encore.consumer.components.home.impl.databinding.RecsplanationSectionheadingLayoutBinding;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class RecsplanationSectionHeadingViewBindingsKt {
    public static final void init(RecsplanationSectionheadingLayoutBinding recsplanationSectionheadingLayoutBinding, Picasso picasso) {
        h.e(recsplanationSectionheadingLayoutBinding, "$this$init");
        h.e(picasso, "picasso");
        ConstraintLayout root = recsplanationSectionheadingLayoutBinding.getRoot();
        h.d(root, "root");
        int dimensionPixelSize = root.getResources().getDimensionPixelSize(R.dimen.home_section_header_side_spacing);
        ConstraintLayout root2 = recsplanationSectionheadingLayoutBinding.getRoot();
        h.d(root2, "root");
        int dimensionPixelSize2 = root2.getResources().getDimensionPixelSize(R.dimen.home_section_header_top_spacing);
        ConstraintLayout root3 = recsplanationSectionheadingLayoutBinding.getRoot();
        h.d(root3, "root");
        int dimensionPixelSize3 = root3.getResources().getDimensionPixelSize(R.dimen.home_section_header_bottom_spacing);
        ConstraintLayout root4 = recsplanationSectionheadingLayoutBinding.getRoot();
        h.d(root4, "root");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        if (Build.VERSION.SDK_INT > 16) {
            layoutParams.setMarginStart(dimensionPixelSize);
            layoutParams.setMarginEnd(dimensionPixelSize);
        }
        root4.setLayoutParams(layoutParams);
        bvd c = dvd.c(recsplanationSectionheadingLayoutBinding.getRoot());
        c.f(recsplanationSectionheadingLayoutBinding.image);
        c.g(recsplanationSectionheadingLayoutBinding.title, recsplanationSectionheadingLayoutBinding.subtitle);
        c.a();
        recsplanationSectionheadingLayoutBinding.image.setViewContext(new ArtworkView.ViewContext(picasso));
        q4.J(recsplanationSectionheadingLayoutBinding.getRoot(), true);
    }
}
