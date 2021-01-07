package io.branch.referral;

import android.os.AsyncTask;
import android.os.Build;

public abstract class e<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public AsyncTask<Params, Progress, Result> a(Params... paramsArr) {
        int i = Build.VERSION.SDK_INT;
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (Throwable unused) {
            return execute(paramsArr);
        }
    }
}
