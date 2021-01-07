package com.spotify.music.playlist.ui.row;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.e0;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Arrays;

public final class Rows {
    public static r90 a(Context context, ViewGroup viewGroup) {
        Resources resources = context.getResources();
        r90 b = e90.d().b(context, viewGroup, 10);
        TextView Z = b.Z();
        int g = nud.g(16.0f, resources);
        Z.setPadding(0, g, Z.getPaddingRight(), g);
        c.n(Z, R.style.TextAppearance_Encore_Mesto);
        Z.setTextColor(a.b(context, R.color.black));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        linearLayout.setId(C0707R.id.row_preview_rounded_layout);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackgroundResource(C0707R.drawable.bg_large_row_rounded_white);
        View view = b.getView();
        b.getView().setPadding(0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        linearLayout.addView(b.getView());
        b.getView().setDuplicateParentStateEnabled(true);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(80);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int g2 = nud.g(16.0f, resources);
        int g3 = nud.g(8.0f, resources);
        relativeLayout.setPadding(g2, g3, g2, g3);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(linearLayout);
        b bVar = new b(b, relativeLayout);
        bVar.getView().setTag(C0707R.id.glue_viewholder_tag, bVar);
        return bVar;
    }

    public static e b(Context context, ViewGroup viewGroup) {
        y90 j = e90.d().j(context, viewGroup, false);
        Resources resources = context.getResources();
        int g = nud.g(84.0f, resources);
        int g2 = nud.g(72.0f, resources);
        int g3 = nud.g(8.0f, resources);
        int g4 = nud.g(6.0f, resources);
        int g5 = nud.g(8.0f, resources);
        int g6 = nud.g(8.0f, resources);
        RoundedLinearLayout roundedLinearLayout = new RoundedLinearLayout(context);
        roundedLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g));
        roundedLinearLayout.setMinimumHeight(g);
        roundedLinearLayout.setOrientation(0);
        roundedLinearLayout.setGravity(16);
        roundedLinearLayout.setBackgroundResource(C0707R.drawable.bg_large_row_rounded);
        roundedLinearLayout.a(g3, g4, g3, g4);
        roundedLinearLayout.b((float) g6);
        ImageView imageView = j.getImageView();
        ViewGroup.LayoutParams layoutParams = j.getImageView().getLayoutParams();
        layoutParams.height = g2;
        layoutParams.width = g2;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g2);
        imageView.setMinimumWidth(g2);
        g(j.getImageView(), g5);
        roundedLinearLayout.addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        d dVar = new d(j, roundedLinearLayout);
        dVar.getView().setTag(C0707R.id.glue_viewholder_tag, dVar);
        f fVar = new f(dVar, new e0((ViewGroup) dVar.getView().findViewById(C0707R.id.accessory)));
        fVar.getView().setTag(C0707R.id.glue_viewholder_tag, fVar);
        return fVar;
    }

    public static e c(Context context, ViewGroup viewGroup) {
        y90 j = e90.d().j(context, viewGroup, false);
        f fVar = new f(j, new e0((ViewGroup) j.getView().findViewById(C0707R.id.accessory)));
        fVar.getView().setTag(C0707R.id.glue_viewholder_tag, fVar);
        return fVar;
    }

    public static i d(Context context, ViewGroup viewGroup) {
        Resources resources = context.getResources();
        y90 j = e90.d().j(context, viewGroup, false);
        int g = nud.g(74.0f, resources);
        int g2 = nud.g(64.0f, resources);
        int g3 = nud.g(16.0f, resources);
        int g4 = nud.g(6.0f, resources);
        int g5 = nud.g(8.0f, resources);
        int g6 = nud.g(8.0f, resources);
        RoundedLinearLayout roundedLinearLayout = new RoundedLinearLayout(context);
        roundedLinearLayout.setOrientation(1);
        roundedLinearLayout.setGravity(16);
        roundedLinearLayout.setId(C0707R.id.row_preview_rounded_layout);
        roundedLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g));
        roundedLinearLayout.setMinimumHeight(g);
        roundedLinearLayout.setBackgroundResource(C0707R.drawable.bg_large_row_rounded2);
        roundedLinearLayout.a(g3, g4, g3, g4);
        roundedLinearLayout.b((float) g6);
        int g7 = nud.g(8.0f, resources);
        roundedLinearLayout.setPadding(g7, 0, g7, 0);
        ImageView imageView = j.getImageView();
        ViewGroup.LayoutParams layoutParams = j.getImageView().getLayoutParams();
        layoutParams.height = g2;
        layoutParams.width = g2;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g2);
        imageView.setMinimumWidth(g2);
        g(j.getImageView(), g5);
        c.n(j.getTitleView(), R.style.TextAppearance_Encore_BalladBold);
        roundedLinearLayout.addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(80);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout2.setPadding(nud.g(12.0f, resources), nud.g(8.0f, resources), nud.g(16.0f, resources), nud.g(8.0f, resources));
        relativeLayout2.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        c.n(textView, R.style.TextAppearance_Encore_Mesto);
        int i = R.color.gray_70;
        textView.setTextColor(a.b(context, i));
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(C0707R.id.row_preview_footer_icon_view);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.HELPCIRCLE, (float) nud.g(24.0f, resources));
        spotifyIconDrawable.r(a.b(context, i));
        imageView2.setImageDrawable(spotifyIconDrawable);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(0, imageView2.getId());
        layoutParams3.addRule(15);
        relativeLayout2.addView(textView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        relativeLayout2.addView(imageView2, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, roundedLinearLayout.getId());
        relativeLayout.addView(relativeLayout2, layoutParams5);
        relativeLayout.addView(roundedLinearLayout);
        g gVar = new g(j, relativeLayout2, relativeLayout, textView);
        gVar.getView().setTag(C0707R.id.glue_viewholder_tag, gVar);
        j jVar = new j(gVar, new e0((ViewGroup) gVar.getView().findViewById(C0707R.id.accessory)));
        jVar.getView().setTag(C0707R.id.glue_viewholder_tag, jVar);
        return jVar;
    }

    public static u90 e(Context context, ViewGroup viewGroup) {
        u90 d = e90.d().d(context, viewGroup);
        int g = nud.g(80.0f, context.getResources());
        int g2 = nud.g(64.0f, context.getResources());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g));
        linearLayout.setMinimumHeight(g);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = d.getImageView();
        ViewGroup.LayoutParams layoutParams = d.getImageView().getLayoutParams();
        layoutParams.height = g2;
        layoutParams.width = g2;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g2);
        imageView.setMinimumWidth(g2);
        linearLayout.addView(d.getView());
        d.getView().setDuplicateParentStateEnabled(true);
        c cVar = new c(d, linearLayout);
        cVar.getView().setTag(C0707R.id.glue_viewholder_tag, cVar);
        return cVar;
    }

    public static y90 f(Context context, ViewGroup viewGroup) {
        y90 j = e90.d().j(context, viewGroup, false);
        int g = nud.g(80.0f, context.getResources());
        int g2 = nud.g(64.0f, context.getResources());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g));
        linearLayout.setMinimumHeight(g);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = j.getImageView();
        ViewGroup.LayoutParams layoutParams = j.getImageView().getLayoutParams();
        layoutParams.height = g2;
        layoutParams.width = g2;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g2);
        imageView.setMinimumWidth(g2);
        linearLayout.addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        d dVar = new d(j, linearLayout);
        dVar.getView().setTag(C0707R.id.glue_viewholder_tag, dVar);
        return dVar;
    }

    private static void g(View view, int i) {
        while (i > 0 && view != null) {
            int paddingLeft = view.getPaddingLeft();
            if (paddingLeft > 0) {
                int i2 = 0;
                if (paddingLeft > i) {
                    i2 = paddingLeft - i;
                    i = 0;
                } else {
                    i -= paddingLeft;
                }
                view.setPadding(i2, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
    }

    /* access modifiers changed from: private */
    public static class RoundedLinearLayout extends LinearLayout {
        private int a;
        private int b;
        private int c;
        private int f;
        private final float[] n;
        private final RectF o;
        private final Path p;

        public RoundedLinearLayout(Context context) {
            super(context, null);
            this.n = new float[8];
            this.o = new RectF();
            this.p = new Path();
        }

        public void a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.f = i4;
        }

        public void b(float f2) {
            Arrays.fill(this.n, 0, 8, f2);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.View, android.view.ViewGroup
        public void dispatchDraw(Canvas canvas) {
            int save = canvas.save();
            if (!this.p.isEmpty()) {
                try {
                    canvas.clipPath(this.p);
                } catch (UnsupportedOperationException e) {
                    Logger.c(e, "Failed clipping, moving on.", new Object[0]);
                }
            }
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.p.reset();
            this.o.set((float) this.a, (float) this.b, (float) ((i3 - i) - this.c), (float) ((i4 - i2) - this.f));
            this.p.addRoundRect(this.o, this.n, Path.Direction.CW);
        }

        public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n = new float[8];
            this.o = new RectF();
            this.p = new Path();
        }

        public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.n = new float[8];
            this.o = new RectF();
            this.p = new Path();
        }
    }
}
