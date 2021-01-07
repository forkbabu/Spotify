package com.spotify.music.slate;

import android.app.Activity;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Activity a;

    public /* synthetic */ a(Activity activity) {
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.a;
        activity.setResult(101);
        activity.finish();
    }
}
