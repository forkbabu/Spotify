package com.spotify.music.features.addtoplaylist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.navigation.b;
import java.util.ArrayList;
import java.util.List;

public class e implements d {
    private final Context a;
    private final Bundle b;
    private final b c;

    public e(Context context, b bVar) {
        this.a = context;
        this.c = bVar;
        this.b = androidx.core.app.b.a(context, 17432576, 17432577).c();
    }

    @Override // com.spotify.music.features.addtoplaylist.d
    public void a(List<String> list, String str, String str2) {
        b bVar = this.c;
        Context context = this.a;
        int i = AddToPlaylistActivity.R;
        Intent intent = new Intent(context, AddToPlaylistActivity.class);
        intent.putStringArrayListExtra("item_uris", new ArrayList<>(list));
        intent.putExtra("source_context_uri", str2);
        intent.putExtra("source_view_uri", str);
        bVar.a(intent, this.b);
    }
}
