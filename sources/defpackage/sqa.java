package defpackage;

import android.view.View;

/* renamed from: sqa  reason: default package */
public final /* synthetic */ class sqa implements View.OnClickListener {
    public final /* synthetic */ o61 a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ sqa(o61 o61, s81 s81) {
        this.a = o61;
        this.b = s81;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.a(n61.b("click", this.b));
    }
}
