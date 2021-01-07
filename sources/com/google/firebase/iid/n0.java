package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n0 implements f {
    static final f a = new n0();

    private n0() {
    }

    @Override // com.google.android.gms.tasks.f
    public final g a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return j.e(null);
        }
        return j.e(bundle);
    }
}
