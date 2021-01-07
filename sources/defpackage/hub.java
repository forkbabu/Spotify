package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import defpackage.vub;
import io.reactivex.functions.c;

/* renamed from: hub  reason: default package */
public final /* synthetic */ class hub implements c {
    public static final /* synthetic */ hub a = new hub();

    private /* synthetic */ hub() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return vub.a.c((BluetoothConnectionState) obj, ((Boolean) obj2).booleanValue());
    }
}
