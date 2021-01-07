package com.spotify.music.features.createplaylist;

import android.content.Context;
import android.os.Bundle;
import com.spotify.music.navigation.b;
import java.util.Collections;
import java.util.List;

public class e implements d {
    private final Context a;
    private final Bundle b;
    private final b c;

    public e(Context context, b bVar) {
        this.a = context;
        this.b = androidx.core.app.b.a(context, 17432576, 17432577).c();
        this.c = bVar;
    }

    @Override // com.spotify.music.features.createplaylist.d
    public void a(List<String> list, String str, String str2) {
        this.c.a(CreatePlaylistActivity.U0(this.a, null, list, str, str2), this.b);
    }

    @Override // com.spotify.music.features.createplaylist.d
    public void b(String str, List<String> list, String str2, String str3) {
        this.c.a(CreatePlaylistActivity.U0(this.a, str, list, str2, str3), this.b);
    }

    @Override // com.spotify.music.features.createplaylist.d
    public void c(String str, String str2, String str3) {
        b bVar = this.c;
        Context context = this.a;
        int i = CreatePlaylistActivity.P;
        bVar.b(CreatePlaylistActivity.U0(context, str, Collections.emptyList(), str2, str3));
    }
}
