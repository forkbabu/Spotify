package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: dic  reason: default package */
public final class dic implements cic {
    private final cb1 a;

    public dic(cb1 cb1) {
        h.e(cb1, "quotesLogger");
        this.a = cb1;
    }

    @Override // defpackage.cic
    public void a(iic iic) {
        h.e(iic, "quoteCardView");
        this.a.a();
        nic nic = (nic) iic;
        nic.E(false);
        nic.w(true);
    }
}
