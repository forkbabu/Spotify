package defpackage;

import com.google.common.collect.ImmutableList;
import com.squareup.picasso.a0;
import java.util.List;
import java.util.Set;

/* renamed from: ic3  reason: default package */
public final class ic3 implements fjf<List<a0>> {
    private final wlf<Set<a0>> a;
    private final wlf<kwd> b;
    private final wlf<mwd> c;

    public ic3(wlf<Set<a0>> wlf, wlf<kwd> wlf2, wlf<mwd> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        kwd kwd = this.b.get();
        mwd mwd = this.c.get();
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (a0 a0Var : this.a.get()) {
            builder.mo53add((ImmutableList.Builder) a0Var);
        }
        builder.mo53add((ImmutableList.Builder) kwd);
        builder.mo53add((ImmutableList.Builder) mwd);
        ImmutableList build = builder.build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
