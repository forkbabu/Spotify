package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.util.l0;

/* renamed from: kkb  reason: default package */
public final /* synthetic */ class kkb implements sg0 {
    public static final /* synthetic */ kkb a = new kkb();

    private /* synthetic */ kkb() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        StringBuilder V0 = je.V0("Triggered by a ");
        V0.append(l0.z(((Intent) obj).getDataString()).B());
        V0.append(" intent");
        return V0.toString();
    }
}
