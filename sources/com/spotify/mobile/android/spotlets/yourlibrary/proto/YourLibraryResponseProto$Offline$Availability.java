package com.spotify.mobile.android.spotlets.yourlibrary.proto;

import com.google.protobuf.o;

public enum YourLibraryResponseProto$Offline$Availability implements o.c {
    UNKNOWN(0),
    NO(1),
    YES(2),
    DOWNLOADING(3),
    WAITING(4),
    UNRECOGNIZED(-1);
    
    private final int value;

    private YourLibraryResponseProto$Offline$Availability(int i) {
        this.value = i;
    }

    public static YourLibraryResponseProto$Offline$Availability d(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO;
        }
        if (i == 2) {
            return YES;
        }
        if (i == 3) {
            return DOWNLOADING;
        }
        if (i != 4) {
            return null;
        }
        return WAITING;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
