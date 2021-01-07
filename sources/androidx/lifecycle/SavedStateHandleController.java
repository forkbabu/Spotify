package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class SavedStateHandleController implements l {
    private final String a;
    private boolean b = false;
    private final a0 c;

    /* access modifiers changed from: package-private */
    public static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(b bVar) {
            if (bVar instanceof i0) {
                h0 Z = ((i0) bVar).Z();
                SavedStateRegistry g0 = bVar.g0();
                Iterator it = ((HashSet) Z.c()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.a(Z.b((String) it.next()), g0, bVar.A());
                }
                if (!((HashSet) Z.c()).isEmpty()) {
                    g0.e(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, a0 a0Var) {
        this.a = str;
        this.c = a0Var;
    }

    static void a(e0 e0Var, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) e0Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.b) {
            savedStateHandleController.b(savedStateRegistry, lifecycle);
            e(savedStateRegistry, lifecycle);
        }
    }

    static SavedStateHandleController c(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        a0 a0Var;
        Bundle a2 = savedStateRegistry.a(str);
        int i = a0.e;
        if (a2 == null && bundle == null) {
            a0Var = new a0();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a2 == null) {
                a0Var = new a0(hashMap);
            } else {
                ArrayList parcelableArrayList = a2.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a2.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    hashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
                }
                a0Var = new a0(hashMap);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a0Var);
        savedStateHandleController.b(savedStateRegistry, lifecycle);
        e(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    private static void e(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        Lifecycle.State b2 = lifecycle.b();
        if (b2 != Lifecycle.State.INITIALIZED) {
            if (!(b2.compareTo(Lifecycle.State.STARTED) >= 0)) {
                lifecycle.a(new l() {
                    /* class androidx.lifecycle.SavedStateHandleController.AnonymousClass1 */

                    @Override // androidx.lifecycle.l
                    public void p(n nVar, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_START) {
                            lifecycle.c(this);
                            savedStateRegistry.e(a.class);
                        }
                    }
                });
                return;
            }
        }
        savedStateRegistry.e(a.class);
    }

    /* access modifiers changed from: package-private */
    public void b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        if (!this.b) {
            this.b = true;
            lifecycle.a(this);
            savedStateRegistry.d(this.a, this.c.d());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    public a0 d() {
        return this.c;
    }

    @Override // androidx.lifecycle.l
    public void p(n nVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.b = false;
            nVar.A().c(this);
        }
    }
}
