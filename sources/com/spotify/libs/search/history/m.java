package com.spotify.libs.search.history;

import android.app.Application;
import com.spotify.music.json.g;
import java.util.HashMap;
import java.util.Map;

public class m implements l {
    private final Map<a, p> a = new HashMap(2);
    private final Application b;
    private final g c;

    /* access modifiers changed from: package-private */
    public static abstract class a {
        a() {
        }

        public abstract String a();

        public abstract String b();
    }

    public m(Application application, g gVar) {
        application.getClass();
        this.b = application;
        this.c = gVar;
    }

    @Override // com.spotify.libs.search.history.l
    public p a(String str, String str2) {
        return b(str, str2, 10);
    }

    @Override // com.spotify.libs.search.history.l
    public p b(String str, String str2, int i) {
        p pVar = this.a.get(new e(str, str2));
        if (pVar != null) {
            return pVar;
        }
        q qVar = new q(this.b, str, str2, this.c, i);
        this.a.put(new e(str, str2), qVar);
        return qVar;
    }
}
