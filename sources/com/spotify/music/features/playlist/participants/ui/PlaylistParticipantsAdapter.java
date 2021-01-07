package com.spotify.music.features.playlist.participants.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.elements.quickactions.Initials;
import com.spotify.music.C0707R;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.models.p;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class PlaylistParticipantsAdapter extends v<d.a.C0369a, ViewHolder> {
    private final wlf<ParticipantRowPlaylist> n;
    private final c o;

    public final class ViewHolder extends RecyclerView.b0 {
        private final Component<ParticipantRowPlaylist.Model, ParticipantRowPlaylist.Event> C;
        final /* synthetic */ PlaylistParticipantsAdapter D;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PlaylistParticipantsAdapter playlistParticipantsAdapter, Component<ParticipantRowPlaylist.Model, ParticipantRowPlaylist.Event> component) {
            super(component.getView());
            h.e(component, "row");
            this.D = playlistParticipantsAdapter;
            this.C = component;
            component.onEvent(new nmf<ParticipantRowPlaylist.Event, f>(this) {
                /* class com.spotify.music.features.playlist.participants.ui.PlaylistParticipantsAdapter.ViewHolder.AnonymousClass1 */
                final /* synthetic */ ViewHolder this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // defpackage.nmf
                public f invoke(ParticipantRowPlaylist.Event event) {
                    ParticipantRowPlaylist.Event event2 = event;
                    h.e(event2, "event");
                    if (event2 instanceof ParticipantRowPlaylist.Event.RowClicked) {
                        c cVar = this.this$0.D.o;
                        int A = this.this$0.A();
                        ViewHolder viewHolder = this.this$0;
                        cVar.c(A, PlaylistParticipantsAdapter.f0(viewHolder.D, viewHolder.A()).d());
                    }
                    return f.a;
                }
            });
        }

        public final void h0(d.a.C0369a aVar) {
            String str;
            h.e(aVar, "collaborator");
            p d = aVar.d();
            if (d.b()) {
                str = d.a();
                if (str == null) {
                    throw new IllegalArgumentException(("Display can not be null for " + d).toString());
                }
            } else {
                str = d.f();
            }
            Context context = this.C.getView().getContext();
            h.d(context, "row.view.context");
            boolean a = aVar.a();
            int c = aVar.c();
            int b = aVar.b();
            StringBuilder sb = new StringBuilder();
            Resources resources = context.getResources();
            h.d(resources, "context.resources");
            if (a) {
                sb.append(resources.getString(C0707R.string.playlist_participants_row_subtitle_owner));
                if (c > 0 || b > 0) {
                    sb.append(" • ");
                }
                String sb2 = sb.toString();
                h.d(sb2, "StringBuilder().apply(builderAction).toString()");
                String c2 = d.c();
                String a2 = f0.a(str);
                h.d(a2, "ProfileSignature.getSignature(name)");
                View view = this.a;
                h.d(view, "itemView");
                this.C.render(new ParticipantRowPlaylist.Model(str, sb2, c2, new Initials(a2, iqa.a(view.getContext(), d.f()))));
            }
            if (c > 0) {
                sb.append(resources.getQuantityString(C0707R.plurals.playlist_participants_row_subtitle_tracks, c, Integer.valueOf(c)));
                if (b > 0) {
                    sb.append(" • ");
                }
                String sb22 = sb.toString();
                h.d(sb22, "StringBuilder().apply(builderAction).toString()");
                String c22 = d.c();
                String a22 = f0.a(str);
                h.d(a22, "ProfileSignature.getSignature(name)");
                View view2 = this.a;
                h.d(view2, "itemView");
                this.C.render(new ParticipantRowPlaylist.Model(str, sb22, c22, new Initials(a22, iqa.a(view2.getContext(), d.f()))));
            }
            if (b > 0) {
                sb.append(resources.getQuantityString(C0707R.plurals.playlist_participants_row_subtitle_episodes, b, Integer.valueOf(b)));
            }
            String sb222 = sb.toString();
            h.d(sb222, "StringBuilder().apply(builderAction).toString()");
            String c222 = d.c();
            String a222 = f0.a(str);
            h.d(a222, "ProfileSignature.getSignature(name)");
            View view22 = this.a;
            h.d(view22, "itemView");
            this.C.render(new ParticipantRowPlaylist.Model(str, sb222, c222, new Initials(a222, iqa.a(view22.getContext(), d.f()))));
        }
    }

    public static final class a extends m.d<d.a.C0369a> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(d.a.C0369a aVar, d.a.C0369a aVar2) {
            d.a.C0369a aVar3 = aVar;
            d.a.C0369a aVar4 = aVar2;
            h.e(aVar3, "oldItem");
            h.e(aVar4, "newItem");
            return aVar3.equals(aVar4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(d.a.C0369a aVar, d.a.C0369a aVar2) {
            d.a.C0369a aVar3 = aVar;
            d.a.C0369a aVar4 = aVar2;
            h.e(aVar3, "oldItem");
            h.e(aVar4, "newItem");
            return h.a(aVar3.d().e(), aVar4.d().e());
        }
    }

    public interface b {
        v<d.a.C0369a, ViewHolder> a(c cVar);
    }

    public interface c {
        void c(int i, p pVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaylistParticipantsAdapter(wlf<ParticipantRowPlaylist> wlf, c cVar) {
        super(new a());
        h.e(wlf, "participantRowProvider");
        h.e(cVar, "listener");
        this.n = wlf;
        this.o = cVar;
    }

    public static final /* synthetic */ d.a.C0369a f0(PlaylistParticipantsAdapter playlistParticipantsAdapter, int i) {
        return (d.a.C0369a) playlistParticipantsAdapter.Y(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ViewHolder viewHolder = (ViewHolder) b0Var;
        h.e(viewHolder, "holder");
        Object Y = Y(i);
        h.d(Y, "getItem(position)");
        viewHolder.h0((d.a.C0369a) Y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        ParticipantRowPlaylist participantRowPlaylist = this.n.get();
        h.d(participantRowPlaylist, "participantRowProvider.get()");
        return new ViewHolder(this, participantRowPlaylist);
    }
}
