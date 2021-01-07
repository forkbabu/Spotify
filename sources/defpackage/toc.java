package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;

/* renamed from: toc  reason: default package */
public final class toc implements roc {
    private final View a;
    private final View b;
    private final TextView c;
    private final TextView f;
    private final ImageView n;
    private final ProgressBar o;
    private final ImageView p;
    private final soc q;

    private toc(Context context, View view, Picasso picasso) {
        this.a = view;
        View findViewById = view.findViewById(C0707R.id.container);
        this.b = findViewById;
        View findViewById2 = view.findViewById(16908294);
        findViewById2.getClass();
        this.p = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.primary_action_button);
        findViewById3.getClass();
        ImageView imageView = (ImageView) findViewById3;
        this.n = imageView;
        View findViewById4 = view.findViewById(16908308);
        findViewById4.getClass();
        this.c = (TextView) findViewById4;
        View findViewById5 = view.findViewById(16908309);
        findViewById5.getClass();
        TextView textView = (TextView) findViewById5;
        this.f = textView;
        View findViewById6 = view.findViewById(C0707R.id.progress);
        findViewById6.getClass();
        this.o = (ProgressBar) findViewById6;
        bvd a2 = dvd.a(imageView);
        a2.f(imageView);
        a2.a();
        bvd c2 = dvd.c(findViewById);
        c2.f(findViewById);
        c2.a();
        this.q = new soc(context, picasso);
        textView.setAllCaps(false);
        getView().setTag(C0707R.id.glue_viewholder_tag, this);
    }

    public static roc b(Context context, ViewGroup viewGroup, Picasso picasso) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.episode_compact_action_card, viewGroup, false);
        if (Build.VERSION.SDK_INT >= 21) {
            inflate.setClipToOutline(true);
        }
        return new toc(context, inflate, picasso);
    }

    @Override // defpackage.roc
    public void F(boolean z) {
        this.n.setEnabled(z);
    }

    @Override // defpackage.roc
    public void H0(String str) {
        this.q.a(this.p, str);
    }

    @Override // defpackage.roc
    public void N() {
        this.o.setVisibility(0);
    }

    @Override // defpackage.roc
    public void O(int i) {
        this.o.setMax(i);
    }

    @Override // defpackage.roc
    public void Q() {
        this.o.setVisibility(8);
    }

    @Override // defpackage.roc
    public void V0() {
        TextLabelUtil.b(this.a.getContext(), this.f, true);
    }

    @Override // defpackage.p90
    public View W1() {
        return null;
    }

    @Override // defpackage.roc
    public void Z1(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.p;
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.f;
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.c;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.roc
    public void k0(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    @Override // defpackage.roc
    public void p2(boolean z) {
        if (z) {
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        this.a.setActivated(z);
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.c.setEnabled(!z);
        this.f.setEnabled(!z);
        this.n.setEnabled(!z);
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // defpackage.roc
    public void t0(int i) {
        this.o.setProgress(i);
    }

    @Override // defpackage.roc
    public void x0(String str) {
        this.n.setContentDescription(str);
    }

    @Override // defpackage.roc
    public void y1() {
        TextLabelUtil.b(this.a.getContext(), this.f, false);
    }

    @Override // defpackage.p90
    public void z0(View view) {
    }

    @Override // defpackage.roc
    public void z2(Drawable drawable) {
        this.n.setImageDrawable(drawable);
    }
}
