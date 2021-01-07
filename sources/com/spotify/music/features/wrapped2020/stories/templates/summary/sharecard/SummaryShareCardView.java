package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class SummaryShareCardView extends View {
    private final ImageView A;
    private final TextView B;
    private float a;
    private float b;
    private float c;
    private final View f;
    private final WrappedGradientView n;
    private final View o;
    private final WrappedGradientView p;
    private final ImageView q;
    private final TextView r;
    private final TextView s;
    private final TextView t;
    private final TextView u;
    private final TextView v;
    private final TextView w;
    private final RecyclerView x;
    private final RecyclerView y;
    private final View z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryShareCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0707R.layout.view_share_card, (ViewGroup) null);
        h.d(inflate, "LayoutInflater.from(cont…ut.view_share_card, null)");
        this.f = inflate;
        View G = q4.G(inflate, C0707R.id.outer_gradient);
        h.d(G, "requireViewById<WrappedG…iew, R.id.outer_gradient)");
        this.n = (WrappedGradientView) G;
        View G2 = q4.G(inflate, C0707R.id.background);
        h.d(G2, "requireViewById<View>(view, R.id.background)");
        this.o = G2;
        View G3 = q4.G(inflate, C0707R.id.inner_gradient);
        h.d(G3, "requireViewById<WrappedG…iew, R.id.inner_gradient)");
        this.p = (WrappedGradientView) G3;
        View G4 = q4.G(inflate, C0707R.id.cover_art_image);
        h.d(G4, "requireViewById<ImageVie…ew, R.id.cover_art_image)");
        this.q = (ImageView) G4;
        View G5 = q4.G(inflate, C0707R.id.topLeftTitle);
        h.d(G5, "requireViewById<TextView>(view, R.id.topLeftTitle)");
        this.r = (TextView) G5;
        View G6 = q4.G(inflate, C0707R.id.bottomLeftTitle);
        h.d(G6, "requireViewById<TextView…ew, R.id.bottomLeftTitle)");
        this.s = (TextView) G6;
        View G7 = q4.G(inflate, C0707R.id.topRightTitle);
        h.d(G7, "requireViewById<TextView…view, R.id.topRightTitle)");
        this.t = (TextView) G7;
        View G8 = q4.G(inflate, C0707R.id.bottomRightTitle);
        h.d(G8, "requireViewById<TextView…w, R.id.bottomRightTitle)");
        this.u = (TextView) G8;
        View G9 = q4.G(inflate, C0707R.id.bottomLeftData);
        h.d(G9, "requireViewById<TextView…iew, R.id.bottomLeftData)");
        this.v = (TextView) G9;
        View G10 = q4.G(inflate, C0707R.id.bottomRightData);
        h.d(G10, "requireViewById<TextView…ew, R.id.bottomRightData)");
        this.w = (TextView) G10;
        View G11 = q4.G(inflate, C0707R.id.topRightData);
        h.d(G11, "requireViewById<Recycler…(view, R.id.topRightData)");
        this.x = (RecyclerView) G11;
        View G12 = q4.G(inflate, C0707R.id.topLeftData);
        h.d(G12, "requireViewById<Recycler…>(view, R.id.topLeftData)");
        this.y = (RecyclerView) G12;
        View G13 = q4.G(inflate, C0707R.id.bottomBar);
        h.d(G13, "requireViewById<View>(view, R.id.bottomBar)");
        this.z = G13;
        View G14 = q4.G(inflate, C0707R.id.spotifyLogo);
        h.d(G14, "requireViewById<ImageView>(view, R.id.spotifyLogo)");
        this.A = (ImageView) G14;
        View G15 = q4.G(inflate, C0707R.id.hashtag);
        h.d(G15, "requireViewById<TextView>(view, R.id.hashtag)");
        this.B = (TextView) G15;
    }

    public final void a(c cVar, e eVar) {
        h.e(cVar, "card");
        h.e(eVar, "color");
        a aVar = new a(cVar.k());
        a aVar2 = new a(cVar.i());
        this.n.setGradient(cVar.h());
        this.p.setGradient(cVar.g());
        this.q.setImageBitmap(cVar.a());
        this.r.setText(cVar.j());
        this.s.setText(cVar.c());
        this.t.setText(cVar.l());
        this.u.setText(cVar.e());
        this.v.setText(cVar.b());
        this.w.setText(cVar.d());
        this.x.setLayoutManager(new LinearLayoutManager(getContext()));
        this.x.setAdapter(aVar);
        this.y.setLayoutManager(new LinearLayoutManager(getContext()));
        this.y.setAdapter(aVar2);
        this.B.setText(cVar.f());
        this.o.setBackgroundColor(eVar.a());
        this.r.setTextColor(eVar.d());
        this.s.setTextColor(eVar.d());
        this.t.setTextColor(eVar.d());
        this.u.setTextColor(eVar.d());
        this.v.setTextColor(eVar.e());
        this.w.setTextColor(eVar.e());
        aVar.X(eVar.e(), eVar.d());
        aVar.z();
        aVar2.X(eVar.e(), eVar.d());
        aVar2.z();
        this.z.setBackgroundColor(eVar.b());
        this.A.setColorFilter(eVar.c());
        this.B.setTextColor(eVar.c());
        int i = (int) 1233.0f;
        int i2 = (int) 2193.0f;
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        this.f.layout(0, 0, i, i2);
        invalidate();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.b, this.c);
        float f2 = this.a;
        canvas.scale(f2, f2);
        this.f.draw(canvas);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f2 = (float) i;
        float f3 = (float) i2;
        float min = Math.min(f2 / 1233.0f, f3 / 2193.0f);
        this.a = min;
        this.b = (f2 - (1233.0f * min)) / 2.0f;
        this.c = (f3 - (min * 2193.0f)) / 2.0f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryShareCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(C0707R.layout.view_share_card, (ViewGroup) null);
        h.d(inflate, "LayoutInflater.from(cont…ut.view_share_card, null)");
        this.f = inflate;
        View G = q4.G(inflate, C0707R.id.outer_gradient);
        h.d(G, "requireViewById<WrappedG…iew, R.id.outer_gradient)");
        this.n = (WrappedGradientView) G;
        View G2 = q4.G(inflate, C0707R.id.background);
        h.d(G2, "requireViewById<View>(view, R.id.background)");
        this.o = G2;
        View G3 = q4.G(inflate, C0707R.id.inner_gradient);
        h.d(G3, "requireViewById<WrappedG…iew, R.id.inner_gradient)");
        this.p = (WrappedGradientView) G3;
        View G4 = q4.G(inflate, C0707R.id.cover_art_image);
        h.d(G4, "requireViewById<ImageVie…ew, R.id.cover_art_image)");
        this.q = (ImageView) G4;
        View G5 = q4.G(inflate, C0707R.id.topLeftTitle);
        h.d(G5, "requireViewById<TextView>(view, R.id.topLeftTitle)");
        this.r = (TextView) G5;
        View G6 = q4.G(inflate, C0707R.id.bottomLeftTitle);
        h.d(G6, "requireViewById<TextView…ew, R.id.bottomLeftTitle)");
        this.s = (TextView) G6;
        View G7 = q4.G(inflate, C0707R.id.topRightTitle);
        h.d(G7, "requireViewById<TextView…view, R.id.topRightTitle)");
        this.t = (TextView) G7;
        View G8 = q4.G(inflate, C0707R.id.bottomRightTitle);
        h.d(G8, "requireViewById<TextView…w, R.id.bottomRightTitle)");
        this.u = (TextView) G8;
        View G9 = q4.G(inflate, C0707R.id.bottomLeftData);
        h.d(G9, "requireViewById<TextView…iew, R.id.bottomLeftData)");
        this.v = (TextView) G9;
        View G10 = q4.G(inflate, C0707R.id.bottomRightData);
        h.d(G10, "requireViewById<TextView…ew, R.id.bottomRightData)");
        this.w = (TextView) G10;
        View G11 = q4.G(inflate, C0707R.id.topRightData);
        h.d(G11, "requireViewById<Recycler…(view, R.id.topRightData)");
        this.x = (RecyclerView) G11;
        View G12 = q4.G(inflate, C0707R.id.topLeftData);
        h.d(G12, "requireViewById<Recycler…>(view, R.id.topLeftData)");
        this.y = (RecyclerView) G12;
        View G13 = q4.G(inflate, C0707R.id.bottomBar);
        h.d(G13, "requireViewById<View>(view, R.id.bottomBar)");
        this.z = G13;
        View G14 = q4.G(inflate, C0707R.id.spotifyLogo);
        h.d(G14, "requireViewById<ImageView>(view, R.id.spotifyLogo)");
        this.A = (ImageView) G14;
        View G15 = q4.G(inflate, C0707R.id.hashtag);
        h.d(G15, "requireViewById<TextView>(view, R.id.hashtag)");
        this.B = (TextView) G15;
    }
}
