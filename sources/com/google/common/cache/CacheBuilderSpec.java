package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class CacheBuilderSpec {

    static class AccessDurationParser extends DurationParser {
        AccessDurationParser() {
        }
    }

    static class ConcurrencyLevelParser extends IntegerParser {
        ConcurrencyLevelParser() {
        }
    }

    static abstract class DurationParser {
        DurationParser() {
        }
    }

    static class InitialCapacityParser extends IntegerParser {
        InitialCapacityParser() {
        }
    }

    static abstract class IntegerParser {
        IntegerParser() {
        }
    }

    static class KeyStrengthParser {
        public KeyStrengthParser(LocalCache.Strength strength) {
        }
    }

    static abstract class LongParser {
        LongParser() {
        }
    }

    static class MaximumSizeParser extends LongParser {
        MaximumSizeParser() {
        }
    }

    static class MaximumWeightParser extends LongParser {
        MaximumWeightParser() {
        }
    }

    static class RecordStatsParser {
        RecordStatsParser() {
        }
    }

    static class RefreshDurationParser extends DurationParser {
        RefreshDurationParser() {
        }
    }

    static class ValueStrengthParser {
        public ValueStrengthParser(LocalCache.Strength strength) {
        }
    }

    static class WriteDurationParser extends DurationParser {
        WriteDurationParser() {
        }
    }

    static {
        Splitter.on(',').trimResults();
        Splitter.on('=').trimResults();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("initialCapacity", new InitialCapacityParser());
        builder.mo51put("maximumSize", new MaximumSizeParser());
        builder.mo51put("maximumWeight", new MaximumWeightParser());
        builder.mo51put("concurrencyLevel", new ConcurrencyLevelParser());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        builder.mo51put("weakKeys", new KeyStrengthParser(strength));
        builder.mo51put("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT));
        builder.mo51put("weakValues", new ValueStrengthParser(strength));
        builder.mo51put("recordStats", new RecordStatsParser());
        builder.mo51put("expireAfterAccess", new AccessDurationParser());
        builder.mo51put("expireAfterWrite", new WriteDurationParser());
        builder.mo51put("refreshAfterWrite", new RefreshDurationParser());
        builder.mo51put("refreshInterval", new RefreshDurationParser());
        builder.build();
    }

    private static Long durationInNanos(long j, TimeUnit timeUnit) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        ((CacheBuilderSpec) obj).getClass();
        if (!rw.equal(null, null) || !rw.equal(null, null) || !rw.equal(null, null) || !rw.equal(null, null) || !rw.equal(null, null) || !rw.equal(null, null) || !rw.equal(null, null) || !rw.equal(durationInNanos(0, null), durationInNanos(0, null)) || !rw.equal(durationInNanos(0, null), durationInNanos(0, null)) || !rw.equal(durationInNanos(0, null), durationInNanos(0, null))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, durationInNanos(0, null), durationInNanos(0, null), durationInNanos(0, null)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.addValue(null);
        return stringHelper.toString();
    }
}
