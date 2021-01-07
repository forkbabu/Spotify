package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import android.content.IntentFilter;

public abstract class RegisterableCardReceiver extends p60 {
    Context a;
    IntentFilter b;
    private boolean c;

    private enum CardContentProviderActions {
        UPDATE("com.samsung.android.app.spage.action.CARD_UPDATE"),
        INSTANT_UPDATE("com.samsung.android.app.spage.action.CARD_INSTANT_UPDATE"),
        EVENT("com.samsung.android.app.spage.action.CARD_EVENT"),
        ENABLED("com.samsung.android.app.spage.action.CARD_ENABLED"),
        DISABLED("com.samsung.android.app.spage.action.CARD_DISABLED");
        
        private final String mValue;

        private CardContentProviderActions(String str) {
            this.mValue = str;
        }

        public String d() {
            return this.mValue;
        }
    }

    public RegisterableCardReceiver(Context context) {
        this.a = context;
        IntentFilter intentFilter = new IntentFilter();
        this.b = intentFilter;
        intentFilter.addAction(CardContentProviderActions.UPDATE.d());
        this.b.addAction(CardContentProviderActions.INSTANT_UPDATE.d());
        this.b.addAction(CardContentProviderActions.EVENT.d());
        this.b.addAction(CardContentProviderActions.ENABLED.d());
        this.b.addAction(CardContentProviderActions.DISABLED.d());
    }

    public void e() {
        this.a.registerReceiver(this, this.b);
        this.c = true;
    }

    public void f() {
        if (this.c) {
            this.a.unregisterReceiver(this);
            this.c = false;
        }
    }
}
