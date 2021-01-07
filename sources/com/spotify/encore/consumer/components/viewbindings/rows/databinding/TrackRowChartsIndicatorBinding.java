package com.spotify.encore.consumer.components.viewbindings.rows.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.viewbindings.rows.R;

public final class TrackRowChartsIndicatorBinding {
    public final ImageView imgIndicatorIconLower;
    public final ImageView imgIndicatorIconUpper;
    private final ConstraintLayout rootView;
    public final TextView txtTrackRowNumber;

    private TrackRowChartsIndicatorBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.imgIndicatorIconLower = imageView;
        this.imgIndicatorIconUpper = imageView2;
        this.txtTrackRowNumber = textView;
    }

    public static TrackRowChartsIndicatorBinding bind(View view) {
        int i = R.id.img_indicator_icon_lower;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.img_indicator_icon_upper;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                i = R.id.txt_track_row_number;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new TrackRowChartsIndicatorBinding((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static TrackRowChartsIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TrackRowChartsIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.track_row_charts_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
