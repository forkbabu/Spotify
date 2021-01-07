package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;

class i implements Runnable {
    final /* synthetic */ BaseTransientBottomBar.f a;

    i(BaseTransientBottomBar.f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        BaseTransientBottomBar.this.v(3);
    }
}
