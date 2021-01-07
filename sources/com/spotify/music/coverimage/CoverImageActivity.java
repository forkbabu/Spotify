package com.spotify.music.coverimage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class CoverImageActivity extends ss2 {
    private static final TimeInterpolator O = new DecelerateInterpolator();
    public static final /* synthetic */ int P = 0;
    private ImageView G;
    private int H;
    private ColorDrawable I;
    private int J;
    private int K;
    private float L;
    private float M;
    Picasso N;

    private void U0() {
        boolean z;
        a aVar = new a(this);
        if (getResources().getConfiguration().orientation != this.H) {
            ImageView imageView = this.G;
            imageView.setPivotX(((float) imageView.getWidth()) / 2.0f);
            ImageView imageView2 = this.G;
            imageView2.setPivotY(((float) imageView2.getHeight()) / 2.0f);
            this.J = 0;
            this.K = 0;
            z = true;
        } else {
            z = false;
        }
        this.G.animate().setDuration(300).scaleX(this.L).scaleY(this.M).translationX((float) this.J).translationY((float) this.K).setListener(new d(this, aVar));
        if (z) {
            this.G.animate().alpha(0.0f);
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.I, "alpha", 0);
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public static void X0(Context context, int i, int i2, int i3, int i4, Uri uri, int i5) {
        Intent intent = new Intent(context, CoverImageActivity.class);
        intent.putExtra("ARGUMENT_LEFT", i);
        intent.putExtra("ARGUMENT_TOP", i2);
        intent.putExtra("ARGUMENT_WIDTH", i3);
        intent.putExtra("ARGUMENT_HEIGHT", i4);
        intent.putExtra("ARGUMENT_IMAGE_URI", uri);
        intent.putExtra("ARGUMENT_ORIENTATION", i5);
        context.startActivity(intent, ActivityOptions.makeCustomAnimation(context, 0, 0).toBundle());
    }

    public void V0(int i, int i2, int i3, int i4, ImageView imageView) {
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        this.J = i - iArr[0];
        this.K = i2 - iArr[1];
        this.L = ((float) i3) / ((float) imageView.getWidth());
        this.M = ((float) i4) / ((float) imageView.getHeight());
        this.G.setPivotX(0.0f);
        this.G.setPivotY(0.0f);
        this.G.setScaleX(this.L);
        this.G.setScaleY(this.M);
        this.G.setTranslationX((float) this.J);
        this.G.setTranslationY((float) this.K);
        this.I.setAlpha(0);
        this.G.animate().setDuration(300).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(O);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.I, "alpha", 0, BitmapRenderer.ALPHA_VISIBLE);
        ofInt.setDuration(300L);
        ofInt.start();
    }

    public /* synthetic */ void W0(View view) {
        U0();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        U0();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_cover_image);
        this.G = (ImageView) findViewById(C0707R.id.cover_image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0707R.id.content_frame);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        this.I = colorDrawable;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        frameLayout.setBackground(colorDrawable);
        Bundle extras = getIntent().getExtras();
        int i3 = extras.getInt("ARGUMENT_LEFT");
        int i4 = extras.getInt("ARGUMENT_TOP");
        int i5 = extras.getInt("ARGUMENT_WIDTH");
        int i6 = extras.getInt("ARGUMENT_HEIGHT");
        this.H = extras.getInt("ARGUMENT_ORIENTATION");
        z l = this.N.l((Uri) extras.getParcelable("ARGUMENT_IMAGE_URI"));
        l.p();
        l.m(this.G);
        if (bundle == null) {
            x.c(this.G, new b(this, i3, i4, i5, i6));
        }
        frameLayout.setOnClickListener(new c(this));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.COVERIMAGE, ViewUris.X1.toString());
    }
}
