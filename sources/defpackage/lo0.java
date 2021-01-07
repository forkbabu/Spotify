package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import defpackage.go0;
import defpackage.mo0;

/* renamed from: lo0  reason: default package */
public abstract class lo0 {
    public static final lo0 a;

    /* renamed from: lo0$a */
    public static abstract class a {
        public abstract a a(ImmutableList<ActionType> immutableList);

        public abstract lo0 b();

        public abstract a c(ImmutableList<FormatType> immutableList);

        public abstract a d(ho0 ho0);

        public abstract a e(mo0 mo0);

        public abstract a f(ImmutableList<TriggerType> immutableList);
    }

    static {
        go0.b bVar = new go0.b();
        bVar.e(new mo0.a());
        bVar.c(ImmutableList.of());
        bVar.a(ImmutableList.of());
        bVar.f(ImmutableList.of());
        bVar.d(null);
        a = bVar.b();
    }

    public abstract ImmutableList<ActionType> a();

    public abstract ImmutableList<FormatType> b();

    public abstract ho0 c();

    public abstract a d();

    public abstract mo0 e();

    public abstract ImmutableList<TriggerType> f();
}
