package com.spotify.superbird.earcon;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.f;

public enum EarconType {
    CONFIRMATION(C0707R.raw.voice_earcon_confirmation, "confirmation"),
    LISTENING(C0707R.raw.voice_earcon_listening, "listening"),
    ERROR(C0707R.raw.voice_earcon_error, AppProtocol.LogMessage.SEVERITY_ERROR);
    
    public static final a n = new a(null);
    private final String alias;
    private final int rawRes;

    public static final class a {
        public a(f fVar) {
        }
    }

    private EarconType(int i, String str) {
        this.rawRes = i;
        this.alias = str;
    }

    public final String d() {
        return this.alias;
    }

    public final int g() {
        return this.rawRes;
    }
}
