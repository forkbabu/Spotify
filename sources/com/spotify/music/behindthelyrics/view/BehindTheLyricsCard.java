package com.spotify.music.behindthelyrics.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.behindthelyrics.presenter.CardType;
import com.spotify.music.behindthelyrics.view.BehindTheLyricsViewStateManager;
import java.util.Locale;

public class BehindTheLyricsCard extends FrameLayout implements bl2, View.OnClickListener {
    private static final String z = CardType.CREDITS.toString();
    private ObjectAnimator a;
    private ProgressBar b;
    private Button c;
    private Paint f;
    private final RectF n = new RectF();
    private Intent o;
    private nk2 p;
    private final h q = new h(a.b(getContext(), C0707R.color.genius_yellow));
    private BehindTheLyricsViewStateManager r;
    private boolean s = true;
    private float t;
    private boolean u;
    private boolean v = true;
    private String w = "";
    private String x = "";
    private sk2 y;

    public BehindTheLyricsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.cl2
    public void a(String str, f fVar, String str2) {
        this.c.setVisibility(8);
        this.r.a(str, fVar, str2);
    }

    @Override // defpackage.bl2
    public boolean b() {
        return this.u;
    }

    @Override // defpackage.bl2
    public void c(String str, String str2) {
        this.x = str;
        this.w = str2;
    }

    @Override // defpackage.bl2
    public void d() {
        sk2 sk2;
        if (this.p != null && (sk2 = this.y) != null) {
            this.p.b(this.y.c(), sk2.a(this.w), this.x);
        }
    }

    @Override // defpackage.cl2
    public void e(String str) {
        this.c.setVisibility(8);
        this.r.e(str);
    }

    @Override // defpackage.cl2
    public void f(String str) {
        this.c.setVisibility(8);
        this.r.f(str);
    }

    @Override // defpackage.cl2
    public void g() {
        this.c.setVisibility(8);
        this.r.g();
    }

    @Override // defpackage.bl2
    public void h(int i, int i2, boolean z2) {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.a = null;
        }
        this.b.setMax(i);
        int i3 = i - i2;
        this.b.setProgress(i3);
        if (z2) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.b, "progress", i3, 0);
            this.a = ofInt;
            ofInt.setDuration((long) i3);
            this.a.setInterpolator(new LinearInterpolator());
            this.a.start();
        }
    }

    @Override // defpackage.cl2
    public void i() {
        this.c.setVisibility(0);
        this.r.i();
    }

    @Override // defpackage.cl2
    public void j(String str) {
        this.c.setVisibility(8);
        this.r.j(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = this.o;
        if (view == this.c && intent != null) {
            String dataString = intent.getDataString();
            nk2 nk2 = this.p;
            if (!(nk2 == null || dataString == null)) {
                String c2 = this.y.c();
                sk2 sk2 = this.y;
                String str = z;
                nk2.c(c2, sk2.b(str), str.toLowerCase(Locale.US), dataString);
            }
            getContext().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.s) {
            this.n.set(0.0f, 0.0f, (float) width, (float) height);
            RectF rectF = this.n;
            float f2 = this.t;
            canvas.drawRoundRect(rectF, f2, f2, this.f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (Button) findViewById(C0707R.id.go_to_genius);
        this.b = (ProgressBar) findViewById(C0707R.id.progressBar);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(BehindTheLyricsViewStateManager.State.INTRODUCTION, findViewById(C0707R.id.intro_card));
        builder.mo51put(BehindTheLyricsViewStateManager.State.CREDITS, findViewById(C0707R.id.credits_card));
        builder.mo51put(BehindTheLyricsViewStateManager.State.LYRICS, findViewById(C0707R.id.content_card));
        builder.mo51put(BehindTheLyricsViewStateManager.State.INSIGHT, findViewById(C0707R.id.content_card));
        builder.mo51put(BehindTheLyricsViewStateManager.State.ARTIST_ANNOTATION, findViewById(C0707R.id.content_card));
        d dVar = new d();
        b bVar = new b(this, dVar);
        this.r = new BehindTheLyricsViewStateManager(builder.build(), new g(this, dVar), bVar, dVar, this.q, getContext().getResources());
        ((TextView) findViewById(C0707R.id.intro_title)).setText(this.q.apply(getContext().getString(C0707R.string.btl_intro_card_title)));
        this.c.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f == null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float f2 = ((float) size) / 2.0f;
            double d = (double) f2;
            double tan = Math.tan(Math.toRadians(10.0d));
            double d2 = (double) size2;
            Double.isNaN(d2);
            Double.isNaN(d);
            LinearGradient linearGradient = new LinearGradient(f2, (float) size2, (float) ((int) (d - (tan * d2))), 0.0f, a.b(getContext(), C0707R.color.black_80), a.b(getContext(), R.color.black_30), Shader.TileMode.CLAMP);
            Paint paint = new Paint(1);
            this.f = paint;
            paint.setShader(linearGradient);
        }
        super.onMeasure(i, i2);
    }

    public void setContentVisibility(boolean z2) {
        sk2 sk2;
        this.u = z2;
        if (!z2) {
            this.v = true;
        } else if (this.v) {
            this.v = false;
            nk2 nk2 = this.p;
            if (!(nk2 == null || (sk2 = this.y) == null)) {
                nk2.a(sk2.c());
            }
            d();
        }
    }

    @Override // defpackage.bl2
    public void setCreditsDestination(Intent intent) {
        this.o = intent;
    }

    /* access modifiers changed from: protected */
    public void setGradientCornerRadius(float f2) {
        this.t = f2;
    }

    /* access modifiers changed from: protected */
    public void setGradientEnabled(boolean z2) {
        this.s = z2;
    }

    public void setLogger(nk2 nk2) {
        nk2.getClass();
        this.p = nk2;
    }

    @Override // defpackage.bl2
    public void setLoggingDataMapper(sk2 sk2) {
        this.y = sk2;
    }

    public BehindTheLyricsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
