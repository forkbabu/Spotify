package com.spotify.music.features.editplaylist.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.e;
import com.spotify.glue.dialogs.f;
import com.spotify.music.C0707R;

public class SavePlaylistDialog implements e {
    private a a = h.a;
    private a b = c.a;
    private a c = g.a;
    private final d d;
    private TextView e;
    private View f;
    private View g;

    public enum State {
        SAVING,
        ERROR
    }

    public interface a {
        void a();
    }

    public SavePlaylistDialog(Context context) {
        f fVar = new f(context, this);
        fVar.a(false);
        this.d = fVar.b();
    }

    @Override // com.spotify.glue.dialogs.e
    public void a() {
    }

    @Override // com.spotify.glue.dialogs.e
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.save_playlist_dialog, viewGroup, true);
        this.e = (TextView) inflate.findViewById(C0707R.id.save_dialog_title);
        this.g = inflate.findViewById(C0707R.id.save_dialog_error_container);
        ((Button) inflate.findViewById(C0707R.id.save_dialog_progress_cancel_button)).setOnClickListener(new b(this));
        this.f = inflate.findViewById(C0707R.id.save_dialog_progress_container);
        ((Button) inflate.findViewById(C0707R.id.save_dialog_error_save_others_button)).setOnClickListener(new f(this));
        ((Button) inflate.findViewById(C0707R.id.save_dialog_error_cancel_button)).setOnClickListener(new a(this));
    }

    @Override // com.spotify.glue.dialogs.e
    public int c() {
        return 0;
    }

    public void d() {
        this.d.dismiss();
    }

    public /* synthetic */ void e(View view) {
        this.a.a();
    }

    public /* synthetic */ void f(View view) {
        this.c.a();
    }

    public /* synthetic */ void g(View view) {
        this.b.a();
    }

    public void h(a aVar, a aVar2, a aVar3) {
        this.a = (a) MoreObjects.firstNonNull(aVar, d.a);
        this.b = (a) MoreObjects.firstNonNull(aVar2, i.a);
        this.c = (a) MoreObjects.firstNonNull(aVar3, e.a);
    }

    public void i(State state) {
        this.d.a();
        TextView textView = this.e;
        View view = this.g;
        View view2 = this.f;
        if (textView != null && view2 != null && view != null) {
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                textView.setText(C0707R.string.edit_playlist_save_dialog_title_saving);
                view2.setVisibility(0);
                view.setVisibility(4);
            } else if (ordinal == 1) {
                textView.setText(C0707R.string.edit_playlist_save_dialog_title_error);
                view2.setVisibility(4);
                view.setVisibility(0);
            }
        }
    }
}
