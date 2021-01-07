package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: ka7  reason: default package */
public class ka7 implements ja7 {
    private final String a;
    private final OffliningLogger b;
    private final jz1 c;
    private final aqe d;

    public ka7(String str, OffliningLogger offliningLogger, jz1 jz1, aqe aqe) {
        this.a = str;
        this.b = offliningLogger;
        this.c = jz1;
        this.d = aqe;
    }

    @Override // defpackage.ja7
    public void a(boolean z) {
        this.b.a(this.a, OffliningLogger.SourceElement.HEADER_ACTION, z);
    }

    @Override // defpackage.ja7
    public void b(String str, String str2, String str3) {
        String str4 = this.a;
        this.d.getClass();
        this.c.a(new fa1(str4, "com.spotify.feature.podcast.episode", str4, str2, 0, str, "hit", str3, (double) System.currentTimeMillis()));
    }
}
