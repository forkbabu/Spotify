package com.spotify.music.features.queue.service;

import android.content.Intent;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.player.model.ContextTrack;
import dagger.android.f;
import java.util.ArrayList;

public class QueueService extends f {
    public static final /* synthetic */ int b = 0;
    s a;

    public QueueService() {
        super("QueueService");
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String str = "";
            if ("add_tracks_or_episodes".equals(action)) {
                boolean booleanExtra = intent.getBooleanExtra("show_toast", true);
                s sVar = this.a;
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("items");
                parcelableArrayListExtra.getClass();
                ImmutableList asList = FluentIterable.from(parcelableArrayListExtra).toMap(e.a).values().asList();
                String stringExtra = intent.getStringExtra(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID);
                if (stringExtra == null) {
                    stringExtra = str;
                }
                String stringExtra2 = intent.getStringExtra(ContextTrack.Metadata.KEY_INTERACTION_ID);
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                sVar.d(asList, stringExtra, str, booleanExtra);
            } else if ("add_album".equals(action)) {
                String stringExtra3 = intent.getStringExtra("album_uri");
                stringExtra3.getClass();
                s sVar2 = this.a;
                String stringExtra4 = intent.getStringExtra(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID);
                if (stringExtra4 == null) {
                    stringExtra4 = str;
                }
                String stringExtra5 = intent.getStringExtra(ContextTrack.Metadata.KEY_INTERACTION_ID);
                if (stringExtra5 != null) {
                    str = stringExtra5;
                }
                sVar2.c(stringExtra3, stringExtra4, str);
            }
        }
    }
}
