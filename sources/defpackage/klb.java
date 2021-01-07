package defpackage;

import com.spotify.intentrouter.m;

/* access modifiers changed from: package-private */
/* renamed from: klb  reason: default package */
public final class klb implements m<T> {
    m<? super T> a;
    final /* synthetic */ Iterable b;

    klb(Iterable iterable) {
        this.b = iterable;
    }

    @Override // com.spotify.intentrouter.m
    public boolean a(T t) {
        this.a = null;
        for (m<? super T> mVar : this.b) {
            if (!mVar.a(t)) {
                this.a = mVar;
                return false;
            }
        }
        return true;
    }

    @Override // com.spotify.intentrouter.m
    public String description() {
        String str;
        StringBuilder sb = new StringBuilder(1024);
        String str2 = "";
        for (m<? super T> mVar : this.b) {
            if (this.a == mVar) {
                str = "*";
            } else {
                str = "";
            }
            sb.append(str2);
            sb.append(str);
            sb.append(mVar.description());
            sb.append(str);
            str2 = " AND ";
        }
        return sb.toString();
    }
}
