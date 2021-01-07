package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.squareup.picasso.f0;
import defpackage.n94;

/* renamed from: f94  reason: default package */
public class f94 implements n94.a, g90 {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final TextView f;
    private final TextView n;
    private final ImageView o;
    private final ImageView p;
    private final ImageView q;
    private final g94 r;
    private final g94 s;
    private final urc t;
    private final n94 u;
    private final f0 v;
    private final f0 w;

    public f94(ViewGroup viewGroup) {
        int i = trc.a;
        urc urc = new urc(src.b);
        this.t = urc;
        n94 n94 = new n94(this);
        this.u = n94;
        this.v = new s94(n94);
        this.w = new r94(n94);
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.browse_promo_header, viewGroup, false);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.promo_title);
        this.b = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.promo_description);
        this.c = textView2;
        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.promo_subtitle);
        this.f = textView3;
        TextView textView4 = (TextView) inflate.findViewById(C0707R.id.promo_accessory);
        this.n = textView4;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.promo_background_image);
        this.o = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(C0707R.id.promo_main_image);
        this.p = imageView2;
        this.q = (ImageView) inflate.findViewById(C0707R.id.promo_logo);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.browse_promo_background_corner_radius);
        h94 h94 = new h94(context, dimensionPixelSize);
        this.r = h94;
        imageView.setBackground(new i94(dimensionPixelSize));
        imageView.setImageDrawable(h94);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0707R.dimen.browse_promo_main_image_corner_radius);
        g94 g94 = new g94(dimensionPixelSize2);
        this.s = g94;
        imageView2.setBackground(new i94(dimensionPixelSize2));
        imageView2.setImageDrawable(g94);
        urc.e(new q94(n94));
        bvd b2 = dvd.b(inflate.findViewById(C0707R.id.promo_root_view));
        b2.f(textView, textView2, textView3, textView4, imageView, imageView2);
        b2.g(inflate);
        b2.a();
    }

    public f0 b() {
        return this.t.f();
    }

    public f0 c() {
        return this.w;
    }

    public f0 d() {
        return this.v;
    }

    public n94 g() {
        return this.u;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    public void w(m94 m94) {
        String a2 = m94.a();
        if (!TextUtils.isEmpty(a2)) {
            this.n.setText(a2);
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
        String h = m94.h();
        if (!TextUtils.isEmpty(h)) {
            this.f.setText(h);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        String d = m94.d();
        if (!TextUtils.isEmpty(d)) {
            this.c.setText(d);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (m94.b().a() != null) {
            this.r.e(m94.b().a(), !m94.b().b());
        } else {
            this.r.d();
        }
        if (m94.f().a() != null) {
            Bitmap a3 = m94.f().a();
            String i = m94.i();
            if (a3 != null) {
                this.q.setImageBitmap(a3);
                this.q.setVisibility(0);
                this.q.setContentDescription(i);
            } else {
                this.q.setVisibility(8);
            }
            this.b.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(m94.i())) {
            this.b.setText(m94.i());
            this.b.setTextColor(m94.e());
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
        Bitmap a4 = m94.g().a();
        if (a4 != null) {
            this.s.e(a4, !m94.g().b());
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
            this.s.d();
        }
        this.q.setVisibility(8);
    }
}
