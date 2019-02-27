/*
 * citygml4j - The Open Source Java API for CityGML
 * https://github.com/citygml4j
 *
 * Copyright 2013-2019 Claus Nagel <claus.nagel@gmail.com>
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
 */

package org.citygml4j.model.common.base;

import org.citygml4j.model.common.child.Child;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class ModelObjects {

    public static <T extends Child> T setParent(T child, ModelObject parent) {
        if (child != null)
            child.setParent(parent);

        return child;
    }

    public static <T extends ModelObject> T setNull(T object) {
        if (object instanceof Child)
            ((Child) object).unsetParent();

        return null;
    }

    public static <T extends List<?>> T setNull(T list) {
        if (list instanceof ChildList)
            ((ChildList) list).unsetParent();

        return null;
    }

}