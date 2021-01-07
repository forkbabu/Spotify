package defpackage;

import android.nfc.NfcAdapter;

/* renamed from: xod  reason: default package */
public final class xod implements fjf<wod> {
    private final wlf<NfcAdapter> a;

    public xod(wlf<NfcAdapter> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wod(this.a.get());
    }
}
