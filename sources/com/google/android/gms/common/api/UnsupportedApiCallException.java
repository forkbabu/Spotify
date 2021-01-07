package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.c;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final c zza;

    public UnsupportedApiCallException(@RecentlyNonNull c cVar) {
        this.zza = cVar;
    }

    @Override // java.lang.Throwable
    @RecentlyNonNull
    public final String getMessage() {
        String valueOf = String.valueOf(this.zza);
        return je.i0(valueOf.length() + 8, "Missing ", valueOf);
    }
}
