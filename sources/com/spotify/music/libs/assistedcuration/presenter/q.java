package com.spotify.music.libs.assistedcuration.presenter;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.libs.collection.service.CollectionService;
import com.spotify.music.libs.viewuri.c;

public class q {
    private final Context a;
    private final c b;

    public q(Activity activity, c cVar) {
        activity.getClass();
        this.a = activity;
        cVar.getClass();
        this.b = cVar;
    }

    public void a(String[] strArr, String str) {
        CollectionService.i(this.a, strArr, this.b.toString(), str, CollectionService.Messaging.NONE);
    }
}
