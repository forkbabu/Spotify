package io.netty.util;

import java.util.Arrays;

@Deprecated
public class ResourceLeakException extends RuntimeException {
    private static final long serialVersionUID = 7186453858343358280L;
    private final StackTraceElement[] cachedStackTrace = getStackTrace();

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof ResourceLeakException)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(this.cachedStackTrace, ((ResourceLeakException) obj).cachedStackTrace);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 0;
        for (StackTraceElement stackTraceElement : this.cachedStackTrace) {
            i = (i * 31) + stackTraceElement.hashCode();
        }
        return i;
    }
}
