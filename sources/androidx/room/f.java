package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class f {
    final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    private final RoomDatabase b;

    f(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }

    /* access modifiers changed from: package-private */
    public <T> LiveData<T> a(String[] strArr, boolean z, Callable<T> callable) {
        return new k(this.b, this, z, callable, strArr);
    }
}
