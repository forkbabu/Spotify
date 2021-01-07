package defpackage;

import android.content.Context;
import io.branch.referral.Branch;
import io.reactivex.disposables.a;
import io.reactivex.y;

/* renamed from: q3a  reason: default package */
public class q3a implements x70 {
    private final z70 a;
    private final m3a b;
    private final y c;
    private final a d = new a();

    public q3a(z70 z70, m3a m3a, y yVar) {
        this.a = z70;
        this.b = m3a;
        this.c = yVar;
    }

    @Override // defpackage.x70
    public void a(Context context) {
        this.d.b(this.b.isEnabled().H(this.c).subscribe(new g3a(this, context)));
    }

    public void b(Context context, Boolean bool) {
        if (bool.booleanValue()) {
            this.a.getClass();
            Branch.A(context, "key_live_pfaVQo61xda7Zq1zC1ca3igayxarnljw");
        }
    }
}
