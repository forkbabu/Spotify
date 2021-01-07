package com.spotify.music.features.yourlibrary.musicpages.songsmetadata;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

public class a {
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.e("music_pages_songs_metadata");
    private final Context a;
    private final i b;

    /* renamed from: com.spotify.music.features.yourlibrary.musicpages.songsmetadata.a$a  reason: collision with other inner class name */
    class C0264a implements c {
        C0264a() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.c
        public void a(String str, String str2) {
            SpSharedPreferences.a<Object> b = a.this.b.b(a.this.a, str).b();
            b.f(a.c, str2);
            b.i();
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.songsmetadata.c
        public String getValue(String str) {
            String m = a.this.b.b(a.this.a, str).m(a.c, "");
            m.getClass();
            return m;
        }
    }

    public a(Context context, i iVar) {
        this.a = context;
        this.b = iVar;
    }

    public c d() {
        return new C0264a();
    }
}
