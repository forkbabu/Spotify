package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class p extends c {
    final /* synthetic */ Socket k;

    p(Socket socket) {
        this.k = socket;
    }

    /* access modifiers changed from: protected */
    @Override // okio.c
    public IOException m(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    @Override // okio.c
    public void n() {
        try {
            this.k.close();
        } catch (Exception e) {
            Logger logger = o.a;
            Level level = Level.WARNING;
            StringBuilder V0 = je.V0("Failed to close timed out socket ");
            V0.append(this.k);
            logger.log(level, V0.toString(), (Throwable) e);
        } catch (AssertionError e2) {
            if (o.e(e2)) {
                Logger logger2 = o.a;
                Level level2 = Level.WARNING;
                StringBuilder V02 = je.V0("Failed to close timed out socket ");
                V02.append(this.k);
                logger2.log(level2, V02.toString(), (Throwable) e2);
                return;
            }
            throw e2;
        }
    }
}
