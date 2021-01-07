package com.spotify.intentrouter;

import io.reactivex.functions.l;
import io.reactivex.internal.functions.Functions;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ CommandRunner a;

    public /* synthetic */ a(CommandRunner commandRunner) {
        this.a = commandRunner;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        CommandRunner commandRunner = this.a;
        g gVar = (g) obj;
        commandRunner.getClass();
        return gVar.a().N().h(Throwable.class).M(new b(commandRunner, gVar), Functions.c).J(new c(commandRunner)).r0(new d(commandRunner, gVar));
    }
}
