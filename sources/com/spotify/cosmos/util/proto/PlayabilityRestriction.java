package com.spotify.cosmos.util.proto;

import com.google.protobuf.o;

public enum PlayabilityRestriction implements o.c {
    UNKNOWN(0),
    NO_RESTRICTION(1),
    EXPLICIT_CONTENT(2),
    AGE_RESTRICTED(3),
    NOT_IN_CATALOGUE(4),
    NOT_AVAILABLE_OFFLINE(5);
    
    public static final int AGE_RESTRICTED_VALUE = 3;
    public static final int EXPLICIT_CONTENT_VALUE = 2;
    public static final int NOT_AVAILABLE_OFFLINE_VALUE = 5;
    public static final int NOT_IN_CATALOGUE_VALUE = 4;
    public static final int NO_RESTRICTION_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final o.d<PlayabilityRestriction> internalValueMap = new o.d<PlayabilityRestriction>() {
        /* class com.spotify.cosmos.util.proto.PlayabilityRestriction.AnonymousClass1 */

        public PlayabilityRestriction findValueByNumber(int i) {
            return PlayabilityRestriction.forNumber(i);
        }
    };
    private final int value;

    private PlayabilityRestriction(int i) {
        this.value = i;
    }

    public static PlayabilityRestriction forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO_RESTRICTION;
        }
        if (i == 2) {
            return EXPLICIT_CONTENT;
        }
        if (i == 3) {
            return AGE_RESTRICTED;
        }
        if (i == 4) {
            return NOT_IN_CATALOGUE;
        }
        if (i != 5) {
            return null;
        }
        return NOT_AVAILABLE_OFFLINE;
    }

    public static o.d<PlayabilityRestriction> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static PlayabilityRestriction valueOf(int i) {
        return forNumber(i);
    }
}
