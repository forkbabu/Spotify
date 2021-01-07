package com.spotify.music.feedback.service;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import dagger.android.f;
import io.reactivex.a;
import java.util.concurrent.TimeUnit;

public class FeedbackService extends f {
    rh9 a;

    public FeedbackService() {
        super("FeedbackService");
    }

    private static void a(a aVar) {
        if (!aVar.j(3000, TimeUnit.MILLISECONDS)) {
            Logger.d("Failed to send feedback", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.entity_uri");
            String stringExtra2 = intent.getStringExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.context_uri");
            String stringExtra3 = intent.getStringExtra("com.spotify.music.feedback.service.FEEDBACK_SERVICE.intent_keys.feature_identifier");
            if (action != null) {
                action.hashCode();
                char c = 65535;
                switch (action.hashCode()) {
                    case 494597013:
                        if (action.equals("com.spotify.music.feedback.service.DISLIKE_ENTITY")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 685353299:
                        if (action.equals("com.spotify.music.feedback.service.LIKE_ENTITY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1591694377:
                        if (action.equals("com.spotify.music.feedback.service.REMOVE_FEEEDBACK")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        a(this.a.a(stringExtra, stringExtra2, stringExtra, stringExtra3, "local"));
                        return;
                    case 1:
                        a(this.a.b(stringExtra, stringExtra2, stringExtra, ViewUris.d0.toString(), stringExtra3));
                        return;
                    case 2:
                        a(this.a.c(stringExtra, stringExtra2, stringExtra, stringExtra3));
                        return;
                    default:
                        je.p("FeedbackService can't resolve the action : ", action);
                        return;
                }
            }
        }
    }
}
