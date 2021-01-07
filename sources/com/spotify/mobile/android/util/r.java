package com.spotify.mobile.android.util;

import android.content.Intent;
import android.os.AsyncTask;
import com.spotify.android.storage.e;
import com.spotify.music.storage.j;
import java.io.IOException;

public class r extends AsyncTask<Void, Integer, Long[]> {
    private final j a;
    private final e6 b;

    public r(e6 e6Var, j jVar) {
        this.b = e6Var;
        this.a = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Long[] doInBackground(Void[] voidArr) {
        Long[] lArr = new Long[2];
        try {
            String i = this.a.i();
            if (i != null) {
                lArr[0] = Long.valueOf(new e(i).a());
            } else {
                lArr[0] = Long.MAX_VALUE;
            }
        } catch (IOException unused) {
            lArr[0] = Long.MAX_VALUE;
        }
        try {
            String b2 = this.a.b();
            if (b2 != null) {
                lArr[1] = Long.valueOf(new e(b2).a());
            } else {
                lArr[1] = Long.MAX_VALUE;
            }
        } catch (IOException unused2) {
            lArr[1] = Long.MAX_VALUE;
        }
        return lArr;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Long[] lArr) {
        Long[] lArr2 = lArr;
        if (lArr2[0].longValue() < 2097152) {
            this.b.d(new Intent("check_storage.settings_low.error"));
        } else if (lArr2[1].longValue() < 52428800) {
            this.b.d(new Intent("check_storage.cache_low.error"));
        } else {
            this.b.d(new Intent("check_storage.diskspace.ok"));
        }
    }
}
