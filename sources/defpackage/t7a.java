package defpackage;

import android.content.Context;
import com.spotify.music.libs.collection.service.CollectionService;
import com.spotify.music.libs.viewuri.c;

/* renamed from: t7a  reason: default package */
public class t7a implements s7a {
    private final Context a;
    private final c b;

    public t7a(Context context, c cVar) {
        context.getClass();
        this.a = context;
        cVar.getClass();
        this.b = cVar;
    }

    @Override // defpackage.s7a
    public void a(String str, String str2, boolean z) {
        CollectionService.c(this.a, str, this.b.toString(), str2, z ? CollectionService.Messaging.ALL : CollectionService.Messaging.NONE);
    }

    @Override // defpackage.s7a
    public void b(String str, String str2, boolean z) {
        Context context = this.a;
        String cVar = this.b.toString();
        CollectionService.Messaging messaging = z ? CollectionService.Messaging.ALL : CollectionService.Messaging.NONE;
        int i = CollectionService.p;
        CollectionService.i(context, new String[]{str}, cVar, str2, messaging);
    }
}
