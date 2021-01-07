package com.spotify.music.features.carepackage.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class CarePackageTrackView extends ConstraintLayout implements f0 {
    private final RectF a = new RectF();
    private final Path b = new Path();
    private final ImageView c;
    private final TextView f;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final View q;
    private final View r;
    private final View s;
    private final View t;
    private boolean u;
    private boolean v;

    static final class a implements View.OnClickListener {
        final /* synthetic */ CarePackageTrackView a;
        final /* synthetic */ cmf b;

        a(CarePackageTrackView carePackageTrackView, cmf cmf) {
            this.a = carePackageTrackView;
            this.b = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.a.n.getVisibility() == 0) {
                this.b.invoke();
            }
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ cmf a;

        b(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ CarePackageTrackView a;
        final /* synthetic */ cmf b;
        final /* synthetic */ cmf c;

        c(CarePackageTrackView carePackageTrackView, cmf cmf, cmf cmf2) {
            this.a = carePackageTrackView;
            this.b = cmf;
            this.c = cmf2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.a.getPlaying()) {
                this.b.invoke();
            } else {
                this.c.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarePackageTrackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.care_package_row, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.track_image);
        h.d(G, "requireViewById(this, R.id.track_image)");
        this.c = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.position_text);
        h.d(G2, "requireViewById(this, R.id.position_text)");
        this.f = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.add_song_label);
        h.d(G3, "requireViewById(this, R.id.add_song_label)");
        this.n = (TextView) G3;
        View G4 = q4.G(this, C0707R.id.track_title);
        h.d(G4, "requireViewById(this, R.id.track_title)");
        this.o = (TextView) G4;
        View G5 = q4.G(this, C0707R.id.track_subtitle);
        h.d(G5, "requireViewById(this, R.id.track_subtitle)");
        this.p = (TextView) G5;
        View G6 = q4.G(this, C0707R.id.icon_plus);
        h.d(G6, "requireViewById(this, R.id.icon_plus)");
        this.q = G6;
        View G7 = q4.G(this, C0707R.id.icon_plus_2px);
        h.d(G7, "requireViewById(this, R.id.icon_plus_2px)");
        this.r = G7;
        View G8 = q4.G(this, C0707R.id.icon_sort);
        h.d(G8, "requireViewById(this, R.id.icon_sort)");
        this.s = G8;
        View G9 = q4.G(this, C0707R.id.icon_delete);
        h.d(G9, "requireViewById(this, R.id.icon_delete)");
        this.t = G9;
    }

    private final float P(int i) {
        Context context = getContext();
        h.d(context, "context");
        Resources resources = context.getResources();
        h.d(resources, "context.resources");
        return ((float) i) * resources.getDisplayMetrics().density;
    }

    private final void setupBackgroundColor(ImageView imageView) {
        imageView.setBackground(androidx.core.content.a.d(imageView.getContext(), this.u ? C0707R.drawable.care_package_row_image_highlited_background : C0707R.drawable.care_package_row_image_background));
    }

    public final void D() {
        this.t.setOnClickListener(null);
    }

    public final void E() {
        this.c.setOnClickListener(null);
    }

    public final void G(cmf<f> cmf, cmf<f> cmf2) {
        h.e(cmf, "playConsumer");
        h.e(cmf2, "pauseConsumer");
        this.c.setOnClickListener(new c(this, cmf2, cmf));
    }

    public final void J(int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        setEnabled(true);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.f.setVisibility(0);
        this.n.setVisibility(0);
        if (this.u) {
            androidx.core.widget.c.n(this.n, R.style.TextAppearance_Encore_BalladBold);
            TextView textView = this.n;
            Resources resources = getResources();
            Context context = getContext();
            h.d(context, "context");
            Resources.Theme theme = context.getTheme();
            if (Build.VERSION.SDK_INT >= 23) {
                colorStateList2 = resources.getColorStateList(C0707R.color.care_package_row_text_highlited_color, theme);
            } else {
                colorStateList2 = resources.getColorStateList(C0707R.color.care_package_row_text_highlited_color);
            }
            textView.setTextColor(colorStateList2);
            this.q.setVisibility(8);
            this.r.setVisibility(0);
        } else {
            androidx.core.widget.c.n(this.n, R.style.TextAppearance_Encore_Ballad);
            TextView textView2 = this.n;
            Resources resources2 = getResources();
            Context context2 = getContext();
            h.d(context2, "context");
            Resources.Theme theme2 = context2.getTheme();
            if (Build.VERSION.SDK_INT >= 23) {
                colorStateList = resources2.getColorStateList(C0707R.color.care_package_row_text_color, theme2);
            } else {
                colorStateList = resources2.getColorStateList(C0707R.color.care_package_row_text_color);
            }
            textView2.setTextColor(colorStateList);
            this.r.setVisibility(8);
            this.q.setVisibility(0);
        }
        this.f.setText(String.valueOf(i));
        this.c.setImageBitmap(null);
        setupBackgroundColor(this.c);
    }

    public final void K(String str, String str2) {
        h.e(str, "title");
        h.e(str2, ContextTrack.Metadata.KEY_SUBTITLE);
        setEnabled(false);
        this.o.setVisibility(0);
        this.p.setVisibility(0);
        this.s.setVisibility(8);
        this.t.setVisibility(0);
        this.f.setVisibility(8);
        this.n.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.o.setText(str);
        this.p.setText(str2);
        this.c.setBackground(null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        int save = canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public final boolean getHighlighted() {
        return this.u;
    }

    public final ImageView getImage() {
        return this.c;
    }

    public final boolean getPlaying() {
        return this.v;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.c.setImageDrawable(drawable);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.c.setImageBitmap(bitmap);
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        h.e(drawable, "placeHolderDrawable");
        this.c.setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.set(0.0f, 0.0f, (float) i, (float) i2);
        Path path = this.b;
        path.reset();
        path.addRoundRect(this.a, P(8), P(8), Path.Direction.CW);
        path.close();
    }

    public final void setHighlighted(boolean z) {
        this.u = z;
        invalidate();
    }

    public final void setOnAddSongListener(cmf<f> cmf) {
        h.e(cmf, "consumer");
        setOnClickListener(new a(this, cmf));
    }

    public final void setOnDeleteListener(cmf<f> cmf) {
        h.e(cmf, "consumer");
        this.t.setOnClickListener(new b(cmf));
    }

    public final void setPlaying(boolean z) {
        this.v = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarePackageTrackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.care_package_row, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.track_image);
        h.d(G, "requireViewById(this, R.id.track_image)");
        this.c = (ImageView) G;
        View G2 = q4.G(this, C0707R.id.position_text);
        h.d(G2, "requireViewById(this, R.id.position_text)");
        this.f = (TextView) G2;
        View G3 = q4.G(this, C0707R.id.add_song_label);
        h.d(G3, "requireViewById(this, R.id.add_song_label)");
        this.n = (TextView) G3;
        View G4 = q4.G(this, C0707R.id.track_title);
        h.d(G4, "requireViewById(this, R.id.track_title)");
        this.o = (TextView) G4;
        View G5 = q4.G(this, C0707R.id.track_subtitle);
        h.d(G5, "requireViewById(this, R.id.track_subtitle)");
        this.p = (TextView) G5;
        View G6 = q4.G(this, C0707R.id.icon_plus);
        h.d(G6, "requireViewById(this, R.id.icon_plus)");
        this.q = G6;
        View G7 = q4.G(this, C0707R.id.icon_plus_2px);
        h.d(G7, "requireViewById(this, R.id.icon_plus_2px)");
        this.r = G7;
        View G8 = q4.G(this, C0707R.id.icon_sort);
        h.d(G8, "requireViewById(this, R.id.icon_sort)");
        this.s = G8;
        View G9 = q4.G(this, C0707R.id.icon_delete);
        h.d(G9, "requireViewById(this, R.id.icon_delete)");
        this.t = G9;
    }
}
