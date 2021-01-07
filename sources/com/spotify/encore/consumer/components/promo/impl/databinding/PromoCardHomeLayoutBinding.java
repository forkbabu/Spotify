package com.spotify.encore.consumer.components.promo.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.promo.impl.R;
import com.spotify.encore.consumer.components.promo.impl.promocard.elements.PlayButtonView;

public final class PromoCardHomeLayoutBinding {
    public final ImageView backgroundImage;
    public final FrameLayout cardRoot;
    public final TextView label;
    public final ImageView logo;
    public final PlayButtonView playButton;
    public final ConstraintLayout rootView;
    private final FrameLayout rootView_;
    public final TextView subtitle;
    public final TextView title;

    private PromoCardHomeLayoutBinding(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, TextView textView, ImageView imageView2, PlayButtonView playButtonView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3) {
        this.rootView_ = frameLayout;
        this.backgroundImage = imageView;
        this.cardRoot = frameLayout2;
        this.label = textView;
        this.logo = imageView2;
        this.playButton = playButtonView;
        this.rootView = constraintLayout;
        this.subtitle = textView2;
        this.title = textView3;
    }

    public static PromoCardHomeLayoutBinding bind(View view) {
        int i = R.id.background_image;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = R.id.label;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.logo;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = R.id.play_button;
                    PlayButtonView playButtonView = (PlayButtonView) view.findViewById(i);
                    if (playButtonView != null) {
                        i = R.id.root_view;
                        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                        if (constraintLayout != null) {
                            i = R.id.subtitle;
                            TextView textView2 = (TextView) view.findViewById(i);
                            if (textView2 != null) {
                                i = R.id.title;
                                TextView textView3 = (TextView) view.findViewById(i);
                                if (textView3 != null) {
                                    return new PromoCardHomeLayoutBinding(frameLayout, imageView, frameLayout, textView, imageView2, playButtonView, constraintLayout, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PromoCardHomeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PromoCardHomeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.promo_card_home_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView_;
    }
}
