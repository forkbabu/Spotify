package defpackage;

import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: sr2  reason: default package */
public final class sr2 implements ur2 {
    private final cr9 a;

    public sr2(cr9 cr9) {
        h.e(cr9, "gradientUtils");
        this.a = cr9;
    }

    @Override // defpackage.ur2
    public void a(View view, String str) {
        h.e(view, "gradientView");
        this.a.a(view, z81.a().p("style", "diagonal").p("startColorFromImage", str).i("overlayDarkness", 0.2f).d());
    }
}
