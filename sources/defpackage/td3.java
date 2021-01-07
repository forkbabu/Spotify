package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.freetiercommon.models.a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: td3  reason: default package */
public class td3 implements a71 {
    private final wk9 a;
    private final p71 b;
    private final j81 c;
    private final ere f;
    private final c n;

    /* renamed from: td3$a */
    public static abstract class a implements com.spotify.music.freetiercommon.models.a {

        /* renamed from: td3$a$a  reason: collision with other inner class name */
        public interface AbstractC0684a extends a.AbstractC0274a<a, AbstractC0684a> {
        }

        @Override // com.spotify.music.freetiercommon.models.a
        public a.AbstractC0274a<?, ?> J() {
            return a();
        }

        public abstract AbstractC0684a a();
    }

    public td3(wk9 wk9, p71 p71, j81 j81, ere ere, c cVar) {
        wk9.getClass();
        this.a = wk9;
        p71.getClass();
        this.b = p71;
        this.c = j81;
        this.f = ere;
        cVar.getClass();
        this.n = cVar;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<com.spotify.music.freetiercommon.models.a> a(p81[] p81Arr) {
        ArrayList<com.spotify.music.freetiercommon.models.a> newArrayListWithCapacity = Collections2.newArrayListWithCapacity(p81Arr.length);
        for (p81 p81 : p81Arr) {
            String string = p81.string("trackUri", "");
            String string2 = p81.string("trackName", "");
            String string3 = p81.string("trackImageUri", "");
            String string4 = p81.string("previewId", "");
            String string5 = p81.string("albumName", "");
            String string6 = p81.string("artistName", "");
            newArrayListWithCapacity.add(new sd3(string, string2, string4, p81.boolValue("isExplicit", false), false, false, Boolean.valueOf(p81.boolValue("isCurrentlyPlayable", true)), string5, string6, Collections.singletonList(string6), string3, null));
        }
        return newArrayListWithCapacity;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("title", "");
        p81[] bundleArray = o81.data().bundleArray("tracks");
        String string2 = o81.data().string("uri", "unknown_uri");
        if (bundleArray == null) {
            return;
        }
        if (!a(bundleArray).isEmpty()) {
            this.a.a(this.n, a(bundleArray), string, string2);
            this.b.a(string2, n61.d(), "trackCloudShowAllSongs", null);
            this.f.a(this.c.a(n61).j());
            return;
        }
        Assertion.g("List of tracks cannot be empty.");
    }
}
