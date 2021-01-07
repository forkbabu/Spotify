package com.spotify.encore.consumer.components.error.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.error.impl.R;

public final class ErrorBannerLayoutBinding {
    public final Button btnAction;
    public final ImageButton btnClose;
    public final ConstraintLayout infoBanner;
    private final ConstraintLayout rootView;
    public final TextView txtContent;
    public final TextView txtTitle;

    private ErrorBannerLayoutBinding(ConstraintLayout constraintLayout, Button button, ImageButton imageButton, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnAction = button;
        this.btnClose = imageButton;
        this.infoBanner = constraintLayout2;
        this.txtContent = textView;
        this.txtTitle = textView2;
    }

    public static ErrorBannerLayoutBinding bind(View view) {
        int i = R.id.btn_action;
        Button button = (Button) view.findViewById(i);
        if (button != null) {
            i = R.id.btn_close;
            ImageButton imageButton = (ImageButton) view.findViewById(i);
            if (imageButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.txt_content;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.txt_title;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        return new ErrorBannerLayoutBinding(constraintLayout, button, imageButton, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ErrorBannerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ErrorBannerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.error_banner_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
