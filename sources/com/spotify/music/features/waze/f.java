package com.spotify.music.features.waze;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class f implements i92 {
    @Override // defpackage.i92
    public PendingIntent a(Context context) {
        Intent intent = new Intent(context, WazeReturnActivity.class);
        intent.setFlags(268435456);
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }
}
