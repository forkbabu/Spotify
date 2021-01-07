package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.endpoints.d;
import com.spotify.rxjava2.p;
import java.util.Collections;

/* renamed from: ru1  reason: default package */
public class ru1 {
    private final c a = c.a("spotify:bixbyhomestreamingcard");
    private final d b;
    private final p c = new p();

    public ru1(d dVar) {
        this.b = dVar;
    }

    public void a() {
        this.c.a();
    }

    public void b(String str) {
        String name = kfd.m.getName();
        this.c.b(this.b.c(str, d.b.b().b(), PreparePlayOptions.EMPTY, PlayOrigin.builder(name).viewUri(this.a.toString()).referrerIdentifier(name).build(), Collections.emptyMap(), "interaction ID not set in bixby", "page instance ID not set in bixby").subscribe(nu1.a, mu1.a));
    }
}
