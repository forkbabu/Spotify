package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.c;
import com.google.android.gms.common.api.Status;

/* renamed from: ts  reason: default package */
public final class ts implements c {
    private final Status a;
    private final Credential b;

    public ts(Status status, Credential credential) {
        this.a = status;
        this.b = credential;
    }

    @Override // com.google.android.gms.common.api.i
    public final Status h() {
        return this.a;
    }

    @Override // com.google.android.gms.auth.api.credentials.c
    public final Credential h1() {
        return this.b;
    }
}
