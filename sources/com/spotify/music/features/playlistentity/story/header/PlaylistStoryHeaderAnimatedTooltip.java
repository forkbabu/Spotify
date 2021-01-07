package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.r5;

public class PlaylistStoryHeaderAnimatedTooltip extends ConstraintLayout {
    private static final u5 v;
    private static final u5 w;
    private static final u5 x;
    private static final u5 y;
    private View a;
    private ImageView b;
    private t5 c;
    private t5 f;
    private t5 n;
    private t5 o;
    private t5 p;
    private t5 q;
    private t5 r;
    private t5 s;
    private float t;
    private float u;

    static {
        u5 u5Var = new u5();
        u5Var.c(1.0f);
        u5Var.e(500.0f);
        v = u5Var;
        u5 u5Var2 = new u5();
        u5Var2.c(1.0f);
        u5Var2.e(1000.0f);
        w = u5Var2;
        u5 u5Var3 = new u5();
        u5Var3.c(1.0f);
        u5Var3.e(10000.0f);
        x = u5Var3;
        u5 u5Var4 = new u5();
        u5Var4.c(0.75f);
        u5Var4.e(500.0f);
        y = u5Var4;
    }

    public PlaylistStoryHeaderAnimatedTooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C(attributeSet, context);
    }

    private void C(AttributeSet attributeSet, Context context) {
        View inflate = ViewGroup.inflate(context, C0707R.layout.playlist_story_header_tooltip, this);
        this.a = inflate;
        this.b = (ImageView) inflate.findViewById(C0707R.id.image);
        TextView textView = (TextView) this.a.findViewById(C0707R.id.title);
        View findViewById = this.a.findViewById(C0707R.id.background);
        View findViewById2 = this.a.findViewById(C0707R.id.arrow);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jt6.a);
        textView.setText(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        ImageView imageView = this.b;
        r5.m mVar = r5.l;
        t5 t5Var = new t5(imageView, mVar);
        t5Var.g(0.0f);
        t5Var.f(1.0f);
        this.c = t5Var;
        ImageView imageView2 = this.b;
        r5.m mVar2 = r5.m;
        t5 t5Var2 = new t5(imageView2, mVar2);
        t5Var2.g(0.0f);
        t5Var2.f(1.0f);
        this.f = t5Var2;
        t5 t5Var3 = new t5(textView, mVar);
        t5Var3.g(0.0f);
        t5Var3.f(1.0f);
        this.n = t5Var3;
        this.o = new t5(this.b, r5.q);
        this.r = new t5(findViewById2, r5.r);
        t5 t5Var4 = new t5(findViewById2, mVar);
        t5Var4.g(0.0f);
        t5Var4.f(1.0f);
        this.s = t5Var4;
        t5 t5Var5 = new t5(findViewById, mVar);
        t5Var5.g(0.0f);
        t5Var5.f(1.0f);
        this.p = t5Var5;
        t5 t5Var6 = new t5(findViewById, mVar2);
        t5Var6.g(0.0f);
        t5Var6.f(1.0f);
        this.q = t5Var6;
        this.o.k(v);
        t5 t5Var7 = this.p;
        u5 u5Var = y;
        t5Var7.k(u5Var);
        this.q.k(u5Var);
        this.r.k(w);
        this.s.k(x);
        this.n.k(u5Var);
        measure(0, 0);
        this.t = (((float) getMeasuredWidth()) / 2.0f) - (((float) this.b.getMaxWidth()) / 2.0f);
        this.u = (((float) getMeasuredHeight()) / 2.0f) - ((float) findViewById2.getMeasuredHeight());
        View view = this.a;
        view.setTag(C0707R.id.show_animation_end_listener, new a(this, nud.f(getResources().getDimension(C0707R.dimen.tooltip_image_margin), getResources()), (int) Math.floor((double) ((((float) findViewById2.getMeasuredHeight()) / 2.0f) + (((float) getMeasuredHeight()) / 2.0f)))));
        view.setTag(C0707R.id.hide_animation_end_listener, new b(this));
        ImageView imageView3 = this.b;
        imageView3.setX(this.t);
        imageView3.setScaleX(0.0f);
        imageView3.setScaleY(0.0f);
        findViewById2.setScaleX(0.0f);
        findViewById.setScaleX(0.0f);
        findViewById.setScaleY(0.0f);
        textView.setScaleX(0.0f);
        findViewById2.setY((float) (-findViewById2.getMeasuredHeight()));
    }

    public /* synthetic */ void D(int i, int i2, r5 r5Var, boolean z, float f2, float f3) {
        this.o.j((float) i);
        this.r.j((float) i2);
        this.s.j(1.0f);
        this.p.j(1.0f);
        this.q.j(1.0f);
        this.n.j(1.0f);
    }

    public /* synthetic */ void E(r5 r5Var, boolean z, float f2, float f3) {
        this.c.j(0.0f);
        this.f.j(0.0f);
    }

    public void G(String str, Picasso picasso) {
        z m = picasso.m(str);
        m.x(new cwd());
        m.t(yc0.s(getContext()));
        m.g(yc0.s(getContext()));
        m.m(this.b);
    }

    public void a() {
        View view = this.a;
        t5 t5Var = this.o;
        Object tag = view.getTag(C0707R.id.hide_animation_end_listener);
        if (tag instanceof r5.k) {
            t5Var.d((r5.k) tag);
        }
        if (this.a.getTag(C0707R.id.show_animation_end_listener) instanceof r5.k) {
            this.c.b((r5.k) this.a.getTag(C0707R.id.show_animation_end_listener));
            this.c.j(1.0f);
            this.f.j(1.0f);
        }
    }

    public void b() {
        View view = this.a;
        t5 t5Var = this.c;
        Object tag = view.getTag(C0707R.id.show_animation_end_listener);
        if (tag instanceof r5.k) {
            t5Var.d((r5.k) tag);
        }
        if (this.a.getTag(C0707R.id.hide_animation_end_listener) instanceof r5.k) {
            this.o.b((r5.k) this.a.getTag(C0707R.id.hide_animation_end_listener));
            this.o.j(this.t);
            this.r.j(this.u);
            this.s.j(0.0f);
            this.n.j(0.0f);
            this.p.j(0.0f);
            this.q.j(0.0f);
        }
    }

    public PlaylistStoryHeaderAnimatedTooltip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C(attributeSet, context);
    }
}
