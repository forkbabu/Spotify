package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.collection.service.CollectionService;
import com.spotify.music.libs.viewuri.c;
import defpackage.s8a;
import defpackage.y8a;

/* renamed from: u8a  reason: default package */
public class u8a implements t8a {
    private final y8a a;
    private final Context b;
    private final c c;

    public u8a(y8a y8a, Context context, c cVar) {
        this.a = y8a;
        this.b = context;
        this.c = cVar;
    }

    @Override // defpackage.t8a
    public void a(String str, String str2, boolean z) {
        c(new String[]{str}, str2, z);
    }

    @Override // defpackage.t8a
    public void b(String str) {
        d(new String[]{str}, true);
    }

    @Override // defpackage.t8a
    public void c(String[] strArr, String str, boolean z) {
        CollectionService.b(this.b, strArr, this.c.toString(), str, z ? CollectionService.Messaging.ALL : CollectionService.Messaging.NONE);
        y8a y8a = this.a;
        s8a.b bVar = (s8a.b) y8a.a.a();
        bVar.c(ImmutableList.copyOf(strArr));
        s8a.b bVar2 = bVar;
        bVar2.b(str);
        s8a.b bVar3 = bVar2;
        bVar3.d(this.c.toString());
        s8a.b bVar4 = bVar3;
        bVar4.e(false);
        y8a.a(bVar4.a());
    }

    @Override // defpackage.t8a
    public void d(String[] strArr, boolean z) {
        CollectionService.g(this.b, strArr, this.c.toString(), z ? CollectionService.Messaging.ALL : CollectionService.Messaging.NONE);
        y8a y8a = this.a;
        s8a.b bVar = (s8a.b) y8a.a.a();
        bVar.c(ImmutableList.copyOf(strArr));
        s8a.b bVar2 = bVar;
        bVar2.b(this.c.toString());
        s8a.b bVar3 = bVar2;
        bVar3.d(this.c.toString());
        s8a.b bVar4 = bVar3;
        bVar4.e(true);
        y8a.a(bVar4.a());
    }

    @Override // defpackage.t8a
    public void e(String str, String str2) {
        c(new String[]{str}, str2, true);
    }

    @Override // defpackage.t8a
    public void f(String str, boolean z) {
        d(new String[]{str}, z);
    }
}
