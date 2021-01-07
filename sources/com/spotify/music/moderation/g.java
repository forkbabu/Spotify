package com.spotify.music.moderation;

import android.app.Activity;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.music.libs.viewuri.c;
import defpackage.yjb;
import java.util.ArrayList;
import java.util.List;

public class g implements vka {
    private final Activity a;
    private final PlayerStateCompat b;

    public g(Activity activity, PlayerStateCompat playerStateCompat) {
        activity.getClass();
        this.a = activity;
        playerStateCompat.getClass();
        this.b = playerStateCompat;
    }

    @Override // defpackage.vka
    public void a(c cVar, String str) {
        Activity activity = this.a;
        yjb a2 = zjb.a(cVar, str, this.b);
        int i = ModerationReportActivity.G;
        Intent intent = new Intent(activity, ModerationReportActivity.class);
        intent.putExtra("moderation-view-config", a2);
        activity.startActivity(intent);
    }

    @Override // defpackage.vka
    public void b(c cVar, String str, List<String> list) {
        Activity activity = this.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.addAll(list);
        yjb.a a2 = yjb.a();
        a2.c(cVar);
        a2.b(arrayList);
        yjb a3 = a2.a();
        int i = ModerationReportActivity.G;
        Intent intent = new Intent(activity, ModerationReportActivity.class);
        intent.putExtra("moderation-view-config", a3);
        activity.startActivity(intent);
    }
}
