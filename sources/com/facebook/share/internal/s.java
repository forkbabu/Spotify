package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.i;
import com.facebook.internal.a;

public abstract class s {
    private i a;

    public s(i iVar) {
        this.a = iVar;
    }

    public abstract void a(a aVar);

    public abstract void b(a aVar, FacebookException facebookException);

    public abstract void c(a aVar, Bundle bundle);
}
