package defpackage;

import android.content.Context;
import android.nfc.NfcAdapter;

/* renamed from: ou2  reason: default package */
public final class ou2 implements fjf<NfcAdapter> {
    private final wlf<Context> a;

    public ou2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return NfcAdapter.getDefaultAdapter(this.a.get());
    }
}
