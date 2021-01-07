package com.google.common.util.concurrent;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MapMaker;
import java.util.ArrayList;
import java.util.logging.Logger;

public class CycleDetectingLockFactory {

    private static class ExampleStackTrace extends IllegalStateException {
        static {
            ImmutableSet.of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), LockGraphNode.class.getName());
        }
    }

    private static class LockGraphNode {
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    static {
        MapMaker mapMaker = new MapMaker();
        mapMaker.weakKeys();
        mapMaker.makeMap();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new ThreadLocal<ArrayList<LockGraphNode>>() {
            /* class com.google.common.util.concurrent.CycleDetectingLockFactory.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public ArrayList<LockGraphNode> initialValue() {
                return Collections2.newArrayListWithCapacity(3);
            }
        };
    }
}
