package com.spotify.music.features.connectui.picker.frictionlessjoin.ui;

import android.widget.CompoundButton;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b;
import com.spotify.music.features.connectui.picker.legacy.util.f;
import kotlin.jvm.internal.h;

public final class GroupSessionViewBinderImpl implements b {
    private a a;
    private b.c b;
    private b.AbstractC0223b c;
    private final f d;

    static final class a implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ GroupSessionViewBinderImpl a;

        a(GroupSessionViewBinderImpl groupSessionViewBinderImpl) {
            this.a = groupSessionViewBinderImpl;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            b.c cVar = this.a.b;
            if (cVar != null) {
                ((ms4) cVar).a.m(z);
            }
        }
    }

    public GroupSessionViewBinderImpl(f fVar) {
        h.e(fVar, "connectStringBuilder");
        this.d = fVar;
    }

    private final void j(int i) {
        a aVar = this.a;
        if (aVar != null) {
            String k = this.d.k(i);
            h.d(k, "connectStringBuilder.get…articipants\n            )");
            aVar.d(k);
        }
        a aVar2 = this.a;
        if (aVar2 != null) {
            String i2 = this.d.i(i);
            h.d(i2, "connectStringBuilder.get…articipants\n            )");
            aVar2.x(i2);
        }
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void a() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void b() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void c(b.c cVar) {
        h.e(cVar, "listener");
        this.b = cVar;
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void d(boolean z) {
        a aVar;
        a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.setGroupSessionOn(z);
        }
        if (this.b != null && (aVar = this.a) != null) {
            aVar.setOnGroupSessionSwitchListener(new a(this));
        }
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void e(a aVar) {
        h.e(aVar, "groupSessionView");
        this.a = aVar;
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void f(b.AbstractC0223b bVar) {
        h.e(bVar, "listener");
        this.c = bVar;
        a aVar = this.a;
        if (aVar != null) {
            aVar.setOnGroupSessionLeaveClickListener(new GroupSessionViewBinderImpl$setOnGroupSessionLeaveClickListener$1(this));
        }
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b
    public void g(b.a aVar) {
        h.e(aVar, "mode");
        if (aVar instanceof b.a.C0221a) {
            a aVar2 = this.a;
            if (aVar2 != null) {
                aVar2.a();
            }
            a aVar3 = this.a;
            if (aVar3 != null) {
                aVar3.j(a.AbstractC0219a.C0220a.a);
            }
            j(((b.a.C0221a) aVar).a().size());
        } else if (aVar instanceof b.a.C0222b) {
            a aVar4 = this.a;
            if (aVar4 != null) {
                aVar4.a();
            }
            a aVar5 = this.a;
            if (aVar5 != null) {
                aVar5.j(a.AbstractC0219a.b.a);
            }
            j(((b.a.C0222b) aVar).a().size());
        }
    }
}
