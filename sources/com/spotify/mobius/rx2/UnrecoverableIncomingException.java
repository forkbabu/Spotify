package com.spotify.mobius.rx2;

import java.util.Arrays;

public class UnrecoverableIncomingException extends RuntimeException {
    public UnrecoverableIncomingException(Throwable th) {
        super("PROGRAMMER ERROR: Mobius cannot recover from this exception; ensure your event sources don't invoke onError", th);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof UnrecoverableIncomingException)) {
            return false;
        }
        UnrecoverableIncomingException unrecoverableIncomingException = (UnrecoverableIncomingException) obj;
        if (obj == this || ((getCause() == null && unrecoverableIncomingException.getCause() == null) || getCause().equals(unrecoverableIncomingException.getCause()))) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{getCause()});
    }
}
