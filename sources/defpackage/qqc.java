package defpackage;

import android.text.style.URLSpan;
import android.view.View;
import defpackage.rqc;

/* access modifiers changed from: package-private */
/* renamed from: qqc  reason: default package */
public final class qqc extends URLSpan {
    final /* synthetic */ rqc.b a;
    final /* synthetic */ URLSpan b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    qqc(String str, rqc.b bVar, URLSpan uRLSpan) {
        super(str);
        this.a = bVar;
        this.b = uRLSpan;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        super.onClick(view);
        this.a.a(this.b.getURL());
    }
}
