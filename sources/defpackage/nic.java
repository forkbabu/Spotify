package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.mobile.android.quotesharing.b;
import com.spotify.mobile.android.quotesharing.c;
import com.spotify.mobile.android.quotesharing.d;
import com.spotify.mobile.android.quotesharing.e;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: nic  reason: default package */
public final class nic implements iic {
    private final uoc a;
    private final View b;
    private final RecyclerView c;
    private final cic f;
    private final hic n;
    private final ConstraintLayout o;
    private final cb1 p;
    private boolean q;

    private nic(Context context, ViewGroup viewGroup, Picasso picasso, uoc uoc, cic cic, e eVar, cb1 cb1, hic hic) {
        this.a = uoc;
        this.f = cic;
        this.n = hic;
        this.p = cb1;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.episode_carousel_holder, viewGroup, true);
        this.b = inflate;
        inflate.findViewById(C0707R.id.icon_view).setOnClickListener(new bic(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.quote_row);
        this.c = recyclerView;
        recyclerView.k(new d(context.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp)), -1);
        recyclerView.k(new upa(cb1), -1);
        recyclerView.setAdapter(new c(picasso, eVar));
        this.o = (ConstraintLayout) inflate.findViewById(C0707R.id.carousel_holder);
    }

    static iic c(Context context, ViewGroup viewGroup, Picasso picasso, uoc uoc, cic cic, e eVar, cb1 cb1, hic hic) {
        return new nic(context, viewGroup, picasso, uoc, cic, eVar, cb1, hic);
    }

    @Override // defpackage.uoc
    public void A0(boolean z) {
        this.a.A0(z);
    }

    @Override // defpackage.uoc
    public void D0(String str) {
        this.a.D0(str);
    }

    @Override // defpackage.uoc
    public void D1(View.OnClickListener onClickListener) {
        this.a.D1(onClickListener);
    }

    public void E(boolean z) {
        if (this.o.getAnimation() == null && !this.q) {
            if (z && this.o.getVisibility() == 8) {
                this.p.c();
                this.o.setAlpha(0.0f);
                this.o.setVisibility(0);
                this.o.animate().alpha(1.0f).setStartDelay(300).setDuration(900).setListener(null);
                ((fic) this.n).b();
            } else if (!z && this.o.getVisibility() == 0) {
                this.o.animate().alpha(0.0f).setDuration(100).setListener(new mic(this));
                this.o.setVisibility(8);
                ((fic) this.n).b();
            }
        }
    }

    @Override // defpackage.roc
    public void F(boolean z) {
        this.a.F(z);
    }

    @Override // defpackage.roc
    public void G0() {
        this.a.G0();
    }

    @Override // defpackage.roc
    public void H0(String str) {
        this.a.H0(str);
    }

    @Override // defpackage.uoc
    public void L(boolean z) {
        this.a.L(z);
    }

    @Override // defpackage.uoc
    public void M(View.OnClickListener onClickListener) {
        this.a.M(onClickListener);
    }

    @Override // defpackage.roc
    public void N() {
        this.a.N();
    }

    @Override // defpackage.roc
    public void O(int i) {
        this.a.O(i);
    }

    @Override // defpackage.uoc
    public void O1(Drawable drawable) {
        this.a.O1(drawable);
    }

    @Override // defpackage.roc
    public void Q() {
        this.a.Q();
    }

    @Override // defpackage.uoc
    public void R(boolean z) {
        this.a.R(z);
    }

    @Override // defpackage.uoc
    public void T() {
        this.a.T();
    }

    @Override // defpackage.uoc
    public void U1(String str) {
        this.a.U1(str);
    }

    @Override // defpackage.roc
    public void V0() {
        this.a.V0();
    }

    @Override // defpackage.p90
    public View W1() {
        return this.a.W1();
    }

    @Override // defpackage.roc
    public void Z1(View.OnClickListener onClickListener) {
        this.a.Z1(onClickListener);
    }

    public /* synthetic */ void d(View view) {
        this.f.a(this);
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        this.a.e(charSequence);
    }

    @Override // defpackage.uoc
    public void f2(Drawable drawable) {
        this.a.f2(drawable);
    }

    public void g(List<b> list, c.a aVar) {
        ((c) this.c.getAdapter()).b0(list);
    }

    @Override // defpackage.uoc
    public void g2(String str) {
        this.a.g2(str);
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.a.getImageView();
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.a.getSubtitleView();
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.a.getTitleView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    @Override // defpackage.uoc
    public void i0(Drawable drawable) {
        this.a.i0(drawable);
    }

    @Override // defpackage.uoc
    public void j1(boolean z) {
        this.a.j1(z);
    }

    @Override // defpackage.roc
    public void k0(View.OnClickListener onClickListener) {
        this.a.k0(onClickListener);
    }

    @Override // defpackage.uoc
    public void k2(View.OnClickListener onClickListener) {
        this.a.k2(onClickListener);
    }

    @Override // defpackage.uoc
    public void l2(String str) {
        this.a.l2(str);
    }

    @Override // defpackage.uoc
    public void n(String str) {
        this.a.n(str);
    }

    @Override // defpackage.uoc
    public void n0(String str) {
        this.a.n0(str);
    }

    @Override // defpackage.roc
    public void p2(boolean z) {
        this.a.p2(z);
    }

    @Override // defpackage.uoc
    public void q0(boolean z) {
        this.a.q0(z);
    }

    @Override // defpackage.uoc
    public LottieAnimationView q2() {
        return this.a.q2();
    }

    @Override // defpackage.f90
    public void setActive(boolean z) {
        this.a.setActive(z);
    }

    @Override // com.spotify.paste.widgets.internal.c
    public void setAppearsDisabled(boolean z) {
        this.a.setAppearsDisabled(z);
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // defpackage.roc
    public void t0(int i) {
        this.a.t0(i);
    }

    @Override // defpackage.uoc
    public void t1(boolean z) {
        this.a.t1(z);
    }

    public void w(boolean z) {
        this.q = z;
    }

    @Override // defpackage.uoc
    public void w2(boolean z) {
        this.a.w2(z);
    }

    @Override // defpackage.roc
    public void x0(String str) {
        this.a.x0(str);
    }

    @Override // defpackage.uoc
    public void x1(boolean z) {
        this.a.x1(z);
    }

    @Override // defpackage.roc
    public void y() {
        this.a.y();
    }

    @Override // defpackage.uoc
    public void y0() {
        this.a.y0();
    }

    @Override // defpackage.roc
    public void y1() {
        this.a.y1();
    }

    @Override // defpackage.p90
    public void z0(View view) {
        this.a.z0(view);
    }

    @Override // defpackage.roc
    public void z2(Drawable drawable) {
        this.a.z2(drawable);
    }
}
