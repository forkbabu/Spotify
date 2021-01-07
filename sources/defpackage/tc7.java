package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: tc7  reason: default package */
public class tc7 implements sc7 {
    private final boolean a;
    private final awc b;
    private final String c;

    public tc7(boolean z, awc awc, String str) {
        this.a = z;
        this.b = awc;
        this.c = str;
    }

    @Override // defpackage.sc7
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.a) {
            viewGroup.addView(this.b.a(layoutInflater, viewGroup));
            this.b.c(this.c);
        }
    }
}
