package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.cast.framework.g;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.internal.cast.k7;
import com.google.android.gms.internal.cast.zzkj;
import com.spotify.music.C0707R;

public class MiniControllerFragment extends Fragment {
    private static final b E0 = new b("MiniControllerFragment");
    private int A0;
    private int B0;
    private int C0;
    private wq D0;
    private boolean g0;
    private int h0;
    private int i0;
    private TextView j0;
    private int k0;
    private int l0;
    private int m0;
    private int n0;
    private int[] o0;
    private ImageView[] p0 = new ImageView[3];
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private int x0;
    private int y0;
    private int z0;

    private final void K4(RelativeLayout relativeLayout, int i, int i2) {
        ImageView imageView = (ImageView) relativeLayout.findViewById(i);
        int i3 = this.o0[i2];
        if (i3 == C0707R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
        } else if (i3 == C0707R.id.cast_button_type_custom) {
        } else {
            if (i3 == C0707R.id.cast_button_type_play_pause_toggle) {
                int i4 = this.r0;
                int i5 = this.s0;
                int i6 = this.t0;
                if (this.q0 == 1) {
                    i4 = this.u0;
                    i5 = this.v0;
                    i6 = this.w0;
                }
                Drawable a = b.a(F2(), this.n0, i4);
                Drawable a2 = b.a(F2(), this.n0, i5);
                Drawable a3 = b.a(F2(), this.n0, i6);
                imageView.setImageDrawable(a2);
                ProgressBar progressBar = new ProgressBar(F2());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(8, i);
                layoutParams.addRule(6, i);
                layoutParams.addRule(5, i);
                layoutParams.addRule(7, i);
                layoutParams.addRule(15);
                progressBar.setLayoutParams(layoutParams);
                progressBar.setVisibility(8);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                int i7 = this.m0;
                if (!(i7 == 0 || indeterminateDrawable == null)) {
                    indeterminateDrawable.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                }
                relativeLayout.addView(progressBar);
                this.D0.r(imageView, a, a2, a3, progressBar, true);
            } else if (i3 == C0707R.id.cast_button_type_skip_previous) {
                imageView.setImageDrawable(b.a(F2(), this.n0, this.x0));
                imageView.setContentDescription(R2().getString(C0707R.string.cast_skip_prev));
                this.D0.A(imageView, 0);
            } else if (i3 == C0707R.id.cast_button_type_skip_next) {
                imageView.setImageDrawable(b.a(F2(), this.n0, this.y0));
                imageView.setContentDescription(R2().getString(C0707R.string.cast_skip_next));
                this.D0.z(imageView, 0);
            } else if (i3 == C0707R.id.cast_button_type_rewind_30_seconds) {
                imageView.setImageDrawable(b.a(F2(), this.n0, this.z0));
                imageView.setContentDescription(R2().getString(C0707R.string.cast_rewind_30));
                this.D0.y(imageView, 30000);
            } else if (i3 == C0707R.id.cast_button_type_forward_30_seconds) {
                imageView.setImageDrawable(b.a(F2(), this.n0, this.A0));
                imageView.setContentDescription(R2().getString(C0707R.string.cast_forward_30));
                this.D0.w(imageView, 30000);
            } else if (i3 == C0707R.id.cast_button_type_mute_toggle) {
                imageView.setImageDrawable(b.a(F2(), this.n0, this.B0));
                this.D0.q(imageView);
            } else if (i3 == C0707R.id.cast_button_type_closed_caption) {
                imageView.setImageDrawable(b.a(F2(), this.n0, this.C0));
                this.D0.v(imageView);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void D3(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.D3(context, attributeSet, bundle);
        if (this.o0 == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.b, C0707R.attr.castMiniControllerStyle, C0707R.style.CastMiniController);
            this.g0 = obtainStyledAttributes.getBoolean(14, true);
            this.h0 = obtainStyledAttributes.getResourceId(19, 0);
            this.i0 = obtainStyledAttributes.getResourceId(18, 0);
            this.k0 = obtainStyledAttributes.getResourceId(0, 0);
            int color = obtainStyledAttributes.getColor(12, 0);
            this.l0 = color;
            this.m0 = obtainStyledAttributes.getColor(8, color);
            this.n0 = obtainStyledAttributes.getResourceId(1, 0);
            this.r0 = obtainStyledAttributes.getResourceId(11, 0);
            this.s0 = obtainStyledAttributes.getResourceId(10, 0);
            this.t0 = obtainStyledAttributes.getResourceId(17, 0);
            this.u0 = obtainStyledAttributes.getResourceId(11, 0);
            this.v0 = obtainStyledAttributes.getResourceId(10, 0);
            this.w0 = obtainStyledAttributes.getResourceId(17, 0);
            this.x0 = obtainStyledAttributes.getResourceId(16, 0);
            this.y0 = obtainStyledAttributes.getResourceId(15, 0);
            this.z0 = obtainStyledAttributes.getResourceId(13, 0);
            this.A0 = obtainStyledAttributes.getResourceId(4, 0);
            this.B0 = obtainStyledAttributes.getResourceId(9, 0);
            this.C0 = obtainStyledAttributes.getResourceId(2, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                com.google.android.exoplayer2.util.g.c(obtainTypedArray.length() == 3);
                this.o0 = new int[obtainTypedArray.length()];
                for (int i = 0; i < obtainTypedArray.length(); i++) {
                    this.o0[i] = obtainTypedArray.getResourceId(i, 0);
                }
                obtainTypedArray.recycle();
                if (this.g0) {
                    this.o0[0] = C0707R.id.cast_button_type_empty;
                }
                this.q0 = 0;
                for (int i2 : this.o0) {
                    if (i2 != C0707R.id.cast_button_type_empty) {
                        this.q0++;
                    }
                }
            } else {
                E0.f("Unable to read attribute castControlButtons.", new Object[0]);
                this.o0 = new int[]{C0707R.id.cast_button_type_empty, C0707R.id.cast_button_type_empty, C0707R.id.cast_button_type_empty};
            }
            obtainStyledAttributes.recycle();
        }
        k7.b(zzkj.CAF_MINI_CONTROLLER);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D0 = new wq(B2());
        View inflate = layoutInflater.inflate(C0707R.layout.cast_mini_controller, viewGroup);
        inflate.setVisibility(8);
        this.D0.B(inflate, 8);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0707R.id.container_current);
        int i = this.k0;
        if (i != 0) {
            relativeLayout.setBackgroundResource(i);
        }
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.icon_view);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title_view);
        if (this.h0 != 0) {
            textView.setTextAppearance(B2(), this.h0);
        }
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.subtitle_view);
        this.j0 = textView2;
        if (this.i0 != 0) {
            textView2.setTextAppearance(B2(), this.i0);
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0707R.id.progressBar);
        if (this.l0 != 0) {
            ((LayerDrawable) progressBar.getProgressDrawable()).setColorFilter(this.l0, PorterDuff.Mode.SRC_IN);
        }
        this.D0.t(textView, "com.google.android.gms.cast.metadata.TITLE");
        this.D0.u(this.j0);
        this.D0.s(progressBar);
        this.D0.x(relativeLayout);
        if (this.g0) {
            this.D0.p(imageView, new com.google.android.gms.cast.framework.media.b(2, R2().getDimensionPixelSize(C0707R.dimen.cast_mini_controller_icon_width), R2().getDimensionPixelSize(C0707R.dimen.cast_mini_controller_icon_height)), C0707R.drawable.cast_album_art_placeholder);
        } else {
            imageView.setVisibility(8);
        }
        this.p0[0] = (ImageView) relativeLayout.findViewById(C0707R.id.button_0);
        this.p0[1] = (ImageView) relativeLayout.findViewById(C0707R.id.button_1);
        this.p0[2] = (ImageView) relativeLayout.findViewById(C0707R.id.button_2);
        K4(relativeLayout, C0707R.id.button_0, 0);
        K4(relativeLayout, C0707R.id.button_1, 1);
        K4(relativeLayout, C0707R.id.button_2, 2);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        wq wqVar = this.D0;
        if (wqVar != null) {
            wqVar.C();
            this.D0 = null;
        }
        super.x3();
    }
}
