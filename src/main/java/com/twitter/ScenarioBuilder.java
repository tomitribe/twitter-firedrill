package com.twitter;

import java.util.Random;

public class ScenarioBuilder {

    /**
     * Allows the following factors to be controlled
     *  - Response code
     *  - Invocation time
     *  - Response bytes (size)
     *
     * @param args
     */
    public static void main(String[] args) {

        final WeightedRandomResult<Integer> statusCodes = new WeightedRandomResult<Integer>(
                200,
                200,
                200,
                200,
                500
        );

        final Integer integer = statusCodes.get();

        final Runnable sleep = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        final Runnable goodBehavior = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        final WeightedRandomResult<Runnable> behavior = new WeightedRandomResult<Runnable>(
                sleep,
                sleep,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior
        );

    }

    public static class WeightedRandomResult<T> {
        final Random random = new Random();

        final T[] statusCodes;

        public WeightedRandomResult(final T... statusCodes) {
            this.statusCodes = statusCodes;
        }

        public T get() {
            final int i = random.nextInt(statusCodes.length);
            return statusCodes[i];
        }
    }

}
