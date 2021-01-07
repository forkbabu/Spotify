package com.spotify.music.libs.collection.played;

import android.content.Intent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import dagger.android.f;
import java.util.HashMap;

public class PlayedStateService extends f {
    g a;
    FireAndForgetResolver b;
    ObjectMapper c;

    public PlayedStateService() {
        super("PlayedStateService");
    }

    @Override // dagger.android.f, android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e b2 = this.a.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.c = b2.build();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("PlayedStateService.action.PLAYED".equals(action)) {
            try {
                this.b.resolve(new Request(intent.getBooleanExtra("played", false) ? Request.DELETE : Request.POST, "sp://core-collection/unstable/unplayed", new HashMap(), this.c.writeValueAsString(new UpdateModel(intent.getStringArrayExtra("uris"))).getBytes(Charsets.UTF_8)));
            } catch (JsonProcessingException e) {
                Logger.e(e, "Failed to serialize update model request.", new Object[0]);
                throw new AssertionError(e);
            }
        } else {
            throw new IllegalArgumentException(je.y0("Unsupported action ", action, " in PlayedStateService."));
        }
    }
}
