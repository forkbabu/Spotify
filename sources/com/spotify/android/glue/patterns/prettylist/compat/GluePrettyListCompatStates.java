package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.paste.widgets.a;

/* access modifiers changed from: package-private */
public enum GluePrettyListCompatStates {
    PRETTY_LIST_VIEW {
        @Override // com.spotify.android.glue.patterns.prettylist.compat.GluePrettyListCompatStates
        public <T extends j> c<T> d(e eVar, Context context, Fragment fragment, u uVar, n nVar) {
            a aVar = eVar.i;
            int i = eVar.b;
            if (aVar != null) {
                return new n(eVar, context, fragment, aVar, nVar);
            }
            if (i == 1) {
                return new q(eVar, context, fragment, nVar);
            }
            if (i != 2) {
                return new t(eVar, context, fragment, nVar);
            }
            throw new UnsupportedOperationException("Not implemented");
        }
    },
    PRETTY_RECYCLER_VIEW {
        @Override // com.spotify.android.glue.patterns.prettylist.compat.GluePrettyListCompatStates
        public <T extends j> c<T> d(e eVar, Context context, Fragment fragment, u uVar, n nVar) {
            a aVar = eVar.i;
            int i = eVar.b;
            if (aVar != null) {
                return new y(eVar, context, fragment, aVar, nVar);
            }
            if (i == 1) {
                return new c0(eVar, context, fragment, nVar);
            }
            if (i != 2) {
                return new f0(eVar, context, fragment, nVar);
            }
            throw new UnsupportedOperationException("Not implemented");
        }
    };

    GluePrettyListCompatStates(AnonymousClass1 r3) {
    }

    public abstract <T extends j> c<T> d(e eVar, Context context, Fragment fragment, u uVar, n nVar);
}
