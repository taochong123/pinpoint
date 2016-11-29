/*
 * Copyright 2016 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.navercorp.pinpoint.common.util;

import java.util.Collection;

/**
 * @author Woonduk Kang(emeroad)
 */
public final class CollectionUtils {

    private CollectionUtils() {
    }

    public static <T> int nullSafeSize(Collection<T> collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

//    public static <T> int nullSafeSize(Collection<T> collection, int defaultValue) {
//        if (collection == null) {
//            // -1
//            return defaultValue;
//        }
//        return collection.size();
//    }

    public static <T> boolean isEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> boolean isNotEmpty(Collection<T> collection) {
        return !isEmpty(collection);
    }

}
