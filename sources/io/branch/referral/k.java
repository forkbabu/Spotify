package io.branch.referral;

import android.content.DialogInterface;
import io.branch.referral.j;

/* access modifiers changed from: package-private */
public class k implements DialogInterface.OnDismissListener {
    final /* synthetic */ j.c a;
    final /* synthetic */ j.b b;
    final /* synthetic */ j c;

    k(j jVar, j.c cVar, j.b bVar) {
        this.c = jVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.c.a = false;
        this.c.g = null;
        if (this.a == null) {
            return;
        }
        if (this.c.b) {
            ((Branch) this.a).S(this.b.b, this.b.a);
            return;
        }
        ((Branch) this.a).T(this.b.b, this.b.a);
    }
}
