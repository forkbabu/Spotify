package com.spotify.mobius.rx2;

public class UnknownEffectException extends RuntimeException {
    private final Object effect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnknownEffectException(Object obj) {
        super(obj.toString());
        obj.getClass();
        this.effect = obj;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownEffectException)) {
            return false;
        }
        return this.effect.equals(((UnknownEffectException) obj).effect);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.effect.hashCode();
    }
}
