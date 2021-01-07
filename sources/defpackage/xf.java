package defpackage;

import com.facebook.m;
import com.facebook.q;
import java.util.ArrayList;
import org.json.JSONException;

/* access modifiers changed from: package-private */
/* renamed from: xf  reason: default package */
public final class xf implements m.c {
    final /* synthetic */ ArrayList a;

    xf(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.facebook.m.c
    public void b(q qVar) {
        try {
            if (qVar.e() == null && qVar.f().getBoolean("success")) {
                for (int i = 0; this.a.size() > i; i++) {
                    ((vf) this.a.get(i)).a();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
