package com.twitter;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ScenarioBuilder {

    public static void technique1() {

        final Runnable spike = () -> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        final Runnable slow = () -> {
            try {
                Thread.sleep(1000);
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
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                goodBehavior,
                slow,
                slow,
                slow,
                slow,
                spike
        );

    }

    public static void technique2() {

        final List<Supplier<Response>> behaviors = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            behaviors.add(ScenarioBuilder::sleepOk);
        }

        for (int i = 0; i < 100; i++) {
            behaviors.add(ScenarioBuilder::sortOfSlow);
        }

        for (int i = 0; i < 2; i++) {
            behaviors.add(ScenarioBuilder::spike);
        }

        for (int i = 0; i < 12; i++) {
            behaviors.add(() -> Response.serverError().build());
        }

        for (int i = 0; i < 12; i++) {
            behaviors.add(() -> Response.status(403).build());
        }

        final WeightedRandomResult<Supplier<Response>> possibilities = new WeightedRandomResult<>(behaviors);

        // Then later at runtime...
        final Response response = possibilities.get().get();
        // and then return it
    }

    private static Response sleepOk() {
        try {
            // note we'd still want some variance in response time
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Response.ok().build();
    }

    private static Response spike() {
        try {
            // note we'd still want some variance in response time
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Response.ok().build();
    }

    private static Response sortOfSlow() {
        try {
            // note we'd still want some variance in response time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Response.ok().build();
    }

}
