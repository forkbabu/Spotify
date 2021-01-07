package com.spotify.share.cleanup;

import android.content.Context;
import android.net.Uri;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.share.util.i;
import com.spotify.share.util.o;
import com.spotify.workmanager.DaggerWorker;
import com.spotify.workmanager.a;
import java.io.File;

public class SharedFilesCleanWorker extends DaggerWorker {
    o o;
    i p;
    ColdStartTracker q;

    public SharedFilesCleanWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // com.spotify.workmanager.DaggerWorker, androidx.work.Worker
    public ListenableWorker.a p() {
        a.a(this);
        new ListenableWorker.a.c();
        this.q.o(getClass().getSimpleName());
        String[] f = e().f("file_names_to_delete");
        String[] f2 = e().f("uris_to_revoke");
        if (f2 != null) {
            for (String str : f2) {
                this.p.a(Uri.parse(str), 1);
            }
        }
        if (f != null) {
            for (String str2 : f) {
                this.o.getClass();
                File file = new File(str2);
                if (file.exists() && !file.delete()) {
                    return new ListenableWorker.a.b();
                }
            }
        }
        return new ListenableWorker.a.c();
    }
}
