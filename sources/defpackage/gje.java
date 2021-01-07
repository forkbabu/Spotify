package defpackage;

import android.view.View;

/* renamed from: gje  reason: default package */
public final /* synthetic */ class gje implements View.OnClickListener {
    public final /* synthetic */ jje a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ gje(jje jje, da2 da2) {
        this.a = jje;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, view);
    }
}
