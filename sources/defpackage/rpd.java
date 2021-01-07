package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

/* renamed from: rpd  reason: default package */
public class rpd extends EntitySorting {
    private static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.e("music_pages_sorting");

    public rpd(Context context, i iVar, g gVar) {
        super(context, iVar, gVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.EntitySorting
    public SpSharedPreferences.b<Object, String> b() {
        return e;
    }
}
