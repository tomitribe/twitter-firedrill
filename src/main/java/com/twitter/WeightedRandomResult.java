/* =====================================================================
 *
 * Copyright (c) 2011 David Blevins.  All rights reserved.
 *
 * =====================================================================
 */
package com.twitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WeightedRandomResult<T> {
    final Random random = new Random();

    final List<T> statusCodes = new ArrayList<>();

    public WeightedRandomResult(final T... statusCodes) {
        Collections.addAll(this.statusCodes, statusCodes);
    }

    public WeightedRandomResult(final Collection<T> statusCodes) {
        this.statusCodes.addAll(statusCodes);
    }

    public T get() {
        final int i = random.nextInt(statusCodes.size());
        return statusCodes.get(i);
    }
}
