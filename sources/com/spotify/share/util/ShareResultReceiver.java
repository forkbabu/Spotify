package com.spotify.share.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.share.logging.b;
import com.spotify.player.model.ContextTrack;
import dagger.android.a;
import dagger.android.d;
import java.util.ArrayList;

public class ShareResultReceiver extends d {
    b8e a;
    r4e b;
    m c;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.g("onReceive: %s", intent);
        a.c(this, context);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("session_id");
            String string2 = extras.getString(ContextTrack.Metadata.KEY_ENTITY_URI);
            String string3 = extras.getString("context_uri");
            String string4 = extras.getString("source_page_uri_legacy");
            long j = extras.getLong("destination_index");
            ArrayList<String> stringArrayList = extras.getStringArrayList("test_groups");
            String string5 = extras.getString("share_id");
            String string6 = extras.getString("source_page_uri");
            String string7 = extras.getString("source_page_id");
            int i = extras.getInt("destination_id");
            String string8 = extras.getString("destination_capability");
            String string9 = extras.getString("integration_id");
            ComponentName componentName = (ComponentName) extras.get("android.intent.extra.CHOSEN_COMPONENT");
            String packageName = componentName != null ? componentName.getPackageName() : "";
            b8e b8e = this.a;
            string2.getClass();
            string5.getClass();
            string.getClass();
            string4.getClass();
            stringArrayList.getClass();
            ((b) b8e).a(string2, string3, string5, string, packageName, j, string4, stringArrayList);
            r4e r4e = this.b;
            m mVar = this.c;
            string6.getClass();
            string7.getClass();
            string9.getClass();
            d8e d8e = new d8e(context, r4e, mVar, string6, string7, string9);
            string8.getClass();
            d8e.b(string2, i, string8, string5, packageName);
        }
    }
}
