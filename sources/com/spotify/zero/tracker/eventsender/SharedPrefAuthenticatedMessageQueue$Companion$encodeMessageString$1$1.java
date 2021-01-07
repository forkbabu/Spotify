package com.spotify.zero.tracker.eventsender;

import android.util.Base64;
import com.spotify.messages.ZeroFrictionAuthentication;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class SharedPrefAuthenticatedMessageQueue$Companion$encodeMessageString$1$1 extends Lambda implements nmf<ZeroFrictionAuthentication, CharSequence> {
    public static final SharedPrefAuthenticatedMessageQueue$Companion$encodeMessageString$1$1 a = new SharedPrefAuthenticatedMessageQueue$Companion$encodeMessageString$1$1();

    SharedPrefAuthenticatedMessageQueue$Companion$encodeMessageString$1$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public CharSequence invoke(ZeroFrictionAuthentication zeroFrictionAuthentication) {
        ZeroFrictionAuthentication zeroFrictionAuthentication2 = zeroFrictionAuthentication;
        h.e(zeroFrictionAuthentication2, "it");
        String encodeToString = Base64.encodeToString(zeroFrictionAuthentication2.toByteArray(), 0);
        h.d(encodeToString, "Base64.encodeToString(\n …                        )");
        return encodeToString;
    }
}
