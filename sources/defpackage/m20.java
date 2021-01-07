package defpackage;

import com.google.gson.j;
import com.google.gson.stream.a;
import com.google.gson.stream.b;
import com.google.gson.w;
import defpackage.n20;
import java.lang.reflect.Field;

/* renamed from: m20  reason: default package */
class m20 extends n20.b {
    final /* synthetic */ Field d;
    final /* synthetic */ boolean e;
    final /* synthetic */ w f;
    final /* synthetic */ j g;
    final /* synthetic */ z20 h;
    final /* synthetic */ boolean i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m20(n20 n20, String str, boolean z, boolean z2, Field field, boolean z3, w wVar, j jVar, z20 z20, boolean z4) {
        super(str, z, z2);
        this.d = field;
        this.e = z3;
        this.f = wVar;
        this.g = jVar;
        this.h = z20;
        this.i = z4;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.n20.b
    public void a(a aVar, Object obj) {
        Object read = this.f.read(aVar);
        if (read != null || !this.i) {
            this.d.set(obj, read);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.n20.b
    public void b(b bVar, Object obj) {
        w wVar;
        Object obj2 = this.d.get(obj);
        if (this.e) {
            wVar = this.f;
        } else {
            wVar = new r20(this.g, this.f, this.h.d());
        }
        wVar.write(bVar, obj2);
    }

    @Override // defpackage.n20.b
    public boolean c(Object obj) {
        if (this.b && this.d.get(obj) != obj) {
            return true;
        }
        return false;
    }
}
