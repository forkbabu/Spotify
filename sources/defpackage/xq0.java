package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.h0;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.mobile.android.spotlets.common.recyclerview.d;
import defpackage.cr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: xq0  reason: default package */
public abstract class xq0<T extends cr0> extends d<T, CallingCode> {
    private final g0.b<CallingCode> n;
    private final b o;
    private final g0<CallingCode> p;
    List<CallingCode> q = Collections.emptyList();
    String r = "";

    /* renamed from: xq0$a */
    class a extends h0<CallingCode> {
        a(xq0 xq0, RecyclerView.e eVar) {
            super(eVar);
        }

        @Override // androidx.recyclerview.widget.g0.b, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int i = CallingCode.a;
            return com.spotify.libs.callingcode.json.b.a.compare((CallingCode) obj, (CallingCode) obj2);
        }

        @Override // androidx.recyclerview.widget.g0.b
        public boolean e(Object obj, Object obj2) {
            return ((CallingCode) obj).equals((CallingCode) obj2);
        }

        @Override // androidx.recyclerview.widget.g0.b
        public boolean f(Object obj, Object obj2) {
            return ((CallingCode) obj).equals((CallingCode) obj2);
        }
    }

    /* renamed from: xq0$b */
    public interface b {
        void a(CallingCode callingCode);
    }

    public xq0(b bVar) {
        a aVar = new a(this, this);
        this.n = aVar;
        this.p = new g0<>(CallingCode.class, aVar);
        g0(false);
        bVar.getClass();
        this.o = bVar;
    }

    private void i0() {
        ArrayList arrayList = new ArrayList(this.q.size());
        if (this.r.isEmpty()) {
            arrayList.addAll(this.q);
        } else {
            for (CallingCode callingCode : this.q) {
                if (callingCode.c().toLowerCase(Locale.getDefault()).contains(this.r)) {
                    arrayList.add(callingCode);
                }
            }
        }
        super.f0(arrayList);
        this.p.c();
        this.p.d();
        this.p.a(arrayList);
        this.p.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return j0(viewGroup, i, this.o);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.d
    public void f0(List<CallingCode> list) {
        this.q = list;
        i0();
    }

    /* access modifiers changed from: protected */
    public abstract T j0(ViewGroup viewGroup, int i, b bVar);

    public void k0(String str) {
        this.r = str.toLowerCase(Locale.getDefault());
        i0();
    }
}
