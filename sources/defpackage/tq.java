package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;

/* renamed from: tq  reason: default package */
final class tq extends a.AbstractC0094a<j, GoogleSignInOptions> {
    tq() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.c$a, com.google.android.gms.common.api.c$b] */
    @Override // com.google.android.gms.common.api.a.AbstractC0094a
    public final /* synthetic */ j a(Context context, Looper looper, c cVar, GoogleSignInOptions googleSignInOptions, c.a aVar, c.b bVar) {
        return new j(context, looper, cVar, googleSignInOptions, aVar, bVar);
    }
}
