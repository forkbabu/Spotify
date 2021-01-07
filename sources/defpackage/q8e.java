package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.share.sharedata.ShareCapability;
import defpackage.r8e;

/* renamed from: q8e  reason: default package */
public abstract class q8e implements o8e {

    /* renamed from: q8e$a */
    public interface a {
        a a(ImmutableList<ShareCapability> immutableList);

        q8e build();
    }

    public static a e(int i, int i2, int i3, Drawable drawable, ShareCapability... shareCapabilityArr) {
        r8e.b bVar = new r8e.b();
        bVar.c(i);
        bVar.f(i2);
        bVar.d(i3);
        bVar.e(Optional.absent());
        bVar.b(drawable);
        bVar.a(ImmutableList.copyOf(shareCapabilityArr));
        return bVar;
    }

    @Override // defpackage.o8e
    public abstract int a();

    @Override // defpackage.o8e
    public abstract int c();

    @Override // defpackage.o8e
    public abstract Optional<String> d();

    /* renamed from: f */
    public abstract ImmutableList<ShareCapability> b();

    @Override // defpackage.o8e
    public abstract Drawable icon();

    @Override // defpackage.o8e
    public abstract int id();
}
