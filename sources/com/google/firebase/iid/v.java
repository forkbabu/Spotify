package com.google.firebase.iid;

import android.content.Intent;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.ExecutorService;

class v implements a {
    private final ExecutorService a;

    v(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // com.google.firebase.iid.a
    public g<Integer> a(Intent intent) {
        return j.c(this.a, new u(intent));
    }
}
