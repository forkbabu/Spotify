package com.spotify.music.superbird.setup.domain;

import android.bluetooth.BluetoothDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.superbird.setup.domain.b;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.q;
import kotlin.jvm.internal.h;

/* compiled from: java-style lambda group */
public final class a implements io.reactivex.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ((b.C0348b.a) this.b).a.b.accept(q.c.a);
            BluetoothDevice a2 = ((d.o) this.c).a();
            h.e(a2, "device");
            try {
                Object invoke = BluetoothDevice.class.getMethod("removeBond", new Class[0]).invoke(a2, new Object[0]);
                if (invoke != null) {
                    ((Boolean) invoke).booleanValue();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception e) {
                Logger.e(e, "Failed remove bond to remote device.", new Object[0]);
            }
        } else if (i == 1) {
            b.e(((b.C0348b.a) this.b).a.a, ((d.o) this.c).a(), ((b.C0348b.a) this.b).a.b);
        } else {
            throw null;
        }
    }
}
