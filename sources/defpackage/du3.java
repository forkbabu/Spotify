package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.cu3;

/* renamed from: du3  reason: default package */
public class du3 extends LinearLayout implements cu3 {
    private cu3.a a;
    private TextView b;
    private ImageView c;
    private Picasso f;
    private final f0 n = new a();

    /* renamed from: du3$a */
    class a implements f0 {
        a() {
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            du3.this.c.setVisibility(8);
            if (du3.this.a != null) {
                ((qt3) du3.this.a).c("Failed to load logo");
            }
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            du3.this.c.setAlpha(0.0f);
            du3.this.c.setImageBitmap(bitmap);
            du3.this.c.animate().setDuration(350).alpha(1.0f);
            if (du3.this.a != null) {
                ((qt3) du3.this.a).d();
            }
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    public du3(Context context) {
        super(context);
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(context).inflate(C0707R.layout.sponsored_header_section, (ViewGroup) this, true);
        this.b = (TextView) findViewById(C0707R.id.sponsored_title);
        ImageView imageView = (ImageView) findViewById(C0707R.id.sponsored_logo);
        this.c = imageView;
        imageView.setOnClickListener(new zt3(this, context));
        nud.p(context, this.b, C0707R.attr.pasteTextAppearanceMetadata);
    }

    public /* synthetic */ void c(Context context, View view) {
        cu3.a aVar = this.a;
        if (aVar != null) {
            ((qt3) aVar).e(context);
        }
    }

    public /* synthetic */ void d() {
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }

    public /* synthetic */ void e(String str) {
        Picasso picasso = this.f;
        if (picasso != null) {
            picasso.m(str).v(C0707R.dimen.widget_cover_size, C0707R.dimen.device_volume_bar_height).b().p().q().o(this.n);
            this.c.setVisibility(0);
        }
    }

    public /* synthetic */ void f(String str) {
        this.b.setText(String.format(getResources().getString(C0707R.string.ads_title_sponsored_playlist), str));
        this.b.setVisibility(0);
    }

    public void g(Bundle bundle) {
        cu3.a aVar = this.a;
        if (aVar != null && bundle != null) {
            ((qt3) aVar).h(bundle.getBoolean("sponsorship_impression_logged"));
        }
    }

    public cu3.a getListener() {
        return this.a;
    }

    public void h(Bundle bundle) {
        cu3.a aVar = this.a;
        if (aVar != null && bundle != null) {
            bundle.putBoolean("sponsorship_impression_logged", ((qt3) aVar).b());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cu3.a aVar = this.a;
        if (aVar != null) {
            ((qt3) aVar).f(this);
        }
    }

    public void setListener(cu3.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.cu3
    public void setLogo(String str) {
        ((Activity) getContext()).runOnUiThread(new au3(this, str));
    }

    public void setPicasso(Picasso picasso) {
        this.f = picasso;
    }

    @Override // defpackage.cu3
    public void setTitle(String str) {
        ((Activity) getContext()).runOnUiThread(new bu3(this, str));
    }
}
