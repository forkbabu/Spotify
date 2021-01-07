package defpackage;

import android.view.View;
import defpackage.lgf;

/* renamed from: agf  reason: default package */
public final /* synthetic */ class agf implements View.OnClickListener {
    public final /* synthetic */ lgf.a a;
    public final /* synthetic */ jff b;

    public /* synthetic */ agf(lgf.a aVar, jff jff) {
        this.a = aVar;
        this.b = jff;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lgf.a aVar = this.a;
        jff jff = this.b;
        aVar.getClass();
        String a2 = dhf.a(jff.a());
        if (lgf.this.o.e()) {
            lgf.this.a.B(a2);
        } else {
            lgf.this.a.f(a2);
        }
        if (lgf.this.u != null) {
            lgf.this.u.accept(hff.k(a2));
        }
    }
}
