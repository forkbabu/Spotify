package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.i;
import java.util.concurrent.TimeUnit;

public abstract class e<R extends i> {

    public interface a {
        void a(@RecentlyNonNull Status status);
    }

    public abstract void b(@RecentlyNonNull a aVar);

    public abstract R c(long j, @RecentlyNonNull TimeUnit timeUnit);

    public abstract void d();

    public abstract void e(@RecentlyNonNull j<? super R> jVar);
}
