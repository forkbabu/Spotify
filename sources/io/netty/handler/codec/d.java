package io.netty.handler.codec;

import com.spotify.voiceassistant.player.models.SearchResponse;
import io.netty.util.Signal;

public class d {
    protected static final Signal b;
    protected static final Signal c;
    public static final d d;
    private final Throwable a;

    static {
        Signal d2 = Signal.d(d.class, "UNFINISHED");
        b = d2;
        Signal d3 = Signal.d(d.class, SearchResponse.RESULT_SUCCESS);
        c = d3;
        if (d2 != null) {
            d = new d(d3);
            return;
        }
        throw new NullPointerException("cause");
    }

    protected d(Throwable th) {
        if (th != null) {
            this.a = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    public static d a(Throwable th) {
        if (th != null) {
            return new d(th);
        }
        throw new NullPointerException("cause");
    }

    public String toString() {
        Throwable th = this.a;
        Signal signal = b;
        boolean z = true;
        if (!(th != signal)) {
            return "unfinished";
        }
        Signal signal2 = c;
        if (th == signal2) {
            return "success";
        }
        if (th == signal2 || th == signal) {
            z = false;
        }
        if (!z) {
            th = null;
        }
        String th2 = th.toString();
        StringBuilder sb = new StringBuilder(th2.length() + 17);
        sb.append("failure(");
        sb.append(th2);
        sb.append(')');
        return sb.toString();
    }
}
