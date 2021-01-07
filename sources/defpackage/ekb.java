package defpackage;

import android.content.Intent;

/* renamed from: ekb  reason: default package */
public final /* synthetic */ class ekb implements sg0 {
    public static final /* synthetic */ ekb a = new ekb();

    private /* synthetic */ ekb() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        StringBuilder V0 = je.V0("Triggered by intent with action ");
        V0.append(((Intent) obj).getAction());
        return V0.toString();
    }
}
