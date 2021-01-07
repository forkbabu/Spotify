package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.music.libs.viewuri.c;

/* renamed from: rt5  reason: default package */
public class rt5 {
    private final mba a;
    private final a b;
    private final c c;

    public rt5(mba mba, a aVar, c cVar) {
        this.a = mba;
        this.b = aVar;
        this.c = cVar;
    }

    public void a(ConnectManager.ConnectState connectState) {
        ConnectStates$State connectStates$State;
        mba mba = this.a;
        int ordinal = connectState.ordinal();
        if (ordinal == 1) {
            connectStates$State = ConnectStates$State.NO_DEVICES;
        } else if (ordinal == 2) {
            connectStates$State = ConnectStates$State.DEVICES_AVAILABLE;
        } else if (ordinal == 3) {
            connectStates$State = ConnectStates$State.PLAYING_FROM;
        } else if (ordinal != 4) {
            connectStates$State = ConnectStates$State.NONE;
        } else {
            connectStates$State = ConnectStates$State.CONNECTING;
        }
        mba.d(connectStates$State, this.b.path(), this.c.toString());
    }
}
