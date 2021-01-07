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
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.comscore.streaming.WindowState;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.a;
import com.squareup.picasso.Picasso;

/* renamed from: voc  reason: default package */
public final class voc implements uoc {
    private final Group A;
    private final int B;
    private final soc C;
    private final View a;
    private final View b;
    private final View c;
    private final TextView f;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final ImageView q;
    private final ImageView r;
    private final ImageView s;
    private final ImageView t;
    private final ImageView u;
    private final ProgressBar v;
    private final ProgressBar w;
    private final a x;
    private final LottieAnimationView y;
    private final TextView z;

    private voc(Context context, View view, Picasso picasso) {
        this.a = view;
        View findViewById = view.findViewById(C0707R.id.container);
        this.b = findViewById;
        this.r = (ImageView) view.findViewById(16908294);
        this.f = (TextView) view.findViewById(16908308);
        this.n = (TextView) view.findViewById(16908309);
        TextView textView = (TextView) view.findViewById(C0707R.id.description);
        this.o = textView;
        this.q = (ImageView) view.findViewById(C0707R.id.primary_action_button);
        this.p = (TextView) view.findViewById(C0707R.id.time_label);
        this.w = (ProgressBar) view.findViewById(C0707R.id.progress);
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.quickaction_start);
        this.s = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(C0707R.id.quickaction_end);
        this.u = imageView2;
        this.v = (ProgressBar) view.findViewById(C0707R.id.download_progress);
        ImageView imageView3 = (ImageView) view.findViewById(C0707R.id.quickaction_middle);
        this.t = imageView3;
        this.y = (LottieAnimationView) view.findViewById(C0707R.id.lottie_animated_icon_end);
        this.c = view.findViewById(C0707R.id.quickaction_end_guide);
        this.z = (TextView) view.findViewById(C0707R.id.music_and_talk_label);
        this.A = (Group) view.findViewById(C0707R.id.music_and_talk_group);
        this.x = new a((ViewGroup) view.findViewById(C0707R.id.accessory));
        bvd a2 = dvd.a(imageView);
        a2.f(imageView);
        a2.a();
        bvd a3 = dvd.a(imageView3);
        a3.f(imageView3);
        a3.a();
        bvd a4 = dvd.a(imageView2);
        a4.f(imageView2);
        a4.a();
        bvd c2 = dvd.c(findViewById);
        c2.f(findViewById);
        c2.a();
        ((ImageView) view.findViewById(C0707R.id.music_and_talk_icon)).setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.PLAYLIST, (float) nud.g(16.0f, context.getResources())));
        Context context2 = view.getContext();
        nud.p(context2, textView, C0707R.attr.pasteTextAppearanceBodySmall);
        textView.setTextColor(androidx.core.content.a.b(context2, C0707R.color.glue_row_subtitle_color));
        if (x.g(context)) {
            this.B = WindowState.NORMAL;
        } else {
            this.B = 160;
        }
        this.C = new soc(context, picasso);
        j1(false);
        A0(false);
        x1(false);
        getView().setTag(C0707R.id.glue_viewholder_tag, this);
    }

    public static uoc b(Context context, ViewGroup viewGroup, Picasso picasso) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.episode_quick_action_card, viewGroup, false);
        if (Build.VERSION.SDK_INT >= 21) {
            inflate.setClipToOutline(true);
        }
        return new voc(context, inflate, picasso);
    }

    @Override // defpackage.uoc
    public void A0(boolean z2) {
        if (z2) {
            this.t.setVisibility(0);
        } else {
            this.t.setVisibility(8);
        }
    }

    @Override // defpackage.uoc
    public void D0(String str) {
        this.s.setContentDescription(str);
    }

    @Override // defpackage.uoc
    public void D1(View.OnClickListener onClickListener) {
        this.t.setOnClickListener(onClickListener);
    }

    @Override // defpackage.roc
    public void F(boolean z2) {
        this.q.setEnabled(z2);
    }

    @Override // defpackage.roc
    public void G0() {
        this.n.setVisibility(0);
    }

    @Override // defpackage.roc
    public void H0(String str) {
        this.C.a(this.r, str);
    }

    @Override // defpackage.uoc
    public void L(boolean z2) {
        if (z2) {
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
    }

    @Override // defpackage.uoc
    public void M(View.OnClickListener onClickListener) {
        this.s.setOnClickListener(onClickListener);
    }

    @Override // defpackage.roc
    public void N() {
        this.w.setVisibility(0);
    }

    @Override // defpackage.roc
    public void O(int i) {
        this.w.setMax(i);
    }

    @Override // defpackage.uoc
    public void O1(Drawable drawable) {
        this.t.setImageDrawable(drawable);
    }

    @Override // defpackage.roc
    public void Q() {
        this.w.setVisibility(8);
    }

    @Override // defpackage.uoc
    public void R(boolean z2) {
        if (z2) {
            this.y.setVisibility(0);
            this.c.setVisibility(0);
            return;
        }
        this.y.setVisibility(8);
        this.c.setVisibility(8);
    }

    @Override // defpackage.uoc
    public void T() {
        this.o.setVisibility(8);
    }

    @Override // defpackage.uoc
    public void U1(String str) {
        this.t.setContentDescription(str);
    }

    @Override // defpackage.roc
    public void V0() {
        TextLabelUtil.b(this.a.getContext(), this.n, true);
    }

    @Override // defpackage.p90
    public View W1() {
        return this.x.d();
    }

    @Override // defpackage.roc
    public void Z1(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        this.n.setText(charSequence);
    }

    @Override // defpackage.uoc
    public void f2(Drawable drawable) {
        this.u.setImageDrawable(drawable);
    }

    @Override // defpackage.uoc
    public void g2(String str) {
        this.u.setContentDescription(str);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.r;
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.n;
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.f;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.uoc
    public void i0(Drawable drawable) {
        this.s.setImageDrawable(drawable);
    }

    @Override // defpackage.uoc
    public void j1(boolean z2) {
        if (z2) {
            this.s.setVisibility(0);
        } else {
            this.s.setVisibility(8);
        }
    }

    @Override // defpackage.roc
    public void k0(View.OnClickListener onClickListener) {
        this.q.setOnClickListener(onClickListener);
    }

    @Override // defpackage.uoc
    public void k2(View.OnClickListener onClickListener) {
        this.u.setOnClickListener(onClickListener);
    }

    @Override // defpackage.uoc
    public void l2(String str) {
        this.z.setText(str);
    }

    @Override // defpackage.uoc
    public void n(String str) {
        String str2;
        TextView textView = this.o;
        if (str != null) {
            int length = str.length();
            int i = this.B;
            if (length < i) {
                i = str.length();
            }
            str2 = str.substring(0, i);
        } else {
            str2 = "";
        }
        textView.setText(str2);
    }

    @Override // defpackage.uoc
    public void n0(String str) {
        this.p.setText(str);
    }

    @Override // defpackage.roc
    public void p2(boolean z2) {
        if (z2) {
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
    }

    @Override // defpackage.uoc
    public void q0(boolean z2) {
        if (z2) {
            this.v.setVisibility(0);
            this.u.setVisibility(4);
            return;
        }
        this.v.setVisibility(8);
        this.u.setVisibility(0);
    }

    @Override // defpackage.uoc
    public LottieAnimationView q2() {
        return this.y;
    }

    @Override // defpackage.f90
    public void setActive(boolean z2) {
        this.a.setActivated(z2);
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z2) {
        this.f.setEnabled(!z2);
        this.n.setEnabled(!z2);
        this.p.setEnabled(!z2);
        this.q.setEnabled(!z2);
        this.s.setEnabled(!z2);
        this.t.setEnabled(!z2);
        this.u.setEnabled(!z2);
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        this.n.setText(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    @Override // defpackage.roc
    public void t0(int i) {
        this.w.setProgress(i);
    }

    @Override // defpackage.uoc
    public void t1(boolean z2) {
        this.u.setEnabled(z2);
    }

    @Override // defpackage.uoc
    public void w2(boolean z2) {
        this.s.setEnabled(z2);
    }

    @Override // defpackage.roc
    public void x0(String str) {
        this.q.setContentDescription(str);
    }

    @Override // defpackage.uoc
    public void x1(boolean z2) {
        if (z2) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
    }

    @Override // defpackage.roc
    public void y() {
        this.n.setVisibility(0);
    }

    @Override // defpackage.uoc
    public void y0() {
        this.o.setVisibility(0);
    }

    @Override // defpackage.roc
    public void y1() {
        TextLabelUtil.b(this.a.getContext(), this.n, false);
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.x.f(view);
        this.x.g();
    }

    @Override // defpackage.roc
    public void z2(Drawable drawable) {
        this.q.setImageDrawable(drawable);
    }
}
