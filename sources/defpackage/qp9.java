package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;

/* renamed from: qp9  reason: default package */
public class qp9 implements rp9 {
    private final Context a;
    private final View b;
    private final TextView c;
    private final TextView f;
    private final ImageView n;
    private final r o;

    public qp9(Context context, ViewGroup viewGroup, Picasso picasso) {
        this.a = context;
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_tappable_section_header, viewGroup, false);
        this.b = inflate;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.home_tappable_header_title);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.home_tappable_header_subtitle);
        this.f = textView2;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.home_tappable_header_image);
        this.n = imageView;
        this.o = new r(new c0(picasso), context);
        q4.J(inflate, true);
        bvd c2 = dvd.c(inflate);
        c2.f(imageView);
        c2.g(textView, textView2);
        c2.a();
    }

    @Override // defpackage.rp9
    public void a(Uri uri, Drawable drawable, String str) {
        this.n.setVisibility(0);
        z c2 = this.o.c(uri);
        br9.b(this.a, this.c, this.f);
        str.hashCode();
        if (str.equals("circular")) {
            c cVar = new c(drawable, 1.0f);
            c2.t(cVar);
            c2.g(cVar);
            c2.o(rwd.c(this.n));
            this.c.setGravity(1);
            this.f.setGravity(1);
        } else if (!str.equals("rounded")) {
            c2.t(drawable);
            c2.g(drawable);
            c2.m(this.n);
        } else {
            c2.t(drawable);
            c2.g(drawable);
            c2.o(rwd.f(this.n, d.a((float) this.b.getResources().getDimensionPixelSize(C0707R.dimen.episode_card_corner_radius))));
        }
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    @Override // defpackage.rp9
    public void reset() {
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        this.n.setVisibility(8);
        this.c.setText("");
        this.f.setText("");
        this.n.setImageResource(0);
    }

    @Override // defpackage.rp9
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.setText(charSequence);
            this.f.setVisibility(0);
            return;
        }
        this.f.setText("");
        this.f.setVisibility(8);
    }

    @Override // defpackage.rp9
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
            return;
        }
        this.c.setText("");
        this.c.setVisibility(8);
    }
}
