package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.spotify.music.features.queue.view.b;

/* renamed from: mw7  reason: default package */
class mw7 implements View.OnTouchListener {
    final /* synthetic */ b a;
    final /* synthetic */ nw7 b;

    mw7(nw7 nw7, b bVar) {
        this.b = nw7;
        this.a = bVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        this.b.b.a(this.a);
        return true;
    }
}
