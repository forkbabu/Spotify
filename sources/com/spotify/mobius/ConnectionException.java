package com.spotify.mobius;

public class ConnectionException extends RuntimeException {
    private final Object effect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectionException(Object obj, Throwable th) {
        super(obj.toString(), th);
        obj.getClass();
        this.effect = obj;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionException)) {
            return false;
        }
        return this.effect.equals(((ConnectionException) obj).effect);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.effect.hashCode();
    }
}
