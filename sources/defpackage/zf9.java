package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobius.g;
import com.spotify.mobius.h;

/* renamed from: zf9  reason: default package */
public final class zf9<I, O> implements g<I, O> {
    private final ImmutableList<g<I, O>> a;

    /* access modifiers changed from: package-private */
    /* renamed from: zf9$a */
    public class a implements h<I> {
        final /* synthetic */ ImmutableList a;

        a(zf9 zf9, ImmutableList immutableList) {
            this.a = immutableList;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(I i) {
            UnmodifiableListIterator listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                ((h) listIterator.next()).accept(i);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            UnmodifiableListIterator listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                ((h) listIterator.next()).dispose();
            }
        }
    }

    /* renamed from: zf9$b */
    public static class b<I, O> {
        private final ImmutableList.Builder<g<I, O>> a = new ImmutableList.Builder<>();

        b() {
            int i = ImmutableList.a;
        }

        public b<I, O> a(g<I, O> gVar) {
            this.a.mo53add((ImmutableList.Builder<g<I, O>>) gVar);
            return this;
        }

        public zf9<I, O> b() {
            return new zf9<>(this.a.build(), null);
        }
    }

    zf9(ImmutableList immutableList, a aVar) {
        this.a = immutableList;
    }

    public static <I, O> b<I, O> a() {
        return new b<>();
    }

    @Override // com.spotify.mobius.g
    public h<I> t(da2<O> da2) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator<g<I, O>> listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            builder.mo53add((ImmutableList.Builder) listIterator.next().t(da2));
        }
        return new a(this, builder.build());
    }
}
