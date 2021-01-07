package com.facebook.internal.instrument;

import com.facebook.m;
import com.facebook.q;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public final class a implements m.c {
    final /* synthetic */ InstrumentData a;

    a(InstrumentData instrumentData) {
        this.a = instrumentData;
    }

    @Override // com.facebook.m.c
    public void b(q qVar) {
        try {
            if (qVar.e() == null && qVar.f().getBoolean("success")) {
                this.a.a();
            }
        } catch (JSONException unused) {
        }
    }
}
