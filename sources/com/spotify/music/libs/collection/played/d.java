package com.spotify.music.libs.collection.played;

import android.content.Context;
import android.content.Intent;

public class d {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public void a(String[] strArr, boolean z) {
        Intent intent = new Intent(this.a, PlayedStateService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("played", z);
        intent.setAction("PlayedStateService.action.PLAYED");
        this.a.startService(intent);
    }
}
