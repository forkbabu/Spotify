package com.spotify.music.homecomponents.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;

public class i implements HomeCardViewBinder {
    private static final String w = "i";
    private final Context a;
    private final View b;
    private final ConstraintLayout c;
    private final ImageView f;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final Drawable q;
    private final int r;
    private final int s;
    private final int t;
    private final r u;
    private final po9 v;

    public i(Context context, ViewGroup viewGroup, Picasso picasso, po9 po9) {
        this.a = context;
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_card_component_layout, viewGroup, false);
        this.b = inflate;
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C0707R.id.home_card_root_view);
        this.c = constraintLayout;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.image);
        this.f = imageView;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.title);
        this.n = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.sub_title);
        this.o = textView2;
        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.recsplanation);
        this.p = textView3;
        this.t = textView3.getCurrentTextColor();
        this.q = l70.e(context, 10);
        this.r = context.getResources().getColor(C0707R.color.home_green_highlight);
        this.s = context.getResources().getColor(C0707R.color.home_title_text_default);
        this.u = new r(new c0(picasso), context);
        po9.getClass();
        this.v = po9;
        bvd b2 = dvd.b(constraintLayout);
        b2.f(imageView);
        b2.g(textView, textView2);
        b2.a();
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void D(Drawable drawable, Drawable drawable2, String str) {
        br9.b(this.a, this.n, this.o);
        this.f.setImageDrawable(drawable);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void P(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.p.setText((CharSequence) null);
            this.p.setVisibility(8);
            return;
        }
        this.p.setText(charSequence);
        this.p.setVisibility(0);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void Q1() {
        CharSequence text = this.n.getText();
        Drawable b2 = l70.b(this.n.getContext());
        TextView textView = this.n;
        if (!TextUtils.isEmpty(text)) {
            text = l70.n(text, b2);
        }
        textView.setText(text);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void a(Uri uri, Drawable drawable, String str) {
        z c2 = this.u.c(uri);
        c2.w(w + uri);
        br9.b(this.a, this.n, this.o);
        str.hashCode();
        if (str.equals("circular")) {
            c cVar = new c(drawable, 1.0f);
            c2.t(cVar);
            c2.g(cVar);
            c2.o(rwd.c(this.f));
            this.n.setGravity(1);
            this.o.setGravity(1);
        } else if (!str.equals("rounded")) {
            c2.t(drawable);
            c2.g(drawable);
            c2.m(this.f);
        } else {
            c2.t(drawable);
            c2.g(drawable);
            c2.o(rwd.f(this.f, d.a((float) this.b.getResources().getDimensionPixelSize(C0707R.dimen.episode_card_corner_radius))));
        }
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void a1() {
        CharSequence text = this.o.getText();
        Drawable b2 = l70.b(this.n.getContext());
        TextView textView = this.o;
        if (!TextUtils.isEmpty(text)) {
            text = l70.n(text, b2);
        }
        textView.setText(text);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f1(java.lang.CharSequence r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.toString()
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = -1654568714(0xffffffff9d6148f6, float:-2.9816222E-21)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x0033
            r1 = -710065853(0xffffffffd5ad4143, float:-2.38119761E13)
            if (r0 == r1) goto L_0x0028
            r1 = 99151942(0x5e8f046, float:2.1905438E-35)
            if (r0 == r1) goto L_0x001d
            goto L_0x003b
        L_0x001d:
            java.lang.String r0 = "heart"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0026
            goto L_0x003b
        L_0x0026:
            r5 = 2
            goto L_0x003e
        L_0x0028:
            java.lang.String r0 = "highMatch"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            r5 = 1
            goto L_0x003e
        L_0x0033:
            java.lang.String r0 = "whiteText"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x003d
        L_0x003b:
            r5 = -1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            r0 = 0
            if (r5 == 0) goto L_0x006e
            if (r5 == r3) goto L_0x0061
            if (r5 == r2) goto L_0x0052
            android.widget.TextView r5 = r4.p
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r0, r0)
            android.widget.TextView r5 = r4.p
            int r0 = r4.t
            r5.setTextColor(r0)
            return
        L_0x0052:
            android.widget.TextView r5 = r4.p
            android.graphics.drawable.Drawable r1 = r4.q
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r1, r0)
            android.widget.TextView r5 = r4.p
            int r0 = r4.t
            r5.setTextColor(r0)
            return
        L_0x0061:
            android.widget.TextView r5 = r4.p
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r0, r0)
            android.widget.TextView r5 = r4.p
            int r0 = r4.r
            r5.setTextColor(r0)
            return
        L_0x006e:
            android.widget.TextView r5 = r4.p
            r5.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r0, r0)
            android.widget.TextView r5 = r4.p
            int r0 = r4.s
            r5.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.homecomponents.card.i.f1(java.lang.CharSequence):void");
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void n1(HomeCardViewBinder.CardSize cardSize) {
        this.v.b(this.f, cardSize);
        this.v.c(this.c, cardSize);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void setContentDescription(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.o.setVisibility(8);
            return;
        }
        this.o.setText(charSequence);
        this.o.setVisibility(0);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setText(charSequence);
        this.n.setVisibility(0);
    }

    @Override // com.spotify.music.homecomponents.card.HomeCardViewBinder
    public void v1(HomeCardViewBinder.CardTextLines cardTextLines) {
        this.n.setLines(cardTextLines.value);
    }
}
