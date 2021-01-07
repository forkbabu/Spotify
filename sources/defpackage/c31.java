package defpackage;

import com.google.gson.j;
import com.spotify.accountrecovery.api.models.a;
import com.spotify.magiclink.t;
import defpackage.q21;
import io.reactivex.functions.l;
import okhttp3.e0;

/* renamed from: c31  reason: default package */
public final /* synthetic */ class c31 implements l {
    public final /* synthetic */ q21.a a;

    public /* synthetic */ c31(q21.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        q21.a aVar = this.a;
        t tVar = (t) obj;
        if (tVar.a().f()) {
            return r21.h(aVar.b(), tVar.b());
        }
        if (tVar.a().b() != 400) {
            return r21.g(aVar.b(), tVar.b(), s21.d(String.valueOf(tVar.a().b())));
        }
        e0 d = tVar.a().d();
        if (d != null) {
            Class cls = a.class;
            Object b = new j().b(d.m(), cls);
            if (cls == Integer.TYPE) {
                cls = Integer.class;
            } else if (cls == Float.TYPE) {
                cls = Float.class;
            } else if (cls == Byte.TYPE) {
                cls = Byte.class;
            } else if (cls == Double.TYPE) {
                cls = Double.class;
            } else if (cls == Long.TYPE) {
                cls = Long.class;
            } else if (cls == Character.TYPE) {
                cls = Character.class;
            } else if (cls == Boolean.TYPE) {
                cls = Boolean.class;
            } else if (cls == Short.TYPE) {
                cls = Short.class;
            } else if (cls == Void.TYPE) {
                cls = Void.class;
            }
            a aVar2 = (a) cls.cast(b);
        }
        return r21.g(aVar.b(), tVar.b(), s21.c());
    }
}
