package com.spotify.mobile.android.share.menu.preview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SharePayloadView extends ConstraintLayout {
    private final View a;
    private final View b;
    private final ImageView c;

    static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePayloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.share_payload_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.loading);
        h.d(G, "requireViewById<View>(this, R.id.loading)");
        this.a = G;
        View G2 = q4.G(this, C0707R.id.retry);
        h.d(G2, "requireViewById<View>(this, R.id.retry)");
        this.b = G2;
        View G3 = q4.G(this, C0707R.id.image);
        h.d(G3, "requireViewById<ImageView>(this, R.id.image)");
        this.c = (ImageView) G3;
    }

    public final void C() {
        this.b.setOnClickListener(null);
    }

    public final void D(b bVar) {
        h.e(bVar, "payloadState");
        if (bVar instanceof b.c) {
            this.a.setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
        } else if (bVar instanceof b.a) {
            this.a.setVisibility(8);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
        } else if (bVar instanceof b.C0187b) {
            Bitmap b2 = ((b.C0187b) bVar).a().b();
            this.a.setVisibility(8);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            ImageView imageView = this.c;
            Bitmap createBitmap = Bitmap.createBitmap(b2.getWidth(), b2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float dimension = getResources().getDimension(C0707R.dimen.share_card_corner_size);
            RectF rectF = new RectF(0.0f, 0.0f, (float) b2.getWidth(), (float) b2.getHeight());
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawRoundRect(rectF, dimension, dimension, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(b2, 0.0f, 0.0f, paint);
            h.d(createBitmap, "output");
            imageView.setImageBitmap(createBitmap);
        }
    }

    public final void setOnRetryClicked$libs_share_preview_menu(cmf<f> cmf) {
        h.e(cmf, "onRetryClicked");
        this.b.setOnClickListener(new a(cmf));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePayloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.share_payload_view, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.loading);
        h.d(G, "requireViewById<View>(this, R.id.loading)");
        this.a = G;
        View G2 = q4.G(this, C0707R.id.retry);
        h.d(G2, "requireViewById<View>(this, R.id.retry)");
        this.b = G2;
        View G3 = q4.G(this, C0707R.id.image);
        h.d(G3, "requireViewById<ImageView>(this, R.id.image)");
        this.c = (ImageView) G3;
    }
}
