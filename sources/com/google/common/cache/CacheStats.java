package com.google.common.cache;

import com.google.common.base.MoreObjects;
import java.util.Arrays;

public final class CacheStats {
    private final long evictionCount;
    private final long hitCount;
    private final long loadExceptionCount;
    private final long loadSuccessCount;
    private final long missCount;
    private final long totalLoadTime;

    public CacheStats(long j, long j2, long j3, long j4, long j5, long j6) {
        boolean z = true;
        MoreObjects.checkArgument(j >= 0);
        MoreObjects.checkArgument(j2 >= 0);
        MoreObjects.checkArgument(j3 >= 0);
        MoreObjects.checkArgument(j4 >= 0);
        MoreObjects.checkArgument(j5 >= 0);
        MoreObjects.checkArgument(j6 < 0 ? false : z);
        this.hitCount = j;
        this.missCount = j2;
        this.loadSuccessCount = j3;
        this.loadExceptionCount = j4;
        this.totalLoadTime = j5;
        this.evictionCount = j6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) obj;
        if (this.hitCount == cacheStats.hitCount && this.missCount == cacheStats.missCount && this.loadSuccessCount == cacheStats.loadSuccessCount && this.loadExceptionCount == cacheStats.loadExceptionCount && this.totalLoadTime == cacheStats.totalLoadTime && this.evictionCount == cacheStats.evictionCount) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.hitCount), Long.valueOf(this.missCount), Long.valueOf(this.loadSuccessCount), Long.valueOf(this.loadExceptionCount), Long.valueOf(this.totalLoadTime), Long.valueOf(this.evictionCount)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("hitCount", this.hitCount);
        stringHelper.add("missCount", this.missCount);
        stringHelper.add("loadSuccessCount", this.loadSuccessCount);
        stringHelper.add("loadExceptionCount", this.loadExceptionCount);
        stringHelper.add("totalLoadTime", this.totalLoadTime);
        stringHelper.add("evictionCount", this.evictionCount);
        return stringHelper.toString();
    }
}
