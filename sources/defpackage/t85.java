package defpackage;

import com.spotify.mobile.android.hubframework.defaults.playback.PlayFromContextCommandHandler;
import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.music.inappmessaging.b;
import com.spotify.remoteconfig.x5;

/* renamed from: t85  reason: default package */
public class t85 implements a71 {
    private final b a;
    private final x5 b;
    private final PlayFromContextCommandHandler c;

    public t85(b bVar, PlayFromContextCommandHandler playFromContextCommandHandler, x5 x5Var) {
        this.b = x5Var;
        this.a = bVar;
        this.c = playFromContextCommandHandler;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.c.b(o81, n61);
        if (this.b.b()) {
            this.a.b(MessageRequest.a("track_page", "shuffle_play", "v1"));
        }
    }
}
