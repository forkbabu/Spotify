package defpackage;

import com.spotify.music.navigation.t;
import com.spotify.music.podcast.ui.topic.f;

/* renamed from: b77  reason: default package */
public class b77 implements f {
    private final t a;
    private final w57 b;

    public b77(t tVar, w57 w57) {
        this.a = tVar;
        this.b = w57;
    }

    @Override // com.spotify.music.podcast.ui.topic.f
    public void a(String str) {
        this.b.f(str, -1);
        this.a.d(str);
    }
}
