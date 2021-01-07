package com.spotify.music.features.yourlibraryx;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.yourlibraryx.search.YourLibraryXSearchFragment;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

public final class a implements blb {
    private final wbb a;

    /* renamed from: com.spotify.music.features.yourlibraryx.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    static final class C0265a implements k {
        public static final C0265a b = new C0265a(0);
        public static final C0265a c = new C0265a(1);
        public final /* synthetic */ int a;

        public C0265a(int i) {
            this.a = i;
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            int i = this.a;
            if (i == 0) {
                String currentUser = sessionState.currentUser();
                h.d(currentUser, "sessionState.currentUser()");
                h.e(currentUser, "username");
                YourLibraryXFragment yourLibraryXFragment = new YourLibraryXFragment();
                Bundle bundle = new Bundle();
                bundle.putString("username", currentUser);
                yourLibraryXFragment.r4(bundle);
                return yourLibraryXFragment;
            } else if (i == 1) {
                String currentUser2 = sessionState.currentUser();
                h.d(currentUser2, "sessionState.currentUser()");
                h.e(currentUser2, "username");
                YourLibraryXSearchFragment yourLibraryXSearchFragment = new YourLibraryXSearchFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("username", currentUser2);
                yourLibraryXSearchFragment.r4(bundle2);
                return yourLibraryXSearchFragment;
            } else {
                throw null;
            }
        }
    }

    public a(wbb wbb) {
        h.e(wbb, "yourLibraryXFlags");
        this.a = wbb;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a.g()) {
            xkb xkb = (xkb) glb;
            xkb.i(LinkType.COLLECTION_ROOT, "Collection root: Your Library", C0265a.b);
            xkb.i(LinkType.COLLECTION_SEARCH, "Collection Search: Your Library", C0265a.c);
        }
    }
}
