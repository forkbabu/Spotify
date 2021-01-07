package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import defpackage.urc;

/* renamed from: rjf  reason: default package */
public class rjf implements sjf {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView f;
    private final ImageView n;
    private final ImageView o;
    private final AppCompatButton p;
    private final Picasso q;
    private final Context r;
    private final tjf s;
    private final tjf t;
    private final urc u;
    private final urc.b v;
    private final f0 w = new b();

    /* renamed from: rjf$a */
    class a implements urc.b {
        a() {
        }

        private void c(Drawable drawable) {
            if (drawable != null) {
                rjf.this.n.setImageDrawable(drawable);
            }
        }

        @Override // defpackage.urc.b
        public void a(Drawable drawable) {
            c(drawable);
        }

        @Override // defpackage.urc.b
        public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom, e7 e7Var) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            rjf.this.s.a(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY);
            MoreObjects.checkArgument(!bitmap.isRecycled());
            c(rjf.this.s);
        }

        @Override // defpackage.urc.b
        public void onPrepareLoad(Drawable drawable) {
            c(drawable);
        }
    }

    /* renamed from: rjf$b */
    class b implements f0 {
        b() {
        }

        private void a(Drawable drawable) {
            if (drawable != null) {
                rjf.this.o.setImageDrawable(drawable);
                rjf.this.o.setVisibility(0);
                return;
            }
            rjf.this.o.setVisibility(8);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            a(drawable);
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            MoreObjects.checkArgument(!bitmap.isRecycled());
            rjf.this.t.a(bitmap, loadedFrom != Picasso.LoadedFrom.MEMORY);
            a(rjf.this.t);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
            a(drawable);
        }
    }

    public rjf(Picasso picasso, ViewGroup viewGroup) {
        int i = trc.a;
        urc urc = new urc(src.b);
        this.u = urc;
        a aVar = new a();
        this.v = aVar;
        picasso.getClass();
        this.q = picasso;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        this.r = context;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.fan_funding_card_layout, viewGroup, false);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.fan_funding_title);
        this.b = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.fan_funding_subtitle);
        this.c = textView2;
        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.fan_funding_label);
        this.f = textView3;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.fan_funding_background_image);
        this.n = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(C0707R.id.fan_funding_main_image);
        this.o = imageView2;
        AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(C0707R.id.cta_button);
        this.p = appCompatButton;
        tjf tjf = new tjf(context.getResources().getDimensionPixelSize(C0707R.dimen.fan_funding_background_corner_radius));
        this.s = tjf;
        tjf tjf2 = new tjf(context.getResources().getDimensionPixelSize(C0707R.dimen.fan_funding_main_image_corner_radius));
        this.t = tjf2;
        imageView.setBackground(new ujf(context.getResources(), C0707R.dimen.fan_funding_background_corner_radius));
        imageView.setImageDrawable(tjf);
        imageView2.setBackground(new ujf(context.getResources(), C0707R.dimen.fan_funding_background_corner_radius));
        imageView2.setImageDrawable(tjf2);
        bvd b2 = dvd.b(inflate.findViewById(C0707R.id.fan_funding_root_view));
        b2.f(textView, textView2, textView3, imageView, imageView2, appCompatButton);
        b2.g(inflate);
        b2.a();
        urc.e(aVar);
    }

    private void E(String str, String str2, f0 f0Var) {
        this.o.setVisibility(0);
        Optional<V> transform = n71.a(str2).transform(new njf(this));
        z l = this.q.l(TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str));
        if (transform.isPresent()) {
            l.t(transform.get());
            l.g(transform.get());
        }
        l.o(f0Var);
    }

    @Override // defpackage.sjf
    public void B(String str, String str2) {
        E(str, str2, this.u.f());
    }

    @Override // defpackage.sjf
    public View L0() {
        return this.p;
    }

    @Override // defpackage.sjf
    public void V() {
        this.b.setTextColor(this.r.getResources().getColor(R.color.white));
    }

    @Override // defpackage.sjf
    public void X1(int i) {
        this.b.setTextColor(i);
    }

    @Override // defpackage.sjf
    public void Y0() {
        this.o.setVisibility(8);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.sjf
    public void j(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setText(charSequence);
            this.f.setVisibility(0);
        }
    }

    @Override // defpackage.sjf
    public void s0(String str, String str2) {
        E(str, str2, this.w);
    }

    @Override // defpackage.sjf
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    @Override // defpackage.sjf
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
        }
    }

    public Drawable w(SpotifyIconV2 spotifyIconV2) {
        return yc0.d(this.r, spotifyIconV2, (float) nud.g((float) 64, this.r.getResources()));
    }
}
