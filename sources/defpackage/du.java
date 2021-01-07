package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: du  reason: default package */
public class du extends Handler {
    public du(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    public du(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
