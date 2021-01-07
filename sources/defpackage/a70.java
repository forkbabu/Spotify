package defpackage;

import android.os.Bundle;

/* renamed from: a70  reason: default package */
public final class a70 extends y60 {
    a70(String str, Bundle bundle) {
        super(str, bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.y60
    public void b(Bundle bundle) {
        bundle.getString("searchText", "");
    }
}
