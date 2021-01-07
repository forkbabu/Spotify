package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import io.reactivex.a;
import io.reactivex.b;
import java.lang.ref.WeakReference;

/* renamed from: cte  reason: default package */
public class cte {
    private final WeakReference<Context> a;

    public cte(Context context) {
        this.a = new WeakReference<>(context);
    }

    public /* synthetic */ void a(int i, b bVar) {
        Context context = this.a.get();
        if (context == null) {
            bVar.onError(new NullPointerException("context is null"));
            return;
        }
        MediaPlayer create = MediaPlayer.create(context, i);
        create.getClass();
        bVar.e(new zse(create));
        create.setOnCompletionListener(new bte(bVar));
        try {
            create.start();
        } catch (IllegalStateException e) {
            if (!bVar.d()) {
                bVar.onError(e);
            }
        }
    }

    public a b(int i) {
        return a.m(new ate(this, i)).G(io.reactivex.schedulers.a.c());
    }
}
