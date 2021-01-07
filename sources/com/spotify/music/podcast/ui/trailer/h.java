package com.spotify.music.podcast.ui.trailer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.internal.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class h implements g90 {
    private static final String v = "h";
    private final Picasso a;
    private final int b;
    private final Drawable c;
    private final d f;
    private ViewGroup n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private boolean r;
    private String s;
    private String t;
    private a u;

    public h(Picasso picasso, Context context, d dVar) {
        this.a = picasso;
        this.f = dVar;
        this.b = context.getResources().getDimensionPixelOffset(C0707R.dimen.action_card_image_size);
        this.c = yc0.g(context);
    }

    private void w() {
        this.q.setText(this.t);
        if (this.r) {
            TextLabelUtil.b(this.n.getContext(), this.q, this.r);
        }
        String str = this.s;
        if (str != null && !str.isEmpty()) {
            TextLabelUtil.d(this.n.getContext(), this.q, this.s);
        }
    }

    public void Z1(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    public View b(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.podcast_trailer_section, viewGroup, false);
        this.n = viewGroup2;
        this.o = (ImageView) viewGroup2.findViewById(16908294);
        this.p = (TextView) this.n.findViewById(16908308);
        this.q = (TextView) this.n.findViewById(16908309);
        a aVar = new a((ViewGroup) this.n.findViewById(C0707R.id.accessory));
        this.u = aVar;
        aVar.e(true);
        this.q.setAllCaps(false);
        bvd c2 = dvd.c(this.n);
        c2.f(this.n);
        c2.a();
        return this.n;
    }

    public void c(String str) {
        this.a.b(this.o);
        z l = this.a.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        l.t(this.c);
        l.g(this.c);
        int i = this.b;
        l.u(i, i);
        l.a();
        l.w(v);
        l.o(f.a(this.o, this.f));
    }

    public void d(boolean z) {
        this.r = z;
        w();
    }

    public void g(String str) {
        this.s = str;
        w();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.n;
    }

    public void setEnabled(boolean z) {
        this.p.setEnabled(z);
        this.q.setEnabled(z);
    }

    public void setSubtitle(String str) {
        this.t = str;
        w();
    }

    public void setTitle(String str) {
        this.p.setText(str);
    }

    public void z0(View view) {
        this.u.f(view);
        this.u.g();
    }
}
