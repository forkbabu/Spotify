package com.spotify.music.freetiercommon.uicomponents;

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
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import java.util.Arrays;
import java.util.List;

public final class Rows {

    static class a implements e {
        final /* synthetic */ u90 a;
        final /* synthetic */ LinearLayout b;

        a(u90 u90, LinearLayout linearLayout) {
            this.a = u90;
            this.b = linearLayout;
        }

        @Override // defpackage.p90
        public View W1() {
            return this.a.W1();
        }

        @Override // defpackage.t90
        public TextView Z() {
            return this.a.Z();
        }

        @Override // defpackage.p90
        public void g1(boolean z) {
            this.a.g1(z);
        }

        @Override // defpackage.fa0
        public ImageView getImageView() {
            return this.a.getImageView();
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.b;
        }

        @Override // defpackage.f90
        public void setActive(boolean z) {
            this.a.setActive(z);
        }

        @Override // com.spotify.paste.widgets.internal.c
        public void setAppearsDisabled(boolean z) {
            this.a.setAppearsDisabled(z);
        }

        @Override // defpackage.t90
        public void setText(CharSequence charSequence) {
            this.a.setText(charSequence);
        }

        @Override // defpackage.p90
        public void z0(View view) {
            this.a.z0(view);
        }
    }

    static class b implements f {
        final /* synthetic */ y90 a;
        final /* synthetic */ LinearLayout b;

        b(y90 y90, LinearLayout linearLayout) {
            this.a = y90;
            this.b = linearLayout;
        }

        @Override // defpackage.p90
        public View W1() {
            return this.a.W1();
        }

        @Override // defpackage.x90
        public void e(CharSequence charSequence) {
            this.a.e(charSequence);
        }

        @Override // defpackage.fa0
        public ImageView getImageView() {
            return this.a.getImageView();
        }

        @Override // defpackage.x90
        public TextView getSubtitleView() {
            return this.a.getSubtitleView();
        }

        @Override // defpackage.x90
        public TextView getTitleView() {
            return this.a.getTitleView();
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.b;
        }

        @Override // defpackage.f90
        public void setActive(boolean z) {
            this.a.setActive(z);
        }

        @Override // com.spotify.paste.widgets.internal.c
        public void setAppearsDisabled(boolean z) {
            this.a.setAppearsDisabled(z);
        }

        @Override // defpackage.x90
        public void setSubtitle(CharSequence charSequence) {
            this.a.setSubtitle(charSequence);
        }

        @Override // defpackage.x90
        public void setTitle(CharSequence charSequence) {
            this.a.setTitle(charSequence);
        }

        @Override // defpackage.p90
        public void z0(View view) {
            this.a.z0(view);
        }
    }

    static class c implements h {
        final /* synthetic */ g a;
        final /* synthetic */ b b;

        c(g gVar, b bVar) {
            this.a = gVar;
            this.b = bVar;
        }

        @Override // defpackage.p90
        public View W1() {
            return this.b.a();
        }

        @Override // defpackage.x90
        public void e(CharSequence charSequence) {
            this.a.e(charSequence);
        }

        @Override // defpackage.fa0
        public ImageView getImageView() {
            return this.a.getImageView();
        }

        @Override // defpackage.x90
        public TextView getSubtitleView() {
            return this.a.getSubtitleView();
        }

        @Override // defpackage.x90
        public TextView getTitleView() {
            return this.a.getTitleView();
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.a.getView();
        }

        @Override // defpackage.f90
        public void setActive(boolean z) {
            this.a.setActive(z);
        }

        @Override // com.spotify.paste.widgets.internal.c
        public void setAppearsDisabled(boolean z) {
            this.a.setAppearsDisabled(z);
        }

        @Override // defpackage.x90
        public void setSubtitle(CharSequence charSequence) {
            this.a.setSubtitle(charSequence);
        }

        @Override // defpackage.x90
        public void setTitle(CharSequence charSequence) {
            this.a.setTitle(charSequence);
        }

        @Override // com.spotify.music.freetiercommon.uicomponents.Rows.d
        public void z(List<View> list) {
            this.b.c(list);
            this.b.d();
        }

        @Override // defpackage.p90
        public void z0(View view) {
            b bVar = this.b;
            bVar.getClass();
            bVar.c(ImmutableList.of(view));
        }
    }

    public interface d {
        void z(List<View> list);
    }

    public interface e extends u90 {
    }

    public interface f extends y90 {
    }

