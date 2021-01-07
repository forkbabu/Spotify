package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.cast.a;
import com.google.android.gms.internal.cast.n0;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connect.cast.r;

public final class w extends a implements d0 {
    private final d a;

    public w(d dVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener");
        this.a = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.a
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            com.google.android.gms.dynamic.a F3 = b.F3(this.a);
            parcel2.writeNoException();
            n0.b(parcel2, F3);
            return true;
        } else if (i == 2) {
            int readInt = parcel.readInt();
            ((com.spotify.music.features.connect.cast.b) this.a).getClass();
            int i3 = r.o;
            Logger.b("CR - Cast state is %d", Integer.valueOf(readInt));
            parcel2.writeNoException();
            return true;
        } else if (i != 3) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
            return true;
        }
    }
}
