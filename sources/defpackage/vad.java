package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.models.SessionMember;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: vad  reason: default package */
public final class vad extends RecyclerView.e<b> {
    private ImmutableList<Session> c;
    private boolean f = true;
    private a n;
    private final lqa o;
    private final Context p;

    /* renamed from: vad$a */
    public interface a {
        void a(int i, Session session);
    }

    /* renamed from: vad$b */
    public static final class b extends RecyclerView.b0 {
        private final TextView C;
        private final ImageView D;
        private final Button E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            h.e(view, "itemView");
            View G = q4.G(view, C0707R.id.title);
            h.d(G, "ViewCompat.requireViewById(itemView, R.id.title)");
            this.C = (TextView) G;
            View G2 = q4.G(view, C0707R.id.image);
            h.d(G2, "ViewCompat.requireViewById(itemView, R.id.image)");
            this.D = (ImageView) G2;
            View G3 = q4.G(view, C0707R.id.join_button);
            h.d(G3, "ViewCompat.requireViewBy…emView, R.id.join_button)");
            this.E = (Button) G3;
        }

        public final ImageView h0() {
            return this.D;
        }

        public final Button j0() {
            return this.E;
        }

        public final TextView l0() {
            return this.C;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: vad$c */
    public static final class c implements View.OnClickListener {
        final /* synthetic */ vad a;
        final /* synthetic */ int b;
        final /* synthetic */ Session c;

        c(vad vad, int i, Session session) {
            this.a = vad;
            this.b = i;
            this.c = session;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = this.a.n;
            if (aVar != null) {
                aVar.a(this.b, this.c);
            }
        }
    }

    public vad(lqa lqa, Context context) {
        h.e(lqa, "profilePictureLoader");
        h.e(context, "context");
        this.o = lqa;
        this.p = context;
        ImmutableList<Session> of = ImmutableList.of();
        h.d(of, "ImmutableList.of()");
        this.c = of;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public /* bridge */ /* synthetic */ b M(ViewGroup viewGroup, int i) {
        return Z(viewGroup);
    }

    /* renamed from: Y */
    public void K(b bVar, int i) {
        SessionMember sessionMember;
        h.e(bVar, "holder");
        Session session = this.c.get(i);
        h.d(session, "sessions[position]");
        Session session2 = session;
        List<SessionMember> sessionMembers = session2.getSessionMembers();
        if (sessionMembers == null || (sessionMember = sessionMembers.get(0)) == null) {
            sessionMember = SessionMember.EMPTY;
        }
        bVar.l0().setText(this.p.getString(C0707R.string.social_listening_nearby_session_item_title, sessionMember.getDisplayName()));
        bVar.j0().setOnClickListener(new c(this, i, session2));
        bVar.j0().setEnabled(this.f);
        String username = sessionMember.getUsername();
        if (username != null) {
            this.o.a(bVar.h0(), sessionMember.getLargeImageUrl(), username, sessionMember.getDisplayName(), false, null);
        }
    }

    public b Z(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.item, viewGroup, false);
        h.d(inflate, "root");
        return new b(inflate);
    }

    public final void b0(a aVar) {
        h.e(aVar, "joinSessionClickListener");
        this.n = aVar;
    }

    public final void c0(boolean z) {
        if (this.f != z) {
            this.f = z;
            z();
        }
    }

    public final void f0(ImmutableList<Session> immutableList) {
        h.e(immutableList, "value");
        if (!h.a(this.c, immutableList)) {
            this.c = immutableList;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
