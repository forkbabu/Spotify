package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.libs.connect.g;
import com.spotify.music.libs.viewuri.c;

/* renamed from: mrb  reason: default package */
public class mrb implements g {
    private final kqd a;
    private final mba b;
    private final a c;
    private final c d;

    public mrb(kqd kqd, mba mba, a aVar, c cVar) {
        this.a = kqd;
        this.b = mba;
        this.c = aVar;
        this.d = cVar;
    }

    @Override // com.spotify.libs.connect.g
    public void a(ConnectStates$State connectStates$State) {
        this.b.d(connectStates$State, this.c.path(), this.d.toString());
        this.a.e();
    }
}
