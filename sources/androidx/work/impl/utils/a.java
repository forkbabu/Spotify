package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.c;
import androidx.work.impl.e;
import androidx.work.impl.f;
import androidx.work.impl.l;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

public abstract class a implements Runnable {
    private final c a = new c();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a$a  reason: collision with other inner class name */
    public class C0053a extends a {
        final /* synthetic */ l b;
        final /* synthetic */ UUID c;

        C0053a(l lVar, UUID uuid) {
            this.b = lVar;
            this.c = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a
        public void e() {
            WorkDatabase o = this.b.o();
            o.c();
            try {
                a(this.b, this.c.toString());
                o.s();
                o.h();
                l lVar = this.b;
                f.b(lVar.i(), lVar.o(), lVar.n());
            } catch (Throwable th) {
                o.h();
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends a {
        final /* synthetic */ l b;
        final /* synthetic */ String c;
        final /* synthetic */ boolean f;

        b(l lVar, String str, boolean z) {
            this.b = lVar;
            this.c = str;
            this.f = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.a
        public void e() {
            WorkDatabase o = this.b.o();
            o.c();
            try {
                Iterator it = ((ArrayList) ((ia) o.z()).o(this.c)).iterator();
                while (it.hasNext()) {
                    a(this.b, (String) it.next());
                }
                o.s();
                o.h();
                if (this.f) {
                    l lVar = this.b;
                    f.b(lVar.i(), lVar.o(), lVar.n());
                }
            } catch (Throwable th) {
                o.h();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, l lVar) {
        return new C0053a(lVar, uuid);
    }

    public static a c(String str, l lVar, boolean z) {
        return new b(lVar, str, z);
    }

    /* access modifiers changed from: package-private */
    public void a(l lVar, String str) {
        WorkDatabase o = lVar.o();
        ha z = o.z();
        s9 t = o.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            ia iaVar = (ia) z;
            WorkInfo.State n = iaVar.n(str2);
            if (!(n == WorkInfo.State.SUCCEEDED || n == WorkInfo.State.FAILED)) {
                iaVar.z(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(((t9) t).a(str2));
        }
        lVar.m().j(str);
        for (e eVar : lVar.n()) {
            eVar.a(str);
        }
    }

    public androidx.work.l d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public abstract void e();

    @Override // java.lang.Runnable
    public void run() {
        try {
            e();
            this.a.a(androidx.work.l.a);
        } catch (Throwable th) {
            this.a.a(new l.b.a(th));
        }
    }
}
