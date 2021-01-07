package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.m;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.music.C0707R;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    private g a;
    private f b;
    e c;

    public h(g gVar) {
        this.a = gVar;
    }

    public void a(IBinder iBinder) {
        g gVar = this.a;
        f.a aVar = new f.a(gVar.n());
        e eVar = new e(aVar.b(), C0707R.layout.abc_list_menu_item_layout);
        this.c = eVar;
        eVar.h(this);
        this.a.b(this.c);
        aVar.c(this.c.a(), this);
        View view = gVar.o;
        if (view != null) {
            aVar.e(view);
        } else {
            aVar.f(gVar.n);
            aVar.n(gVar.m);
        }
        aVar.j(this);
        f a2 = aVar.a();
        this.b = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.b.getWindow().getAttributes();
        attributes.type = ContentMediaFormat.FULL_CONTENT_MOVIE;
        attributes.flags |= 131072;
        this.b.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void c(g gVar, boolean z) {
        f fVar;
        if ((z || gVar == this.a) && (fVar = this.b) != null) {
            fVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean d(g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.y(((e.a) this.c.a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}
