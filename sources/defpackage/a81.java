package defpackage;

import com.google.common.base.Optional;

/* renamed from: a81  reason: default package */
public final class a81 {
    public static final /* synthetic */ int a = 0;

    /* renamed from: a81$a */
    static class a implements v51 {
        final /* synthetic */ kg0 a;

        a(kg0 kg0) {
            this.a = kg0;
        }

        @Override // defpackage.v51
        public int d(s81 s81) {
            s81.getClass();
            return ((Integer) this.a.f(s81.componentId().id()).transform(x71.a).or((Optional) 0)).intValue();
        }
    }

    public static <T extends Enum<T> & q81 & z71> v51 a(Class<T> cls) {
        return new a(kg0.b(cls, w71.a));
    }
}
