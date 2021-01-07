package com.spotify.mobile.android.video.exo;

public class NoSuitableRepresentationException extends Exception {
    private static final long serialVersionUID = 98547385920L;
    public final int mReason;

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NoSuitableRepresentationException) && this.mReason == ((NoSuitableRepresentationException) obj).mReason;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.mReason;
    }
}
