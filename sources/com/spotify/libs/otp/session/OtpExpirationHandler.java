package com.spotify.libs.otp.session;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.google.common.base.MoreObjects;

public class OtpExpirationHandler extends Handler {
    private final a a;
    private long b;
    private long c;

    /* access modifiers changed from: package-private */
    public enum MessageType {
        EXPIRATION_UPDATE,
        EXPIRED;
        
        static final MessageType[] c = values();
    }

    public interface a {
    }

    public OtpExpirationHandler(a aVar) {
        this.a = aVar;
    }

    public void a() {
        MessageType messageType = MessageType.EXPIRATION_UPDATE;
        removeMessages(0);
        MessageType messageType2 = MessageType.EXPIRED;
        removeMessages(1);
        this.c = 0;
        this.b = 0;
    }

    public void b(long j, long j2) {
        MoreObjects.checkState(j2 >= j);
        if (j2 <= j) {
            ((d) this.a).n();
            return;
        }
        a();
        this.b = j;
        this.c = j2;
        MessageType messageType = MessageType.EXPIRED;
        sendEmptyMessageAtTime(1, j2);
        MessageType messageType2 = MessageType.EXPIRATION_UPDATE;
        sendEmptyMessageDelayed(0, 1000);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int ordinal = MessageType.c[message.what].ordinal();
        if (ordinal == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.c;
            long j2 = j - uptimeMillis;
            if (j2 <= 0) {
                a();
                ((d) this.a).n();
                return;
            }
            ((d) this.a).s(((float) j2) / ((float) (j - this.b)));
            MessageType messageType = MessageType.EXPIRATION_UPDATE;
            sendEmptyMessageDelayed(0, 1000);
        } else if (ordinal == 1) {
            a();
            ((d) this.a).n();
        }
    }
}
