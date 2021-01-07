package com.spotify.music.features.confirmdeletion;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.navigation.b;
import kotlin.jvm.internal.h;

public final class a implements xec {
    private final Context a;
    private final b b;

    public a(Context context, b bVar) {
        h.e(context, "context");
        h.e(bVar, "activityStarter");
        this.a = context;
        this.b = bVar;
    }

    @Override // defpackage.xec
    public void a(String str, String str2) {
        h.e(str, "name");
        h.e(str2, "uri");
        Context context = this.a;
        h.e(context, "context");
        h.e(str, "name");
        h.e(str2, "uri");
        Assertion.c(str2, "We need a non-empty uri", "");
        Intent intent = new Intent();
        intent.setClass(context, ConfirmDeletionActivity.class);
        intent.putExtra("com.spotify.mobile.android.ui.activity.name", str);
        intent.putExtra("com.spotify.mobile.android.ui.activity.uri", str2);
        this.b.b(intent);
    }
}
