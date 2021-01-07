package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import com.spotify.core.http.HttpConnection;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.b;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: m44  reason: default package */
public final class m44<T> implements g<f44> {
    final /* synthetic */ Resources a;
    final /* synthetic */ b b;

    m44(Resources resources, b bVar) {
        this.a = resources;
        this.b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(f44 f44) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.a.getString(C0707R.string.invitation_message, f44.a()));
        intent.setType(HttpConnection.kDefaultContentType);
        this.b.b(Intent.createChooser(intent, null));
    }
}
