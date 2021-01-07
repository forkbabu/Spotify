package com.spotify.music.navigation;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;

public abstract class y {
    public static final s a = new b(null);

    private static class b implements s {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.ui.fragments.s
        public String D0(Context context) {
            throw new UnsupportedOperationException();
        }

        @Override // com.spotify.mobile.android.ui.fragments.s
        public Fragment e() {
            throw new UnsupportedOperationException();
        }

        @Override // com.spotify.mobile.android.ui.fragments.s
        public String i0() {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.ij9.b
        public ij9 u0() {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.ifd.b
        public ifd z1() {
            throw new UnsupportedOperationException();
        }
    }

    public abstract s a(String str, String str2, SessionState sessionState, boolean z);
}
