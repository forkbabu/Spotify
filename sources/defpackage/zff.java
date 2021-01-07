package defpackage;

import android.view.View;
import defpackage.lgf;

/* renamed from: zff  reason: default package */
public final /* synthetic */ class zff implements View.OnClickListener {
    public final /* synthetic */ lgf.a a;
    public final /* synthetic */ jff b;

    public /* synthetic */ zff(lgf.a aVar, jff jff) {
        this.a = aVar;
        this.b = jff;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lgf.a aVar = this.a;
        jff jff = this.b;
        aVar.getClass();
        String a2 = dhf.a(jff.a());
        lgf.this.a.p(a2);
        if (lgf.this.u != null) {
            lgf.this.u.accept(hff.h(a2));
        }
    }
}
