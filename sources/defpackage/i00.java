package defpackage;

import com.google.firebase.crashlytics.internal.report.model.a;

/* renamed from: i00  reason: default package */
public class i00 implements j00 {
    private final k00 a;
    private final l00 b;

    public i00(k00 k00, l00 l00) {
        this.a = k00;
        this.b = l00;
    }

    @Override // defpackage.j00
    public boolean a(a aVar, boolean z) {
        int ordinal = aVar.c.getType().ordinal();
        if (ordinal == 0) {
            this.a.a(aVar, z);
            return true;
        } else if (ordinal != 1) {
            return false;
        } else {
            this.b.a(aVar, z);
            return true;
        }
    }
}
