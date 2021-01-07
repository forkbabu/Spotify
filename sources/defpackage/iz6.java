package defpackage;

import android.view.View;
import defpackage.kz6;

/* renamed from: iz6  reason: default package */
public final /* synthetic */ class iz6 implements View.OnClickListener {
    public final /* synthetic */ kz6.b a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ iz6(kz6.b bVar, boolean z) {
        this.a = bVar;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kz6.b bVar = this.a;
        if (this.b) {
            kz6.this.c.b();
        } else {
            kz6.this.c.c();
        }
        kz6.this.e.a(kz6.this.b, kz6.this.d);
    }
}
