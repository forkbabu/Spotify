package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.api.g;
import io.reactivex.disposables.a;
import java.util.HashMap;

/* renamed from: mv3  reason: default package */
public class mv3 {
    private final HashMap<String, String> a = new HashMap<>();
    private final g b;
    private final a c = new a();

    public mv3(g gVar) {
        this.b = gVar;
    }

    public void a(String str, String str2) {
        this.a.put("value", str2);
        this.c.b(this.b.a(str, this.a).subscribe(new zu3(str, str2), new yu3(str, str2)));
    }

    public void b() {
        Logger.g("StatePoster is stopped.", new Object[0]);
        this.c.f();
    }
}
