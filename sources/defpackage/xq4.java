package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.spotify.music.C0707R;
import defpackage.dr4;

/* renamed from: xq4  reason: default package */
public final /* synthetic */ class xq4 implements Runnable {
    public final /* synthetic */ dr4.d a;
    public final /* synthetic */ View b;

    public /* synthetic */ xq4(dr4.d dVar, View view) {
        this.a = dVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.d dVar = this.a;
        View view = this.b;
        dVar.getClass();
        Rect rect = new Rect();
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
        dVar.I.getHitRect(rect);
        rect.top -= dimensionPixelSize;
        rect.bottom += dimensionPixelSize;
        view.setTouchDelegate(new TouchDelegate(rect, dVar.I));
    }
}
