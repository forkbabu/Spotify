package com.spotify.music.storage;

import android.content.Intent;
import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ MoveCacheConfirmationActivity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ b(MoveCacheConfirmationActivity moveCacheConfirmationActivity, String str, long j) {
        this.a = moveCacheConfirmationActivity;
        this.b = str;
        this.c = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MoveCacheConfirmationActivity moveCacheConfirmationActivity = this.a;
        String str = this.b;
        long j = this.c;
        moveCacheConfirmationActivity.getClass();
        int i = CacheMovingIntentService.n;
        Intent intent = new Intent("move", null, moveCacheConfirmationActivity, CacheMovingIntentService.class);
        intent.putExtra("volume", str);
        intent.putExtra("estimated-size", j);
        moveCacheConfirmationActivity.startService(intent);
        moveCacheConfirmationActivity.finish();
    }
}
