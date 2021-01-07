package com.spotify.share.cleanup;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.d;
import androidx.work.impl.l;
import androidx.work.k;
import androidx.work.q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final Context a;

    public b(Context context) {
        h.e(context, "mContext");
        this.a = context;
    }

    @Override // com.spotify.share.cleanup.a
    public void a(List<String> list, List<String> list2) {
        h.e(list, "filesToDelete");
        h.e(list2, "urisToRevoke");
        d.a aVar = new d.a();
        Object[] array = list2.toArray(new String[0]);
        if (array != null) {
            aVar.h("uris_to_revoke", (String[]) array);
            Object[] array2 = list.toArray(new String[0]);
            if (array2 != null) {
                aVar.h("file_names_to_delete", (String[]) array2);
                d a2 = aVar.a();
                h.d(a2, "Data.Builder()\n         …   )\n            .build()");
                q b = ((k.a) ((k.a) ((k.a) ((k.a) new k.a(SharedFilesCleanWorker.class).g(10, TimeUnit.MINUTES)).e(BackoffPolicy.EXPONENTIAL, 1, TimeUnit.HOURS)).h(a2)).a("SharedFilesCleanerWorker")).b();
                h.d(b, "OneTimeWorkRequest.Build…\n                .build()");
                l.k(this.a).b((k) b);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
