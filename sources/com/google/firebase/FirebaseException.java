package com.google.firebase;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;

public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@RecentlyNonNull String str) {
        super(str);
        g.h(str, "Detail message must not be empty");
    }
}
