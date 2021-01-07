package com.spotify.music.features.queue.v2;

import com.spotify.music.features.queue.v2.b;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.queue.f;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

final class QueueEffectsHandlerKt$onSetQueue$1<Upstream, Downstream> implements w<b.a, d> {
    final /* synthetic */ f a;

    static final class a<T, R> implements l<b.a, SetQueueCommand> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public SetQueueCommand apply(b.a aVar) {
            b.a aVar2 = aVar;
            h.e(aVar2, "it");
            return SetQueueCommand.create(aVar2.c(), aVar2.a(), aVar2.b());
        }
    }

    QueueEffectsHandlerKt$onSetQueue$1(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.w
    public final v<d> apply(s<b.a> sVar) {
        h.e(sVar, "setQueueEffects");
        return new z(sVar.j0(a.a).a0(new c(new nmf<SetQueueCommand, io.reactivex.z<zwd>>(this.a) {
            /* class com.spotify.music.features.queue.v2.QueueEffectsHandlerKt$onSetQueue$1.AnonymousClass2 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public io.reactivex.z<zwd> invoke(SetQueueCommand setQueueCommand) {
                return ((f) this.receiver).b(setQueueCommand);
            }
        }))).N();
    }
}
