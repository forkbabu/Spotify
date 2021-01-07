package com.spotify.encore.consumer.components.promo.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.promo.impl.R;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;

public final class PromoCardWrappedBinding {
    public final ImageView imageArrow;
    public final WrappedGradientView imageBackground;
    public final ConstraintLayout promotionRootView;
    private final ConstraintLayout rootView;
    public final TextView txtDescription;
    public final TextView txtTitle;

    private PromoCardWrappedBinding(ConstraintLayout constraintLayout, ImageView imageView, WrappedGradientView wrappedGradientView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.imageArrow = imageView;
        this.imageBackground = wrappedGradientView;
        this.promotionRootView = constraintLayout2;
        this.txtDescription = textView;
        this.txtTitle = textView2;
    }

    public static PromoCardWrappedBinding bind(View view) {
        int i = R.id.image_arrow;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.image_background;
            WrappedGradientView wrappedGradientView = (WrappedGradientView) view.findViewById(i);
            if (wrappedGradientView != null) {
                i = R.id.promotion_root_view;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                if (constraintLayout != null) {
                    i = R.id.txt_description;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        i = R.id.txt_title;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new PromoCardWrappedBinding((ConstraintLayout) view, imageView, wrappedGradientView, constraintLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PromoCardWrappedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PromoCardWrappedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.promo_card_wrapped, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
