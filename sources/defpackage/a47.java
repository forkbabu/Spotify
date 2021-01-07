package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.paste.app.d;
import com.spotify.music.C0707R;

/* renamed from: a47  reason: default package */
public class a47 implements j47 {
    private final Context a;
    private final d47 b;
    private final AppBarLayout c;
    private final ImageView f;
    private final TextView n;
    private final TextView o;
    private final View p;
    private final g47 q;
    private final float r;
    private final int s;

    a47(LayoutInflater layoutInflater, Context context, AppBarLayout appBarLayout, d47 d47, g47 g47) {
        this.q = g47;
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_entity_header_condensed, (ViewGroup) appBarLayout, false);
        this.p = inflate;
        this.c = appBarLayout;
        this.a = context;
        this.b = d47;
        appBarLayout.addView(inflate);
        ImageView imageView = (ImageView) q4.G(inflate, C0707R.id.header_image);
        this.f = imageView;
        TextView textView = (TextView) q4.G(inflate, C0707R.id.podcast_title);
        this.n = textView;
        this.o = (TextView) q4.G(inflate, C0707R.id.podcast_creator);
        bvd b2 = dvd.b(imageView);
        b2.f(imageView);
        b2.a();
        this.s = d.c(context);
        this.r = context.getResources().getDimension(C0707R.dimen.podcast_entity_condensed_image_corner_radius);
        appBarLayout.a(new z37(this));
        q4.J(textView, true);
    }

    private float c(int i, int i2, int i3) {
        int i4 = (i3 + this.s) - i;
        if (i4 <= 0) {
            return 1.0f;
        }
        int i5 = i2 - i4;
        if (i2 <= 0) {
            return 1.0f;
        }
        return ((float) i5) / ((float) i2);
    }

    public void b(r67 r67) {
        this.f.setContentDescription(this.f.getContext().getString(C0707R.string.podcast_entity_header_image_content_description, r67.d()));
        this.o.setText(r67.c());
        this.n.setText(r67.d());
        this.f.setOnClickListener(new y37(this, r67));
    }

    public /* synthetic */ void d(r67 r67, View view) {
        this.b.a(this.a, this.f, r67.b());
    }

    public void g(AppBarLayout appBarLayout, int i) {
        int i2 = -i;
        float f2 = 1.0f;
        float c2 = 1.0f - c(this.n.getTop() + this.p.getTop(), this.n.getHeight(), i2);
        float c3 = 1.0f - c(this.p.getTop(), this.p.getHeight(), i2);
        this.p.setAlpha(1.0f - (c2 < 0.0f ? 0.0f : c2 > 1.0f ? 1.0f : c2));
        g47 g47 = this.q;
        if (c2 < 0.0f) {
            f2 = 0.0f;
        } else if (c2 <= 1.0f) {
            f2 = c2;
        }
        g47.a(f2);
        this.q.b(c3);
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }

    public void w(boa boa) {
        Bitmap a2 = boa.a();
        int b2 = boa.b();
        Drawable c2 = boa.c();
        if (a2 != null) {
            this.f.setImageDrawable(new com.spotify.paste.graphics.drawable.d(a2, this.r));
        }
        if (c2 != null) {
            this.f.setImageDrawable(c2);
        }
        mc0 c3 = lc0.c(this.a, b2);
        AppBarLayout appBarLayout = this.c;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        appBarLayout.setBackground(c3);
    }
}
