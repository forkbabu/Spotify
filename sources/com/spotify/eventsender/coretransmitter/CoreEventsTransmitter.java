package com.spotify.eventsender.coretransmitter;

import androidx.annotation.Keep;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

@Keep
public class CoreEventsTransmitter {
    private static final String NON_AUTH_SUFFIX = "NonAuth";
    private final hl0 mEventPublisher;

    public CoreEventsTransmitter(hl0 hl0) {
        this.mEventPublisher = hl0;
    }

    public native void registerSdk();

    public void send(byte[] bArr, byte[] bArr2) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (str.endsWith(NON_AUTH_SUFFIX)) {
            this.mEventPublisher.a(str, bArr2);
        } else {
            this.mEventPublisher.b(str, bArr2);
        }
    }
}
