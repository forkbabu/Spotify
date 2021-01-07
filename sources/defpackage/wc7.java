package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: wc7  reason: default package */
public class wc7 implements vc7 {
    private final boolean a;
    private final ttc b;
    private final String c;

    public wc7(boolean z, ttc ttc, String str) {
        this.a = z;
        this.b = ttc;
        this.c = str;
    }

    @Override // defpackage.vc7
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.a) {
            viewGroup.addView(this.b.a(layoutInflater, viewGroup));
            this.b.b(this.c);
        }
    }
}
