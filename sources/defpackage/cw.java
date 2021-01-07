package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.c;
import com.google.android.gms.wearable.e;

/* renamed from: cw  reason: default package */
public final class cw extends c implements e {
    public cw(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final String d() {
        return c("asset_key");
    }

    @Override // com.google.android.gms.wearable.e
    public final String getId() {
        return c("asset_id");
    }
}
