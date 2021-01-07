package com.spotify.music.sleeptimer;

public interface SleepTimerStatusHandler {

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class State extends Enum<State> {
        public static final State a;
        public static final State b;
        private static final /* synthetic */ State[] c;

        static {
            State state = new State("TIMER_COMPLETED", 0);
            a = state;
            State state2 = new State("TIMER_INTERRUPTED", 1);
            b = state2;
            c = new State[]{state, state2, new State("NONE", 2)};
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) c.clone();
        }
    }
}
