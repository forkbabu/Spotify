package com.spotify.android.glue.patterns.prettylist.compat;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.prettylist.i;
import com.spotify.android.glue.patterns.prettylist.k;
import com.spotify.android.glue.patterns.prettylist.n;

/* access modifiers changed from: package-private */
public class a implements n {
    @Override // com.spotify.android.glue.patterns.prettylist.n
    public k a(Fragment fragment, View view) {
        return b.e(fragment, view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.n
    public i b(Fragment fragment) {
        return b.h(fragment);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.n
    public k c(Fragment fragment) {
        return b.g(fragment);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.n
    public i d(Fragment fragment, View view) {
        return b.f(fragment, view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.n
    public i e(Fragment fragment, View view) {
        return b.a(fragment, view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.n
    public k f(Fragment fragment, View view) {
        return b.d(fragment, view);
    }
}
