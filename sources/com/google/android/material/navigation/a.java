package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewTreeObserver;

class a implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ NavigationView a;

    a(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.a;
        navigationView.getLocationOnScreen(NavigationView.b(navigationView));
        boolean z = true;
        boolean z2 = NavigationView.b(this.a)[1] == 0;
        NavigationView.c(this.a).w(z2);
        this.a.setDrawTopInsetForeground(z2);
        Context context = this.a.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null && Build.VERSION.SDK_INT >= 21) {
            boolean z3 = activity.findViewById(16908290).getHeight() == this.a.getHeight();
            boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView2 = this.a;
            if (!z3 || !z4) {
                z = false;
            }
            navigationView2.setDrawBottomInsetForeground(z);
        }
    }
}
