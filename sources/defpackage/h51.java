package defpackage;

import android.view.View;

/* renamed from: h51  reason: default package */
public final /* synthetic */ class h51 implements View.OnClickListener {
    public final /* synthetic */ s81 a;
    public final /* synthetic */ w51 b;

    public /* synthetic */ h51(s81 s81, w51 w51) {
        this.a = s81;
        this.b = w51;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s81 s81 = this.a;
        w51 w51 = this.b;
        if (s81.events().containsKey("click")) {
            w51.b().a(n61.b("click", s81));
            return;
        }
        a91 target = s81.target();
        if (target != null) {
            w51.e().a(target, s81);
        }
    }
}