    public interface g extends y90 {
    }

    public interface h extends g, d {
    }

    public interface i extends x90, d {
    }

    public static h a(Context context, ViewGroup viewGroup) {
        int i2;
        y90 j = e90.d().j(context, viewGroup, false);
        Resources resources = context.getResources();
        int g2 = nud.g(84.0f, resources);
        int g3 = nud.g(72.0f, resources);
        int g4 = nud.g(8.0f, resources);
        int g5 = nud.g(6.0f, resources);
        int g6 = nud.g(8.0f, resources);
        int g7 = nud.g(8.0f, resources);
        RoundedLinearLayout roundedLinearLayout = new RoundedLinearLayout(context);
        roundedLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g2));
        roundedLinearLayout.setMinimumHeight(g2);
        roundedLinearLayout.setOrientation(0);
        roundedLinearLayout.setGravity(16);
        roundedLinearLayout.setBackgroundResource(C0707R.drawable.bg_large_row_rounded);
        roundedLinearLayout.a(g4, g5, g4, g5);
        roundedLinearLayout.b((float) g7);
        ImageView imageView = j.getImageView();
        ViewGroup.LayoutParams layoutParams = j.getImageView().getLayoutParams();
        layoutParams.height = g3;
        layoutParams.width = g3;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g3);
        imageView.setMinimumWidth(g3);
        View imageView2 = j.getImageView();
        while (g6 > 0 && imageView2 != null) {
            int paddingLeft = imageView2.getPaddingLeft();
            if (paddingLeft > 0) {
                if (paddingLeft > g6) {
                    i2 = paddingLeft - g6;
                    g6 = 0;
                } else {
                    g6 -= paddingLeft;
                    i2 = 0;
                }
                imageView2.setPadding(i2, imageView2.getPaddingTop(), imageView2.getPaddingRight(), imageView2.getPaddingBottom());
            }
            imageView2 = imageView2.getParent() instanceof View ? (View) imageView2.getParent() : null;
        }
        roundedLinearLayout.addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        c cVar = new c(j, roundedLinearLayout);
        roundedLinearLayout.setTag(C0707R.id.glue_viewholder_tag, cVar);
        c cVar2 = new c(cVar, new b((ViewGroup) cVar.b.findViewById(C0707R.id.accessory)));
        cVar2.getView().setTag(C0707R.id.glue_viewholder_tag, cVar2);
        return cVar2;
    }

    public static i b(Context context, ViewGroup viewGroup) {
        x90 h2 = e90.d().h(context, viewGroup, false);
        d dVar = new d(h2, new b((ViewGroup) h2.getView().findViewById(C0707R.id.accessory)));
        dVar.getView().setTag(C0707R.id.glue_viewholder_tag, dVar);
        return dVar;
    }

    public static e c(Context context, ViewGroup viewGroup, int i2, int i3) {
        u90 d2 = e90.d().d(context, viewGroup);
        int g2 = nud.g((float) ((i3 * 2) + i2), context.getResources());
        int g3 = nud.g((float) i2, context.getResources());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g2));
        linearLayout.setMinimumHeight(g2);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = d2.getImageView();
        ViewGroup.LayoutParams layoutParams = d2.getImageView().getLayoutParams();
        layoutParams.height = g3;
        layoutParams.width = g3;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g3);
        imageView.setMinimumWidth(g3);
        linearLayout.addView(d2.getView());
        d2.getView().setDuplicateParentStateEnabled(true);
        a aVar = new a(d2, linearLayout);
        linearLayout.setTag(C0707R.id.glue_viewholder_tag, aVar);
        return aVar;
    }

    public static f d(Context context, ViewGroup viewGroup, int i2, int i3) {
        y90 j = e90.d().j(context, viewGroup, false);
        int g2 = nud.g((float) ((i3 * 2) + i2), context.getResources());
        int g3 = nud.g((float) i2, context.getResources());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, g2));
        linearLayout.setMinimumHeight(g2);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ImageView imageView = j.getImageView();
        ViewGroup.LayoutParams layoutParams = j.getImageView().getLayoutParams();
        layoutParams.height = g3;
        layoutParams.width = g3;
        imageView.setLayoutParams(layoutParams);
        imageView.setMinimumHeight(g3);
        imageView.setMinimumWidth(g3);
        linearLayout.addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        b bVar = new b(j, linearLayout);
        bVar.getView().setTag(C0707R.id.glue_viewholder_tag, bVar);
        return bVar;
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
