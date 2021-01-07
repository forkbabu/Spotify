package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;

/* renamed from: j42  reason: default package */
public final class j42 implements AdapterView.OnItemLongClickListener, View.OnLongClickListener {
    private final Context a;
    private final c b;

    public j42(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        return onLongClick(view);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Object tag = view.getTag(C0707R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((i42) tag).a(this.a, this.b);
        return true;
    }
}
