package defpackage;

import android.content.Context;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f71  reason: default package */
public final class f71 {
    private final t a;

    public f71(t tVar) {
        this.a = tVar;
    }

    public Map<String, a71> a(Context context, v3 v3Var, c.a aVar, p71 p71, ere ere) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("navigate", new d71(this.a, p71, new j81(aVar), ere));
        hashMap.put("contextMenu", new b71(context, v3Var, aVar, p71, new j81(aVar), ere));
        return hashMap;
    }
}
