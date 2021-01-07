package defpackage;

import android.view.View;

/* renamed from: l4  reason: default package */
public class l4 {
    private int a;
    private int b;

    public int a() {
        return this.a | this.b;
    }

    public void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public void c(View view, View view2, int i) {
        this.a = i;
    }

    public void d(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
