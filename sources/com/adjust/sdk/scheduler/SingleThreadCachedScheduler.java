package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingleThreadCachedScheduler implements ThreadScheduler {
    private boolean isTeardown = false;
    private boolean isThreadProcessing = false;
    private final List<Runnable> queue = new ArrayList();
    private ThreadPoolExecutor threadPoolExecutor;

    public SingleThreadCachedScheduler(final String str) {
        this.threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new RejectedExecutionHandler() {
            /* class com.adjust.sdk.scheduler.SingleThreadCachedScheduler.AnonymousClass1 */

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
    }

    private void processQueue(final Runnable runnable) {
        this.threadPoolExecutor.submit(new Runnable() {
            /* class com.adjust.sdk.scheduler.SingleThreadCachedScheduler.AnonymousClass3 */

            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable);
                while (true) {
                    synchronized (SingleThreadCachedScheduler.this.queue) {
                        if (!SingleThreadCachedScheduler.this.isTeardown) {
                            if (SingleThreadCachedScheduler.this.queue.isEmpty()) {
                                SingleThreadCachedScheduler.this.isThreadProcessing = false;
                                return;
                            } else {
                                runnable = (Runnable) SingleThreadCachedScheduler.this.queue.get(0);
                                SingleThreadCachedScheduler.this.queue.remove(0);
                            }
                        } else {
                            return;
                        }
                    }
                    SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void tryExecuteRunnable(Runnable runnable) {
        try {
            if (!this.isTeardown) {
                runnable.run();
            }
        } catch (Throwable th) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(final Runnable runnable, final long j) {
        synchronized (this.queue) {
            if (!this.isTeardown) {
                this.threadPoolExecutor.submit(new Runnable() {
                    /* class com.adjust.sdk.scheduler.SingleThreadCachedScheduler.AnonymousClass2 */

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException e) {
                            AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
                        }
                        SingleThreadCachedScheduler.this.submit(runnable);
                    }
                });
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            if (!this.isTeardown) {
                if (!this.isThreadProcessing) {
                    this.isThreadProcessing = true;
                    processQueue(runnable);
                } else {
                    this.queue.add(runnable);
                }
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
