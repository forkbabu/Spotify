package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.OutOfSkips;
import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.music.inappmessaging.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.nowplaying.ui.components.controls.next.j;
import com.spotify.remoteconfig.w8;
import com.spotify.voiceassistant.player.models.metadata.ErrorMetadata;

/* renamed from: eyb  reason: default package */
public class eyb implements j {
    private final b b;
    private final t c;
    private final gl0<u> d;
    private final w8 e;

    public eyb(b bVar, t tVar, gl0<u> gl0, w8 w8Var) {
        this.b = bVar;
        this.c = tVar;
        this.d = gl0;
        this.e = w8Var;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.j
    public void call() {
        if (this.e.a()) {
            OutOfSkips.b i = OutOfSkips.i();
            i.m("Free Tier NPV");
            this.d.c(i.build());
            this.c.d(ViewUris.l2.toString());
            return;
        }
        this.b.b(MessageRequest.a("upsell", ErrorMetadata.ERROR_SKIP_LIMIT_REACHED, "v1"));
    }
}
