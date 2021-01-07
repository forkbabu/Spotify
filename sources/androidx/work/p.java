package androidx.work;

import java.util.Collections;
import java.util.List;

public abstract class p {
    protected p() {
    }

    public abstract l a(String str);

    public final l b(q qVar) {
        return c(Collections.singletonList(qVar));
    }

    public abstract l c(List<? extends q> list);

    public abstract l d(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, m mVar);

    public l e(String str, ExistingWorkPolicy existingWorkPolicy, k kVar) {
        return f(str, existingWorkPolicy, Collections.singletonList(kVar));
    }

    public abstract l f(String str, ExistingWorkPolicy existingWorkPolicy, List<k> list);
}
