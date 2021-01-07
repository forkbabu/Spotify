package com.spotify.music.features.employeepodcasts.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.i1;
import kotlin.jvm.internal.h;

public final class a implements d, DialogInterface.OnClickListener {
    private f a;
    private final TextView b;
    private final Button c;
    private final View f;

    /* renamed from: com.spotify.music.features.employeepodcasts.view.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    static final class View$OnClickListenerC0228a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public View$OnClickListenerC0228a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                f fVar = ((a) this.b).a;
                if (fVar != null) {
                    fVar.b();
                }
            } else if (i == 1) {
                f fVar2 = ((a) this.b).a;
                if (fVar2 != null) {
                    fVar2.a();
                }
            } else {
                throw null;
            }
        }
    }

    public a(View view) {
        h.e(view, "rootView");
        this.f = view;
        View findViewById = view.findViewById(C0707R.id.employeePodcastsIcon);
        ((ImageView) findViewById).setOnClickListener(new View$OnClickListenerC0228a(0, this));
        h.d(findViewById, "rootView.findViewById<Im…?.iconClick() }\n        }");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.employeePodcastsVerified);
        h.d(findViewById2, "rootView.findViewById(R.…employeePodcastsVerified)");
        this.b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.employeePodcastsGetAccessButton);
        ((Button) findViewById3).setOnClickListener(new View$OnClickListenerC0228a(1, this));
        h.d(findViewById3, "rootView.findViewById<Bu…AccessClick() }\n        }");
        this.c = (Button) findViewById3;
    }

    @Override // com.spotify.music.features.employeepodcasts.view.d
    public void a() {
        new AlertDialog.Builder(this.f.getContext()).setMessage("Clear auth token?").setPositiveButton("Yes", this).setNegativeButton("No", this).show();
    }

    @Override // com.spotify.music.features.employeepodcasts.view.d
    public void b() {
        this.c.setVisibility(0);
        this.b.setVisibility(8);
    }

    @Override // com.spotify.music.features.employeepodcasts.view.d
    public void c() {
        this.c.setVisibility(8);
        this.b.setVisibility(0);
    }

    @Override // com.spotify.music.features.employeepodcasts.view.d
    public void d(f fVar) {
        h.e(fVar, "listener");
        this.a = fVar;
    }

    @Override // com.spotify.music.features.employeepodcasts.view.d
    public void e(String str) {
        h.e(str, "url");
        i1.a aVar = new i1.a();
        aVar.c(-16777216);
        aVar.b(false);
        aVar.a().a(this.f.getContext(), Uri.parse(str));
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        f fVar;
        h.e(dialogInterface, "dialog");
        if (i == -1 && (fVar = this.a) != null) {
            fVar.c();
        }
    }
}
