package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: nqc  reason: default package */
public class nqc extends ClickableSpan {
    final /* synthetic */ long a;
    final /* synthetic */ oqc b;

    nqc(oqc oqc, long j) {
        this.b = oqc;
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.b.b.a(this.a);
    }
}
