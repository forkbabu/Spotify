package okhttp3.internal.connection;

import java.io.IOException;

public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public void a(IOException iOException) {
        rnf.a(this.firstException, iOException);
        this.lastException = iOException;
    }

    public IOException b() {
        return this.firstException;
    }

    public IOException c() {
        return this.lastException;
    }
}
