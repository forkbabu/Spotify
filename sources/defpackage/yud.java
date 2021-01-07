package defpackage;

import android.view.View;

/* renamed from: yud  reason: default package */
public class yud {
    private final View a;
    private l b;

    public yud(View view) {
        this.a = view;
    }

    public void a() {
        l lVar = this.b;
        if (lVar != null) {
            lVar.g(this.a.getDrawableState());
        }
    }

    public l b() {
        return this.b;
    }

    public void c() {
        l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    public void d(l lVar) {
        l lVar2 = this.b;
        if (lVar2 != lVar) {
            if (lVar2 != null) {
                lVar2.j(null);
            }
            this.b = lVar;
            if (lVar != null) {
                lVar.j(this.a);
                if (q4.v(this.a)) {
                    lVar.g(this.a.getDrawableState());
                }
            }
        }
    }
}
