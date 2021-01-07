package defpackage;

import android.os.Bundle;

/* renamed from: z60  reason: default package */
public final class z60 extends y60 {
    z60(String str, Bundle bundle) {
        super(str, bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.y60
    public void b(Bundle bundle) {
        bundle.getInt("selectedItemIndex", -1);
        bundle.getString("selectedItem", "");
    }
}
